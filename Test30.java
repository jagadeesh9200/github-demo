package job;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Test30 
{
	public static void main(String[] args) throws Exception
	{

		//open excel file for reading
		File f=new File("F:\\Batch230\\Automation\\kalam\\w2sms.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nor=rsh.getRows();
		//open excel file for writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//data driven
		for(int i=1;i<nor;i++)
		{
			String m=rsh.getCell(0,i).getContents();
			String mc=rsh.getCell(1,i).getContents();
			String p=rsh.getCell(2,i).getContents();
			String pc=rsh.getCell(3,i).getContents();
		//launch site
		System.setProperty("webdriver.chrome.driver","F:\\batch230\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://site24.way2sms.com/content/index.html?");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//do login
		driver.findElement(By.name("username")).sendKeys(m);
		driver.findElement(By.name("password")).sendKeys(p);
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		//checking login operation
		if(m.length()<10 && ExpectedConditions.alertIsPresent()!=null)
		{
			Label l=new Label(4,i,"Test Passed");
			wsh.addCell(l);
			driver.switchTo().alert().dismiss();
		}
		else if(mc.equals("invalid")&&driver.findElement(By.xpath
				("//*[contains(text(),'rigistered yet')]")).isDisplayed())
		{
			Label l=new Label(4,i,"Test Passed");
			wsh.addCell(l);
		}
		else if(mc.equals("valid")&& pc.equals("invalid")&&driver.findElement(By.xpath
				("//*[contains(text(),'Forgot Password')]")).isDisplayed())		
		{
			Label l=new Label(4,i,"Test Passed");
			wsh.addCell(l);
		}
		else if(mc.equals("valid")&&pc.equals("valid")&&driver.findElement(By.xpath
				("//*[@value='Skip'or@value='Send Free SMS']")).isDisplayed())
		{
			Label l=new Label(4,i,"Test Passed");
			wsh.addCell(l);
		}
		else
		{
			Label l=new Label(4,i,"Test failed");
			wsh.addCell(l);
		}
		//close site
		driver.quit();
		}
		//save and close excel 
		wwb.write();
		wwb.close();
		rwb.close();
		
		}

}

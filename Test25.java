package job;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//take a word from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		//lunch google site
		System.setProperty("webdriver.chrome.driver", "F:\\batch230\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//search a word
		driver.findElement(By.name("q")).sendKeys(x);
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(3000);
		//check title
		String t=driver.getTitle();
		if(t.contains(x))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		//close site
		driver.close();
	}

}

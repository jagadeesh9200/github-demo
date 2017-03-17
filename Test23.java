package job;

import java.rmi.RemoteException;

import job.Live_Sensex_Bse_IndexStub.ArrayOfString;
import job.Live_Sensex_Bse_IndexStub.GetLiveSensex;
import job.Live_Sensex_Bse_IndexStub.GetLiveSensexResponse;

import org.apache.axis2.AxisFault;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 
{

	public static void main(String[] args) throws InterruptedException, RemoteException {
	
		//Launch site and get visible test(SWD)
	System.setProperty("webdriver.chrome.driver","F:\\batch230\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.bseindia.com");
	Thread.sleep(5000);
	String x=driver.findElement(By.id("tdsp")).getText();
	String siteval=x.replace(",", "");
	System.out.println(siteval);
	driver.close();
		//connect to service to get output(AXIS2)
	Live_Sensex_Bse_IndexStub stub=new Live_Sensex_Bse_IndexStub("http://freewebservicesx.com/live-sensex-bse-index.asmx?WSDL");
	GetLiveSensex req=new GetLiveSensex();
	req.setUserName("mindq@gmail.com");
	req.setPassword("mindq");
		//create object to response and get output
	GetLiveSensexResponse res=stub.getLiveSensex(req);
	ArrayOfString as=res.getGetLiveSensexResult();
	String[] o=as.localString;
	String serviceval=o[0];
	System.out.println(serviceval);
		//End-to-End Test
	if(siteval.equals(serviceval))
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test failed");
	}
	
	}

}

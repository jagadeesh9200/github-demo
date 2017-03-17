package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{
	WebDriver driver;
	By pwd=By.name("Passwd");
	By signin=By.id("signIn");
	public Loginpage(WebDriver x)
	{
		this.driver=x;
	}
	public void fillpassword(String d)
	{
		driver.findElement(pwd).sendKeys(d);
	}
	public void clicksignin()
	{
		driver.findElement(signin).click();
	}

}

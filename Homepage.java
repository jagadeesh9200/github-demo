package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage 
{
	WebDriver driver;
	By uid=By.name("Email");
	By next=By.id("next");
	public Homepage(WebDriver x)
	{
		this.driver=x;
	}
	public void filluserid(String d)
	{
		driver.findElement(uid).sendKeys(d);
	}
	public void clicknext()
	{
		driver.findElement(next).click();
	}
}

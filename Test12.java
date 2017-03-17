package job;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 int w=driver.manage().window().getSize().getWidth();
		 int h=driver.manage().window().getSize().getHeight();
		 System.out.println(w+" "+h);
		 int x=driver.manage().window().getPosition().getX();
		 int y=driver.manage().window().getPosition().getY();
		 System.out.println(x+" "+y);
		 Thread.sleep(5000);
		 Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		Point p=new Point(100,400);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		driver.close();
			 
	}

}

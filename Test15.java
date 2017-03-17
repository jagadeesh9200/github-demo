package job;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import com.sun.glass.events.KeyEvent;

public class Test15 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
	//Launch Notepad.
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
	//send data to notepad via clipboard.
		StringSelection s1=new StringSelection("Hi How Are? Am In Their........");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
	//choose Save Option.
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
	//save file.
		StringSelection s2=new StringSelection("F:\\Batch230\\Message.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	//close window.
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		

		}

}

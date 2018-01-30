import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowsHandling 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		String handler = driver.getWindowHandle();
		System.out.println(handler);
		//driver.findElement(By.xpath("//[contains(text(), newMsgWin)]")).click();
		//driver.findElement(By.xpath("//button[@onclick=newMsgWin]")).click();
		driver.findElement(By.xpath(".//*[@id='content']/p[3]/button"));
		Set<String> handles = driver.getWindowHandles();
		 
        System.out.println(handles.toString());

        // Pass a window handle to the other window

        for (String handle1 : driver.getWindowHandles()) 
        {
        	System.out.println(handle1.toString());
        	driver.switchTo().window(handle1);
        }

        // Closing Pop Up window

        driver.close();

        // Close Original window

        driver.quit();

	}

}
		
	

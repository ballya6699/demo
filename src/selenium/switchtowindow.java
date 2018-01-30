package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.AlertOverride;

import javafx.scene.control.Alert;

public class switchtowindow 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		driver.findElement(By.id("button1")).click();
		System.out.println("1");
		driver.findElement(By.xpath(".//*[@id='content']/p[3]/button")).click();
		System.out.println("2");
		driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
		System.out.println("3");
		
		Set<String> windows = driver.getWindowHandles();
		for (String newOpenWindow : windows) 
		{
			driver.switchTo().window(newOpenWindow);
			if(mainWindow.equalsIgnoreCase(newOpenWindow))
				continue;
			System.out.println(newOpenWindow.toString());
			driver.manage().window().maximize();
			driver.close();
		}
		//driver.close();
		driver.switchTo().window(mainWindow);
		
		System.out.println("to click alert..");
		driver.findElement(By.id("alert")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
		System.out.println("main window closing");
		driver.close();
	}

}

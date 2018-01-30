package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class guru99demo1 
{

	public static void main(String[] args)
	{
		
		//System.setProperty("webdriver.gecko.driver", "F://geckodriver.exe");
		
		/*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);*/
		
		
		WebDriver driver  = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/v4/");
		
		driver.findElement(By.name("uid")).sendKeys("mngr79580");
		
		driver.findElement(By.name("password")).sendKeys("YzunYdY");
		
		driver.findElement(By.name("btnLogin")).click();
		

	}

}

	
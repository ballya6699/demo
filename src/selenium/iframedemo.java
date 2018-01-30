package selenium;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframedemo 
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		System.out.println("Switch to 1st iframe");
		driver.findElement(By.name("firstname")).sendKeys("Nikhil");
		driver.findElement(By.name("lastname")).sendKeys("Bhalerao");

		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("iframe2");
		System.out.println("Switch to 2st iframe");
		driver.findElement(By.id("ui-id-2")).click();
		System.out.println("Switch to 2 Click");
		
		
		
	}

}

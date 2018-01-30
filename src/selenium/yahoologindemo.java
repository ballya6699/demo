package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class yahoologindemo 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com/");
		
		driver.findElement(By.xpath("//a[@id='uh-mail-link']")).click();

		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("demo6699@yahoo.com");  // login address
		
		driver.findElement(By.xpath("//input[@class='orko-button-primary orko-button']")).submit();
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		/*jse.executeScript("alert('welcome to the JavaScript');");
		jse.executeScript("");*/
		//jse.executeScript("document.getElementById('login-passwd').value = 'Ballya@6699';");
		
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Ballya@6699");
		
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		
		WebElement ele = driver.findElement(By.linkText("nikhil"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		driver.findElement(By.xpath("//a[@id='yucs-signout']")).click();
			
		int[] arr = new int[5];
		String str = "Hi I am Nikhil BHalerao";
		String str1[] = str.split(" ");
	}

}

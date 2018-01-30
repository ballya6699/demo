import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginDemo 
{
	public static void main(String[] args) 
	{
		
		WebDriver dri = new FirefoxDriver();
		dri.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dri.get("https://www.yahoo.com/");
		
		dri.findElement(By.id("yucs-mail_link_id")).click();
		
		dri.findElement(By.id("login-username")).sendKeys("demo6699@yahoo.com");
		
		dri.findElement(By.id("login-signin")).click();
		
		dri.findElement(By.id("login-passwd")).sendKeys("Ballya@6699");
		
		dri.findElement(By.id("login-signin")).click();		
		//dri.close();
	}

}

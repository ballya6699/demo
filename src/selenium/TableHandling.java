package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableHandling 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		List<WebElement> tr = driver.findElements(By.tagName("tr"));
		
		System.out.println("tr = "+tr.size());
		
		List<WebElement> td = driver.findElements(By.tagName("td"));
		
		System.out.println("td = "+td.size());
		
		List<WebElement> th = driver.findElements(By.tagName("th"));
		
		System.out.println("th = "+th.size());
		
		for (int i = 0; i < tr.size(); i++) 
		{
			System.out.print(tr.get(i).getText());
			for (int j = 0; j < td.size(); j++) 
			{
				System.out.print(td.get(j).getText());
			}
			System.out.println();
		}
		
		driver.close();
	}

}

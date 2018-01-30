package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class largervaluefromtable 
{
	public static void main(String[] args) 
	{
		long start_time = System.currentTimeMillis();
		WebDriver driver  = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		int lowest = 0;
		int higest = 0;
		
		List<WebElement> row = driver.findElements(By.xpath("//tbody/tr"));
		int row_count = row.size();
		System.out.println(row_count);
		
		for(int i =1; i<row_count;i++)
		{	
			List<WebElement> col = driver.findElements(By.xpath("//td[3]"));
			for (int j = 1; j < col.size(); j++)
			{
				String str = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+j+"]/td[3]")).getText();
				String[] s = str.split("m");
				int a = Integer.parseInt(s[0]);
				int k = j+1;
				String str1 = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+k+"]/td[3]")).getText();
				String[] s1 = str1.split("m");
				int b = Integer.parseInt(s1[0]);
				//System.out.println("B - "+b);
				
				if(a<b)
				{
					lowest = a;
					/*a=b;
					b=higest;*/
				}
				else
				{
					higest = a;
				}
							
				//System.out.println("--------------------------- END -----------------------");
			}
			
			//System.out.println("--------------------------- ALL END -----------------------");
		}
		
		System.out.println("Higest : - " + higest);
		System.out.println("Lowest : - " + lowest);
		
		long end_time = System.currentTimeMillis();
		
		long total_time = end_time-start_time;
		System.out.println(total_time);
		
		driver.close();
	}
}

package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class getallelementsfromdropdown 
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-form/?firstname=&lastname=&photo=&continents=Asia&selenium_commands=Browser+Commands&submit=");
		
		Select select = new Select(driver.findElement(By.id("continents")));
		List<WebElement> li = select.getOptions();
		for (WebElement webElement : li) 
		{
			String str = webElement.getText();
			System.out.println(str);
		}
		
		System.out.println("Display selected option...");
		select.selectByVisibleText("Europe");
		String str1 = select.getFirstSelectedOption().getText();
		System.out.println(str1);
		
		System.out.println("Multipal Select option...");
		
		Select multiSelect = new Select(driver.findElement(By.id("selenium_commands")));
		boolean b = multiSelect.isMultiple();
		System.out.println(b);
		
		multiSelect.selectByIndex(0);
		multiSelect.selectByVisibleText("Switch Commands");
		
		System.out.println("Display multi Select options..");
		
		List<WebElement> li1 = multiSelect.getAllSelectedOptions();
		for (WebElement webElement : li1) 
		{
			System.out.println("Multipal select : - "+webElement.getText());
		}
		
		String str = Keys.chord(Keys.CONTROL,Keys.ALT,Keys.DELETE);
		driver.findElement(By.id("")).sendKeys(str);
	}

}

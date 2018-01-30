package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestngDemo 
{
	
	WebDriver driver = new FirefoxDriver();
  @Test
  public void verifyTitle() 
  {
	  
	  driver.get("https://www.google.co.in/?gws_rd=ssl");
	  String exceptedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  org.testng.Assert.assertEquals(exceptedTitle, actualTitle);
	  System.out.println("Script Ends..");
	  
  }
}

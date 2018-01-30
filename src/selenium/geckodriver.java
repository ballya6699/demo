package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class geckodriver {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver", "F://geckodriver.exe");
		WebDriver dri = new FirefoxDriver();
		dri.get("https://www.google.co.in/?gws_rd=ssl");

	}

}

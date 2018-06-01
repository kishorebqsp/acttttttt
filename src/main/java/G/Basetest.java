package G;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Constant{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	    driver=new FirefoxDriver();
	   driver.get("http://localhost/login.do");
		
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.quit();
	}

}

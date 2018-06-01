package G;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage extends Basetest {
	public WebDriver driver;
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifytitle(String title)
	{try{
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs(title));
		Reporter.log("title matching",true);
	}
	catch(Exception e)
	{
		Reporter.log("title not matching",true);
		Assert.fail();
	}}
	
	public void verifyelement(WebElement elements)
	{
		try{
			WebDriverWait wait =new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
			Reporter.log("element matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("element not matching",true);
			Assert.fail();
		}
		
	}
		
	}



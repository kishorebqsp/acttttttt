package P;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import G.Basepage;

public class Homepage extends Basepage {
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement helpbtn;
	
	@FindBy(xpath="//a[.='About actiTIME']")
	private WebElement aboutacttime;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement closebtn;
	
	@FindBy(xpath="//span[.='actiTIME 2014 Pro']")
	private WebElement version;
	
	public Homepage(WebDriver driver)
	{
		super(driver);//to match super class constructor it is contrutor changring 
		PageFactory.initElements(driver,this);
	}
	
	public void logout()
	{
		logoutbtn.click();
	}
	
	public void help()
	{
		helpbtn.click();
	}
  public void about()
  {
	  aboutacttime.click();
  }
  
  public void close()
  {
	  closebtn.click();
  }
  public void verifyelement(String titleis)
  {
	  String t = version.getText();
	  Assert.assertEquals(t,titleis);
  }

}

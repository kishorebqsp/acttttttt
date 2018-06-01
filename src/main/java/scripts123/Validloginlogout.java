package scripts123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import G.Basetest;
import G.Excel;
import P.Loginpage;
import P.Homepage;
import P.Loginpage;

public class Validloginlogout extends Basetest {
	
@Test
public void test1()
{
	String un = Excel.getCellV(PATH,"validlogin",1,0);
	String pwd = Excel.getCellV(PATH,"validlogin",1,1);
	
	Loginpage l=new Loginpage(driver);
	l.username(un);
	l.password(pwd);
	l.login1();
	Homepage h=new Homepage(driver);
	h.logout();
}

}

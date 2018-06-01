package scripts123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import G.Basetest;
import G.Excel;
import P.Homepage;
import P.Loginpage;
import P.Loginpage;

public class Verfiy extends Basetest {
	@Test
	public void test3() throws InterruptedException
	{
		
		String un = Excel.getCellV(PATH,"bulidversion",1,0);
		String pwd = Excel.getCellV(PATH,"bulidversion",1,1);

		Loginpage l=new Loginpage(driver);
		Thread.sleep(2000);
		l.username(un);
		Thread.sleep(2000);
		l.password(pwd);
		Thread.sleep(2000);
		l.login1();
	Homepage h=new Homepage(driver);
		Thread.sleep(2000);
	h.help();
		Thread.sleep(2000);
	h.about();
		Thread.sleep(2000);
	h.close();
		Thread.sleep(2000);
	h.logout();
	}

}

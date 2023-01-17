package hrPageTestCase;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import common_Actions.BaseClass;
import hrPageObjects.LoginPage;

public class TC_LoginTestCase_001 extends BaseClass{
	//Webdriver driver;
	public static Logger logger=Logger.getLogger(TC_LoginTestCase_001.class); 
	LoginPage login=new LoginPage();
	
	@Test
	public void LoginVerify() 
	{
		login.setuserName();
		logger.info("enter the username done");
		login.setpassword();
		logger.info("enter the Password done");
		login.Clickbutton();
		logger.info("click on login done");
		login.verifydashboard();
		logger.info("verify Dshboard");
	}

}

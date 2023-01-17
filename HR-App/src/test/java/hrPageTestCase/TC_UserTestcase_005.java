package hrPageTestCase;

import java.awt.AWTException;

import org.testng.annotations.Test;

import hrPageObjects.Userspage;

public class TC_UserTestcase_005 {
	
	Userspage Object=new Userspage();
	@Test
	public void verifyuser() throws AWTException, InterruptedException {
		Object.users();
		
	}

}

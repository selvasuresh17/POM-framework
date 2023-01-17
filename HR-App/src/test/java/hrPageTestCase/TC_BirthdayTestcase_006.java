package hrPageTestCase;

import org.testng.annotations.Test;

import hrPageObjects.Birthdaypage;

public class TC_BirthdayTestcase_006 {
	
	Birthdaypage day=new Birthdaypage();
	@Test
	public void verifyBirthday() {
		day.Birthday();
	}

}

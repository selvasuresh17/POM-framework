package hrPageTestCase;

import org.testng.annotations.Test;

import hrPageObjects.LeavesPage;

public class TC_leavesTestcase_003 {
	LeavesPage Leave=new LeavesPage();
	
	@Test
	public void verifyleave() throws InterruptedException {
		Leave.leaveTestcase();
	}

}

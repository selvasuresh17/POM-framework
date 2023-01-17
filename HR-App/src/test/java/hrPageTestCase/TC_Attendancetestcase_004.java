package hrPageTestCase;

import org.testng.annotations.Test;

import hrPageObjects.AttendancePage;

public class TC_Attendancetestcase_004 {
	AttendancePage attendance=new AttendancePage();
	
	@Test
	public void verifyattendance() {
		attendance.AttendanceTestcase();
		
	}

}

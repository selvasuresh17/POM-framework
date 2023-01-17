package hrPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common_Actions.BaseClass;

 public class AttendancePage extends BaseClass {
	

	     //Attendance Module click
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[4]/span/span[2]/p")
		public static WebElement AttendanceMd;

		//All Attendance Module page Obj
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/mat-nav-list/a[1]/span/span[2]/p")
		public static WebElement AllAttend;

		//click the Dropdown entries
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-attendance-list/div/div/mat-card/mat-card-content/div[3]/mat-tab-group/div/mat-tab-body[2]/div/div/div[1]/label/select")
		public static WebElement entrydrpdown;

		//click the date textfield
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-attendance-list/div/div/mat-card/mat-card-content/mat-form-field/div/div[1]/div[1]/input")
		public static WebElement datetextfield;

		//click the date textfield
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-attendance-list/div/div/mat-card/mat-card-content/mat-form-field/div/div[1]/div[1]/input")
		public static WebElement datetextfield1;
		
		//click the dropdown in datepicker
		@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]")
		public static WebElement dropdatepicker;
	    
		//click the year 
		@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[2]/td[3]/button/div[1]")
		public static WebElement selectyear;
		
		//click the month 
		@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[4]/td[4]/button/div[1]")
		public static WebElement selectmonth;
		
		//click the date
		@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[1]/td[2]/button/div[1]")
		public static WebElement selectdate;
		
		//click the Export Button
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-attendance-list/div/div/mat-card/mat-card-content/div[1]/div[3]/button/span[1]")
		public static WebElement exportbutton;
		
		
		//click the myAttendance
		@FindBy(xpath="//span[contains(.,'My Attendance')]")
		public static WebElement Myattendance;
		
		//click the search
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-attendance-view/div/div/mat-card/mat-card-content/div[3]/div[2]/mat-card-content/div/div/div[2]/label/input")
		public static WebElement searchtextfeild;
		
		//click the drpentries
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-attendance-view/div/div/mat-card/mat-card-content/div[3]/div[2]/mat-card-content/div/div/div[1]/label/select")
		public static WebElement attdrpdown;
		
		

        public void AttendanceTestcase() {
        	
        		PageFactory.initElements(driver, AttendancePage.class);
        		
        		AttendancePage.AttendanceMd.click();
        		AttendancePage.AllAttend.click();
        		AttendancePage.datetextfield.click();
        		AttendancePage.dropdatepicker.click();
        		AttendancePage.selectyear.click();
        		AttendancePage.selectmonth.click();
        		AttendancePage.selectdate.click();
        		AttendancePage.AttendanceMd.click();
        		AttendancePage.exportbutton.click();
        		AttendancePage.Myattendance.click();
        		AttendancePage.searchtextfeild.sendKeys(properties.getProperty("search"));

        		Select drop=new Select(AttendancePage.attdrpdown);
        		drop.selectByVisibleText("5");
        		AttendancePage.searchtextfeild.clear();
        		AttendancePage.searchtextfeild.sendKeys(properties.getProperty("search1"));
        		drop.selectByVisibleText("25");
        		
        		
        }

}

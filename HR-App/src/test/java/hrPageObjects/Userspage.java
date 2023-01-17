package hrPageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_Actions.BaseClass;

public class Userspage extends BaseClass

{
	//clk users module
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[5]/span/span[2]/p")
	public static WebElement usermoduleclk;
	
	//clk add users module
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/mat-nav-list/a[2]/span/span[2]/p")
	public static WebElement addusersclk;
	
	//enter the userfirstname
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[1]/div[1]/mat-form-field/div/div[1]/div/input")
	public static WebElement userfirstname;
	
	//enter the userlastname
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[1]/div[3]/mat-form-field/div/div[1]/div/input")
	public static WebElement userlastname;
	
	//enter the designation
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[2]/div[1]/mat-form-field/div/div[1]/div/input")
	public static WebElement userdesignation;
	
	// Drop down select the role
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[2]/div[3]/mat-form-field/div/div[1]/div/mat-select")
	public static WebElement userrole;
	
	//select the dropdown
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span")
	public static WebElement selectdropdown;
	
	//enter the email
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[3]/div[1]/mat-form-field/div/div[1]/div/input")
	public static WebElement emailinput;
	
	//enter the Contact Num
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[4]/div[1]/mat-form-field/div/div[1]/div/input")
	public static WebElement contactnum;
	
	
	
	//Clk the DatePicker icon
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[4]/div[3]/mat-form-field/div/div[1]/div[1]/input")
	public static WebElement datepickericonDOB;
	
	//click the year button
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")
    public static WebElement yearbuttonDOB;
	
	//select Year
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[1]/td[1]/button/div[1]")
	public static WebElement selectyearDOB;
	
	//select Month 
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[4]/td[2]/button/div[1]")
    public static WebElement selectmonthDOB;
	
	//select Date
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[5]/button/div[1]")
	public static WebElement selectdateDOB;
	
	//select gender
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[5]/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	public static WebElement selectgender;
	
	//select particular
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span")
	public static WebElement selectparticulargender;
	
	//enter the employee
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[5]/div[3]/mat-form-field/div/div[1]/div/input")
	public static WebElement employeeId;
	
	//create password
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[6]/div[1]/mat-form-field/div/div[1]/div[1]/input")
	public static WebElement createpassword;
	
	
	//confirm password
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[6]/div[3]/mat-form-field/div/div[1]/div[1]/input")
	public static WebElement confirmpassword;
	
	//click designationrole
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[7]/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	public static WebElement designationclk;
	
	//click designationrole
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/mat-option[8]")
	public static WebElement designationrole;
	
	//click datepickericon
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[7]/div[3]/mat-form-field/div/div[1]/div[1]/input")
	public static WebElement dateofjoiningDOJ;  
	
	//click the year 
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]")
	public static WebElement clickyrDOJ;
	
	//select the year
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[6]/td[4]/button/div[1]")
	public static WebElement selectyrDOJ;
	
	//select month for DOJ
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[4]/td[4]/button/div[1]")
	public static WebElement selectmonthDOJ;
	
	//select the date
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[4]/button/div[1]")
	public static WebElement selectdateDOJ;
	
	//upload image
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[8]/div[1]/div/label/span")
	public static WebElement uploadpicbuttonclk;
	
	//click submit button
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-add/div/div/mat-card/mat-card-content/form/div[9]/div[2]/button[2]")
	public static WebElement submitbutton;

	//Validate the Add user 
	
	//enter the search
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-list/div/div/div/div[2]/label/input")
	public static WebElement searchtextfield;
	
	//click view icon
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-user-list/div/div/div/table/tbody/tr/td[7]/a[2]")
	public static WebElement viewicon;
	
	
	public void users() throws AWTException, InterruptedException {
		PageFactory.initElements(driver, Userspage.class);
//click the usermodule		
		Userspage.usermoduleclk.click();
//click the user>add user module		
		Userspage.addusersclk.click();
//Enter the firstname and Lastname		
		Userspage.userfirstname.sendKeys(properties.getProperty("Firstname"));
		Userspage.userlastname.sendKeys(properties.getProperty("Lastname"));
//enter the designation		
		Userspage.userdesignation.sendKeys(properties.getProperty("Desgination"));
		Userspage.userrole.click();
		Userspage.selectdropdown.click();
		Userspage.emailinput.sendKeys(properties.getProperty("E-mail"));
		Userspage.contactnum.sendKeys(properties.getProperty("mobile"));
		Userspage.datepickericonDOB.click();
		Userspage.yearbuttonDOB.click();
		Userspage.selectyearDOB.click();
		Userspage.selectmonthDOB.click();
		Userspage.selectdateDOB.click();
		Userspage.selectgender.click();
		Userspage.selectparticulargender.click();
		Userspage.employeeId.sendKeys(properties.getProperty("empID"));
//password		
		Userspage.createpassword.sendKeys(properties.getProperty("Password"));
		Userspage.confirmpassword.sendKeys(properties.getProperty("conformPassword"));
//Designation click		
		Userspage.designationclk.click();
		Userspage.designationrole.click();
//Date of Joining		
		Userspage.dateofjoiningDOJ.click();
		Userspage.clickyrDOJ.click();
		Userspage.selectyrDOJ.click();
		Userspage.selectmonthDOJ.click();
		Userspage.selectdateDOJ.click();
//Upload PICture		
		Userspage.uploadpicbuttonclk.click();
		Thread.sleep(3000);
		StringSelection path=new StringSelection("C:\\Users\\GIS023\\Downloads\\Thor.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
//submit action		
		Userspage.submitbutton.click();
//verify the user in all user		
		Userspage.searchtextfield.sendKeys(properties.getProperty("searchuser"));
		Userspage.viewicon.click();
		
		
	}
	
	


}

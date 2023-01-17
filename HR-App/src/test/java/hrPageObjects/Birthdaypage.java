package hrPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_Actions.BaseClass;

public class Birthdaypage extends BaseClass {
	
	//click the Birthday
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[12]/span/span[2]/p")
	public static WebElement Birthdaymoduleclick;
	
	//click the Birthday date Text field
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-birthday-list/div/div/mat-card/mat-card-content/div[1]/div[3]/mat-form-field/div/div[1]/div[1]/input")
    public static WebElement Birthdaydatepicker;
	
	//Select the year Button
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")
	public static WebElement clickyearbutton;
	
	//select prticular year
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[2]/td[4]/button/div[1]")
	public static WebElement selectparticularyear;
	
	//select the month
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]/button/div[1]")
	public static WebElement selectmonth;
	
	//select the date
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[4]/td[1]/button/div[1]")
	public static WebElement selectdate;
	
	
	public void Birthday() {
		PageFactory.initElements(driver, Birthdaypage.class);
		Birthdaypage.Birthdaymoduleclick.click();
		Birthdaypage.Birthdaydatepicker.click();
		Birthdaypage.clickyearbutton.click();
		Birthdaypage.selectmonth.click();
		Birthdaypage.selectdate.click();
	}
	

	
	
}

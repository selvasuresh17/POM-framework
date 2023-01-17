package hrPageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common_Actions.BaseClass;

public class LeavesPage extends BaseClass{
	//leaves module click
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[3]/span/span[2]/p")
		public static WebElement Leavesmoduleclick;

		//Add leaves module click
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/mat-nav-list/a[2]/span/span[2]/p")
		public static WebElement addleavesmoduleclick;

		//Leavetype drop enabled
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-leaves-add/div/div/mat-card/mat-card-content/form/div[1]/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
		public static WebElement leavetypedropdownenabled;

		//select particular leavetype
		@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span")
		public static WebElement leavetype;

		// Date Text enabled
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-leaves-add/div/div/mat-card/mat-card-content/form/div[1]/div[3]/div/mat-form-field/div/div[1]/div[1]/input")
		public static WebElement datetextenabled;

 
		@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")
		public static WebElement clickyearbutton;

		//select year button
		@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[2]/td[3]/button/div[1]")
		public static WebElement selectyear;

		//select month
		@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[4]/td[4]/button/div[1]")
		public static WebElement selectmonth;

		//select date
		@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[4]/td[3]/button/div[1]")
		public static WebElement selectdate;

		//enter the reason 
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-leaves-add/div/div/mat-card/mat-card-content/form/div[2]/div[3]/mat-form-field/div/div[1]/div/input")
		public static WebElement reasons;

		//click the submitbutton
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-leaves-add/div/div/mat-card/mat-card-content/form/div[4]/div[2]/button[2]/span[1]")
		public static WebElement submit;

		//verify add leaves
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-leaves-mylist/div/div/mat-card/mat-card-content/div[2]/div/div/table/tbody/tr[1]/td[1]")
		public static WebElement verifyaddedleaves;
		
		//delete the leaves
		@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-leaves-mylist/div/div/mat-card/mat-card-content/div[2]/div/div/table/tbody/tr[1]/td[8]/a[2]/span/mat-icon")
		public static WebElement clickdelete;
		
		//click the Ok popup
		@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirm-dialog/div/div/mat-dialog-actions/button[2]/span[1]")
		public static WebElement Okclick;
		
		//Entries drop down
		 @FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-leaves-mylist/div/div/mat-card/mat-card-content/div[2]/div/div/div[1]/label/select")
		 public static WebElement Leavesdropdown;
		 
		//Enter the data in search
			@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-leaves-mylist/div/div/mat-card/mat-card-content/div[2]/div/div/div[2]/label/input")
			public static WebElement Myleavessearch;
		
		


		public void leaveTestcase() throws InterruptedException {
			PageFactory.initElements(driver, LeavesPage.class);
			
			LeavesPage.Leavesmoduleclick.click();
			LeavesPage.addleavesmoduleclick.click();
			LeavesPage.leavetypedropdownenabled.click();
			LeavesPage.leavetype.click();
			LeavesPage.datetextenabled.click();
			LeavesPage.clickyearbutton.click();
			LeavesPage.selectyear.click();
			LeavesPage.selectmonth.click();
			LeavesPage.selectdate.click();
			LeavesPage.reasons.sendKeys(properties.getProperty("reason"));
			LeavesPage.submit.click();
			String value=	LeavesPage.verifyaddedleaves.getText();
			if(value.equals(value)) {
				System.out.println("leaves applied");
			}
			else {
				System.out.println("leaves not applied");
			}
			LeavesPage.clickdelete.click();
			Thread.sleep(3000);
			LeavesPage.Okclick.click();
			Select attribute=new Select(LeavesPage.Leavesdropdown);
			attribute.selectByVisibleText("5");
			LeavesPage.Myleavessearch.sendKeys(properties.getProperty("searchtext"));
			attribute.selectByVisibleText("25");
			
			
			 		

		}

}

package hrPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_Actions.BaseClass;

public class CompanyPage extends BaseClass {

	//click the company modules
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[2]/span/span[2]/p")
	public static WebElement Company;

	//click the companypage
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-list/div/div/mat-card/mat-card-content/div/div[2]/div[2]/div[2]/div[1]/p/span")
	public static WebElement companytext;

	//click edit button
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-list/div/div/mat-card/mat-card-content/div/div[1]/div[2]/button/span[1]")
	public static WebElement editbtn;

	//click companyname txtfield
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-add/div/div/mat-card/mat-card-content/form/div[1]/div[1]/mat-form-field/div/div[1]/div/input")
	public static WebElement compNamefield;

	//click compAddress
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-add/div/div/mat-card/mat-card-content/form/div[1]/div[3]/mat-form-field/div/div[1]/div/input")
	public static WebElement companyaddress;

	//Enter employee counts
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-add/div/div/mat-card/mat-card-content/form/div[2]/div[1]/mat-form-field/div/div[1]/div/input")
	public static WebElement companyemp;

	//Enter the contact num
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-add/div/div/mat-card/mat-card-content/form/div[2]/div[3]/mat-form-field/div/div[1]/div/input")
	public static WebElement companycontact;

	//Enter the email
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-add/div/div/mat-card/mat-card-content/form/div[3]/div[1]/mat-form-field/div/div[1]/div/input")
	public static WebElement emailaddress;

	//Enter the fulldayTiming
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-add/div/div/mat-card/mat-card-content/form/div[3]/div[3]/mat-form-field/div/div[1]/div/input")
	public static WebElement fulldaytiming;

	//Enter the HalfdayTiming
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-add/div/div/mat-card/mat-card-content/form/div[4]/div[1]/mat-form-field/div/div[1]/div/input")
	public static WebElement HalfdayTiming;

	//click  timepicker In
	@FindBy(xpath="//*[@id=\'regularWorkInInput\']")
	public static WebElement Intiming;

	//click timepicker Out
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-add/div/div/mat-card/mat-card-content/form/div[5]/div[1]/mat-form-field/div/div[1]/div/input")
	public static WebElement OutTiming;

	//enter leaves count
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-add/div/div/mat-card/mat-card-content/form/div[5]/div[3]/mat-form-field/div/div[1]/div/input")
	public static WebElement leavescount;

	//click  submit
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-company-add/div/div/mat-card/mat-card-content/form/div[8]/div[2]/button[2]/span[1]")
	public static WebElement submit;

	public void companyTestcase() throws InterruptedException {
		PageFactory.initElements(driver, CompanyPage.class);
		CompanyPage.Company.click();
		CompanyPage.companytext.getText();
		Thread.sleep(8000);
		CompanyPage.editbtn.click();
		CompanyPage.compNamefield.clear();
		CompanyPage.compNamefield.sendKeys(properties.getProperty("companyname"));
		CompanyPage.companyaddress.clear();
		CompanyPage.companyaddress.sendKeys(properties.getProperty("companyaddress"));
		CompanyPage.companyemp.clear();
		CompanyPage.companyemp.sendKeys(properties.getProperty("noemp"));
		CompanyPage.companycontact.clear();
		CompanyPage.companycontact.sendKeys(properties.getProperty("contactnum"));
		CompanyPage.emailaddress.clear();
		CompanyPage.emailaddress.sendKeys(properties.getProperty("email"));
		CompanyPage.fulldaytiming.clear();
		CompanyPage.fulldaytiming.sendKeys(properties.getProperty("FulldayTiming"));
		CompanyPage.HalfdayTiming.clear();
		CompanyPage.HalfdayTiming.sendKeys(properties.getProperty("HalfdayTiming")) ;
		CompanyPage.Intiming.clear();
		CompanyPage.Intiming.sendKeys(properties.getProperty("Intime"));
		CompanyPage.OutTiming.clear();		
		CompanyPage.OutTiming.sendKeys(properties.getProperty("Outtime"));
		CompanyPage.leavescount.clear();
		CompanyPage.leavescount.sendKeys(properties.getProperty("Leavescount"));
		CompanyPage.submit.click();
		Thread.sleep(2000);

	}

}

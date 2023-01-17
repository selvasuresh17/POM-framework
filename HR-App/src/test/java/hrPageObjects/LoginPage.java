package hrPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_Actions.BaseClass;

public class LoginPage extends BaseClass {

    //Username PageObjects
	@FindBy(xpath="/html/body/app-root/app-login/div/form/mat-card/mat-card-content/mat-form-field[1]/div/div[1]/div/input")

	public static WebElement txtusername;

	//Password PageObjects
	@FindBy(xpath="/html/body/app-root/app-login/div/form/mat-card/mat-card-content/mat-form-field[2]/div/div[1]/div[1]/input")
	public static WebElement txtpassword;

	//Login button pageObjects
	@FindBy(xpath="//*[@id=\'login\']")
	public static WebElement Loginbutton;
	
	//Verify the DashBoard
	@FindBy(xpath="/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-dashboard-home/div/div/div[1]/h2")
	public static WebElement DashBoard;



	public void setuserName() 
	{
		PageFactory.initElements(driver,LoginPage.class);
		LoginPage.txtusername.sendKeys(properties.getProperty("Username"));
	}

	public void setpassword() 
	{
		LoginPage.txtpassword.sendKeys(properties.getProperty("Passwrd"));
	}

	public void Clickbutton() 
	{
		LoginPage.Loginbutton.click(); 	
	}
	public void  verifydashboard() {
		LoginPage.DashBoard.getText();
	
	}

}

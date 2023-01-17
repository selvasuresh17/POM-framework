package common_Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import hrUtilityFiles.ExtentReport;

public class BaseClass {
	
	public static Properties properties;
    public static WebDriver driver;
    public static Logger logger;
    
    public Properties Loadproperty() throws IOException {
    	FileInputStream property=new FileInputStream("D:\\Selinium\\workspace\\HR-App\\HRM-Config.properties\\config.properties");
        properties=new Properties();
    	properties.load(property);
    	return properties;
    	
    }
    public void logFile() {
    	PropertyConfigurator.configure("D:\\Selinium\\workspace\\HR-App\\HRM-Log.properties\\log4j.properties");
    }
    @SuppressWarnings("deprecation")
	@BeforeTest
    public void Setup() throws IOException {
  
    	logFile();
    	Loadproperty();
    	String  browser=properties.getProperty("Browser");
		String url=properties.getProperty("Url");
		String driverlocation=properties.getProperty("Driverlocation");


		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",driverlocation );
			driver=new ChromeDriver();
			

		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",driverlocation );
			driver=new FirefoxDriver();

		}
 
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	
    }
        @AfterTest
       public void Brokedown() {
    	 //  driver.quit();
       } 
    }

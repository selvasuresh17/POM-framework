package hrUtilityFiles;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import common_Actions.BaseClass;

public class ExtentReport extends BaseClass {
	public static ExtentReports	extent;
	public static ExtentSparkReporter HTMLreport;
	public static ExtentTest test;
	
	public static void extentreportset() throws IOException  {
		HTMLreport=new ExtentSparkReporter(System.getProperty("user.dir")+"/extentReport/HR_APP_REPORT.html");
		HTMLreport.loadXMLConfig(System.getProperty("user.dir")+"//Extentconfig.xml");
		HTMLreport.config().setDocumentTitle("Automation Test Report");
		HTMLreport.config().setReportName("GIS-HR-Manage App Report");
		HTMLreport.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(HTMLreport);
	
		extent.setSystemInfo("Project Name", "GIS-HR_Manage Application");
		extent.setSystemInfo("OS Name", "Window-12");
		extent.setSystemInfo("Browser Name", "Chrome");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Suresh");
	}

	public static void endReport() 
	{
		extent.flush();
	}


}

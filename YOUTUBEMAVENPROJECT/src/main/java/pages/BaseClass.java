package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilitypackage.BrowserFactory;
import utilitypackage.ConfigDataProvider;
import utilitypackage.ExcelDataProvider;
import utilitypackage.Helper;

public class BaseClass {
public WebDriver driver;
public ExcelDataProvider excel;
public ConfigDataProvider config;
public ExtentReports report;
public ExtentTest logger;

@BeforeSuite
public void setUpSuite() throws IOException
{   
	Reporter.log("Setting up reports and Test is getting ready ", true);
	excel = new ExcelDataProvider(); 
	config= new ConfigDataProvider();  
	
	
    ExtentSparkReporter extent = new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/Reports/FreeCRM_"+Helper.getCurrentDateTime()+".html"));
	report= new ExtentReports();
	report.attachReporter(extent);
	Reporter.log("Setting done-Test can be started ", true);
}
	
	@BeforeClass
	public void setup() {
		Reporter.log("Trying to start browser and getting application ready ", true);
		driver = BrowserFactory.startApplication( driver,config.getBrowser(),config.getStagingURL());	
		Reporter.log("Browser and Application is up and running ", true);
	}	
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		BrowserFactory.quitBrowser(driver);
	}
@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
	Reporter.log("Test is about to end", true);
	      if (result.getStatus()==ITestResult.FAILURE)
	    	  
	      { 
	      logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
	}     
	      else if (result.getStatus()==ITestResult.SUCCESS)
	    	  
	      { 
	      logger.pass("Test passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
	}
 else if (result.getStatus()==ITestResult.SKIP)
	    	  
	      { 
	      logger.skip("Test skipped", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
	}     
	  report.flush(); 
		Reporter.log("Test completed >>> Reports Generated", true);
	}
}

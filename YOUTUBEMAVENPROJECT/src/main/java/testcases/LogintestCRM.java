package testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginPage;


public class LogintestCRM extends BaseClass {

@Test
public void Loginapp() throws InterruptedException, IOException  {
	
logger=report.createTest("Login to CRM");
	System.out.println("hi parul here");
	LoginPage loginpage = PageFactory.initElements (driver,LoginPage.class);
	logger.info("Starting Application");
	loginpage.loginToCRM(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
	logger.pass("Login Successful");
	
}

}

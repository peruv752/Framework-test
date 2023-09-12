package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.TestNGException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	WebDriver driver;
@Test
@Parameters("browser")
public void Verifypagetitle(String browserName) throws TestNGException{
	
	if (browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("Webdriver.firefox.driver","/Users/manish/Downloads/chrome-mac-x64/chrome.exe");
	
	
		driver=new FirefoxDriver();
	}
	else if (browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("Webdriver.chrome.driver","/Users/manish/Downloads/chrome-mac-x64/chrome.exe");
	driver=new ChromeDriver();
	}
	else if (browserName.equalsIgnoreCase("InternetExplorer")) {
		System.setProperty("Webdriver.internetexplorer.driver","/Users/manish/Downloads/chrome-mac-x64/chrome.exe");
		driver=new InternetExplorerDriver();
}
driver.get("http://www.learn-automation.com");
System.out.println(driver.getTitle());
driver.quit();
}
}
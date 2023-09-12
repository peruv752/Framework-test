package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testng.listener.class)
public class Learnlisteners {
	
	@Test
	public void TitleVerify() {
		System.setProperty("Webdriver.firefox.driver","/Users/manish/Downloads/chrome-mac-x64/chrome.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		}
		
		@Test
		public void Titlematch() {
			System.out.println("test 2 dummy");
			Assert.assertTrue(false);
		}
		
	}
	



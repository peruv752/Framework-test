package in.seleniumtesting.youtube;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.NoSuchDriverException;

public class takescrenshot {

	 
		
		}
		}
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import java.io.File;
		import org.apache.commons.io.FileUtils;

		public class SeleniumScreenshot {
		    public static void main(String[] args) {
		        // Set the system property for the ChromeDriver executable (update path accordingly)
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Create a WebDriver instance
		        WebDriver driver = new ChromeDriver();

		        // Open a webpage
		        driver.get("https://www.example.com");

		        try {
		            // Take a screenshot and store it as a file
		            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		            // Specify where to save the screenshot
		            File destFile = new File("screenshot.png");

		            // Copy the screenshot to the destination file
		            FileUtils.copyFile(screenshotFile, destFile);

		            System.out.println("Screenshot saved as screenshot.png");
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Close the WebDriver
		            driver.quit();
		        }
		    }
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

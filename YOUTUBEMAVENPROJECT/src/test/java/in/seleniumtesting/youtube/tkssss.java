package in.seleniumtesting.youtube;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.NoSuchDriverException;

public class tkssss {

	
	
	
	public static void main(String[] args) throws NoSuchDriverException, InterruptedException, IOException  {
		
		System.setProperty("webdriver.gecko.driver","/Users/manish/Downloads/geckodriver");
				
				FirefoxDriver driver =new FirefoxDriver();
				driver.manage().window().maximize();
			
					driver.get("https://www.facebook.com");
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("cute_taurus142@yahoo.com");
			
			
			
			  try {
		            // Take a screenshot and store it as a file
		            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		            // Specify where to save the screenshot
		            File destFile = new File(".src/main/resources/Screenshots/fb.png");

		            // Copy the screenshot to the destination file
		            FileUtils.copyFile(screenshotFile, destFile);

		            System.out.println("Screenshot saved as screenshot.png");
		        } catch (Exception e) {
		            e.printStackTrace();
		        } 
			
		
			
			driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Punnu123%");
				System.out.println("please signup with your details");
				Thread.sleep(3000);
				
					driver.manage().window().maximize();
					
				
}
}
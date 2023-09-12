package dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlealert {

	public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
		
	System.setProperty("webdriver.gecko.driver", "/Users/manish/Downloads/geckodriver");
	 WebDriver driver = new FirefoxDriver();

	 
    driver.get("https://www.ksrtc.in/oprs-web/");
    driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
   Thread.sleep(3000);
   Alert alt=driver.switchTo().alert();
  	alt.accept();
	

	
	
	
	
}
}
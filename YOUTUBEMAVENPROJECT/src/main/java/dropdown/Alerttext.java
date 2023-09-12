package dropdown;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerttext {
	@Test
	public static void main(String[] args) throws ClassNotFoundException, InterruptedException,NoSuchWindowException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Downloads/geckodriver");
		 WebDriver driver = new FirefoxDriver();

		 
	    driver.get("https://www.ksrtc.in/oprs-web/");
	    driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
	   Thread.sleep(3000);
	  String actual_msg =driver.switchTo().alert().getText();
	  System.out.println("actual msg is "+actual_msg);
	  String exp_msg="Please select start place";
		Assert.assertEquals(actual_msg,exp_msg);
}
}
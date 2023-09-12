package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bootstrap {
public static void main (String[] args) throws ClassNotFoundException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Downloads/geckodriver");
	  
	    WebDriver driver = new FirefoxDriver();

	 
	    driver.get("https://seleniumpractise.blogspot.com/search?q=bootstrap+dropdown");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             driver.findElement(By.xpath("//*[@id='menu1']")).click();
             List<WebElement> menu =driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
             for ( int i = 0;i< menu.size();i++) {
            	 WebElement element= menu.get(i);
            	 String innerhtml = element.getAttribute("innerHTML");
            	 System.out.println("Values from dropdown are"+innerhtml);
             }
}
}
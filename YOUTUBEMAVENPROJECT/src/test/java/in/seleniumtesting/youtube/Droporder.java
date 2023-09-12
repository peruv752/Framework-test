package in.seleniumtesting.youtube;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.hc.core5.http2.frame.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Droporder {
public static void main(String[] args) throws ClassNotFoundException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Downloads/geckodriver");
	  
	    WebDriver driver = new FirefoxDriver();

	 
	    driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
	    Select tools = new Select (driver.findElement(By.xpath("//input[@id='tools']")));
	    
	    
	    List<WebElement> myTools= tools.getOptions();
	    List <String>actualist = new ArrayList<>();
	    for(WebElement ele:myTools) {
	    	
	    	String data = ele.getText();
	    	actualist.add(data);
	    } 
	    
	    List <WebElement>temp = new ArrayList();
	temp.addAll(actualist);
	Collections.sort(temp);
	Assert.assertTrue(actualist.equals(temp));
	

	}
}




   
     
       
   














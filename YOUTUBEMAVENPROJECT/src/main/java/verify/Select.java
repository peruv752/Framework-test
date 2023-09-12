package verify;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Assert;

public class Select {

public static void main (String[] args) throws ClassNotFoundException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Downloads/geckodriver");
	  
	    WebDriver driver = new FirefoxDriver();

	 
	    driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
 WebElement  toolElement = driver.findElement(By.xpath("//*[@id='tools']"));
	    Select tools = new Select (toolElement );
	    
	    
	    List<WebElements> myTools= tools.getOptions();
	    List <String>actualist = new ArrayList<>();
	    for(WebElement ele:myTools) {
	    	
	    	String data = ele.getText();
	    	actualist.add(data);
	    } 
	    
	    List <WebElement>temp = new ArrayList<>();
	temp.addAll(actualist);
	Collections.sort(temp);
	Assert.assertTrue(actualist.equals(temp));
	

	}
}

	
	


package verify;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {

	public static void main(String[] args)throws ClassCastException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Downloads/geckodriver");
	    // Create a WebDriver instance
	    WebDriver driver = new FirefoxDriver();

	 
	    driver.get("https://www.seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	List<WebElement> radiobuttons =  driver.findElement(By.xpath("//div[@name='lang' and @type='radio']"));
	for (WebElement radiobutton : radiobuttons) {
        printElementDetails(radiobutton);
        }
        if (value="RUBY".isSelected());
    	{   radiobutton.click();
    	}
        }
  
        private static void printElementDetails ( WebElement Element) {
 	       
	        System.out.println("Element Value: " + Element.getAttribute("value"));

	
	
	
	
	
	List< WebElement >checkbox=(List<WebElement>) driver.findElement(By.xpath("//input[@type='checkbox']"));
	for(int j=0 ; j<checkbox.size();j++) {
		
		WebElement element=checkbox.get(j);
		String id =element.getAttribute("id");
		if(id.equalsIgnoreCase("code"));
		{element.click();
		}
		}
	
	}
}
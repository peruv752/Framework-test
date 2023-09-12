package verify;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiosimple {

	public static void main(String[] args) throws NoSuchElementException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Downloads/geckodriver");
	    // Create a WebDriver instance
	    WebDriver driver = new FirefoxDriver();

	 
	    driver.get("https://www.seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
	WebElement radiobutton =  driver.findElement(By.xpath("//input[@value='maths' and @type='radio']"));

	      
	        if (!radiobutton.isSelected()) {
	            radiobutton.click();}
	        
	            printElementDetails(radiobutton); 
	}
	           

	private static void printElementDetails(WebElement Element) {
		
		
		 System.out.println("Element Value: " + Element.getAttribute("value"));
		
			}
    }
    // Close the browser window
   

	
	


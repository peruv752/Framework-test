package verify;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class Dropdown {

public static void main(String[] args) throws NoSuchElementException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Downloads/geckodriver");
	  
	    WebDriver driver = new FirefoxDriver();

	 
	    driver.get("https://www.facebook.com/signup");
	    
	    WebElement month_dropdown= driver.findElement(By.xpath("//*[@id='month']"));
	    Select month_dd =new Select(month_dropdown) ;
	    month_dd.selectByVisibleText("Apr");

	    WebElement selectedOption= month_dd.getFirstSelectedOption();
	    String selectedText= selectedOption.getText();
	    System.out.println("selected option: "+selectedText);
	   
	    
	    
	    List<WebElement>month_list=month_dd.getOptions();
	    int total_month=month_list.size();
	    System.out.println("the total month count is : "+total_month);
	    for(WebElement ele:month_list)
	    {
	    	String month_name=ele.getText();
             int exp=13;
	    	System.out.println("Months are ======"+month_name);
	    	equalsIgnoreCase(total_month,exp);
	    }
}
	 

private static boolean equalsIgnoreCase(int total_month, int exp) {
	
	return total_month.EqualsIgnoreCase(exp);
}

	    }


//WebElement month_dropdow= driver.findElement(By.xpath("//*[@id='month']"));
// Select month_dd =new Select(month_dropdown) ;
//  month_dd.selectByVisibleText("Apr");

//  WebElement selectedOption= month_dd.getFirstSelectedOption();
 //String selectedText= selectedOption.getText();
 //System.out.println("selected option: "+selectedText);












package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	

	WebDriver driver;
	
public LoginPage (WebDriver ldriver)
{      this.driver=ldriver;
}
@FindBy(xpath="//input[@name ='email']") WebElement username;
@FindBy(xpath="//input[@name ='password']") WebElement pass;
@FindBy(xpath="//*[@class='ui fluid large blue submit button']") WebElement loginButton;
 
public  void loginToCRM (String usrap, String pasap) {


  try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
		username.sendKeys(usrap);
	 
			pass.sendKeys(pasap);
		
			loginButton.click();
		
	}
}

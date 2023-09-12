package verify;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class title {

	 public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "/Users/manish/Downloads/geckodriver");
    // Create a WebDriver instance
    WebDriver driver = new FirefoxDriver();

 
    driver.get("https://www.inviul.com");

   String or = driver.getTitle();
   System.out.println("the title is "+ or);
	
   String ex = ("selenium");
  assert equalsIgnorecase (or,ex);
  System.out.println("test completed");

	 }

	private static boolean equalsIgnorecase(String or, String ex) {
		return or.equalsIgnoreCase(ex);
		
	}
}
	
	
	



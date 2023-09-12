package mavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {

	@Test
	public void startBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.learn-automation.com");
		Assert.assertTrue(driver.getTitle().contains("selenium"),("Title does not matcg"));
		driver.quit();
	}
}

package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Projectdependency {
WebDriver driver;
@Test
public void startapp() {
	driver=new FirefoxDriver();
	driver.get("https://www.makemytrip.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String currentURL = driver.getCurrentUrl();
	Assert.assertTrue(currentURL.contains("makemytrip"));
}
@Test
public void Loginapp() {
	driver.findElement(By.xpath("//div[@class='makeFlex column makeRelative vrtlCenter conCurLang geoSwitcher]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='username' and @name='username']")).sendKeys("purnimav81@gmail.com");
	driver.findElement(By.xpath("//div[@class='captext font16']")).click();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Punnu123%");
	driver.findElement(By.xpath("//div[@class='captext']")).click();
}
}

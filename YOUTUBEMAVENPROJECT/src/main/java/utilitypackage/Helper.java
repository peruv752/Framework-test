package utilitypackage;

import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	//Screenshot,alerts,frames,windows,Sync issue,javascript executor
	
	

	public static String captureScreenshot(WebDriver driver) {
		{
			
			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String screenshotPath = System.getProperty("user.dir")+"/Screenshots/FreeCRM_"+getCurrentDateTime() +".png";
			try {
				FileHandler.copy(src,new File(screenshotPath));
				//optional print
				System.out.println("Screenshot captured");
			} catch (Exception e) {
				System.out.println("Unable to capture screenshot"+e.getMessage());
	
	}

		return screenshotPath;
		}
	}
	public static String getCurrentDateTime()

	{  DateFormat customformat = new SimpleDateFormat ("MM/dd/yyyy HH:mm:ss");
	   Date currentDate = new Date();
	  return  customformat.format(currentDate);
	}




}
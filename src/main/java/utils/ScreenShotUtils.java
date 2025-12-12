
package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtils {
	WebDriver driver;
	
	
  public ScreenShotUtils(WebDriver driver) {
	  
	  this.driver = driver;
  }
  
  public String createScreenshot(String sName) {
	  
	  String timeStamp = new SimpleDateFormat("yyyymmdd_HHmmss").format(new Date());
	  String fileName = sName + "_" + timeStamp + ".png";
	  String filepath =  System.getProperty("user.dir")+"Screenshots/"+fileName;
	  
	  File srcF = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File destF =  new File(filepath);
	  
	  try{
		  FileUtils.copyFile(srcF, destF);
		  System.out.println("✅ Screenshot saved at: " + filepath);
	  }catch (IOException e) {
		  System.out.println("❌ Failed to save screenshot: " + e.getMessage());
	}
	  return filepath;
  }
}

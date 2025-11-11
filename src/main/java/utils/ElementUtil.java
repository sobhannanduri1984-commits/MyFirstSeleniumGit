package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	WebDriver driver;
	
	 public ElementUtil(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	 public WebElement getElement(By locator) {
		 try {
	            WebElement element = driver.findElement(locator);
	            Log.info("✅ Locator found: " + locator.toString());
	            return element;
	        } catch (Exception e) {
	            Log.info("❌ Locator NOT found: " + locator.toString());
	            throw e; // so test fails if locator is wrong
	        }

	 }
	 
	 public void doclick(By locator) {
		 getElement(locator).click();
		 Log.info("Clicked Element: "+locator.toString());
		 
	 }
	 
	 public void sendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
		 Log.info("⌨ Typed '" + value + "' into: " + locator.toString());
	 }
}

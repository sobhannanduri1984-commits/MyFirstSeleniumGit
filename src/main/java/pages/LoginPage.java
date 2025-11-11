package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ElementUtil;
import utils.Log;
import utils.ScreenShotUtils;

public class LoginPage {

	
	WebDriver driver;
	ElementUtil util;
	
	//By userName = By.cssSelector("input[name='username']");	
	//By password = By.cssSelector("input[name='password']");
	By loginBut = By.xpath("//button[normalize-space()='Login']");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		util = new ElementUtil(driver);
		
	}
	
	public void login(String user, String pass) {
		//driver.findElement(userName).sendKeys(user);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys(user);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement passw = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passw.sendKeys(pass);
        driver.findElement(loginBut).click();
        Log.info("after reading all locators");
        
	}
	
}

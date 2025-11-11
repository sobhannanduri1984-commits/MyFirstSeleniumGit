package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Log;

public class DashBoardPage {

	WebDriver driver;
	

	By profileMenu = By.xpath("//img[@alt='profile picture' and @class='oxd-userdropdown-img']");
	
	By logout = By.xpath("//a[text()='Logout']");
	
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		Log.info("in dashboard page");
	}
	
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement profileMenuDropdown = wait.until(ExpectedConditions.elementToBeClickable(profileMenu));
		profileMenuDropdown.click();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
			WebElement logoutbtn =	wait1.until(ExpectedConditions.elementToBeClickable(logout));
        logoutbtn.click();
    }
}

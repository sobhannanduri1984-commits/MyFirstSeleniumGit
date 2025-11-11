package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import reports.ExtentManager;
import utils.*;

public class BaseTest {

	protected WebDriver driver;
	ScreenShotUtils sUtils;
	
	@BeforeSuite
	public void loadConfig() {
		ConfigReader.loadConfig();
		
	}
	
	@BeforeMethod
	public void loadDriver() {
		driver = DriverFactory.getDriver();
		driver.manage().window().maximize();
		sUtils = new ScreenShotUtils(driver);
		driver.get(ConfigReader.get("url"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		ExtentManager.getReportsInstance().flush();
	}
	
}

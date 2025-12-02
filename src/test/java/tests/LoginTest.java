package tests;

import base.BaseTest;
import pages.DashBoardPage;
import pages.LoginPage;
import reports.ExtentManager;
import utils.ConfigReader;
import utils.Log;
import utils.ScreenShotUtils;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginAndLogoutTest() {
		
		ExtentManager.test = ExtentManager.getReportsInstance().createTest("Verify login and logout");
		Log.info("after extend manager + changed in Branch-feature/login");
		
		LoginPage loginPage = new LoginPage(driver);
		
		Log.info("after login page");
		DashBoardPage dash = new DashBoardPage(driver);
		
		
		
		loginPage.login(ConfigReader.get("userName"), ConfigReader.get("password"));
		ScreenShotUtils sUtil = new ScreenShotUtils(driver);
		sUtil.createScreenshot("TakeScreehot");
		Log.info("in login page");
		
		Log.info("Dashbpard page");
		dash.logout();
	}

}

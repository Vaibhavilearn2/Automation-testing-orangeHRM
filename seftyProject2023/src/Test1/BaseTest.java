package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava1.BaseClass;
import mainjava1.DashBoardPage;
import mainjava1.LoginPage;
import mainjava1.PIMPage;

public class BaseTest extends BaseClass  {
	@BeforeSuite
	public void intiBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}
	@BeforeClass
	public void pageObjects() {
	loginPage= new LoginPage(driver);
	dashBoardPage = new DashBoardPage(driver);
	pimPage = new PIMPage(driver);
	}
	@AfterClass
	public void logOutUser() {
		dashBoardPage.logOut();
	}
	
	@AfterSuite
	public void logoutUser() {
		driver.quit();
	
	}
}
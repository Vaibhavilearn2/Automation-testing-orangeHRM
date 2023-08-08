package mainjava1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test1.BaseTest;

public class DashBoardPage extends BaseTest {
	//locator
@FindBy(xpath = "//h6[text()='Dashboard']")
WebElement titleDashboardpage;
@FindBy(css=".oxd-userdropdown i")
WebElement clickLogoutDrpDown;

@FindBy(xpath="//*[text()='Logout']")
WebElement txtLogout;
//intialization
public DashBoardPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
//method 
/*
 * Author: vaibhavi Nighvekar
 * Date : 11 feb 2023
 * Description : This test method use to verify dashboard page title
 * parameter return : String
 */
public String titleofDashBoardPage() {
	return titleDashboardpage.getText();
}
/*
 * Author :vaibhavi Nighvekar
 * Date : 11 feb 2023 
 * Description : This test method use to logout from build  
 */
public void logOut() {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().refresh();
	clickLogoutDrpDown.click();
	txtLogout.click();
}
}

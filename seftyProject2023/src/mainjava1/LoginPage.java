package mainjava1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test1.BaseTest;

public class LoginPage extends BaseTest {
	// All the locators of page
	@FindBy(xpath = "//*[text()='Login']")
	WebElement textloginpge;
	@FindBy(name ="username")
	WebElement usrname;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(tagName="button")
	WebElement btnLogin;
	
	
	//Initialization of locator/variables 
	public LoginPage(WebDriver driver) {
		this.driver = driver ;
				PageFactory.initElements(driver, this);
	}
	//method required to perform test steps 
	/*
	 * Author: vaibhavi Nighvekar
	 * Date : 11 feb 2023
	 * Description : This test method use to verify login page title
	 * Parameter return : String
	 */
	public String titleofLoginPage() {
		return textloginpge.getText();
	}

		/*
		 * Author: vaibhavi Nighvekar
		 * Date : 11 feb 2023
		 * Description : This test method use to verify current  url of  page title
		 * Parameter return : String
		 */
		public String urlofPage() {
			return driver.getCurrentUrl();
		}
		/*
		 * Author: vaibhavi Nighvekar
		 * Date : 11 feb 2023
		 * Description : This test method use to set usernameValue
		 * 
		 */
		public void setUserName(String uerName) {
			usrname.sendKeys(uerName);
		}
		/*
		 * Author: vaibhavi Nighvekar
		 * Date : 11 feb 2023
		 * Description : This test method use to set passwordnameValue
		 * 
		 */
		public void setpassword(String password) {
			pass.sendKeys(password);
		}
		/*
		 * Author: vaibhavi Nighvekar
		 * Date : 11 feb 2023
		 * Description : This test method use to click login button 
		 * 
		 */
		public void clickLoginBtn() {
			btnLogin.click();
		}
		/*
		 * Author: vaibhavi Nighvekar
		 * Date : 11 feb 2023
		 * Description : This test method use to getBuild title
		 * 
		 */
		public String getBuildTitle() {
			return driver.getTitle();
		}
}



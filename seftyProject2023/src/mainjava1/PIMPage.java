package mainjava1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test1.BaseTest;

public class PIMPage extends BaseTest {
	@FindBy(xpath="//*[text()='PIM']")
	WebElement setPimPage;
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement TitleofPimPage;
	@FindBy(xpath="//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	WebElement SetEmid;
	@FindBy(xpath="//Button[@type='submit']")
	WebElement Clicksearchbtn;
	@FindBy(xpath="//div[@class='orangehrm-container']")
	WebElement SearchRecordID;
	public  PIMPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	/*
	 * Author : Vaibhavi Nighvekar
	 * Date : 11 Feb 2023 
	 * Description : This test method use to click on Pim page   
	 */
	public void clicknPimPageLink() {
		setPimPage.click();
	}
	/*
	 * Author : Vaibhavi Nighvekar
	 * Date : 11 Feb 2023 
	* Description : This test method use to return Pim page text
	 * parameter: String   
	 */
	public String getPimPageTitle() {
		return TitleofPimPage.getText();
	
}
	/*
	 * Author : Vaibhavi Nighvekar
	 * Date : 11 Feb 2023 
	* Description : This test method use to return Employeeid text
	 * parameter: String   
	 */
	public void SetPimPageEmid(String Emid) {
		SetEmid.sendKeys(Emid);
	}
	/*
	 * Author : Vaibhavi Nighvekar
	 * Date : 11 Feb 2023 
	* Description : This test method use to click serach Button  
	 */
	public void clickSreachbutton() {
		Clicksearchbtn.click();
	}
	/*
	 * Author : Vaibhavi Nighvekar
	 * Date : 11 Feb 2023 
	 * Description : This test method use to get emp id from searched results
	 * Parameter: String  
	 */
	public String getEmpIdFromSearchedResults(String empId) {
		Clicksearchbtn.click();
		return SearchRecordID.findElements(By.xpath("//div[text()='"+empId+"']")).get(0).getText();
	}
	
}
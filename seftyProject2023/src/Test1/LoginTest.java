 package Test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	@Test(priority=0,groups= {"Smoke","regression"})
	public void verifytitleofloginpage() {
		String verifytileofloginPage = loginPage.titleofLoginPage();
		Assert.assertEquals(verifytileofloginPage, "Login");
	}
	@Test(priority=1,groups= {"Smoke","regression"})
	public void verifyCurrenturlofpage() {
		String veriycurrenturlofPage = loginPage.urlofPage();
		Assert.assertEquals(veriycurrenturlofPage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


}
	@Test(priority=3,groups= {"Smoke","regression"})
	public void verifyLoginwithCorrectcredentials() {
		loginPage.setUserName("Admin");
		loginPage.setpassword("admin123");
		loginPage.clickLoginBtn();
		String titleofDash = dashBoardPage.titleofDashBoardPage();
		Assert.assertEquals(titleofDash, "Dashboard");
	}
	@Test(priority=-1,groups= {"Smoke","regression"})
	public void verifyBuildTitleofpage() {
		String verfyBuildTtleofpage = loginPage.getBuildTitle();
		Assert.assertEquals(verfyBuildTtleofpage, "OrangeHRM");

}
}

package Test1;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class CommonTest extends BaseTest{
	@BeforeClass
	public void Login() {
		loginPage.setUserName("Admin");
		loginPage.setpassword("admin123");
		loginPage.clickLoginBtn();
		String titleofDash = dashBoardPage.titleofDashBoardPage();
		Assert.assertEquals(titleofDash, "Dashboard");
	}

}

package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_LogOut_002 extends ProjectSpecificMethod{

	

	@Test
	public void logOut() {
		
		LoginPage lp=new LoginPage(driver);
		System.out.println(driver);
		lp.enterUserName().enterpassword().clickOnLoginButton()
		
		.clickOnLogout();
		
	}
}

package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_LoginPage_001 extends ProjectSpecificMethod {
	
	@Test
	public void login() {
		
		LoginPage lp=new LoginPage(driver);
		System.out.println(driver);
		lp.enterUserName().enterpassword().clickOnLoginButton()
		.clickOncrmsfa();
		
	}

}

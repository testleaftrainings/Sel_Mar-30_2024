package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//m1
		//LoginPage lp =new LoginPage();
		//return lp;
		//m2
		return this;
	}
	public LoginPage enterpassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		return this;
	}
	public MyHomePage clickOnLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new MyHomePage(driver);

	}
}

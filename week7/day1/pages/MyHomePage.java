package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{

	public MyHomePage(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	public HomePage clickOncrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
 return new HomePage();
	}

	public LoginPage clickOnLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();

		return new LoginPage(driver);
	}
}

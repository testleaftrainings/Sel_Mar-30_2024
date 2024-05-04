package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

	public ChromeDriver	driver ;
	
	@Given("Launch the Browser and Load the URL")
	public void launchBrowser() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@When("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);

	}

	@And("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	
	}

	@And("Click on LoginButton")
	public void clickButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("HomePage should be displayed")
	public void verifyPage() {
		String text = driver.getTitle();
		if (text.contains("Leaftaps")) {
			System.out.println("login successfully");
		}
		else {
			System.out.println("login is not successfully");
		}
	}

	@But("HomePage should not be displayed")
	public void verifythePage() {
		String text = driver.getTitle();
		if (text.contains("Leaftaps")) {
			System.out.println("login  not successfully");
		}
		else {
			System.out.println("login is successfully");
		}
	}

	}
	


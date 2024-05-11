package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {

	//remove static keyword
public  ChromeDriver	driver ;
	
	@BeforeMethod
	public void preCondition() {
		
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
}	
	@AfterMethod
public void postcondition() {
		driver.close();
	}
}


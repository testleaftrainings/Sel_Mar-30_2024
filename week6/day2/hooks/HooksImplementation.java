package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepdef.ProjectSpecficMethod;

public class HooksImplementation extends ProjectSpecficMethod{

	@Before
	public void preCondition() {
	
			driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	
	@After
	public void postcondition() {
		
		driver.close();
	}
}

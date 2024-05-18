package week8.day1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExceptions {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/main");
		try {
			driver.findElement(By.id("Username")).sendKeys("Demosalesmanager");
		} catch (Exception e1) {
			System.out.println(e1);
			driver.findElement(By.id("username")).sendKeys("DemoCsr");

		}
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		try {
			driver.findElement(By.className("decorativesubmit")).click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
System.out.println("check locator value");
		}catch(StaleElementReferenceException a) {
			System.out.println("StaleElementReferenceException");
		}
		catch(Exception o) {
			System.out.println(o);
		}
		
		finally {
			driver.close();
		}
		
	}

}

package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement scroll = driver.findElement(By.linkText("About Us"));
		//About Us
		
		Actions act=new Actions(driver);
		act.scrollToElement(scroll).perform();
		
	//	Thread.sleep(3000);
		scroll.click();
	
		
	
	}
}

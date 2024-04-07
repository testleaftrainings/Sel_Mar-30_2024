package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWaitAndMethods {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//selenium wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dilip");
		
		//title
		String title = driver.getTitle();
		System.out.println(title);
		
		//current page url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//get text
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		
	}

}

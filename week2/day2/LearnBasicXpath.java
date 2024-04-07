package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		

	}

}

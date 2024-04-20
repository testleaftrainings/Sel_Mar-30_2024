package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//alert syntax
		
		Alert alert = driver.switchTo().alert();
		
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		
		//driver.findElement(By.xpath("//i[@class='pi pi-home layout-menuitem-icon']")).click();
		alert.accept();
		
		//alert.accept();
		//alert.dismiss();
		
		//alert.sendKeys("");
//		alert.dismiss(); or alert.accept();
		
		//exception
		//1. if alert is present i am not handling- UnhandledAlertException
		//2. NoAlertPresentException
		

		
		//non-modal alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
	}

}

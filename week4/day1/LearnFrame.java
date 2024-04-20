package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//handle frame
		//index value start from '0'
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
		//NoSuchElementException -if not handle the frame
		
		//switch back webpage
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//i[@class='pi pi-home layout-menuitem-icon']")).click();
	}

}

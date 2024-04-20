package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//1st frame
		driver.switchTo().frame(2);
		
		//2nd frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		//previous frame
		//driver.switchTo().parentFrame();
		
		//main page
		driver.switchTo().defaultContent();

	}

}

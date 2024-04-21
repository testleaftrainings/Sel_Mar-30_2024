package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {

	public static void main(String[] args) throws IOException {
		

		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement d = driver.findElement(By.xpath("//h1[text()='Droppable']"));
		//step -1
		File scr = d.getScreenshotAs(OutputType.FILE);
		
		//step-2
		File dest=new File("./Snap/img1.png");
		
		//step-3
		
	FileUtils.copyFile(scr, dest);
		
	}

}

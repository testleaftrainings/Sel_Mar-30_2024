package week4.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnChromeOptions {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--start-maximized");
		opt.addArguments("--headless");
		ChromeDriver driver= new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		String title = driver.getTitle(); 
		System.out.println(title);
		System.out.println("done");
	}

}

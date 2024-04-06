package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//step1 -Launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		
		//step 2-load url
		driver.get("https://login.salesforce.com/");
		
	   // step -3 max screen
		driver.manage().window().maximize();
		
		//wait -java
		Thread.sleep(5000);
		
		//step -4 close my browser
		driver.close();
		

	}

}

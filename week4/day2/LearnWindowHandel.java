package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandel {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getwindowhandle
		String pwindow = driver.getWindowHandle();
		System.out.println(pwindow);
		String ptitle = driver.getTitle();
		System.out.println("parent :"+ptitle);
		
		//multiple windows -getwindowhandles -return type Set<String>
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("GetWindowHandles : "+windowHandles);
		
		//convent set into list 
		List<String> windowList=new ArrayList<String>(windowHandles);
		
		//syntax
		driver.switchTo().window(windowList.get(1));
		
		//child window 
		String ctitle = driver.getTitle();
		System.out.println("Child :"+ctitle);
		driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");
		//current window/tab
		driver.close();
		
		//switch to parent window
		driver.switchTo().window(windowList.get(0));
		//check control switch back parent window
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		//close all the opened window /tab
		driver.quit();
		
	}

}

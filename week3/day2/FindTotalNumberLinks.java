package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalNumberLinks {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.amazon.in/");
		
		//findElements - will find more than one value
		//return type -findElements-List<WebElement>
		
		//empty list
		//List<String> data= new ArrayList<String>();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int size = list.size();
		System.out.println("total number of links :"+size);
		
		for (int i = 0; i < list.size(); i++) {
			//data.add(list.get(i).getText());
			System.out.println(list.get(i).getText());
		}
		
		//Collections.sort(data);
		//for loop
	}

}

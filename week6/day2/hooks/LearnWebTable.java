package hooks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		
		String firstRow = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println("First Row and First Column :"+firstRow);
		
		
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]/td[4]")).getText();
		System.out.println("Join Date :"+text);
		
		
		List<WebElement> rowCount = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowSize = rowCount.size();
		System.out.println("Row count :"+rowSize);
		
		
		List<WebElement> columnCount = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		int columnSize = columnCount.size();
		System.out.println("column Count :"+ columnSize);
		
		for (int i = 1; i <=rowSize; i++) {
			
			for (int j = 1; j <=columnSize; j++) {
				String text2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text2);
				
			}
			
		}
		
		
		driver.close();
		
	}

}

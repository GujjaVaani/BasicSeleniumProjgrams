package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		List<WebElement> theaders = driver.findElements(By.xpath("//table[@id='table1']//th"));
		//table headers size and name
		System.out.println(theaders.size());
		for(int i=0;i<theaders.size();i++) {
			System.out.println(theaders.get(i).getText());
		}
		//the data in table
		List<WebElement> tdatas = driver.findElements(By.xpath("//table[@id='table1']//td"));
		
		for(WebElement tdata:tdatas) {
			System.out.print(tdata.getText()+" ");
		}
		System.out.println();
		//First Row in table
		List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='table1']//tr[1]//td"));
		for(WebElement data:firstRow) {
			System.out.println(data.getText());
		}
		
		List<WebElement> SecondRow = driver.findElements(By.xpath("//table[@id='table1']//tr[2]//td"));
		for(WebElement data:SecondRow) {
			System.out.println(data.getText());
		}
		
		//Third Row second col
		
		WebElement desireddata=driver.findElement(By.xpath("//table[@id='table1']//tr[3]//td[2]"));
		System.out.println(desireddata.getText());
		
		//locates only third column
		System.out.println("locates only third column");
		List<WebElement> columndatas=driver.findElements(By.xpath("//table[@id='table1']//tbody//td[3]"));
		for(WebElement columndata:columndatas) {
		System.out.println(columndata.getText());
		}
		
		
	}
	
}

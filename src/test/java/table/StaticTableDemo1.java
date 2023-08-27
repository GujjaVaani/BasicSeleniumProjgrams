package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo1 {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	//number of rows in table
	List<WebElement> numOfRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
	int rowsize=numOfRows.size();
	System.out.println(numOfRows.size());
	
	//number of col
List<WebElement> numOfCol = driver.findElements(By.xpath("//table[@id='table1']//th"));
	
	System.out.println(numOfCol.size());
	int colsize=numOfCol.size();
	
	//Print whole table
	
	for(int r=1;r<=rowsize;r++) {
		
		if(r==1) {
			for(int c=1;c<=colsize;c++)
			{
				String xpathText="//table[@id='table1']//th["+c+"]";
				String thead=driver.findElement(By.xpath(xpathText)).getText();
				System.out.print(thead+" ");
			}
			System.out.println();
		}
		else {
			for(int c=1;c<=colsize;c++) {
				String xpathText="//table[@id='table1']//tr["+(r-1)+"]//td["+c+"]";
				String tdata=driver.findElement(By.xpath(xpathText)).getText();
				System.out.print(tdata+" ");
			}
			System.out.println();
		}
	}
	
	
	
}
}

package intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
		for(WebElement link:links) {
			link.click();
			driver.navigate().back();
			System.out.println(link.getText());
		}
		
		
	}
}

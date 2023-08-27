package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTableDemo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin");
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");

		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).submit();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-bs-dismiss='modal']")));
		WebElement close = driver.findElement(By.xpath("//button[@data-bs-dismiss='modal']"));
		close.click();
		WebElement Sales = driver.findElement(By.xpath("//a[contains(text(),'Sales')]"));
		Sales.click();
		WebElement Orders = driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
		Orders.click();

		System.out.println(driver.findElement(By.xpath("//form[@id='form-order']//table//tr[8]//td[4]")).getText());

		List<WebElement> customerNames = driver.findElements(By.xpath("//form[@id='form-order']//table//tr//td[4]"));
		String eCustomerName = "vignesh s";
		for (int i = 0; i < customerNames.size(); i++) {

			if (customerNames.get(i).getText().equals(eCustomerName)) {
				String xpathText = "//form[@id='form-order']//tbody//tr[" + (i + 1) + "]//td[1]";
				WebElement orderId=driver.findElement(By.xpath("//form[@id='form-order']//tbody//tr[" + (i) + "]//td[1]//input[@type='checkbox']"));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				 
				js.executeScript("scrollBy(200,300)"); 
				js.executeScript("arguments[0].click()", orderId);
				break;
			}
		}

		/*
		 * WebElement orderId=driver.findElement(By.
		 * xpath("//form[@id='form-order']//td[text()='vignesh s']/preceding-sibling::td[3]/input[@type='checkbox']"
		 * ));
		 * 
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * 
		 * js.executeScript("scrollBy(0,300)"); js.executeScript("arguments[0].click()",
		 * orderId);
		 */

		
	}
}

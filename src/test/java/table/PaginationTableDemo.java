package table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginationTableDemo {

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
		String label = driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		System.out.println(label);
		int findex = label.indexOf('(') + 1;
		System.out.println(findex);
		int eindex = label.indexOf("Pages") - 1;
		System.out.println(eindex);
		String num = label.substring(findex, eindex);
		System.out.println(num);
		String ecustomerName = "Samuel Dan";
		int pagecount = Integer.parseInt(num);
		for (int p = 1; p <= pagecount; p++) {

			String xpathText = "//form[@id='form-order']//tr//td[text()='" + ecustomerName + "']";
			try {
				if (driver.findElement(By.xpath(xpathText)).isDisplayed()) {

					WebElement check = driver
							.findElement(By.xpath(xpathText + "//preceding-sibling::td[3]//input[@type='checkbox']"));

					JavascriptExecutor js = (JavascriptExecutor) driver;

					js.executeScript("scrollBy(200,300)");
					js.executeScript("arguments[0].click()", check);

					break;
				}
			} catch (Throwable t) {

			}

			WebElement next=driver.findElement(By.xpath("//ul[@class='pagination']/li[@class='page-item active']/span/following::a[1]"));
					JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("scrollBy(200,300)");
			js.executeScript("arguments[0].click()", next);

					
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	driver.quit();
	}
	

}

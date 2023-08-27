package intermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.findElement(By.className("dropbtn")).click();
       
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		 driver.findElement(By.linkText("Facebook")).click();
		driver.navigate().back();
		driver.findElement(By.className("dropbtn")).click();
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
	       driver.findElement(By.linkText("Flipkart")).click();
	}
}

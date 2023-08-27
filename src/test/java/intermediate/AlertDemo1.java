package intermediate;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo1 {
public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	

	WebElement element =driver.findElement(By.id("deletesuccess"));
	//scroll for element to be visible
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", element);
	//Invisibility of Element wait locator
	wait.until(ExpectedConditions.invisibilityOf(element));
	
	driver.findElement(By.id("alert2")).click();
	//Alert
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	driver.findElement(By.id("confirm")).click();
	System.out.println(alert.getText());
	alert.dismiss();
	
	driver.findElement(By.id("prompt")).click();
	wait.until(ExpectedConditions.alertIsPresent());
	alert.sendKeys("Raama");
	System.out.println(alert.getText());
	alert.accept();
	driver.close();
}
}

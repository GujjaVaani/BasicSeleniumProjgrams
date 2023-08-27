package intermediate;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPage2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		try {
            driver.findElement(By.id("timerAlertButton")).click();
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert simpleAlert = driver.switchTo().alert();
            System.out.println(simpleAlert.getText());
            simpleAlert.accept();
            
        } catch (Exception e) {
            System.out.println("unexpected alert not present");
        }
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("scrollBy(0, 2500)");
		
		WebElement alt=driver.findElement(By.id("confirmButton"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", alt);
		
	       alert.accept();	
	       
	       WebElement confirm =driver.findElement(By.id("confirmResult"));
	       //System.out.println(confirm.getText());
	       String msg=confirm.getText();
	       System.out.println(msg);
	      

}
	
}

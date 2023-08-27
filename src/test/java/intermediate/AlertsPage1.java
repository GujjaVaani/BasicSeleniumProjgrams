package intermediate;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage1 {
public static void main(String[] args) {
	WebDriver driver;
	 driver =new ChromeDriver();
	driver.get("https://www.lambdatest.com/selenium-playground/javascript-alert-box-demo");
	driver.manage().window().maximize();
	//WebDriverWait wait=new WebDriverWait(driver, 10);
	WebElement alertelement =driver.findElement(By.xpath("//button[@class='btn btn-dark my-30 mx-10 hover:bg-lambda-900 hover:border-lambda-900']"));
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
	alertelement.click();
	Alert alert =driver.switchTo().alert();
	alert.accept();
	
	
	WebElement alertoption=driver.findElement(By.xpath("//p[@class='text-gray-900 text-size-16 mt-10 text-black font-bold']//button[@type='button'][normalize-space()='Click Me']"));
	alertoption.click();
	System.out.println(alert.getText());
	alert.dismiss();
	
	WebElement confirm= driver.findElement(By.id("confirm-demo"));
	System.out.println(confirm.getText());
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("scrollBy(0, 4500)");
	
	WebElement alertmsg=driver.findElement(By.xpath("(//button[@class='btn btn-dark mx-10 hover:bg-lambda-900 hover:border-lambda-900'])[2]"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", alertoption);
	alertmsg.click();
	alert.sendKeys("Bhumija");
	alert.accept();
	WebElement text=driver.findElement(By.id("prompt-demo"));
	System.out.println(text.getText());
	
	driver.close();
}
}

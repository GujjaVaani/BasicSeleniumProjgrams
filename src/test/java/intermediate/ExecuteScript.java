package intermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement button=driver.findElement(By.id("but2"));
		
		
		js.executeScript("scrollBy(0,300)");
		js.executeScript("arguments[0].click()", button);
		
		WebElement user=driver.findElement(By.name("userid"));
		//
		js.executeScript("arguments[0].value='Avinash Mishra';", user);
		
		WebElement button1=driver.findElement(By.id("button9"));
		js.executeScript("arguments[0].scrollIntoView();", button1);
		
		//js.executeScript("alert('Vani');");
	
		js.executeAsyncScript("window.setTimeout(function(){alert('world');},4000);alert('hello');");
	}
}

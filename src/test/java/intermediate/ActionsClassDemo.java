package intermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {
public static void main(String[] args) {
	

	WebDriver driver= new ChromeDriver();

	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	
	Actions actions =new Actions(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement element=driver.findElement(By.xpath("//input[@id='userName']"));
	//name.click();
	
	/*actions.keyDown(element, Keys.SHIFT);

	actions.sendKeys("TextToBeConvertAndSendInUpperCase").perform();

	actions.keyUp(Keys.SHIFT);
	*/
	actions.keyDown(element,Keys.SHIFT).sendKeys("Vaani Gujja").keyUp(Keys.SHIFT).build().perform();
	
	WebElement email=driver.findElement(By.id("userEmail"));
	actions.sendKeys(email,"vani.g@gmail.com").build().perform();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("scrollBy(0, 10)");

	
	WebElement currentAddress=driver.findElement(By.id("currentAddress"));
	actions.sendKeys(currentAddress,"43 School Lane London EC71 9GO").build().perform();
	
	  /* Select the Current Address using CTRL + A
    actions.keyDown(Keys.CONTROL);
    actions.sendKeys("a");
    actions.keyUp(Keys.CONTROL);
    actions.build().perform();
	*/
	
	
	
	currentAddress.sendKeys(Keys.chord(Keys.CONTROL,"A"));
	currentAddress.sendKeys(Keys.chord(Keys.CONTROL,"C"));
    JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("scrollBy(0,500)");
	
	WebElement permanent=driver.findElement(By.id("permanentAddress"));
	permanent.sendKeys(Keys.chord(Keys.CONTROL,"V"));
	WebElement sub=driver.findElement(By.id("submit"));
	sub.click();
	System.out.println(sub.getCssValue("background-color"));
	
	
	
}
}

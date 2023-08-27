package intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClick {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/buttons");
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	WebElement right= driver.findElement(By.id("rightClickBtn"));
    action.contextClick(right).build().perform();
    
    WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
    action.doubleClick(doubleclick).build().perform();
    
    JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("scrollBy(0,300)");
   
    
    
}
}

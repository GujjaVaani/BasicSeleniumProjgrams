package intermediate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardDemo1 {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	WebElement compend=driver.findElement(By.linkText("compendiumdev"));
			
	act.moveToElement(compend).keyDown(Keys.CONTROL).click().build().perform();
	act.keyUp(Keys.CONTROL).build().perform();
	
	WebElement name=driver.findElement(By.name("userid"));
	name.sendKeys("Vani");
    act.sendKeys(Keys.TAB).build().perform();
    WebElement pwd=driver.findElement(By.name("pswrd"));
    pwd.sendKeys("lkjh");
    act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
    //alert
    Alert alert=driver.switchTo().alert();
    alert.accept();
    
    //chord commands- is used for multiple keys at a same time
    name.sendKeys(Keys.chord(Keys.CONTROL,"z"));
    
	
}
}

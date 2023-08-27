package intermediate;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	public static void main(String[] args) throws AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
	     Actions act=new Actions(driver);
	     WebElement element=driver.findElement(By.id("blogsmenu"));
	     act.moveToElement(element).build().perform();
	}
	
}

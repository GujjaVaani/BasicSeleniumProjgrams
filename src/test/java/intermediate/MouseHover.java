package intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/menu/");
	
	driver.manage().window().maximize();
	Actions action= new Actions(driver);
	WebElement main1=driver.findElement(By.linkText("Main Item 2"));
	action.moveToElement(main1).perform();
	System.out.println(main1.getCssValue("background-color"));
	WebElement sub=driver.findElement(By.linkText("SUB SUB LIST »"));
	
	action.moveToElement(sub).perform();
}
}

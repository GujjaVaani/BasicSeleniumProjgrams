package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard {
public static void main(String[] args) throws AWTException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	WebElement search=driver.findElement(By.name("search"));
	search.sendKeys("HP");
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}

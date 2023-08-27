package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseMoveDemo2 {
public static void main(String[] args) throws AWTException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	driver.manage().window().maximize();
	Robot robot = new Robot();
	robot.delay(2000);
    robot.mouseMove(200, 300);
    
    //right button
    robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
    robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    robot.delay(2000);
    robot.keyPress(KeyEvent.VK_DOWN);
    robot.keyRelease(KeyEvent.VK_DOWN);
    
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);

}
}

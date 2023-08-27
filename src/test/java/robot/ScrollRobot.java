package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRobot {
	public static void main(String[] args) throws AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Robot robot = new Robot();
	    robot.mouseWheel(15);
	    robot.delay(2000);
	    robot.mouseWheel(-8);
	
	}
	
}

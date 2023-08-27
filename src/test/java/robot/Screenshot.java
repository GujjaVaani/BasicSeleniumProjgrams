package robot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Screen shots can be captured in two ways 
//using dimensions
//using rectangle class
public class Screenshot {
public static void main(String[] args) throws AWTException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	Robot robot = new Robot();
	
	  Rectangle rect= new Rectangle(30,150,1000,79); BufferedImage
	  ss1=robot.createScreenCapture(rect); ImageIO.write(ss1, "PNG", new
	  File("C:/Users/v-gujjavani/OneDrive - Microsoft/Documents/Course P/basic/target/ss1.png"));
	 
	
	Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle r1=new Rectangle(d);
	BufferedImage ss2=robot.createScreenCapture(r1);
	ImageIO.write(ss2, "PNG", new File("C:/Users/v-gujjavani/OneDrive - Microsoft/Documents/Course P/basic/target/ss2.png"));
	
}
}

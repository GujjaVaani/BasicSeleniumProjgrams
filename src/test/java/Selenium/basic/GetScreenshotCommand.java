package Selenium.basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshotCommand {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		//Get Size of element height and width
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("search"));
		Dimension d=search.getSize();
		System.out.println("Height="+d.height+" width= "+d.width);
		//Get Screen shot of element
		File srcScreenshot=driver.findElement(By.name("search")).getScreenshotAs(OutputType.FILE);
	    
		FileHandler.copy(srcScreenshot,new File(System.getProperty("user.dir")+"\\snap\\getscreen.png"));
	    
		//Get Location
		Point point=search.getLocation();
		System.out.println("x coordinate: "+point.x+" y coordinates: "+point.y);
	    
	}
}

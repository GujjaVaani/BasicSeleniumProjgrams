package intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();

		// By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);

		// By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
	
	    driver.switchTo().frame("frame1");
	    
	    System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	
	    
	    
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frame2");
	    System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		   
	 
	}
	
}

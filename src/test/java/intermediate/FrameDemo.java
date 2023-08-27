package intermediate;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//To set the time to load page we use the below command
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		// number of frames in page
		List<WebElement> NoOfiframe = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number iframes are " + NoOfiframe.size());

		// Parent frame
		driver.switchTo().frame("iframeResult");

		// Nimber of frames
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of child iframes are " + iframeElements.size());

		System.out.println(driver.findElement(By.tagName("p")).getText());

		// Switch to child frame or inner frame of parent frame
		driver.switchTo().frame(0);

		System.out.println(driver.findElement(By.tagName("h1")).getText());
		// Switch to parent frame
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		
		//switch to page from frames
		driver.switchTo().defaultContent();
		Actions act= new Actions(driver);
		WebElement tooltip2= driver.findElement(By.xpath("//a[@title='Change Orientation']"));
		String msg2=tooltip2.getAttribute("title");
		act.click(tooltip2).build().perform();
		System.out.println(msg2);
		System.out.println(driver.findElement(By.id("framesize")).getText());
	}
}

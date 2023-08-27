package intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * So, here are the methods Actions class provides for Drag-Drop action:

dragAndDrop(WebElementsource, WebElement target)
dragAndDropBy(WebElementsource, int xOffset, int yOffset)
 */

public class DroppableDemo1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/droppable");
	driver.manage().window().maximize();
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(drag, drop).build().perform();
	
	String message=drop.getText();
	//System.out.println(message);
	if(message.equals("Dropped!")) {
		System.out.println("Successfully dragged and dropped");
	}else {
		System.out.println("did not succedded in drag and drop");
	}
	
	System.out.println(drop.getCssValue("background-color"));
	
}
}

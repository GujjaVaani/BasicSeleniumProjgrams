package intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*
 * So, here are the methods Actions class provides for Drag-Drop action:

dragAndDrop(WebElementsource, WebElement target)
dragAndDropBy(WebElementsource, int xOffset, int yOffset)
 * */
public class DragAndDropDemo2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	Actions action=new Actions(driver);
	driver.get("https://demoqa.com/droppable");
	driver.manage().window().maximize();
	WebElement navigatedrag = driver.findElement(By.id("droppableExample-tab-accept"));
	
	navigatedrag.click();
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("scrollBy(0,100)");
	WebElement drag=driver.findElement(By.id("acceptable"));
	int dragx=drag.getLocation().getX();
	int dragy=drag.getLocation().getY();
	System.out.println(dragx+" "+dragy);
	WebElement drop=driver.findElement(By.id("droppable"));
	int dropx=drop.getLocation().getX();
	int dropy=drop.getLocation().getY();
	System.out.println(dropx+" "+dropy);
	int xoffset=(dropx-dragx)+10;
	int yoffset=(dropy-dragy)+20;
	
	System.out.println(xoffset+""+yoffset);
	action.dragAndDropBy(drag, 240,100).build().perform();
	
	
}
}

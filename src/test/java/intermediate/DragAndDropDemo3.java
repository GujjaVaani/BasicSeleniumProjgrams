package intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo3 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/droppable");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.id("droppableExample-tab-preventPropogation"));
    element.click();
    JavascriptExecutor js =(JavascriptExecutor)driver;
    js.executeScript("scrollBy(0,200)");
    Actions action= new Actions(driver);
    
    WebElement drag=driver.findElement(By.id("dragBox"));
    WebElement drop=driver.findElement(By.id("notGreedyInnerDropBox"));
    action.clickAndHold(drag).moveToElement(drop).build().perform();

}
}

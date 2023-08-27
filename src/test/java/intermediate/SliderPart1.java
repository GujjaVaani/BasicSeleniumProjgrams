package intermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderPart1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/p/page3.html");
	driver.manage().window().maximize();
	WebElement minprice=driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
	Actions act=new Actions(driver);
	act.dragAndDropBy(minprice, 150, 0).build().perform();
	act.dragAndDropBy(minprice, -50, 0).build().perform();
}
}

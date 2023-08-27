package Selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	
	// Scroll
			
			
	WebElement ele=driver.findElement(By.id("react-select-4-input"));
	ele.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", ele);
	Select dropdown=new Select(ele);
	for(int i=0;i<3;i++)
	dropdown.selectByIndex(i);
	
}
}

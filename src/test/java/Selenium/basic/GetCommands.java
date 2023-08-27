package Selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {
public static void main(String[] args) {
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	driver.manage().window().maximize();
	String tag=driver.findElement(By.id("alert1")).getTagName();
   System.out.println(tag);           	
}
}

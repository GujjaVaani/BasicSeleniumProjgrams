package Selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://toolsqa.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@href='/selenium-training?q=headers']")).click();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	
}
}

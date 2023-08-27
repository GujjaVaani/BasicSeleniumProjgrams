package Selenium.basic;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableCommandDemo {
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
		WebElement enablebutton=driver.findElement(By.id("but2"));
		boolean isenable1=enablebutton.isEnabled();
		if(isenable1==true) {
			System.out.println("button is clickable");
		}else {
			System.out.println("button is not clickable");
		}
		WebElement disablebutton=driver.findElement(By.id("but1"));
		boolean isenable2=disablebutton.isEnabled();
		if(isenable2==true) {
			System.out.println("button is clickable");
		}else {
			System.out.println("button is not clickable");
		}
		
	}
}

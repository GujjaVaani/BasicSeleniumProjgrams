package Selenium.basic;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayConditionDemo {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
		//check search button is visible or not
		WebElement searchelement=driver.findElement(By.xpath("//input[@class='gsc-search-button']"));
		boolean search=searchelement.isDisplayed();
		if(search==true) {
		System.out.println("Search button is available");
		}
		else {
			System.out.println("Search button is not available");
		}
		//Check hidden button is available or not
		WebElement hiddenbutton=driver.findElement(By.id("hbutton"));
		boolean hidden=hiddenbutton.isDisplayed();
		if(hidden==true) {
			System.out.println("hidden button is available");
			}
			else {
				System.out.println("hidden button is not available");
			}
	}
	
}

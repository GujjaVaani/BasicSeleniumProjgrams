package Selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectConditionDemo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
		boolean isselect1 = checkbox1.isSelected();
		if (isselect1 == true) {
			System.out.println("Check box is selected");
		} else {
			System.out.println("check box is not selected");
		}

		WebElement checkbox2 = driver.findElement(By.id("checkbox2"));
		boolean isselect2 = checkbox2.isSelected();
		if (isselect2 == true) {
			System.out.println("Check box is selected");
		} else {
			System.out.println("check box is not selected");
		}

		// CSS Value-getcssvalue
		String height = driver.findElement(By.id("home")).getCssValue("line-height");
		System.out.println(height);
		
		//get class name
		String driverObjectReferenceClass=driver.getClass().getSimpleName();
		System.out.println(driverObjectReferenceClass);

	}
}

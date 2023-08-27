package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptDateRefreshDemo {

	public static void main(String[] args) {
     WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		WebElement dateField=driver.findElement(By.id("datepicker"));
		javaScriptTypeText(driver,dateField,"11/25/2023");
		javaScriptPageRefresh(driver);
	}
	private static void javaScriptPageRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("history.go(0)");
		
	}
	public static void javaScriptTypeText(WebDriver driver2, WebElement dateField, String string) {
		// TODO Auto-generated method stub
		JavascriptExecutor jse=((JavascriptExecutor)driver2);
		jse.executeScript("arguments[0].value='"+string+"'",dateField);
		
	}
}

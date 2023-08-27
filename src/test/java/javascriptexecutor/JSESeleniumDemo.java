package javascriptexecutor;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSESeleniumDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	     JavascriptExecutor jse=(JavascriptExecutor)driver;
	     String titlePage=jse.executeScript("return document.title").toString();
		 System.out.println(titlePage);
		 
		 String pageUrl=jse.executeScript("return document.URL").toString();
		 System.out.println(pageUrl);
		 
		 WebElement searchBox=driver.findElement(By.name("search"));
		 String value="HP";
		 jse.executeScript("arguments[0].value='"+value+"'", searchBox);
		 
	}
}

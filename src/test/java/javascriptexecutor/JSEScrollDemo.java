package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEScrollDemo {

public static void main(String[] args) {
	

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	WebElement button=driver.findElement(By.id("but2"));
	//scroll till partcular locator
	jse.executeScript("arguments[0].scrollIntoView(true)", button);
	//Scroll end of page
	jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	//Entire text of page
	String textOnPage=jse.executeScript("return document.documentElement.innerText").toString();
	System.out.println(textOnPage);

}

}

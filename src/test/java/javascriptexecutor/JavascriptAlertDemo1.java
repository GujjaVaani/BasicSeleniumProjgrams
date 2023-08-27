package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlertDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("alert('Vani')");
		//jse.executeScript("prompt('What is your name')");
		jse.executeScript("confirm('Do you want to proceed')");
		
	}

}

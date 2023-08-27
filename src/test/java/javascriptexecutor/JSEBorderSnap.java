package javascriptexecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JSEBorderSnap {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	
	
	
	//jse.executeScript("arguments[0].click()", cartbutton);
	WebElement cartbutton=driver.findElement(By.xpath("//div[@id='cart']/button"));
	javaScriptBorderSnap(driver,cartbutton);
}

public static void javaScriptBorderSnap(WebDriver driver, WebElement cartbutton) throws IOException {
	// TODO Auto-generated method stub
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	
		//jse.executeScript("document.querySelector('div#cart>button').style.background='green';");
		jse.executeScript("arguments[0].style.border='3px solid red';",cartbutton);
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File("C://Users//v-gujjavani//OneDrive - Microsoft//Documents//Course P//basic//Screenshots//highlightedElement.png"));
		
		jse.executeScript("arguments[0].style.border='';",cartbutton);
}
	
}

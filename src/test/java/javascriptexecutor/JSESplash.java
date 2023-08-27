package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSESplash {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
		
		//jse.executeScript("arguments[0].click()", cartbutton);
		WebElement cartbutton=driver.findElement(By.xpath("//div[@id='cart']/button"));
		javaScriptSplash(driver,cartbutton);
	}

	public static void javaScriptSplash(WebDriver driver, WebElement cartbutton) {
		// TODO Auto-generated method stub
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		String defaultcolor=cartbutton.getCssValue("background-color");
		for(int i=0;i<50;i++) {
			//jse.executeScript("document.querySelector('div#cart>button').style.background='green';");
			jse.executeScript("arguments[0].style.background='green';",cartbutton);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jse.executeScript("arguments[0].style.background='"+defaultcolor+"';",cartbutton);
		}
		
	}
}

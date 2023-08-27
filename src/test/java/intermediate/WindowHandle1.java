package intermediate;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {
	static Set<String> allwindows;
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://demoqa.com/browser-windows");
		WebElement newTab = driver.findElement(By.id("tabButton"));
		newTab.click();
		driver.switchTo().newWindow(WindowType.TAB);
		String parent=driver.getWindowHandle();
		driver.switchTo().window(parent);
		driver.findElement(By.linkText("Follow On Twitter")).click();
		String title="Log in to Twitter / Twitter";
		
		 allwindows=driver.getWindowHandles();
		 for(String win:allwindows) {
			 System.out.println(win);
		 }
		switchToRequiredWindow(title);
		String path="//span[text()='Next']";
	    String text=driver.findElement(By.xpath(path)).getCssValue("background-color");
	    System.out.println(text);
	    driver.switchTo().window(parent);
	    
	  
	
	}

	public static void switchToRequiredWindow(String title) {
		// TODO Auto-generated method stub
		Iterator<String> itr=allwindows.iterator();
		while(itr.hasNext()) {
			String win=itr.next();
			driver.switchTo().window(win);
			if(driver.getTitle().equals(title)) {
				break;
			}
		}
		
	}
}

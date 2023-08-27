package intermediate;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Open a popup window")).click();
	String parent=driver.getWindowHandle();
	Set<String> allwindows=driver.getWindowHandles();
	Iterator<String> iterate=allwindows.iterator();
	while(iterate.hasNext()) {
		String child=iterate.next();
		driver.switchTo().window(child);
		if(driver.getTitle().equals("Basic Web Page Title")) {
			
			System.out.println(driver.getCurrentUrl());
			driver.close();
		}
	}
	driver.switchTo().window(parent);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
}
}

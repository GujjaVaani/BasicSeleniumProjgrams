package intermediate;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
	driver.findElement(By.xpath("//a[@title='Follow @Lambdatesting on Twitter']")).click();
	 //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));

     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	String parent=driver.getWindowHandle();
	Set<String> allwindows=driver.getWindowHandles();
	Iterator<String> it=allwindows.iterator();
	
	while(it.hasNext()) {
		String child=it.next();
		if(!parent.equals(child)) {
			driver.switchTo().window(child);
			driver.switchTo().window(child).manage().window().maximize();
            System.out.println("The web page title of child window is:"+driver.getTitle());
            driver.close();
                      
		}
	}
	driver.switchTo().window(parent);
}
}

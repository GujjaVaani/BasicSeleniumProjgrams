package intermediate;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement newTab = driver.findElement(By.id("tabButton"));
		newTab.click();
		
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> iterator = allwindows.iterator();

		while (iterator.hasNext()) {
			String child = iterator.next();
			if (!parentwindow.equals(child)) {
				driver.switchTo().window(child);

				WebDriver newdriver = driver.switchTo().window(child);
				System.out.println("title"+driver.switchTo().window(child).getTitle());
				WebElement text = newdriver.findElement(By.id("sampleHeading"));
				System.out.println("text "+text.getText());
				// driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("windowButton")).click();

	}
}

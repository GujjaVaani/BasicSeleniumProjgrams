package properties;

import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesDemo2 extends Properties1{
	public static void main(String[] args) {

		loadPropertiesFile();
			String URL = prop.getProperty("URL");
			WebDriver driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("input-firstname")).sendKeys(prop.getProperty("firstname"));
			driver.findElement(By.id("input-lastname")).sendKeys(prop.getProperty("lastname"));
			driver.findElement(By.id("input-email")).sendKeys("ramsita" + getTimeStamp() + "@gmail.com");
			driver.findElement(By.id("input-telephone")).sendKeys(prop.getProperty("phone"));
			driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.cssSelector("input[name='newsletter'][value='1']")).click();
			driver.findElement(By.name("agree")).click();
			driver.findElement(By.cssSelector("input[value='Continue']")).click();
			driver.quit();

		

	}

	private static String getTimeStamp() {
		// TODO Auto-generated method stub
		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":", "_");

	}
}

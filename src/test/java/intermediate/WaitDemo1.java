package intermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemo1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	//To set the time to load page we use the below command
	//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
    driver.manage().window().maximize();
    //Implicity wait is global wait which applies for all the UI element
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.className("dropbtn")).click();
	
    driver.findElement(By.linkText("Facebook")).click();
    driver.navigate().back();
    
    
}
}

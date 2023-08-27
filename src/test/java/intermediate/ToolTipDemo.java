package intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * In many web pages, it's very common that when hovered over some link, text, some text or sometimes
 * 
 * Case One: When the tooltip is available in the 'title' attribute. Here, we can retrieve tooltip from By strategy
   Case Two: When the tooltip is available in 'div'. Here, we can retrieve tooltip using Actions class methods
 */
public class ToolTipDemo {
public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/tooltip/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	WebElement tooltip1=driver.findElement(By.linkText("Tooltips"));
	String msg1=tooltip1.getAttribute("title");
	System.out.println(msg1);
	
	WebElement tooltip2= driver.findElement(By.xpath("//a[normalize-space()='ThemeRoller']"));
	String msg2=tooltip2.getAttribute("title");
	System.out.println(msg2);
	
	
	WebElement tooltip3= driver.findElement(By.id("age"));
	String msg3=tooltip3.getAttribute("title");
	System.out.println(msg3);
}
}

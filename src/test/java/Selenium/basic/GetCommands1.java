package Selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    //driver.manage().window().maximize();
	    driver.get("https://www.javatpoint.com");
	    //full screen mode
	    driver.manage().window().fullscreen();
	    String pageTitle=driver.getTitle();
	    System.out.println(pageTitle);
	    System.out.println(pageTitle.length()+"Title length");
	    String actualrurl=driver.getCurrentUrl();
	    if(pageTitle.equals(actualrurl)) {
	    	System.out.println("Verified the URL");
	    }else {
	    	System.out.println("Verification failed");
	    }
	     
	    String pageSource=driver.getPageSource();
	    System.out.println("page source"+pageSource);
	    System.out.println("page source lenght"+pageSource.length());
	    driver.close();
	}
}

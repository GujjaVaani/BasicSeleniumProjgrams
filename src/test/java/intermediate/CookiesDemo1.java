package intermediate;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo1 {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	
	
	Cookie cookie2=driver.manage().getCookieNamed("currency");
	System.out.println("cookie value");
	System.out.println("Domai" +cookie2.getDomain());
	System.out.println("Name" +cookie2.getName());
	System.out.println("Path " +cookie2.getPath());
	System.out.println("Value "+cookie2.getValue());
	System.out.println("Expiry "+cookie2.getExpiry());
	System.out.println("=============================");
	
	//adding our own cookie
	Cookie cookie3=new Cookie("cookiename", "Cookievalue");
	
	driver.manage().addCookie(cookie3);
	
	//delete particular cookie
	
	driver.manage().deleteCookieNamed("currency");
	
	//or
	Cookie delcookie = driver.manage().getCookieNamed("OCSESSID");
	 driver.manage().deleteCookie(delcookie);
	
	
Set<Cookie> cookies=driver.manage().getCookies();
	
	for(Cookie cookie:cookies) {
		System.out.println("Domai" +cookie.getDomain());
		System.out.println("Name" +cookie.getName());
		System.out.println("Path " +cookie.getPath());
		System.out.println("Value "+cookie.getValue());
		System.out.println("Expiry "+cookie.getExpiry());
		System.out.println("=============================");
	}
	 //delete all cookie
	driver.manage().deleteAllCookies();
	System.out.println("deleted");

}
}
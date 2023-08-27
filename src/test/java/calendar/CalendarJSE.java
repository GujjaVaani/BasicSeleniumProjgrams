package calendar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//DatePicker using JavaScriptExecutor
public class CalendarJSE {

	
		static WebDriver driver=null;
		public static void main(String[] args) {
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
			JavascriptExecutor jse=((JavascriptExecutor)driver);
			jse.executeScript("document.getElementById('datepicker').value='03/13/2026'");
	}

}

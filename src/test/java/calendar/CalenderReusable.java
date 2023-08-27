package calendar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderReusable {
	static WebDriver driver=null;
public static void main(String[] args) {
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	driver.findElement(By.id("datepicker")).click();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
	String selectDay="30";
	String selectMonth="November";
	String selectYear="2025";
	selectDateInCalendar(selectDay,selectMonth, selectYear);
	
}

   public static void selectDateInCalendar(String selectDay,String selectMonth,String selectYear) {
	
	   
	   if(Integer.parseInt(selectDay)>31||Integer.parseInt(selectDay)<1){
		   System.out.println("Invalid Date Proided"+selectDay+"/"+selectMonth+"/"+selectYear);
	       return;
	   }
	   if(selectMonth.equals("February")&&Integer.parseInt(selectDay)>29){
		   System.out.println("Invalid Date Proided"+selectDay+"/"+selectMonth+"/"+selectYear);
	       return;
	   }
	   
	   
	   
	   String monthyear = driver.findElement(By.className("ui-datepicker-title")).getText();
		
	   
		String month=monthyear.split(" ")[0];
		String year=monthyear.split(" ")[1];
		while(!(month.equals(selectMonth)&&year.endsWith(selectYear))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			monthyear=driver.findElement(By.className("ui-datepicker-title")).getText();
			month=monthyear.split(" ")[0];
			year=monthyear.split(" ")[1];
		}
		String xpathText="//td[@data-handler='selectDay']/a[text()=\'"+selectDay+"\']";
		try {
		driver.findElement(By.xpath(xpathText)).click();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid Date Proided"+selectDay+"/"+selectMonth+"/"+selectYear);
		       
		}
   }
}

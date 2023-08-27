package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class POITestNGDemo {


	@Test(dataProvider="supplier",dataProviderClass=PassDataPOITestNG.class)
	public void loginTest(String email, int password) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		WebElement account = driver.findElement(By.xpath("//span[text()='My Account']"));
		account.click();
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		WebElement email1 = driver.findElement(By.id("input-email"));
		email1.sendKeys(email);

		WebElement pwd = driver.findElement(By.id("input-password"));
		pwd.sendKeys(String.valueOf(password));
		WebElement submit = driver.findElement(By.xpath("//input[@value='Login']"));
		submit.submit();
		
		//Assert.assertTrue(driver.findElement(By.className("fa fa-exclamation-circle")).getText().equals("Warning: No match for E-Mail Address and/or Password."));
		driver.quit();
	}
	

}

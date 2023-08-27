package Selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class WebElementCommands1 {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	//	driver.manage().window().maximize();
		//set size command
		Dimension d2 =new Dimension(300,650);
		driver.manage().window().setSize(d2);
		
		// Sendkeys Command
		WebElement sendName = driver.findElement(By.id("firstName"));

		sendName.sendKeys("Gujja");
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Vaani");

		String attValue = lastName.getAttribute("id");
		System.out.println("attribute= " + attValue);
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("vani.g2505@gmail.com");

		// get height and width dimension of email and Last Name
		Dimension d = email.getSize();
		System.out.println("Email dimension height=" + d.height + " width=" + d.width);

		// Scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 4500)");

		// getText
		WebElement gettext = driver.findElement(By.id("userEmail-label"));
		System.out.println(gettext.getText());

		// Click Command
		WebElement selectgender = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
		selectgender.click();

		// getTagName
		System.out.println(selectgender.getTagName());

		WebElement gender = driver.findElement(By.id("gender-radio-2"));
		boolean statusgender = gender.isSelected();

		System.out.println("Gender is selected: " + statusgender);

		WebElement phoneNumber = driver.findElement(By.id("userNumber"));
		phoneNumber.sendKeys("7995642355");

		// getCss value
		WebElement css = driver.findElement(By.xpath("//div[normalize-space()='Interactions']"));
		WebElement css1 = driver.findElement(By.xpath("//div[contains(@class,'main-header')]"));
		System.out.println(css.getCssValue("color"));
		System.out.println(css1.getCssValue("color"));
		// get Location of element
		System.out.println(css1.getLocation());
		Point p = css1.getLocation();
		System.out.println("x point= " + p.x + " y point= " + p.y);

		// dimension
		Dimension d1 = css.getSize();
		System.out.println("interaction dimensions of heigh=" + d1.height + " width=" + d.width);

		// Select Class

		WebElement doB = driver.findElement(By.id("dateOfBirthInput"));
		doB.click();
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select dropdown = new Select(month);
		dropdown.selectByIndex(4);

		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select dyear = new Select(year);
		dyear.selectByValue("1998");
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, May 26th, 1998']"));
		date.click();
		// doB.click();

		WebElement subject = driver.findElement(By.xpath(
				"//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		boolean status1 = subject.isDisplayed();
		System.out.println(status1);
		// subject.click();
		WebElement newsub = driver.findElement(By.id("subjectsContainer"));
		newsub.click();

		/**
		 * Validate isSelected and click
		 */

		WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isSelected = checkBoxSelected.isSelected();

		// performing click operation if element is not selected
		if (isSelected == false) {
			checkBoxSelected.click();
		}

		/*
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();

		// performing click operation if element is displayed
		if (isDisplayed == true) {
			checkBoxDisplayed.click();
		}

		/*
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isEnabled = checkBoxEnabled.isEnabled();

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxEnabled.click();
		}

	}
}

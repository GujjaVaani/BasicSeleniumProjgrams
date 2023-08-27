package Selenium.basic;

import java.util.List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();

		WebElement dropdown1 = driver.findElement(By.id("drop1"));
		Select singledrop = new Select(dropdown1);

		// Select By Visible Text
		singledrop.selectByVisibleText("doc 4");
		// Select By Value
		singledrop.selectByValue("abc");
		// Select By index
		singledrop.selectByIndex(2);
		WebElement select2 = driver.findElement(By.id("multiselect1"));

		// isMultipleCommand checks whether we are able to select multiple options
		System.out.println("able to select multiple options: " + singledrop.isMultiple());

		// Get all options in drop down can be done through getOptionCommand
		System.out.println("All options in SingleSelection");
		List<WebElement> options = singledrop.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}

		Select multiSelect = new Select(select2);
		// Select By index
		multiSelect.selectByIndex(1);
		// Select by visible text
		multiSelect.selectByVisibleText("Audi");
		multiSelect.selectByVisibleText("Volvo");

		// Select By Value
		multiSelect.selectByValue("Hyundaix");

		// isMultipleCommand checks whether we are able to select multiple options
		System.out.println("able to select multiple options: " + multiSelect.isMultiple());

		// Get All options
		List<WebElement> multioptions = multiSelect.getOptions();
		System.out.println("All options in mutliSelection");
		for (WebElement option : multioptions) {
			System.out.println(option.getText());
		}

		// Getfirstselectedoption command returns the first option which is selected
		// from top to bottom
		System.out.println("Get First selected option in list"+multiSelect.getFirstSelectedOption().getText());

		
		//Get All Selected Options in list
		List<WebElement> list=multiSelect.getAllSelectedOptions();
		
		System.out.println("Get all selected options in list are :");
		for(WebElement value:list) {
			System.out.println(value.getText());

		}
		
		//Deselect By Visble Text command
		
		multiSelect.deselectByVisibleText("Swift");
		
		//Deselect By Value
		multiSelect.deselectByValue("volvox");
		//Deselect By Index
		multiSelect.deselectByIndex(3);
		
		//Deselect All
		multiSelect.deselectAll();
		
	}
}

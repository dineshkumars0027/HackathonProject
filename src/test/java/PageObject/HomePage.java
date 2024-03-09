package PageObject;


import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtility;


public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(xpath = "//input[@placeholder='What do you want to learn?']")  
	WebElement SearchWD;
//	String search
	public void search() throws IOException {
		SearchWD.click();
		SearchWD.sendKeys(ExcelUtility.getCellData("ReadData", 1, 0));
		SearchWD.sendKeys(Keys. ENTER);
		
		}
	
}

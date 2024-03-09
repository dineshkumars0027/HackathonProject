package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enterprise extends BasePage {

	public Enterprise(WebDriver driver) {
	// TODO Auto-generated constructor stub
		super(driver);
	}
	
	//-------------------------Module 3----------------------------------
		//In Home page, go to "For Enterprise"; Look into Courses for Campus under Product; Fill the  "Ready to transform" form with any one input invalid (example: email); Capture the error message & display

		JavascriptExecutor js=(JavascriptExecutor) driver;
		@FindBy(xpath="//a[text()='All AI Courses']")
		WebElement ScrollCourse;
		
		public void scrollcourse() {
			js.executeScript(("arguments[0].scrollIntoView();"),ScrollCourse);
		}
		
		
		@FindBy(xpath="//a[text()='For Enterprise']")
		WebElement ClickEnterprise;
		
		public void clickenterprises() {
			js.executeScript("arguments[0].click();",ClickEnterprise );
		}
		
		
		@FindBy(xpath="//span[text()='Watch now']")
		WebElement ScrollWatch;
		
		public void scrollwatch() {
			js.executeScript("arguments[0].scrollIntoView();", ScrollWatch);
		}
		
		
		@FindBy(xpath="//a[text()='What We Offer']")
		WebElement ClickOffer;
		
		public void clickoffer() {
			js.executeScript("arguments[0].click();",ClickOffer);
		}
		
		
		@FindBy(xpath="//h4[text()='* Credit eligibility determined by your institution.']")
		WebElement ScrollCourse1;
		
		public void scrollcourse1() {
			js.executeScript("arguments[0].scrollIntoView();", ScrollCourse1);
		}
		
		
		@FindBy(xpath="(//div[contains(@class,'MuiGrid-root')]//span[text()='Learn more'])[2]")
		WebElement ClickCourse;
		
		public void clickcourse() {
			js.executeScript("arguments[0].click();", ClickCourse);
		}
		
		

	}

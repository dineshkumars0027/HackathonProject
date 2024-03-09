package PageObject;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ExcelUtility;

public class WebDevelopment extends BasePage{

	JavascriptExecutor  js=(JavascriptExecutor) driver;
	public WebDevelopment(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='cds-checkboxAndRadio-labelText']//span[text()='Data Science']") 
	WebElement JS;
	@FindBy(xpath = "(//*[text()='English'])[1]")  
	WebElement English;
	@FindBy(xpath = "(//*[text()='Beginner'])[1]")  
	WebElement Begin;
	@FindBy(xpath = "(//h3[@class='cds-CommonCard-title css-6ecy9b'])[1]") 
	WebElement TitleGet1;
	@FindBy(xpath = "(//h3[@class='cds-CommonCard-title css-6ecy9b'])[1]")  
	WebElement FirstCourse;
	@FindBy(xpath = "(//div[@class='css-lt1dx1']//div[@class='css-guxf6x'])[2]")  
	WebElement FirstCourseRating;
	@FindBy(xpath = "(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[8]")  
	WebElement FirstCourseDuration;
	@FindBy(xpath = "(//h3[@class='cds-CommonCard-title css-6ecy9b'])[2]") 
	WebElement TitleGet2;
	@FindBy(xpath = "(//h3[@class='cds-CommonCard-title css-6ecy9b'])[2]")  
	WebElement SecondCourse;
	@FindBy(xpath = "(//div[@class='css-lt1dx1']//div[@class='css-guxf6x'])[2]")  
	WebElement SecondCourseRating;
	@FindBy(xpath = "(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[8]")  
	WebElement SecondCourseDuration;
	

	public void scroll() {
		js.executeScript("arguments[0].scrollIntoview", JS);
	}
	public void clickEng() {
		js.executeScript("arguments[0].click();",English);
		
		}
	public void clickBeg() {
		
		js.executeScript("arguments[0].click();",Begin);
		}
	public void FirstCourseTitle() throws IOException {
		
		String data=TitleGet1.getText();
		ExcelUtility.write("WriteData", 1, 0, data);
}	
	
	public void FirstCourse() {
	js.executeScript("arguments[0].click();",FirstCourse);
}
	
	public void FirstCourseinfo() throws IOException {
		
		String parentWindow = driver.getWindowHandle();
	     Set<String> handles = driver.getWindowHandles();
	     for(String windowHandle: handles)
	     {
	    	 if(!windowHandle.equals(parentWindow))
	    	 {
	    		 driver.switchTo().window(windowHandle);   
	    		 String data=FirstCourseRating.getText();
	    		 ExcelUtility.write("WriteData", 2, 0, data);
	    			String data1=FirstCourseDuration.getText();
	    			ExcelUtility.write("WriteData", 3, 0, data1);
	             driver.close();
	             driver.switchTo().window(parentWindow);
	         }
	     }
}
	public void SecondCourseTitle() throws IOException {
		String data=TitleGet2.getText();
		ExcelUtility.write("WriteData", 6, 0, data);
		
}	
	
	public void SecondCourse() {
	js.executeScript("arguments[0].click();",SecondCourse);
}
	
	public void SecondCourseinfo() throws IOException {
		
		String parentWindow = driver.getWindowHandle();
	     Set<String> handles = driver.getWindowHandles();
	     for(String windowHandle: handles)
	     {
	    	 if(!windowHandle.equals(parentWindow))
	    	 {
	    		 driver.switchTo().window(windowHandle);   
	    		 	String data=SecondCourseRating.getText();
	    		 	ExcelUtility.write("WriteData", 7, 0, data);
	    			String data1=SecondCourseDuration.getText();
	    			ExcelUtility.write("WriteData",8, 0, data1);;
	             driver.close();
	             driver.switchTo().window(parentWindow);
	             
	         }
	     }
}
}

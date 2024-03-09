package PageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtility;

public class LanguageLearning extends BasePage {

	public LanguageLearning(WebDriver driver) {
		super(driver);
	}
	
@FindBy(xpath="//*[@class='rc-CourseraLogo']")
WebElement switchMain;
@FindBy(xpath="//input[@placeholder='What do you want to learn?']")
WebElement clicksearch;
@FindBy(xpath="//*[@placeholder='What do you want to learn?']")
WebElement searchlng;
@FindBy(xpath="//*[@aria-label='Show more Language options']")
WebElement seeMore;
@FindBy(xpath="//*[@class=\"css-zweepb\"]")
List<WebElement> lang;
@FindBy(xpath="//div[@class='css-jyd7rb']/button")
WebElement close;
@FindBy(xpath="//label[text()='Level']/following-sibling::div/div/label/div/span/span")
List<WebElement> level;


	public void switchMain() {
		switchMain.click();
	}
	public void clickSearch() {
		//System.out.println("\nModule 2 : Look for Language Learning; Extract all the languages and different levels with its total count & display them");
		clicksearch.click();
	}
	public void searchlng() throws IOException{
	searchlng.click();
	searchlng.sendKeys(ExcelUtility.getCellData("ReadData", 2, 0));
	searchlng.sendKeys(Keys.ENTER);
	}
	public void clickSeeMore() {
		seeMore.click();
	}
	public void listOfLangs() throws InterruptedException, IOException {
		int cntLan=1;
		
		for(WebElement lan:lang) {
		
				String data = lan.getText();
				ExcelUtility.write("WriteData", cntLan , 2, data);
				//System.out.println(lan.getText());
				cntLan++;
		}
//	System.out.println("Total Count of Languages : "+cntLan);
	}
	public void close() {
		close.click();
	}
	public void listOfLvls() throws IOException {
		int cntLvl=1;
		
		for(WebElement l:level) {
			String data= l.getText();
			ExcelUtility.write("WriteData", cntLvl, 4, data);
			System.out.println();
			cntLvl++;
		}
		System.out.println("Total Count of Levels : "+cntLvl);
	}
	}



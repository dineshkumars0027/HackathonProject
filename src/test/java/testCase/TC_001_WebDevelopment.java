package testCase;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObject.HomePage;
import PageObject.WebDevelopment;
import testBase.BaseClass;



public class TC_001_WebDevelopment extends BaseClass  {
	
 @Test (priority = 1)
  public void searchWD() throws IOException {
	  HomePage hp = new HomePage(driver);
	  logger.info("***Requirement 1 Started***");
	  hp.search();
  } 
 
  @Test (priority =2)
  public void WebDevelopmentFunctions() throws IOException {
	  WebDevelopment wd = new WebDevelopment(driver);
	  wd.scroll();
	  wd.clickEng();
	  wd.clickBeg();
	 
  }
  
  @Test(priority=3)
  public void WDFirstCousreInfo() throws IOException {
	  WebDevelopment wd = new WebDevelopment(driver);
	  wd.FirstCourse();
	  wd.FirstCourseTitle();
	  wd.FirstCourseinfo();
  }
  
  @Test(priority=4)
  public void WDSecondCousreInfo() throws IOException {
	  WebDevelopment wd = new WebDevelopment(driver);
	  wd.SecondCourse();
	  wd.SecondCourseTitle();
	  wd.SecondCourseinfo();
	  logger.info("***Requirement 1 Ended***");
  }
}

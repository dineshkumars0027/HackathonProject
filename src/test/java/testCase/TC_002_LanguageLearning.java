package testCase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.LanguageLearning;
import testBase.BaseClass;

public class TC_002_LanguageLearning extends BaseClass {
  
	@Test(priority=1)
	public void SearchLL() throws IOException {
		logger.info("***Requirement 2 Started***");
		LanguageLearning L1 = new LanguageLearning(driver) ;
		L1.switchMain();
		L1.clickSearch();
		L1.searchlng();
	}
	
	@Test(priority=2)
	public void LanguageDetails() throws InterruptedException, IOException {
		logger.info("***Fetching Languages Details***");
		LanguageLearning L1 = new LanguageLearning(driver) ;
		L1.clickSeeMore();
		L1.listOfLangs();
		L1.close();
		L1.listOfLvls();
		logger.info("***Requirement 2 Ended***");
	}
	
}


package testCase;

import java.io.IOException;

import org.testng.annotations.Test;
import PageObject.Enterprise;
import PageObject.EnterpriseForm;
import testBase.BaseClass;

public class TC_003_Enterprise extends BaseClass{
	@Test(priority=1)
	public void clickEnterprises() {
		logger.info("***Requirement 3 Started***");
		Enterprise EP = new Enterprise(driver) ;
		EP.scrollcourse();
		EP.clickenterprises();
	}
@Test(priority=2)
public void clickOffer() {
	Enterprise EP = new Enterprise(driver) ;
	EP.scrollwatch();
	EP.clickoffer();
}
@Test(priority=3)
public void clickCourse() {
	Enterprise EP = new Enterprise(driver) ;
	EP.scrollcourse1();
	EP.clickcourse();
}
public EnterpriseForm EPF = new EnterpriseForm(driver) ;
@Test(priority=3)
public void fillForm() throws IOException {
	logger.info("***Coursera For CampusForm Started***");
	EnterpriseForm EPF = new EnterpriseForm(driver) ;
	EPF.scrolldown();
	EPF.firstname();
	EPF.scrolldown();
}
@Test(priority=4)
public void fillForm1() throws IOException {
	EnterpriseForm EPF = new EnterpriseForm(driver) ;
	EPF.lastname();
	EPF.email();
	EPF.phone();
}
@Test(priority=5)
public void fillForm2() {
	EnterpriseForm EPF = new EnterpriseForm(driver) ;
	EPF.institutiontype();
	EPF.company();
	EPF.student();
	EPF.title();
	EPF.department();
	EPF.website();
	EPF.country();
	EPF.state();
}
@Test(priority=6)
public void fillForm3() {
	EnterpriseForm EPF = new EnterpriseForm(driver) ;
	EPF.scrollsubmit();
	EPF.submit();
	EPF.errorMsg();
	logger.info("***Requirement 3 Ended***");
}
}

package stepsDefenition;

import java.io.IOException;

import PageObject.Enterprise;
import PageObject.EnterpriseForm;
import PageObject.HomePage;
import PageObject.LanguageLearning;
import PageObject.WebDevelopment;
import factory.CucumberBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	HomePage hp;
	WebDevelopment wd;
	LanguageLearning L1;
	Enterprise Ep;
	EnterpriseForm EPF;
	
	@Given("User is on the Coursera Website")
	public void user_is_on_the_coursera_website() {
		hp = new HomePage(CucumberBaseClass.getDriver());
	}

	@When("User Searches for Web Development Courses")
	public void user_searches_for_web_development_courses() throws IOException {
		hp.search();
		CucumberBaseClass.getLogger().info("**** Search button is clicked and Web Development is Searched ***");
	}

	@When("English Language and Beginner Level is Selected From the Search Results Page")
	public void english_language_and_beginner_level_is_selected_from_the_search_results_page() {
		wd = new WebDevelopment(CucumberBaseClass.getDriver());
		wd.clickEng();
		wd.clickBeg();
		CucumberBaseClass.getLogger().info("*** English Checkbox is Selected ***");
		CucumberBaseClass.getLogger().info("*** Beginner Checkbox is Selected ***");
	}

	@Then("First and Second Displayed Course is Selected and Details of the Course are Printed")
	public void first_and_second_displayed_course_is_selected_and_details_of_the_course_are_printed() throws IOException, InterruptedException {
		
		wd.scroll();
		
		CucumberBaseClass.getLogger().info("*** Click English, Click Beginner ***");
		wd.FirstCourse();
		wd.FirstCourseTitle();
		CucumberBaseClass.getLogger().info("*** Getting First CourseTitle ***");
		wd.FirstCourseinfo();
		CucumberBaseClass.getLogger().info("*** Rating and Duration of 1st Course is Printed ***");
		wd.SecondCourse();
		wd.SecondCourseTitle();
		CucumberBaseClass.getLogger().info("*** Getting Second CourseTitle ***");
		wd.SecondCourseinfo();
		CucumberBaseClass.getLogger().info("*** Rating and Duration of 2st Course is Printed ***");
		
	}

	@When("User searches for Language learning")
	public void user_searches_for_language_learning() throws IOException {
		
		L1 = new LanguageLearning(CucumberBaseClass.getDriver());
		L1.clickSearch();
		CucumberBaseClass.getLogger().info("*** Search Bar is Clicked ***");
		L1.searchlng();
		CucumberBaseClass.getLogger().info("*** Language Learning is Searched ***");
	}

	@When("Click on See more")
	public void click_on_see_more() {
		
		L1.clickSeeMore();
		CucumberBaseClass.getLogger().info("**** SeeMore is Clicked ****");
	}

	@Then("Get lists of languages, levels and their count")
	public void get_lists_of_languages_levels_and_their_count() throws InterruptedException, IOException {
		
		L1.listOfLangs();
		CucumberBaseClass.getLogger().info("**** List of Languages and their Count is Printed ****");
		L1.close();
		CucumberBaseClass.getLogger().info("**** Language box is Closed ****");
		L1.listOfLvls();
		CucumberBaseClass.getLogger().info("**** List of Levels and their Count is Printed ****");
	}

	@When("User clicks on For Enterprise")
	public void user_clicks_on_for_enterprise() {
		
		Ep = new Enterprise(CucumberBaseClass.getDriver());
		Ep.scrollcourse();
		Ep.clickenterprises();
		CucumberBaseClass.getLogger().info("**** For Enterprises is Clicked ****");
	}

	@When("User clicks on Offer and navigates to click course")
	public void user_clicks_on_offer_and_navigates_to_click_course() {
		
		Ep.scrollwatch();
		Ep.clickoffer();
		CucumberBaseClass.getLogger().info("**** Click Offer is Clicked ****");
		Ep.scrollcourse1();
		Ep.clickcourse();
		CucumberBaseClass.getLogger().info("**** Course is Clicked ****");
	}

	@Then("User Fills and submits the form, Error message is displayed.")
	public void user_fills_and_submits_the_form_error_message_is_displayed() throws IOException {
		
		EPF = new EnterpriseForm(CucumberBaseClass.getDriver());
		EPF.scrollform();
		EPF.firstname();
		EPF.scrolldown();
		EPF.lastname();
		EPF.email();
		EPF.phone();
		EPF.institutiontype();
		EPF.company();
		EPF.student();
		EPF.title();
		EPF.department();
		EPF.website();
		EPF.country();
		EPF.state();
		EPF.scrollsubmit();
		EPF.submit();
		CucumberBaseClass.getLogger().info("**** Form is Submitted Successfully ****");
		EPF.errorMsg();
		CucumberBaseClass.getLogger().info("**** Error Message is Printed ****");
	    
	}

}
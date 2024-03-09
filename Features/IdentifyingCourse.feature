Feature: Identify Courses

  Scenario: Get Details of Web development courses
    Given User is on the Coursera Website
    When User Searches for Web Development Courses
    And English Language and Beginner Level is Selected From the Search Results Page
    Then First and Second Displayed Course is Selected and Details of the Course are Printed

  Scenario: Get languages,levels and their count
    When User searches for Language learning
    And Click on See more
    Then Get lists of languages, levels and their count

  Scenario: Navigate and fill form
    When User clicks on For Enterprise
    And User clicks on Offer and navigates to click course
    Then User Fills and submits the form, Error message is displayed.

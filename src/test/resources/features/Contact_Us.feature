@contact-us
Feature: WebDriver University Contact - Us Page

  Scenario: Validate Successful Submission - Unique Data
    Given I access the webdriver university contact us page
    When I enter a unique firstname
    And I enter a unique lastname
    And I enter a unique email adress
    And I add a unique comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message


    Scenario: Validate Successful Submission - Specific Data
      Given I access the webdriver university contact us page
      When I enter a specific firstname "sarah"
      And I enter a specific lastname "woods"
      And I enter a specific email adress "sarah_woods123@gmail.com"
      And I add a specific comment "How are you today?"
      And I click on the submit button
      Then I should be presented with a successful contact us submission message

@login
Feature: WebDriver University - Login Page

  Scenario Outline: Validate Successful & unsuccess Login
    Given I access the webdriver university login page
    When I enter a username "<username>"
    And I enter a password "<password>"
    And I click on the login button
    Then I should be presented with a "<loginValidationText>"

Examples:
 | username | password           | loginValidationText |
 | webdriver| webdriver123       | validation succeeded  |
 | webdriver| incorrectpassword  | validation failed   |
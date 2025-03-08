Feature: Check the functionality of login

  Scenario: Check the functionality of the submit button with valid data
 Given User navigate to login page
    Given I enter the user name as "standard_user"
    And I enter the password as "secret_sauce"
    And I click the submit button
    Then the page redirects to the new page with an error message
    
  Scenario: Check the functionality of the submit button with Invalid data
    Given User navigate to login page
    Given I enter the user name as "secret_saucet"
    And I enter the password as "secret_saucetr"
    And I click the submit button
    But system should throw the error message
Feature: Check the login functionality

  Background: 
    Given User should login to the application

  Scenario: check the functionality of login with valid data
    Given User enter the name as "ortoni"
    And User enter the password as "Pass1234"
    When user click the submit button
    Then Check current page url with actual url

  Scenario: check the functionality of login with invalid data
    Given User enter the name as "ortoni1"
    And User enter the password as "Pass12341"
    When user click the submit button
    But Check Error message

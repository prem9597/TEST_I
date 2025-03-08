Feature: Check the functionality of add to cart

  Scenario Outline: different user should login and then add the books they wants
    Given User navigate to login page
    Given user should enter their "<id>" and "<password>"
    Given I click the submit button
    When user should handle the alert
    Then user should add the "<things>" they want

    Examples: 
      | id            | password     | things                |
      | standard_user | secret_sauce | Sauce Labs Backpack   |
      | error_user    | secret_sauce | Sauce Labs Bike Light |

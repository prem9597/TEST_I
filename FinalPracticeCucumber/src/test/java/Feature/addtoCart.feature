Feature: Check the Cart functionality

  Background: 
    Given User should login to the application

  Scenario: Check the cart count
    Given Click the Cart button
    And get the cart count

  Scenario: Add the product to the cart
    Given Click the Cart button
    Given User click the contibue button
    When Enter the search value "Curuk"
    Then Click the add to cart button

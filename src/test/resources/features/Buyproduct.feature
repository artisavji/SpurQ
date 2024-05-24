Feature: BuyProduct
  As user of SauceLabs application
  I would like to have a ability to select product to the application
  so that I can complete buying journey

    Background:
      Given User is on SauceLabs login page
    When User enters "standard_user" and "secret_sauce"
    And User clicks on login button


   Scenario:User completes the buying process
     When user selects "Sauce Labs Backpack" product
     And User clicks on Add to Cart button
     Then User sees the product in the cart
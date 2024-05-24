Feature:Login
  As user of SauceLabs application
  I would like to have a ability to login to the application
  so that I can search and buy products

  Scenario: User is able to login with valid credentials
    Given User is on SauceLabs login page
    When User enters "standard_user" and "secret_sauce"
    And User clicks on login button
    Then user is on product page with list of 6 products

  Scenario: User is not able to login with invalid credentials
    Given User is on SauceLabs login page
    When User enters "problem_user" and "secret_sauce"
    And User clicks on login button
    Then user is on product page with list of 6 products

  Scenario Outline: User is able to login using valid credentials
    Given User is on SauceLabs login page
    When User enters "<userName>" and "<password>"
    And User clicks on login button
    Then user is on product page with list of <products> products
    Examples:
      | userName      | password      | products |
      | standard_user | secret_sauce | 6 |
      | problem_user  | secret_sauce | 6 |









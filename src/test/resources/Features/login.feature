
Feature: logging into the swag lab portal

Scenario: Sucessful login into the portal

    Given User is on the login page
    When  User enters the username "standard_user" and password "secret_sauce"
    And   User clicks on the login button
    Then  User should redirected to the product page
    When  User clicks on the product in the product page
    And   User clicks on the Add to cart
    Then  User clicks on the cart button logo
    And   User should get the product name
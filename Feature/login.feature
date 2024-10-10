Feature: login functionality

  Scenario: Successfull login with valid credentials
    Given user launch a chrome browser
    When user open an URL "https://admin-demo.nopcommerce.com/login"
    And user enter a username as "admin@yourstore.com"
    And user enter a password as "admin"
    And click on login
    Then page tittle should be "Dashboard / nopCommerce administration"
    When user click on logout
    Then page tittle should be "Your store. Login"
    And close browser

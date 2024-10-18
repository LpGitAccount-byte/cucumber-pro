Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
    And close browser

    
   
  
  Scenario Outline: validate search functionality
  
  Given user launch chrome browser
  When user open an url "https://www.ebay.com/"
  And click on search textbox
  And enter a searchable product "computer"
  When click on search
  And close browser
 
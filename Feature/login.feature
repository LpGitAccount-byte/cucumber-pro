Feature: login functionality

Scenario: Login with valid credentials
  Given user at login page
  When user enter a username
  And user enter a password
  And user click on Login button
  Then user should Redirect to home page
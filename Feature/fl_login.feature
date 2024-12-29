Feature: create a new user to facebook
 
 Scenario: create a new user
 Given user launch a chrome browser
 When user open an URL "https://www.facebook.com/login/"
 And click on sign up for facebook link
 Then page tittle should be "Sign up for Facebook"
 And user should enter a required data
 And click on SignUp button
 Then close browser
 
 Scenario Outline: facebook login with valid credentials
 Given user launch a chrome browser
 When 

Feature: fill a user form

Scenario: validate to fill a commercial form

Given user launch a chrome browser
When user open an url "https://demoqa.com/"
And click on form 
Then page tittle should be "DEMOQA"
And click on form down arrow
And click on practice form
Then fill the required field of practice form
And click on submit
And close browser
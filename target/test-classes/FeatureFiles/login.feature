Feature: Saleforce Login

@smoke
Scenario: Home page login

Given Intialize the web driver
When user navaigates to website 
And enter username and password and click on login button
Then user should be able to login sucessfully
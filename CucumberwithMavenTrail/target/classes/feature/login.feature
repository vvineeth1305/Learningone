#Author: vvineeth1305@gmail.com
#Keywords Summary : Cucumber Tutorials
Feature: This feature verify functionality on Saucedemo Login Page
Scenario: Verify Saucedemo App using valid credentials


Given I launch Chrome browser
When I open SauceDemo App
Then I enter valid username
Then I enter valid password
Then I click on Submit button
And  I verify Successful Login
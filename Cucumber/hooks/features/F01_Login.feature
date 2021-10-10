@Login
Feature: Leaftaps login functionality

#Background:
#Given Open the chrome browser
#And Load the application url as 'http://leaftaps.com/opentaps'

@functional
Scenario Outline: Test with positive credential
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'DemoCSR'|'crmsfa'|
|'DemoSalesManager'|'crmsfa'|


@smoke @functional
Scenario: Test with negative credential
Given Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on login button
But Error should be displayed
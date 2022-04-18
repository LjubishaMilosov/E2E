Feature: Login into application

Scenario Outline: Positive test validatin login

Given Initialize the browser with chrome
And Navigate to the "http://qaclickacademy.com" Site
And Click on Login link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in
Then Verify that user is successfully logged in
And Close browsers

Examples:
|username						|password	|
|test99@gmail.com				|123456		|
|test123@gmail.com				|12345		|

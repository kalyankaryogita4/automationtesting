Feature: fb login

Scenario: verify login failed when user enter invalid credential

Given Edge browser should be invoked
And fb login page should be visible
When enter email "mansi" and password "688123"
And click on login button of fb page
Then login failed when user enter the invalid credential
Feature: orangehmr login 

Scenario: verify orangehmr login successfully with valid credential 
Given launch oranghmr login page
When enter email and password
And click on ligin button
Then orangehmr login should be successfull




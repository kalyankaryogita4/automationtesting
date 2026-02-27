Feature: Demoblaze signup and login

 

Scenario: Verify user can create account
  Given launch demoblaze website
  When user click on signup button on navbar
  And user enter username demoblaze
  And user enter password demobalze
  And click on signup button of demoblaze
  Then demoblaze signup successfully and should display alert msg

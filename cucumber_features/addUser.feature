Feature: Add User functionality

  Scenario: Verify user can add new contact
    Given User launch the browser
    When User open add user page
    And User enter first name
    And User enter last name
    And User enter email
    And User enter password
    And User click on submit button
    Then User should be added successfully
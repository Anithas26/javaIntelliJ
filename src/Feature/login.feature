Feature: Login feature testing
  Scenario: Check the login functionality with valid credentials
    Given user is on the login page
    When user enters username and password
    And clicks on the submit button
    Then Login should be successful

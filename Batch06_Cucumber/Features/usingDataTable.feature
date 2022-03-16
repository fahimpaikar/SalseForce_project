Feature: Using DataTable for creating account

  @tag3
  Scenario: I am using data table to create an account
    Given I open chrome browser
    And I enter "batch06@codegator.us.qa" in the username field
    And I enter "Welcome1" in the password field
    When I click the login button
    And I create an account
      | Account Name | Account Number | Rating |
      | John Doe     |          12345 | Hot    |

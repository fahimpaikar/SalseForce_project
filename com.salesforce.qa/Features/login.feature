Feature: Test the login functionality

  Background: 
    Given I Open Chrome Browser
    When I go to Salesforce application
    Then I should see the Salesforce logo
  
  @login
  Scenario Outline: Test Using Valid Credentials
    And I enter "<username>" username
    And I enter "<password>" password
    When I click the login button
    Then I should see the logout link
    When I click Accounts tab
    Then I am Accounts homepage
    And I click the new button
    And I enter Account Name field
    When I click the save button
    Then I should see the Account record

    Examples: 
      | username                | password |
      | batch03@codegator.us.qa | Pa55word |
      | batch03@codegator.us.qa | Pa55word |
      | batch03@codegator.us.qa | Pa55word |

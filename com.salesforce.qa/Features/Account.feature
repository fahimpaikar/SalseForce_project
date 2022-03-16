Feature: Test the fields in Account object

  Background: 
    Given I Open Chrome Browser
    When I go to Salesforce application
    And I enter "batch03@codegator.us.qa" username
    And I enter "Pa55word" password 
    When I click the login button

  @Sprint1 @regression
  Scenario: Veryfy The Rating field and its Options
    When I click Accounts tab
    And I click the new button
    And I enter Account Name field
    And I should see the Rating field
    And I select Hot from the Rating field
    When I click the save button
    Then I should see the Account record

  @Sprint2
  Scenario: Create complete account
    
    And I create an Account
      | Account Name | Rating | Account Number | Account Site    |
      | Fahim        | Warm   |          43827 | www.Eastern.com |

Feature: Dynamic tabs and buttons in account page

  Background: 
    Given I Open Chrome Browser
    When I go to Salesforce application
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click The "Login" button

  @task
  Scenario: Make the tabs and buttons dynamic
    And I click the "Accounts" tab
    Then I am on "Accounts" home page
    When I click "new" button
    And I enter "Fahim" for "acc2" field
    And I enter "743926" for "acc5" field
    And I enter "New York" for "acc23" field
    And I enter "New York" for "acc23" field
    And I select "Prospect" from "acc6" field
    And I select "Banking" from "acc7" field
    And I enter "2.1B" for "acc8" field
    And I should see the Rating field
    And I select "Hot" from "acc9" field
    When I click "save" button
    Then I should see the Account record

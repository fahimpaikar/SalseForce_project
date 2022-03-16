Feature: As a user, I should be able to create account

  Background: 
    Given I open chrome browser
    And I enter "batch06@codegator.us.qa" in the username field
    And I enter "Welcome1" in the password field
    When I click the login button
    Then I should see the dashboard page

  @tag2
  Scenario: As a valid user I should be able to create a new account and click save
    And I should see the accounts link in the menu
    And I click the "Accounts" tab
    When I click the "new" button
    Then I enter "Fahim" for "acc2" field
    Then I enter "12355" for "acc5" field
    And I should see the following options for "acc9" the drop down field
      | --None-- |
      | Hot      |
      | Warm     |
      | Cold     |
    When I click the "save" button
    Then I should be able to see "Fahim" text
    And I click the logout button
    Then I close the chrome browser

  @Assignment1
  Scenario: As a user I should be able to create an account with all the fields filled out
    And I should see the accounts link in the menu
    And I click the "Accounts" tab
    When I click the "new" button
    Then I enter "Adam" for "acc2" field
    And I search and select "Fahim" from "lksrch"
    Then I enter "12355" for "acc5" field
    And I should see the following options for "acc6" the drop down field
      | --None--                   |
      | Prospect                   |
      | Customer - Direct          |
      | Customer - Channel         |
      | Channel Partner / Reseller |
      | Installation Partner       |
      | Technology Partner         |
      | Other                      |
    And I should see the following options for "acc9" the drop down field
      | --None-- |
      | Hot      |
      | Warm     |
      | Cold     |
    And I select SLA expiration date
    When I click the "save" button

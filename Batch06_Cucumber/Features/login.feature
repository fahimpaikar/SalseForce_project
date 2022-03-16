Feature: Test login functionality, I want to test if the user can login using valid credentials.

  Background: 
    Given I open chrome browser

  @tag1
  Scenario: login using valid credentials
    And I enter valid username in username field
    And I enter valid password in password field
    When I click the login button
    Then I should see the dashboard page
    And I should see the accounts link in the menu
    ## this is the first feature file in this project
    ## the first step in cucumber frame work is to creat a folder in the project with features file, and then
    ## create a new file with ".feature" extension
    ## then we create a test runner package with different classes for each feature
    ## when we add more steps in our feature file, we will set dryRun option = True to give the step definition for missing setps
    ## after implementing the new code we can run it regularty
    And I click the logout button
    Then I close the chrome browser

  ## now we will write another scenario where we will make passing credentials dynamic
  @tag1
  Scenario: login by providing different credentials for every login
    And I enter "batch06@codegator.us.qa" in the username field
    And I enter "Welcome1" in the password field
    When I click the login button
    Then I should see the dashboard page
    And I should see the accounts link in the menu
    And I click the logout button
    Then I close the chrome browser

  ## Scenario Outline is the Date Driven Behavoir or testing, if we are passing more than one credentials
  ## we should use Scenario outline for our scenario and pass the credentials in Examples like below
  @tag1
  Scenario Outline: testing with more than one credentials
    And I enter "<username>" in the username field
    And I enter "<password>" in the password field
    When I click the login button
    Then I should see the dashboard page
    And I should see the accounts link in the menu
    And I click the logout button
    Then I close the chrome browser

    Examples: 
      | username                | password |
      | batch06@codegator.us.qa | Welcome1 |
      | batch06@codegator.us.qa | Welcome1 |
      | batch06@codegator.us.qa | Welcome1 |

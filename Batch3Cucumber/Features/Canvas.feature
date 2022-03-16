Feature: Canvas Login
@canvas
Scenario: Automate Canvas Login
Given I Open Chrome Browser
And I go to "https://canvas.instructure.com/login/canvas" page
And I enter "fahimpaikar@gmail.com" username
And I enter"Musawir@2011" password
When I click The "Login" button




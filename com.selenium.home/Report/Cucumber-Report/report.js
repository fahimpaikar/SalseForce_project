$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Gmail.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail login",
  "description": "Given: I open Chrome browser\nWhen  I go to \"url\" webpage\nThen I enter \"username\" username\nAnd I enter \"password\" password\nThen I click the login button\nAnd I should be logged in to my account",
  "id": "gmail-login",
  "keyword": "Feature"
});
});
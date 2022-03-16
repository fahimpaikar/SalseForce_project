$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("account.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I should be able to create account",
  "description": "",
  "id": "as-a-user,-i-should-be-able-to-create-account",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter \"batch06@codegator.us.qa\" in the username field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter \"Welcome1\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 4859417200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "batch06@codegator.us.qa",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_in_the_username_field(String)"
});
formatter.result({
  "duration": 109217500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome1",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_in_the_password_field(String)"
});
formatter.result({
  "duration": 68142100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 1384478400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 1427507200,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "As a user I should be able to create an account with all the fields filled out",
  "description": "",
  "id": "as-a-user,-i-should-be-able-to-create-account;as-a-user-i-should-be-able-to-create-an-account-with-all-the-fields-filled-out",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Assignment1"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I should see the accounts link in the menu",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click the \"Accounts\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click the \"new\" button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I enter \"Adam\" for \"acc2\" field",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I search and select \"Fahim\" from \"lksrch\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter \"12355\" for \"acc5\" field",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I should see the following options for \"acc6\" the drop down field",
  "rows": [
    {
      "cells": [
        "--None--"
      ],
      "line": 36
    },
    {
      "cells": [
        "Prospect"
      ],
      "line": 37
    },
    {
      "cells": [
        "Customer - Direct"
      ],
      "line": 38
    },
    {
      "cells": [
        "Customer - Channel"
      ],
      "line": 39
    },
    {
      "cells": [
        "Channel Partner / Reseller"
      ],
      "line": 40
    },
    {
      "cells": [
        "Installation Partner"
      ],
      "line": 41
    },
    {
      "cells": [
        "Technology Partner"
      ],
      "line": 42
    },
    {
      "cells": [
        "Other"
      ],
      "line": 43
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I should see the following options for \"acc9\" the drop down field",
  "rows": [
    {
      "cells": [
        "--None--"
      ],
      "line": 45
    },
    {
      "cells": [
        "Hot"
      ],
      "line": 46
    },
    {
      "cells": [
        "Warm"
      ],
      "line": 47
    },
    {
      "cells": [
        "Cold"
      ],
      "line": 48
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I select SLA expiration date",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click the \"save\" button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTest.I_should_see_the_accounts_link_in_the_menu()"
});
formatter.result({
  "duration": 50954400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Accounts",
      "offset": 13
    }
  ],
  "location": "LoginTest.I_click_the_tab(String)"
});
formatter.result({
  "duration": 548466800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "new",
      "offset": 13
    }
  ],
  "location": "LoginTest.I_click_the_button(String)"
});
formatter.result({
  "duration": 275883300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adam",
      "offset": 9
    },
    {
      "val": "acc2",
      "offset": 20
    }
  ],
  "location": "LoginTest.I_enter_for_field(String,String)"
});
formatter.result({
  "duration": 199830200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fahim",
      "offset": 21
    },
    {
      "val": "lksrch",
      "offset": 34
    }
  ],
  "location": "LoginTest.I_search_and_select_from(String,String)"
});
formatter.result({
  "duration": 1500770500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12355",
      "offset": 9
    },
    {
      "val": "acc5",
      "offset": 21
    }
  ],
  "location": "LoginTest.I_enter_for_field(String,String)"
});
formatter.result({
  "duration": 70680200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "acc6",
      "offset": 40
    }
  ],
  "location": "LoginTest.I_should_see_the_following_options_for_the_drop_down_field(String,DataTable)"
});
formatter.result({
  "duration": 158425800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "acc9",
      "offset": 40
    }
  ],
  "location": "LoginTest.I_should_see_the_following_options_for_the_drop_down_field(String,DataTable)"
});
formatter.result({
  "duration": 106619900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_select_SLA_expiration_date()"
});
formatter.result({
  "duration": 75325100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "save",
      "offset": 13
    }
  ],
  "location": "LoginTest.I_click_the_button(String)"
});
formatter.result({
  "duration": 1125448200,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Test login functionality, I want to test if the user can login using valid credentials.",
  "description": "",
  "id": "test-login-functionality,-i-want-to-test-if-the-user-can-login-using-valid-credentials.",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 3394827500,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "login using valid credentials",
  "description": "",
  "id": "test-login-functionality,-i-want-to-test-if-the-user-can-login-using-valid-credentials.;login-using-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I enter valid username in username field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter valid password in password field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should see the accounts link in the menu",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 13,
      "value": "## this is the first feature file in this project"
    },
    {
      "line": 14,
      "value": "## the first step in cucumber frame work is to creat a folder in the project with features file, and then"
    },
    {
      "line": 15,
      "value": "## create a new file with \".feature\" extension"
    },
    {
      "line": 16,
      "value": "## then we create a test runner package with different classes for each feature"
    },
    {
      "line": 17,
      "value": "## when we add more steps in our feature file, we will set dryRun option \u003d True to give the step definition for missing setps"
    },
    {
      "line": 18,
      "value": "## after implementing the new code we can run it regularty"
    }
  ],
  "line": 19,
  "name": "I click the logout button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.I_enter_valid_username_in_username_feild()"
});
formatter.result({
  "duration": 150826300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_enter_valid_password_in_password_feild()"
});
formatter.result({
  "duration": 79917700,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 3867473100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 56657700,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_accounts_link_in_the_menu()"
});
formatter.result({
  "duration": 107836800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_logout_button()"
});
formatter.result({
  "duration": 814974900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_close_the_chrome_browser()"
});
formatter.result({
  "duration": 615964600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 3448038300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 22,
      "value": "## now we will write another scenario where we will make passing credentials dynamic"
    }
  ],
  "line": 24,
  "name": "login by providing different credentials for every login",
  "description": "",
  "id": "test-login-functionality,-i-want-to-test-if-the-user-can-login-using-valid-credentials.;login-by-providing-different-credentials-for-every-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I enter \"batch06@codegator.us.qa\" in the username field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter \"Welcome1\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I should see the accounts link in the menu",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click the logout button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "batch06@codegator.us.qa",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_in_the_username_field(String)"
});
formatter.result({
  "duration": 80100600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome1",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_in_the_password_field(String)"
});
formatter.result({
  "duration": 63579800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 1201703900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 1199503000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_accounts_link_in_the_menu()"
});
formatter.result({
  "duration": 46576200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_logout_button()"
});
formatter.result({
  "duration": 379674400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_close_the_chrome_browser()"
});
formatter.result({
  "duration": 598860800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 3472932800,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "testing with more than one credentials",
  "description": "",
  "id": "test-login-functionality,-i-want-to-test-if-the-user-can-login-using-valid-credentials.;testing-with-more-than-one-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "I enter \"batch06@codegator.us.qa\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I enter \"Welcome1\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "I should see the accounts link in the menu",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click the logout button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "batch06@codegator.us.qa",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_in_the_username_field(String)"
});
formatter.result({
  "duration": 152900700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome1",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_in_the_password_field(String)"
});
formatter.result({
  "duration": 78405600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 1307495800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 2005127700,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_accounts_link_in_the_menu()"
});
formatter.result({
  "duration": 44159800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_logout_button()"
});
formatter.result({
  "duration": 416263800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_close_the_chrome_browser()"
});
formatter.result({
  "duration": 611664400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 3476553200,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "testing with more than one credentials",
  "description": "",
  "id": "test-login-functionality,-i-want-to-test-if-the-user-can-login-using-valid-credentials.;testing-with-more-than-one-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "I enter \"batch06@codegator.us.qa\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I enter \"Welcome1\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "I should see the accounts link in the menu",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click the logout button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "batch06@codegator.us.qa",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_in_the_username_field(String)"
});
formatter.result({
  "duration": 149285400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome1",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_in_the_password_field(String)"
});
formatter.result({
  "duration": 88520500,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 1345659300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 1176020500,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_accounts_link_in_the_menu()"
});
formatter.result({
  "duration": 72367900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_logout_button()"
});
formatter.result({
  "duration": 435996300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_close_the_chrome_browser()"
});
formatter.result({
  "duration": 599158700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.I_open_chrome_browser()"
});
formatter.result({
  "duration": 3506588400,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "testing with more than one credentials",
  "description": "",
  "id": "test-login-functionality,-i-want-to-test-if-the-user-can-login-using-valid-credentials.;testing-with-more-than-one-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "I enter \"batch06@codegator.us.qa\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I enter \"Welcome1\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "I should see the accounts link in the menu",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click the logout button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "batch06@codegator.us.qa",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_in_the_username_field(String)"
});
formatter.result({
  "duration": 405695900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome1",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_in_the_password_field(String)"
});
formatter.result({
  "duration": 127629300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_login_button()"
});
formatter.result({
  "duration": 1320501300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 1266325800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_should_see_the_accounts_link_in_the_menu()"
});
formatter.result({
  "duration": 56096300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_the_logout_button()"
});
formatter.result({
  "duration": 422863600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_close_the_chrome_browser()"
});
formatter.result({
  "duration": 608236700,
  "status": "passed"
});
});
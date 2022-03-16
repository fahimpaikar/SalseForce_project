$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("task.feature");
formatter.feature({
  "line": 1,
  "name": "Dynamic tabs and buttons in account page",
  "description": "",
  "id": "dynamic-tabs-and-buttons-in-account-page",
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
  "name": "I Open Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I go to Salesforce application",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter \"batch03@codegator.us.qa\" username",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter \"Pa55word\" password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click The \"Login\" button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTest.I_Open_Chrome_Browser()"
});
formatter.result({
  "duration": 4199622900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_go_to_Salesforce_application()"
});
formatter.result({
  "duration": 2801333100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "batch03@codegator.us.qa",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_username(String)"
});
formatter.result({
  "duration": 118018400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pa55word",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_password(String)"
});
formatter.result({
  "duration": 74060200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 13
    }
  ],
  "location": "FirstCucumberTaskTest.I_click_The_button(String)"
});
formatter.result({
  "duration": 808335300,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Make the tabs and buttons dynamic",
  "description": "",
  "id": "dynamic-tabs-and-buttons-in-account-page;make-the-tabs-and-buttons-dynamic",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@task"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I click the \"Accounts\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I am on \"Accounts\" home page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click \"new\" button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I enter \"Fahim\" for \"acc2\" field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter \"743926\" for \"acc5\" field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter \"New York\" for \"acc23\" field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter \"New York\" for \"acc23\" field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select \"Prospect\" from \"acc6\" field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select \"Banking\" from \"acc7\" field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter \"2.1B\" for \"acc8\" field",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "# And I should see the Rating field"
    }
  ],
  "line": 23,
  "name": "I select \"Hot\" from \"acc9\" field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click \"save\" button",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Accounts",
      "offset": 13
    }
  ],
  "location": "FirstCucumberTaskTest.I_click_the_tab(String)"
});
formatter.result({
  "duration": 22027145800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Accounts\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-NPGNVUT\u0027, ip: \u0027192.168.0.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\fahim\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:61770}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: a5d6e691310f26451612002cdea7f2f4\n*** Element info: {Using\u003dlink text, value\u003dAccounts}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinition.FirstCucumberTaskTest.I_click_the_tab(FirstCucumberTaskTest.java:22)\r\n\tat ✽.And I click the \"Accounts\" tab(task.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Accounts",
      "offset": 9
    }
  ],
  "location": "FirstCucumberTaskTest.I_am_on_home_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "new",
      "offset": 9
    }
  ],
  "location": "FirstCucumberTaskTest.I_click_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Fahim",
      "offset": 9
    },
    {
      "val": "acc2",
      "offset": 21
    }
  ],
  "location": "FirstCucumberTaskTest.I_enter_for_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "743926",
      "offset": 9
    },
    {
      "val": "acc5",
      "offset": 22
    }
  ],
  "location": "FirstCucumberTaskTest.I_enter_for_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 9
    },
    {
      "val": "acc23",
      "offset": 24
    }
  ],
  "location": "FirstCucumberTaskTest.I_enter_for_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 9
    },
    {
      "val": "acc23",
      "offset": 24
    }
  ],
  "location": "FirstCucumberTaskTest.I_enter_for_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Prospect",
      "offset": 10
    },
    {
      "val": "acc6",
      "offset": 26
    }
  ],
  "location": "FirstCucumberTaskTest.I_select_from_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Banking",
      "offset": 10
    },
    {
      "val": "acc7",
      "offset": 25
    }
  ],
  "location": "FirstCucumberTaskTest.I_select_from_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2.1B",
      "offset": 9
    },
    {
      "val": "acc8",
      "offset": 20
    }
  ],
  "location": "FirstCucumberTaskTest.I_enter_for_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hot",
      "offset": 10
    },
    {
      "val": "acc9",
      "offset": 21
    }
  ],
  "location": "FirstCucumberTaskTest.I_select_from_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "save",
      "offset": 9
    }
  ],
  "location": "FirstCucumberTaskTest.I_click_button(String)"
});
formatter.result({
  "status": "skipped"
});
});
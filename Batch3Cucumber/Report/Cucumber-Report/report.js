$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Canvas.feature");
formatter.feature({
  "line": 1,
  "name": "Canvas Login",
  "description": "",
  "id": "canvas-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Automate Canvas Login",
  "description": "",
  "id": "canvas-login;automate-canvas-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@canvas"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I Open Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I go to \"https://canvas.instructure.com/login/canvas\" page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter \"fahimpaikar@gmail.com\" username",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter\"Musawir@2011\" password",
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
  "duration": 2870785600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://canvas.instructure.com/login/canvas",
      "offset": 9
    }
  ],
  "location": "CanvasLoginTest.I_go_to_page(String)"
});
formatter.result({
  "duration": 1048823700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fahimpaikar@gmail.com",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_username(String)"
});
formatter.result({
  "duration": 20105199600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#username\"}\n  (Session info: chrome\u003d98.0.4758.82)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027DESKTOP-NPGNVUT\u0027, ip: \u002710.0.0.158\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.82, chrome: {chromedriverVersion: 98.0.4758.80 (7f0488e8ba0d8..., userDataDir: C:\\Users\\fahim\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:65395}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 77bf36a4654297244a893507cb114706\n*** Element info: {Using\u003did, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinition.LoginTest.I_enter_username(LoginTest.java:48)\r\n\tat ✽.And I enter \"fahimpaikar@gmail.com\" username(Canvas.feature:6)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "status": "skipped"
});
});
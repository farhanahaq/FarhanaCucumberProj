$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/NewAC.feature");
formatter.feature({
  "line": 1,
  "name": "As a valid logged user I want go to New AC Page So that I can create a new AC",
  "description": "",
  "id": "as-a-valid-logged-user-i-want-go-to-new-ac-page-so-that-i-can-create-a-new-ac",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Users would be able to add new account",
  "description": "",
  "id": "as-a-valid-logged-user-i-want-go-to-new-ac-page-so-that-i-can-create-a-new-ac;users-would-be-able-to-add-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "a user already logged in as \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user navigate to Bank Cash -\u003e New Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "New Accounts Page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user submits \"\u003ctitle\u003e\", \"\u003cdescription\u003e\" and \"\u003cinitial balance\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Account created successfully message should display",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 8,
      "value": "#Then created account should be posted"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "id": "as-a-valid-logged-user-i-want-go-to-new-ac-page-so-that-i-can-create-a-new-ac;users-would-be-able-to-add-new-account;",
  "rows": [
    {
      "cells": [
        "title",
        "description",
        "initial balance",
        "username",
        "password"
      ],
      "line": 10,
      "id": "as-a-valid-logged-user-i-want-go-to-new-ac-page-so-that-i-can-create-a-new-ac;users-would-be-able-to-add-new-account;;1"
    },
    {
      "comments": [
        {
          "line": 11,
          "value": "#| Mean | Golf       |10000          | demo@techfios.com  | abc123   |"
        }
      ],
      "cells": [
        "Green",
        "Tennis",
        "2000",
        "demo@techfios.com",
        "abc123"
      ],
      "line": 12,
      "id": "as-a-valid-logged-user-i-want-go-to-new-ac-page-so-that-i-can-create-a-new-ac;users-would-be-able-to-add-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7954961500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#| Mean | Golf       |10000          | demo@techfios.com  | abc123   |"
    }
  ],
  "line": 12,
  "name": "Users would be able to add new account",
  "description": "",
  "id": "as-a-valid-logged-user-i-want-go-to-new-ac-page-so-that-i-can-create-a-new-ac;users-would-be-able-to-add-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "a user already logged in as \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    3,
    4
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user navigate to Bank Cash -\u003e New Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "New Accounts Page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user submits \"Green\", \"Tennis\" and \"2000\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Account created successfully message should display",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 29
    },
    {
      "val": "abc123",
      "offset": 53
    }
  ],
  "location": "NewACSteps.a_user_already_logged_in_as_and(String,String)"
});
formatter.result({
  "duration": 5968927500,
  "status": "passed"
});
formatter.match({
  "location": "NewACSteps.user_navigate_to_Bank_Cash_New_Account_Page()"
});
formatter.result({
  "duration": 1042201000,
  "status": "passed"
});
formatter.match({
  "location": "NewACSteps.new_Accounts_Page_should_display()"
});
formatter.result({
  "duration": 487587700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Green",
      "offset": 14
    },
    {
      "val": "Tennis",
      "offset": 23
    },
    {
      "val": "2000",
      "offset": 36
    }
  ],
  "location": "NewACSteps.user_submits_and(String,String,String)"
});
formatter.result({
  "duration": 8537859000,
  "status": "passed"
});
formatter.match({
  "location": "NewACSteps.account_created_successfully_message_should_display()"
});
formatter.result({
  "duration": 11263834600,
  "status": "passed"
});
formatter.after({
  "duration": 737604500,
  "status": "passed"
});
});
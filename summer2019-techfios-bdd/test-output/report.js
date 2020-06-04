$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/14693/eclipse-workspace-Cucumber/techfios-bdd/src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page",
  "description": "As a user I want a Login page so that only \r\nauthentic user can have access",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "login-page;valid-users-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a valid user",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user goes to techfios site",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "techfios site should display",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "users logs in with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Dashboard page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "username should match",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.a_valid_user()"
});
formatter.result({
  "duration": 106427200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_goes_to_techfios_site()"
});
formatter.result({
  "duration": 7723539000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.techfios_site_should_display()"
});
formatter.result({
  "duration": 94132900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.users_logs_in_with_valid_credentials()"
});
formatter.result({
  "duration": 1852810100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_be_displayed()"
});
formatter.result({
  "duration": 1083084200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.username_should_match()"
});
formatter.result({
  "duration": 27100,
  "status": "passed"
});
});
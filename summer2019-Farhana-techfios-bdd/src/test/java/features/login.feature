Feature: Login Page
	As a user I want a Login page so that only 
		authentic user can have access
		
Scenario: Valid users should be able to login
Given a valid user 	
When user goes to techfios site
Then techfios site should display
When users logs in with valid credentials
Then Dashboard page should be displayed
And username should match


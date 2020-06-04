Feature: As a valid logged user I want go to New AC Page So that I can create a new AC
Scenario Outline: Users would be able to add new account
        Given a user already logged in as "<username>" and "<password>"
        When user navigate to Bank Cash -> New Account Page
        Then New Accounts Page should display
        When user submits "<title>", "<description>" and "<initial balance>"
        Then Account created successfully message should display
        #Then created account should be posted 
Examples: 
| title | description|initial balance| username                | password |
#| Mean | Golf       |10000          | demo@techfios.com  | abc123   |
| Green  | Tennis     |2000          | demo@techfios.com  | abc123   |
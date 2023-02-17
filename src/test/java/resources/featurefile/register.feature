Feature: Register Page

  Scenario: User should navigate to Register Page Successfully
    Given User is on HomePage
    When User click on Register Link
    Then User should verify Register Text "Register"

  Scenario Outline: User should verify that FirstName Lastname Email Password and ConfirmPassword Fields are Mandatory
    Given User is on HomePage
    When User click on Register Link
    And User select gender Female
    And User enter First "<Fname>"
    And User enter Last "<Lname>"
    And User should select d "<Day>"
    And User should select  m"<Month>"
    And User should select y "<Year>"
    And User enter e"<Email>"
    And User enter p"<Password>"
    And User enter cm"<Confirm Password>"
    And User click on Register Button
    And User should verify the "<error message>"
    Examples:
      | Fname  | Lname  | Day | Month | Year | Email             | Password | Confirm Password | error message           |
      |        | disney | 10  | June   | 1995 | mindis@gmail.com | abc123   | abc123           | First name is required. |
      | minnie |        | 10  | June   | 1995 | mindis@gmail.com | abc123   | abc123           | Last name is required.  |
      | minnie | disney | 10  | June   | 1995 |                  | abc123   | abc123           | Email is required.      |
      | minnie | disney | 10  | June   | 1995 | mindis@gmail.com |          | abc123           | Password is required.   |
      | minnie | disney | 10  | June   | 1995 | mindis@gmail.com | abc123   |                  | Password is required.   |


  Scenario: User should create Account Successfully
    Given User is on HomePage
    When User click on Register Link
    And User select gender Female
    And User enter First "kim"
    And User enter Last "philips"
    And User should select d "10"
    And User should select  m"May"
    And User should select y "2000"
    And User enter e"kimp@gmail.com"
    And User enter p"abc123"
    And User enter cm"abc123"
    And User click on Register Button
    Then User should verify the registration completed text"Your registration completed"


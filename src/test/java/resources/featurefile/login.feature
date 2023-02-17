Feature: Login Page

  Scenario: User should navigate to login page successfully
    Given User is on Home Page
    When User click on Login link
    Then User should verify welcome message "Welcome, Please Sign In!"


  Scenario Outline: : User should verify error message with invalid credentials
    Given User is on Home Page
    When User click on Login link
    And User enter an email address "<email address>"
    And User enter a password field "<password>"
    And User click on Login Button
    Then User should verify the error message "<error message>"
    Examples:
      | email address      | password | error message                                                                             |
      | mindis10@gmail.com | 123456   | Login was unsuccessful. Please correct the errors and try again.No customer account found |
      | mindi@gmail.com    | 12345    | Login was unsuccessful. Please correct the errors and try again.No customer account found |


  Scenario: User should login sucessfully with valid credentials
    Given User is on Home Page
    When User click on Login link
    And User enter an email address "kimp@gmail.com"
    And User enter a password field "abc123"
    And User click on Login Button
    Then User should verify logout link "Log out"


  Scenario: User should log out successfully
    Given User is on Home Page
    When User click on Login link
    And User enter an email address "kimp@gmail.com"
    And User enter a password field "abc123"
    And User click on Login Button
    And click on Logout link
    Then User to verify Login link "Log in"

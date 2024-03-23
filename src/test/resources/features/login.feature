@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    Given the user logged in with username as "<User1>" and password as "<UserUser123>"


    Examples:
      | UserType  | User1                 | UserUser123 |
      | HR        | hr21@cydeo.com        | UserUser    |
      | Marketing | marketing21@cydeo.com | UserUser    |
      | Helpdesk  | helpdesk21@cydeo.com  | UserUser    |



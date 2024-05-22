Feature: Create an organization

  Background:
    Given the user is on the serenity demo page
    When attempts to log in
      | user  | pass     |
      | admin | serenity |

  Scenario Outline: Create a Business Organization
    When the user attempts to create a business unit with
      | name   | unity   |
      | <name> | <unity> |
    Then the user will see the business unit created with <name>
    Examples:
      | name     | unity          |
      | Xelerica | Administration |
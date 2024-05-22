Feature: Create a new contact

  Background:
    Given the user is on the serenity demo page
    When attempts to log in
      | user  | pass     |
      | admin | serenity |

  Scenario Outline: Create a New Contact
    When the user attempts to create a Contact with
      | title   | firstName   | lastName   | email   | id   | userName   |
      | <title> | <firstName> | <lastName> | <email> | <id> | <userName> |
    Then the user will see the contact created with <firstName>
    Examples:
      | title         | firstName | lastName | email            | id  | userName      |
      | Administrator | David     | Delta    | jane@example.com | 020 | stephen.white |





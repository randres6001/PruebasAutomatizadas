Feature: Create a supplier

  Background:
    Given the user is on the serenity demo page
    When attempts to log in
      | user  | pass     |
      | admin | serenity |

  Scenario Outline: Create a New Supplier
    When the user attempts to create a Supplier with
      | companyName   | contactName   | contactTitle   | address   | region   | postalCode   | country   | city   | phone   | fax   | homePage   |
      | <companyName> | <contactName> | <contactTitle> | <address> | <region> | <postalCode> | <country> | <city> | <phone> | <fax> | <homePage> |
    Then the user will see the supplier created with <contactName>

    Examples:
      | companyName      | contactName     | contactTitle | address        | region  | postalCode | country | city       | phone    | fax      | homePage     |
      | Acme Corporation | David Rodriguez | Manager      | 123 Elm Street | Central | 12345      | USA     | Metropolis | 555-1234 | 555-5678 | www.acme.com |





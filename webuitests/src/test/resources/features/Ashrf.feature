@Ashrf
Feature: Ashrf Facebook

  Scenario: Regester Facebook Acount
    Given User navigate to Facebook
    When I enter invalid data on the page
      | Fields                 | Values              |
      | First Name             | Ashrf               |
      | Last Name              | Abu Esba            |
      | Email Address          | someone@someone.com |
      | Re-enter Email Address | someone@someone.com |
      | Password               | Password1           |
      | Birthdate              |                  01 |
    When I enter invalid data on the page
      | Fields                 | Values              |
      | First Name             | Ashrf               |
      | Last Name              | Abu Esba            |
      | Email Address          | someone@someone.com |
      | Re-enter Email Address | someone@someone.com |
      | Password               | Password1           |
      | Birthdate              |                  01 |

  Scenario: Finesh the UI tests
    * UI Finesh test

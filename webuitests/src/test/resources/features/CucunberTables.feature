@Functional
Feature: Data table

  Scenario: 
    Given User navigate to Facebook
    When I enter invalid data on the page
      | Fields                 | Values              |
      | First Name             | Ashrf               |
      | Last Name              | Abu Esba            |
      | Email Address          | someone@someone.com |
      | Re-enter Email Address | someone@someone.com |
      | Password               | Password1           |
      | Birthdate              |                  01 |
    * UI Finesh test

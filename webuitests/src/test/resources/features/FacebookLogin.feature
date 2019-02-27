@Functional
Feature: Facebook Login

  @tag1
  Scenario: Title of your scenario
    Given User navigate to Facebook
    When User logs in using Username as "ashrf" and Password as "ashrfpass"
    Then Login should be unsuccessful

  @tag2
  Scenario: Title of your scenario
    Given User navigate to Facebook
    When User logs in using Username as "ashrf" and Password as "ashrfpass"

  @tag3
  Scenario Outline: Login functionality for a social networking site.
    Given User navigate to Facebook
    When User logs in using Username as "<username>" and Password as "<password>"
    Then Login should be unsuccessful

    Examples: 
      | username  | password  |
      | username1 | password1 |
      | username2 | password2 |

  @tag4
  Scenario: Finesh the UI tests
    * UI Finesh test

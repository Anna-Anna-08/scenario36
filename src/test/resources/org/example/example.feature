Feature: : Login functionality

  Scenario Outline: Successful login
    Given I am on the SkillFactory login page
    When I enter valid email and password
    When click the <string> button
    Then I should see the <string1> message
    Examples:
      | string   | string1        |
      | "Log in" | "Welcome back" |

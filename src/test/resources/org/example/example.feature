Feature: : Login functionality

  Scenario Outline: Successful login
    Given I am on the SkillFactory login page
    When I enter valid email and password
    When click the "Log in" button
    Then I should see the "Welcome back" message

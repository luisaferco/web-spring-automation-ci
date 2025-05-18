Feature: Running with spring

  Scenario: Running a test
    Given I run with spring
    When I recollect test with serenity
    Then the result is "success"
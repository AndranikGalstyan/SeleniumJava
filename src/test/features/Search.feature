@test
@search
Feature: Selenium Easy search functionality

  Scenario: Search valid data
    Given Home page is opened
    And Type "interview questions" in search field
    When Click on search icon
    Then Assert that search result titles contain "interview questions"
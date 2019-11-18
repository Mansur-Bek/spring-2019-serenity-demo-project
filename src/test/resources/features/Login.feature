@login
Feature: Login to Vytrack


  @driver
  Scenario: Login as driver
    Given user opens the login page
    When the users logs in as a driver
    Then the dashboard should be visible

  Scenario: Login as sales manager
    Given user opens the login page
    When the users logs in as a sales manager
    Then the dashboard should be visible


  Scenario: Login as store manager
    Given user opens the login page
    When the users logs in as a store manager
    Then the dashboard should be visible

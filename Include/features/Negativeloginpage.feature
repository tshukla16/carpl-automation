@NegativeLogin
Feature: Title of your feature
  I want to use this template for my feature file

  @NegativeLoginpage
  Scenario: Negative login page in carpl ai
    Given I navigate to Carplai application
    And I click Log in button
    Given I navigate to Carplai application
    And I enter the invalid username and Click in submit button
    Given I navigate to Carplai application
    And I enter the invalid username and invalid password
    Given I navigate to Carplai application
    And I enter the invalid password
    Given I navigate to Carplai application
    And I enter the invalid username and invalid password
    Given I navigate to Carplai application
    Then User Should not enter characters more than specified range
    Given I navigate to Carplai application
    When I enter the valid username
    And I click Log in button
    Then user is getting a error a message Enter Password
     Given I navigate to Carplai application
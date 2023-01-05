
@Dashboard
Feature: Dashboard Feature in carpl ai application

  @Dashboard
  Scenario Outline: Dashboard page in carpl ai application
    Given I navigate to Carplai application
    And I enter username <username> and password <password>
    And I click Log in button 
    When I verfiy icon in Dashboard page 
    Then It should not overlap each other
    
Examples: 
      | username | password         |
      | sudo@carpl.ai | admin@c@rpl |
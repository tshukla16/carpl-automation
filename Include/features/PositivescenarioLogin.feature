
@Logincarplai
Feature: Login Feature


  @logincarplai
  Scenario Outline: Login with a valid credential
    Given I navigate to Carplai application
    And I enter username <username> and password <password>
    And I click Log in button 
    Then I should be able to login successfully
    
    
    Examples: 
      | username | password         |
      | sudo@carpl.ai | admin@c@rpl |
      
      
      
      
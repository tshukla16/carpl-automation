
@RegisterPage
Feature: Register page in carpl ai application
  

  @RegisterPage
  Scenario Outline: Verify the user will get the register email from info@carpl.ai
    Given I navigate gmail application
     When I enter username and password in gmail
     Then Verify the user will get the register email info@carpl.ai
     
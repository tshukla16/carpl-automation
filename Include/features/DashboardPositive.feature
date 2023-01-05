
@DashboardPositive
Feature: Title of your feature
  I want to use this template for my feature file

  @DashboardPositive
  Scenario Outline: Dashboard page positive secarnio in carpl ai application
  
 Given I navigate to Carplai application
  And I enter username <username> and password <password>
  And I click Log in button
  When Verify the hyperlink under dashboard page
  Then Link are working fine in annotation
  When Verify Records Are Only Increasing In the Dashboard When We Addupload Studies And Collections
  Then records count are increase on dashboard
 
  
  
    Examples: 
      | username | password         |
      | sudo@carpl.ai | admin@c@rpl |
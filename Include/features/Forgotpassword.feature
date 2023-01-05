
@Forgotbutton
Feature: Forgot Password button 
 

  @Forgotbutton
  Scenario: Verify the Forgot Password button
   Given I navigate to Carplai application
    When I click in forgot link
    Then Reset password page will appear
    Given I navigate reset page of Carplai application
    Then cursor is not in the username textbox
    Given I navigate to Carplai application
    And click in forgot password link
    Given I navigate to Carplai application
    When Verify the email field is present on the forget password page 
   Given I navigate reset page of Carplai application
    When Enter the invalid email id in email textboxes
    Then user is getting a error a massage Email doesn't exist
    Given I navigate reset page of Carplai application
    When Enter the invalid email id in rest password page
    Then verfiy the error message Something went wrong 
  
   
    
    
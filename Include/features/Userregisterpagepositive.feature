
@RegisterPagePositive
Feature: Register page with positive in carpl ai application
  
  @RegisterPagePositive 
  Scenario Outline: register page with positive secarnio in carpl ai applications
     Given I navigate to Carplai register page
     When Fill the invalid password and click register button
     Then It should show error message Password did not Match
     Given I navigate to Carplai register page
     When click in masked icon under password textboxes in new register page 
     Then user click successfully toggle icon password textbox
     When user enter the different <password> and passwords <confirmpassword>
     Given I navigate to Carplai register page
     When Enter the space with password in password textboxes 
     Then It should not reach to dashborad 
     Given I navigate to Carplai register page
     When Enter the password with number
     Then It should gives a error massage
     Given I navigate to Carplai register page
     When Enter the password with minimum number
     Then It should show the error message fill the 8 to 20 character 
     Given I navigate to Carplai register page
     When Fill the Email Text field that has an Email address without @ symbol
     Then It should show the message Invalid mail id 
      Given I navigate to Carplai register page
     When Enter the email with random string
     Then It should show the message Invalid mail id
    Given I navigate to Carplai register page
      When Enter the email without dot in email address
      Then It should show the message Invalid mail id
      Given I navigate to Carplai register page
      Then I click in register button
      Then It should show the message Invalid mail id
      Given I navigate to Carplai register page
      When user Fill the detail which already register
      Then It should show the message Email is already registered
      Given I navigate to Carplai register page
      When user do not fill in register page
      Then it should not show the dasborad page 
      
      Examples: 
      | password | confirmpassword         |
      | Airpush@1601 | admin@c@rpl |
      
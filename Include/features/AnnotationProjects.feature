
@AnnotationProjects
Feature: Verify the Annotation Projects 


  @AnnotationProjects
  Scenario: Verify the Annotation tmeplate with different user and self assgined 
   When Verify the self Assgin annotation template in viewer
   Then Viewer should appear with all options
   When Verify the user Assgin annotation template to different user
   Then viewer should appear with all options with different user 
   When Verify the user assgin the template to different user
   Then different user assgin the templates in annotation page 
   When user create template in annotaion template page
   Then user should able to see viewer with that options
   When user can select the multplie user in assgin annotation page 
   Then multiple users email drop down list should appear in assgin annotation page 
   When Remove all case from annotation project pages 
   Then All case should not appear in annotation project pages
   
   
   

@Searchindataset
Feature: Check search functionality in dataset page 
 
  @Searchindataset
  Scenario: search functionality in dataset page 
    Given enter the username and password
    When Search is functional and generating the correct result for correct keywords 
    Then successfully get result in dataset page
    Given enter the username and password
    When search invalid data in dataset page 
    Then An error message should be display when a user enters the invalid keywords
    Given enter the username and password
    When Verify pagination added in case if the search result goes on the number of pages  
    Then Page should selected according number of page
    When Verify if new items added on the dataset, search would show the result
    When Validate search rules defined for Exact Match with the search key word
    Then These rules should work with exact match
    When Validate search rules defined for Similar Match with the search key word
   Then These rules should work with exact match
   When Enter only special characters in the search field and click on the Search button
   Then dataset with special characters should show on result
   When Enter only numbers in the search field and click on the Search button
   Then dataset with a number should show on result
   When Enter alphanumeric characters in the search box and click on the Search button
   Then dataset with alphanumeric should show on result
   When Verify this on all pages where the Search box is available
   Then search box should be available in page or as per requirement
   When Verify the result when the user enters a partial searched keyword and click on search.
   Then It should search the similar result
   When Verify place holder text added on search or not.
   Then placeholder text is seen in Search box
   When Verify no results are returned when the user enters no value and clicks on the Enter button
   Then no result should be result when user search with null 
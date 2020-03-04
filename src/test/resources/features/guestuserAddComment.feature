
@addNewComment   @regression
Feature:As a guest user they can add new comment in nopcommerce,
   Scenario:Guest user should able to add a new comment in nopcommerce successfully

     Given user is on the Nopcommerce homepage
     When user navigate to new comments
     And user fills comment fields
     And user click on new comment button
     Then comment should be added and message display <News comment is successfully added.>
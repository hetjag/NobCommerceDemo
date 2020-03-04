@compare   @regression
Feature: As a user, I should able to register successfully,
  So that I can use all user functionality.


  Scenario:I should able to compare two different product
    Given I am on the NopeCommerce  homepage
    When I click on two product for add compare list
    And i click compare product
#    And I click on bar notification
    Then I should able to compare two product and see <compare products> message
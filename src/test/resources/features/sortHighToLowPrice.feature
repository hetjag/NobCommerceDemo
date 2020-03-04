
@sortHighLow @reg
Feature:As a user, I should be able to sort product high to low by price,
  so that I can use sort product facility.
  Scenario:I should able to sort product high to low by price.
    Given I am on the NopeCommerce  homepage
    When I click on any category
    And I select on high to low
    Then I should see price organised high to low


   @EmailAFriend  @regression
Feature:As a register user,I should able to refer a product to a friend,
  So that I can refer a prod@regressionuct to friends

  @emailFriendReg
  Scenario:I should able to refer a product to a friend
    Given I am already registered on nopcommerce
    And I am on product page
    When I click on any product
    And I click on email a friend
    And I enter all details except own email
    And I click on send email
    Then I should see <Your message has been sent>

  @emailFriendNonReg
  Scenario:I should NOT able to refer a product to a friend when I am not registered
    Given I am on the NopeCommerce  homepage
    When I click on any product
    And I click on email a friend
    And I enter all details for refer a product
    And I click on send email
    Then I should see error message <Only registered customers can use email a friend feature>

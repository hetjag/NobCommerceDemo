

@hover
Feature:As User I can use hoover facilities on category
   So that I can use hoover facilities successfully
  Background:
    Given   user is on the Nopcommerce homepage

  Scenario: I should able to use hoover facilities
      When I hover over on category "Electronics" link
      Then I should able to see related "Electronics" link text color change to blue


  Scenario: I should able to navigate to subcategory page
        When I hover over "Electronics"  link and click on subcategory "Camera & photo" link
        Then I should able to navigate to sub category  "camera-photo" page successfully
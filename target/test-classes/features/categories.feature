Feature:Categories

  Background:
    Given user us on homepage

  @category
  Scenario Outline: User can navigate to correct category page,
  So that he can use all products features from categories

    When user clicks on "<category>" link from top menu
    Then user should able to navigate to "<related category paged>" successfully
    Examples:
      | category          | related category paged                         |
      | Computers         | https://demo.nopcommerce.com/computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads |


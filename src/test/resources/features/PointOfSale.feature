
Feature: Point Of Sale
As a user I should be able create product under the "Product" subModule in the Point Of Sale Page

  Background: user logs in
    Given user in on the login page
    Then user click Sign in button
    Then user logs in as pos manager with "posmanager60@info.com" username and "posmanager" password

  @PointOfSale
  Scenario: Creating  a Product under "Product" submodule
    Then user will click the Point Of Sale tab
    Then user will click the Products subModule first and then click the Pos Categories
    Then user will click the Create button
    And user will enter the name of the product to the Name box
    Then user enter info to the Parent Category
    Then user enter data to the box of sequence
    And User clicks Save button



Feature: Login
  As a user, I should be able to login into oddo
  under different roles with username and password

  Background: user logs in
    Given user in on the login page
    Then user click Sign in button

  @InventoryManager
Scenario: Login as inventory manager
  Then user logs in as inventory manager with "imm20@info.com" username and "inventorymanager" password
  And user verifies that subtitle "#Inbox" is displayed

  @PosManager
  Scenario: Login as pos manager
    Then user logs in as pos manager with "posmanager60@info.com" username and "posmanager" password
    And user verifies that subtitle "#Inbox" is displayed

  @EventCrmManager
  Scenario: Login as events crm manager
    Then user logs in as events crm manager with "eventscrmmanager32@info.com" username and "eventscrmmanager" password
    And user verifies that subtitle "#Inbox" is displayed


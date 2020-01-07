@Contacts
Feature: Contacts
  As an user, I should be able to create contact under "Contacts" module.

  Background: user logs in
    Given user in on the login page
    Then user click Sign in button
    Then user logs in as pos manager with "posmanager60@info.com" username and "posmanager" password

    @Contacts
    Scenario: Creating a Contact under "Contacts" module
      Then user navigates to contacts module
      When user will click the Create button in "Contacts" module
      And  user enters Contact information and saves new contact



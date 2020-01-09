
@NewPipeline

Feature: Create new pipeline
  As a user, I should be able to create a new pipeline under "CRM" module

  Scenario: Create new pipeline in CRM tab
    Given user is on the login page
    And user clicks Sign In button
    Then user logs in as eventcrm manager with "eventscrmmanager32@info.com" username and "eventscrmmanager" password
    Then user clicks on CRM tab
    Then user licks on create button
    Then user type new Pipeline name
    Then user click on Create and Edit button



Feature: Customer Relationship Management
  As a user, I should be able to see all their leads/opportunities in one location,
  manage them from one stage to another, and analyze their results

  Background: User logs in as events crm manager
    Given user in on the login page
    Then user click Sign in button
    And user logs in as events crm manager with "eventscrmmanager32@info.com" username and "eventscrmmanager" password
    Then user navigates to "CRM" module

  @ChangeStatus
  Scenario: As a user I should be able to chance a status of pipeline
    And user verifies, that columns name "New","Proposition","Qualified","Approved" are visible
    Then user finds pipeline by the "test1"
    And user moves pipeline to "Proposition" column
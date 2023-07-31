@login
Feature: Login
  In order to maintain the health records, doctors records 
  As a user
  I would like to access the OpenEMR dashboard

  Background: 
    Given I have browser with OpenEMR application

  @invalid
  Scenario: Invalid Login
    When I enter username as 'john'
    And I enter password as 'john123'
    And I click on login
    Then I should not get access to dashboard with error as 'Invalid username or password'

  @valid @smoke
  Scenario Outline: Valid Login
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    Then I should get access to the portal with title as '<expected_title>'

    Examples: 
      | username   | password   | expected_title |
      | accountant | accountant | OpenEMR        |
      | physician  | physician  | OpenEMR        |
      
      
  #@valid @smoke
  #Scenario: Valid Login
  #Given I have browser with OpenEMR application
  #When I enter username as 'admin'
  #And I enter password as 'pass'
  #And I click on login
  #Then I should get access to the portal with title as 'OpenEMR'

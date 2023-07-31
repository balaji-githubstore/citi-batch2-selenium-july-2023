@patient
Feature: Patient
  In order to maintain the patient records
  As a user
  I want to add,edit,delete patient records

  @addpatient
  Scenario Outline: Add Valid Patient
    Given I have browser with OpenEMR application
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    And I click on patient menu
    And I click on new-search menu
    And I fill the new patient form
      | firstname | lastname | gender   | dob   |
      | <fname>   | <lname>  | <gender> | <dob> |
    And I click on create new patient
    And I click on confirm create new patient
    And I handle the alert
    And I close the happy birthday popup if avaiable
    Then I should be able verify the added name as '<expected_patient_name>'

    Examples: 
      | username | password | fname | lname   | gender | dob        | expected_patient_name                 |
      | admin    | pass     | john  | wick    | Male   | 2023-07-21 | Medical Record Dashboard john wick    |
      | admin    | pass     | saul  | goodman | Male   | 2023-07-21 | Medical Record Dashboard saul goodman |

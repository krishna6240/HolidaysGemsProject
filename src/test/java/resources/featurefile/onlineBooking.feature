Feature: SignUp, Sign In and Purchase Product

#  @Regression
  Scenario: TC-001 Create New User/SignUp
    Given I am on home page
    When I send email on email textBox
    Then I click on signup button

  @Regression
  Scenario: TC-002 Input all information on Search Form
    Given I am on home page
    When I click on destination list
    And I select destination "Costa Almeria - Spain"
    And I click on departing from
    And I select airport "London (All Airports)"
    And I click on start date
    And I select the month "Apr 2022" and date "16"
    And I select the "3 Nights"
    And I can select BoardBasis "All Inclusive"
    And I can select Rooms
    And I can add adults "1"
    And I can click on Search Button
    And I can select Roomfinal
    And I can click on continue
    And I can click On checkout Button
    And I enter Title "Mr"
    And I enter FirstName "Anand"
    And I enter MiddleName "M"
    And I enter LastName "Tripathi"
    And I enter day "12"
    And I enter month "3"
    And I enter year "1978"
    And I enter Primary Number
    And I enter Email Address
    And I enter confirm Email Address
    And I click on Continue Button
    And I enter House Number
    And I enter City
    And I enter County
    And I enter Country "United Kingdom"
    And I enter PostCode
    Then I click on Continue Btn



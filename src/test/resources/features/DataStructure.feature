@data
Feature: DataStructure Page
  User is able to perform various functions in DataStructure Page

  Background: 
    Given The user is on home page
    And the user goes to signin page
    And the user enters valid username and password 
    And the user clicks on login button
    And the user goes to Data structure page

  @data1
  Scenario: DataStructure Home Page functionalities
    Given The user navigates to home page

    When The user clicks  Get Started button
    Then The user should land in Data Structure Introduction Page
@data2
  Scenario: Time complexity page
    Given The user is on the Time Complexity Page
    When The user clicks Try Here  button of Time Complexity page
    Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
    When The user clicks the Run Button without entring the code in the Editor
    Then Nothing happens to the page and no error message is displayed
@data3
  Scenario Outline: Time complexity invalid page
    Given The user is on the Python Editor page
    When The user write the invalid python code from excel sheet "<sheetname>" and <rownumber>
    And the user click the run button
    Then The user should able to see an error message in alert window

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |
@data4
  Scenario Outline: Time complexity valid page
    Given the user is python editor page
    When the user write valid code datastructure "<sheetname>" and <rownumber>
    And user click run button
    Then The user should able to see output in the console

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |         0 |

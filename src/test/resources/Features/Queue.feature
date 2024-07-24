@tag
Feature: Queue page functionality

  Background: 
    Given user is queue homepage
    When user goes in the sign in page
    Then user clicks is on username and password
    And user clicks login button
    And user is on Queue perform page

  @tag1
  Scenario Outline: user is on Queue homepage
    Given user click getstarted button in queue page
    When user clicks implementation of python page
    Then user clicks try here button
    When user enter try editor page
    Then user enter valid python code to excel sheet "<sheetname>" and <rownumber>
    And user clicks run button to see output in the console
    Then user enter invalid code to excel shhet "<sheetname>" and <rownumber>
    And user get error pop up message

    Examples: 
      | sheetname | rownumber |
      | Sheet12   |         0 |
      | Sheet12   |         1 |

  Scenario Outline: user is Queue home page function
    Given user enter implentation using collection page
    When user clicks try here button of collection page
    Then user enter python editor page in the collection
    When user enter valid python code inthe excel sheet from "<sheetname>" and <rownumber>
    Then user get on console message
    When user enter invalid python code from excel sheet "<sheetname>" and <rownumber>
    Then user get an error message
    And user redirect to collection page

    Examples: 
      | sheetname | rownumber |
      | Sheet13   |         0 |
      | Sheet13   |         1 |
      
      Scenario Outline: user is Queue home page function
      Given user enter implentation of array page
      When user enter try here button in array page
      Then user enter on try editor page in array
      When user click send to valid python code in excel sheet "<sheetname>" and <rownumber>
      Then user get an array output message
      When user click to send invalid python code in excel sheet "<sheetname>" and <rownumber>
      Then user got error message in the pop up in window
      And user redirect to the page
      
      Examples:
       | sheetname| rownumber|
       | Sheet14  |         0| 
       | Sheet14  |         1|
       
       Scenario Outline:user is on Queue home page function
       Given user enter queue operations page
       When user click queue page
       Then user clicks try here button on the queue page
       When user enter valid pythoncode to excel sheet in queue page "<sheetname>" and <rownumber>
       Then user get output in console for queue page
       When user enter invalid pythoncode to excel sheet in queue page "<sheetname>" and <rownumber>
       Then user get error message in the queue page
       And user redirect to the queue page
       
       Examples:
       | sheetname  |  rownumber|
       | sheetname15|          0|
       | sheetname15|          1|
       
       Scenario Outline: user is on Queue home page function
       Given user is practice page
       When user clicks on practice page
       Then user redirect the home page
       
        

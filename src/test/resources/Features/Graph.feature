@tag
Feature: Graph Page Functionality

  Background: 
    Given user navigated to the login page
    When user submit username and password
    Then user should be logged in

  Scenario Outline: Graph home page functionality
    When user is an graph home page
    Then user clicks get strated button
    When user clicks Graph link
    Then user clicks Try Here button
    When user enters code in  tryeditor from excel sheet to "<sheetname>" and <rownumber>
    Then user click run output is printed
    When users writes the code for invalid in tryeditor from "<sheetname>" and <rownumber>
    Then click run button
    And user get error message in the alert window
    And click ok button

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |

  Scenario Outline: GraphRepresentations page functionality
    Given user is on the Graph page and see Graph Representations
    When user clicks Graph Representations link
    Then user Try Here button
    When user enter phythoncode  in  tryeditor from excel sheet to "<sheetname>" and <rownumber>
    Then user click run and output is printed in the console
    When user enter the python editor and write invalid python code from excel sheet "<sheetname>" and <rownumber>
    And click the run button
    And user see error message in alert window
    And user click the ok button alert window

    Examples: 
      | sheetname | rownumber |
      | Sheet8    |         0 |
      | Sheet8    |         1 |

  Scenario Outline: Graph practice page
    Then user clicks practice Questions link
    Then user should be redirected to practice Questions page

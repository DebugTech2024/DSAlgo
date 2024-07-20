@tag
Feature: Array Home Page Functionality
  User is able to perform various functions in Array Page

  Background: 
    Given The user is on home page
    And the user goes to signin page
    And the user enters valid username and password
    And the user clicks on login button

  @tag1
  Scenario Outline: Array in DSAlgo homepage
    Given user in DSAlgo indroduction page
    When user clicks getstatred button
    Then user clicks on Arrays in python
    And user clicks tryhere button of array in python page
    Then user enter try editor page to enter invalid python code from excel sheet "<sheetname>" and <rownumber> and click run button
    And user see error message displyed
    Then user enter try editor page to enter valid python code from excel "<sheetname>" and <rownumber> and click run
    And user get output msg in console

    Examples: 
      | Sheetname | rownumber |
      | Sheet3    |         0 |
      | Sheet3    |         1 |

  Scenario Outline: Array using List page
    Given user enter an arrayedit page
    When user clicks on array using list link
    Then user click tryhere button to enter python edit page
    When user enter invalid python code to excel sheet from "<sheetname>" and <rownumber> and click ru button
    And user click error message
    Then user enter valid python code from excel "<sheetname>" and <rownumber> and click button
    And user got an message

    Examples: 
      | Sheetname | rownumber |
      | Sheet4    |         0 |
      | Sheet4    |         1 |

  Scenario Outline: Basic operations List page
    Given user is array of basic page
    When user clicks basic operation list page
    Then user enter try here button to python page
    When user write Invalid python code from excel sheet "<sheetname>" and <rownumber> and click button
    And user get error messgage
    Then user write valid python code from excel sheet "<sheetname>" and <rownumber> and run button
    And user get output in console box

    Examples: 
      | Sheetname | rownumber |
      | Sheet5    |         0 |
      | Sheet5    |         1 |

  Scenario Outline: Application of arraay page
    Given user is application page
    When user enter application of array link
    Then user cliks tryhere button to redirect python page
    When user wrote to python code from excel sheet "<sheetname>" and <rownumber> and click run button
    And user is on error message
    When user enter to python code valid for excel sheet "<sheetname>" and <rownumber> and run button
    And user is console message for output

    Examples: 
      | Sheetname | rownumber |
      | Sheet6    |         0 |
      | Sheet6    |         1 |

  Scenario Outline: practice question page
    Given user enter practice question page
    When user enter search way page
    Then user enter invalid code from excel sheet to the page "<sheetname>" and <rownumber>
    And user got error message and display
    When user enter valid code from excel sheet to the page "<sheetname>" and <rownumber>
    And user run button to get message in the console
    And user send submit button
    And user see an error message

    Examples: 
      | Sheetname | rownumber |
      | Sheet7    |         0 |
      | Sheet7    |         1 |
      
      Scenario Outline: practice page 
      Given user enter 
      

@stack
Feature: Stack Functionality
  I want to use this template for my feature file

  Background: 
    Given user is on dsalgo homepage
    And User in signin page
    And User enters valid username and password
    And user click on login button
    And User is on stack page
@stack1
  Scenario: Stack HomePage
    Given User navigate to homepage
    When The user clicks the Getting Started button in Stack Panel
    Then The user should be directed to Stack Page
@stack2
  Scenario Outline: Operations in Stack
    Given The user is in the Stack page after logged in
    When The user clicks Operations in Stack button
    And The user should be directed to "Operations in Stack" Page
    And The user clicks Try Here button
    And The user should be redirected to a page having an tryEditor with a Run button to test
    And user valid python code operation stack "<sheetname>" and <rownumber> in editor box
    And user click on run button in operation stack page
    Then User is able to see the output in console

    Examples: 
      | sheetname | rownumber |
      | Sheet4    |         0 |
@stack3
  Scenario Outline: Invalid operations in stack functionality
    Given User is editor page in stack
    When The user writes the invalid python code operations in stack "<sheetname>" and <rownumber> into editor box
    Then The user see error msg in alert window in operations stack

 Examples: 
      | sheetname | rownumber |
      | Sheet4    |         2 |
       | Sheet4    |         3 |
@stack4
  Scenario Outline: Implementation
    Given The user clicks Types of Implementation link
    When The user clicks TryhereBtn again
    And The User is on the editor page enter text
    And The user writes the valid Implementation python code "<sheetname>" and <rownumber> into editorbox
    Then The user is able to see the output Implementation inside the console.

    Examples: 
      | sheetname | rownumber |
      | Sheet4    |         5 |

 @stack5
  Scenario Outline: Invalid Implementation
    Given The user is on the implemantation editor page
    When The user writes the invalid Implementation python code "<sheetname>" and <rownumber> into editor box
    And The user clicks run btn
    Then The user see error msg in alert window in Implementation

   Examples: 
      | sheetname | rownumber |
      | Sheet4    |         7 |
      | Sheet4    |         8 |
@stack6
  Scenario Outline: Application
    Given The user clicks Types of Application link
    When The user clicks TryHerebtn
    And  User is on the editor pages
    And The user writes the valid Application python code "<sheetname>" and <rownumber> into editorbox
    And The User clicks run button again
    Then The user is able to see the output Application inside the console.

    Examples: 
      | sheetname | rownumber |
      | Sheet4    |        10 |

 @stack7
  Scenario Outline: Invalid Application
    Given The user is on the Editor Application page
    When The user writes the invalid application python code "<sheetname>" and <rownumber> into editor box
    And  user click run btn
    Then The user see error msg in alert window in Application

    Examples: 
      | sheetname | rownumber |
      | Sheet4    |        12 |
      | Sheet4    |        13 |

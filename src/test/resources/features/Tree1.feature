@tree
Feature: DsAlgo Tree Page

  Background: 
    Given User is on home page
    And User goes to signin page
    And User enters valid dsalgo username and password
    And User clicks on Login button
    And User goes to Tree page
@tree1
  Scenario: Tree Page
    Given The user comes back to the DS_algo home page to select or start DS Tree
    When The user select "Tree" from the Data Structure dropdown menuor clicks the "Get Started" button in Tree Panel
    Then The user should be redirected to Tree page.
@tree2
  Scenario Outline: Overview of Trees
    Given The user is on the Tree page
    And The user clicks Overview of Trees link
    When The user should be redirected to Overview  of Trees page.
    And User click try it  button
    And user valid python code for overview of trees "<sheetname>" and <rownumber> and run button
    Then user see valid overview of tree message in console

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |         0 |
@tree3
  Scenario Outline: Invalid Overview of tree
    Given user in editor page
    When user invalid python code for overview of tree "<sheetname>" and <rownumber> and run it
    Then user see the error alert message

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |         2 |
      | Sheet5    |         3 |
@tree4
  Scenario Outline: Terminologies of Tree
    Given The user clicks Terminologies of Trees link
    When The user should be redirected to terminologies  of Trees page.
    And User click try it button in tree
    And user enter editor valid python code for terminologies of trees "<sheetname>" and <rownumber> and run button
    Then user see valid terminologies of tree message in console

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |         5 |
@tree5
  Scenario Outline: Invalid Terminologies of tree
    Given user in editor page and user invalid python code for terminologies of tree "<sheetname>" and <rownumber> and run it
    Then user see the error alert message in terminologies page

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |         7 |
      | Sheet5    |         8 |
@tree6
  Scenario Outline: Types of Tree
    Given The user clicks Types of Trees link
    When The user should be redirected to Types  of Trees page.
    And User click try it button in types of tree
    And user enter editor valid python code for Types of trees "<sheetname>" and <rownumber> and run button
    Then user see valid Types of tree message in console

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |        10 |
@tree7
  Scenario Outline: Invalid Types of tree
    Given user in editor page and user invalid python code for Types of tree "<sheetname>" and <rownumber> and run it
    Then user see the error alert message in Types of tree page

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |        12 |
      | Sheet5    |        13 |
@tree8
  Scenario Outline: Tree Traversals
    Given The user clicks Traversal Tree link
    When The user should be redirected to Traversal  of Trees page.
    And User click try it button in traversal of tree
    And user enter editor valid python code for Traversal of trees "<sheetname>" and <rownumber> and run button
    Then user see valid Traversal of tree message in console

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |        15 |
@tree9
  Scenario Outline: Invalid  Tree Traversal
    Given user in editor page and user invalid python code for Traversal of tree "<sheetname>" and <rownumber> and run it
    Then user see the error alert message in Traversal of tree page

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |        17 |
      | Sheet5    |        18 |
@tree10
  Scenario Outline: Tree Traversals-Illustration
    Given The user clicks Traversal Illustration Tree link
    When The user should be redirected to Traversal illustration  of Trees page.
    And User click try it button in traversal illustration of tree
    And user enter editor valid python code for Traversal illustration of trees "<sheetname>" and <rownumber> and run button
    Then user see valid Traversal illustration of tree message in console

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |        20 |
@tree11
  Scenario Outline: Invalid  Tree Traversals-Illustration
    Given user in editor page and user invalid python code for Traversal illustration of tree "<sheetname>" and <rownumber> and run it
    Then user see the error alert message in Traversal illustration of tree page

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |        22 |
      | Sheet5    |        23 |
@tree12
  Scenario Outline: Binary Tree
    Given The user clicks Binary Tree link
    When The user should be redirected to Binary tree page.
    And User click try it button in Binary tree
    And user enter editor valid python code for Binary trees "<sheetname>" and <rownumber> and run button
    Then user see valid Binary tree message in console

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |        25 |
@tree13
  Scenario Outline: Invalid  Binary Tree
    Given user in editor page and user invalid python code for Binary tree "<sheetname>" and <rownumber> and run it
    Then user see the error alert message in Binary page

    Examples: 
      | sheetname | rownumber |
      | Sheet5    |        27 |
      | Sheet5    |        28 |

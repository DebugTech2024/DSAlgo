@tr
Feature: Tree page functionality

  Background: 
    Given user is tree2 homepage
    When user  in the sign in page of tree
    Then user click is on username and password for tree
    And user click login button for tree
    And user is on tree2 perform page

  @tr1
  Scenario Outline: user is on tree homepage
    Given user is on implementation in python pages
    Then user is on try here button
    When user enter try editior page
    Then user enter valid code on implementation in python page from excel sheet "<sheetname>" and <rownumber>
    And user is on get output in the console
    When user enter invalid code on implentation of tree page from excel sheet "<sheetname>" and <rownumber>
    And user get an error message in the implentation of tree
    And user redirct the implentation of the page

    Examples: 
      | sheetname | rownumber |
      | Sheet16   |         0 |
      | Sheet16   |         1 |

@tr2
  Scenario Outline: user is on tree homepage
    Given user Binary tree traversals page
    Then user is tryhere button of tree traversals page
    When user enter is on try editior page on tree traversals page
    Then user enter is on valid python code for tree traversals in excel sheet from "<sheetname>" and <rownumber>
    And user is on get output in the console for tree traversals page
    When user enter invalid code on python code for tree traversals in excel sheet from "<sheetname>" and <rownumber>
    And user is an error message in the tree traversals page
    And user is an redirect the page for tree traversals page

    Examples: 
      | sheetname | rownumber |
      | Sheet17   |         0 |
      | Sheet17   |         1 |

@tr3
   Scenario Outline: user is on tree homepage
   Given user impl of binary trees page
   Then user is tryhere button of imple of binary trees page
   When user is on enter tryeditor page on imple of binary trees page
   Then user enter valid code from python code fof imple of binary trees page in excel sheet from "<sheetname>" and <rownumber>
   And user is on get output message in the console for imple of binary page
   When user enter invalid code for python for imple of binary page in excel sheet from "<sheetname>" and <rownumber>
   And user is an error message in the imple of binary trees page
   And user redirect the page for imple of binary tree page
   
   Examples:
     | sheetname |  rownumber |
     | Sheet18   |          0 |
     | Sheet18   |          1 |   
  
  @tr4     
  Scenario Outline:user is on tree homepage
  Given user is on application of binary trees
  Then user is on try here button in the appliction of binary trees
  When user is on the tryeditor button for appliction of binary trees
  Then user enter valid code from python code for appliction of binary tree in excel sheet from "<sheetname>" and <rownumber>
  And user is on the console message in the application of binary tree
  When user enter invalid code from python code for appliction of binary tree in excel sheet from "<sheetname>" and <rownumber>
  And user is an error message in the appliction of binary tree
  And user redirect the page for appliction of binary tree
  
  Examples:
     | sheetname|  rownumber|
     | Shhet19  |         0 |
     | Shhet19  |         1 | 
     
 @tr5
  Scenario Outline: user is on tree homepage
  Given user is on binary search trees
  Then user is on try here button on the binary search trees
  When user enter on try editior button for binary search trees
  Then user is enter valid python code for binary search trees in the excel sheet from "<sheetname>" and <rownumber>
  And user get output message in the console for binary search tree
  When user is an enter invalid python code for binary search tree in the excel sheet from "<sheetname>" and <rownumber>
  And user is an error message in the binary search tree
  And user redirect the page for binary search tree
  
  Examples:
    | sheetname| rownumber|
    | Sheet20 |         0 |  
    | Sheet20 |         1 |
    
    @tr6
    Scenario Outline: user is on tree homepage
    Given user is on implementation of BST page
    When user enter try here button of implemetation of BST page
    Then user enter tryeditior page of implementation of BST page
    When user enter valid code from implementation of BST from excel sheet "<sheetname>" and <rownumber>
    And user is output in the console of implementation of BST page
    When user enter invalid code from implementation of BSt of excel sheet from "<sheetname>" and <rownumber>
    And user is an error message of implentation of BST page
    And user redirect page 
    
    Examples:
     |sheetname| rownumber|
     | Sheet21 |          0|
     | Sheet21 |          1|
    
    @tr7 
     Scenario Outline: user is on tree page
     Given user enter practice question page in the tree
     And user redirect the home page from tree page              
@list
Feature: Linked List Functionality
  I want to use this template for my feature file

  Background: 
    Given user is on homepage
    And user goes to signin page
    And user enters valid username and password
    And user clicks on login button
    And User is on linked list page

  @list1
  Scenario: LinkedList page
    Given The user comes back to the DS_algo home page to select DS Linked List.
    When The user select Linked List from the Data Structure dropdown menu or clicks the Get Started button in Linked List Panel
    Then The user should be redirected to "Linked List" page.

  @list2
  Scenario: User in Linkedlist page
    Given The user is on the Linked List page
    When The user clicks Introduction link
    Then The user should be redirected to Introduction page.
@list3
  Scenario Outline: User in Introdution page
    Given The user is on the "Introduction" page
    When The user clicks "Try Here" button
    And The user is on the editor page
    And The user writes the valid python code "<sheetname>" and <rownumber> into editorbox
    And the user click on run button
    Then The user is able to see the output inside the console.

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |         2 |
@list4
  Scenario Outline: User in Indroduction invalid page
    Given The user is on the editor page again
    When The user writes the invalid python code "<sheetname>" and <rownumber> into editorbox
    And User click run button
    Then The user see error msg in alert window

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |         4 |
      | Sheet3    |         5 |
@list5
  Scenario Outline: User in Created linked list page
    Given The user is on the Creating Linked LIst page
    When The user clicks TryHere button
    And the User is on the editor page
    And The user writes the valid created linkedlist python code "<sheetname>" and <rownumber> into editorbox
    And the user click on Run button
    Then The user is able to see the output createdlinkedlist inside the console.

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |         7 |
@list6
  Scenario Outline: User in invalid Created linked list
    Given User is on the editor page again
    When The user writes the invalid created linkedlist python code "<sheetname>" and <rownumber> into editorbox
    And The User click run button
    Then The user see error msg in alert window in created linked list

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |         9 |
      | Sheet3    |        10 |
@list7
  Scenario Outline: User in Types of linked list page
    Given The user clicks Types of Linked List link
    When The user clicks TryHere button again
    And The User is on the editor page
    And The user writes the valid type of linkedlist python code "<sheetname>" and <rownumber> into editorbox
    And The User clicks run button
    Then The user is able to see the output typeoflinkedlist inside the console.

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |        12 |
@list8
  Scenario Outline: Types of linked list invalid functionality
    Given The user is on the editor page onemoretime
    When The user writes the invalid python code "<sheetname>" and <rownumber> into editor box
    And The user clicks run button
    Then The user see error msg in alert window in types of linkedlist

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |        14 |
      | Sheet3    |        15 |

  #Implement of Linked List
  @list9
  Scenario Outline: User in Implement linked list
    Given The user clicks Implement Linked List in Python link
    When User clicks Try Button
    And The user writes the valid type of Implement python code "<sheetname>" and <rownumber> into editorbox
    And User clicks RUn button
    Then The user is able to see the output implement inside the console.

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |        17 |
@list10
  Scenario Outline: user in Implement linked list invalid functionality
    Given The user is on the Editor page agains
    When The user writes the invalid Implement python code "<sheetname>" and <rownumber> into editorbox
    And User click run button in implement linkedlist page
    Then The user see error msg in alert window in implement linked list

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |        19 |
      | Sheet3    |        20 |

  #Traversal Linked List
  @list11 
  Scenario Outline: User in Traversal linked list
    Given The user clicks Traversal Linked List in Python link
    When User click Tryhere Buttons again
    And The user writes the valid type of Traversal python code "<sheetname>" and <rownumber> into editorbox
    And User clicks RUn button in traversal
    Then The user is able to see the output implement inside the console.

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |        22 |
@list12
  Scenario Outline: User in Traversal linked list invalid functionality
    Given The user is on the Editor page again
    When The user writes the invalid Traversal python code "<sheetname>" and <rownumber> into editorbox
    And User click run button in Traversal linkedlist page
    Then The user see error msg in alert window in traversal linked list

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |        24 |
      | Sheet3    |        25 |

  # Insertion
  @list13
  Scenario Outline: User in Insertion linked list
    Given The user clicks Insertion Linked List in Python link
    When User click Tryhere Button again
    And The user writes the valid Insertion python code "<sheetname>" and <rownumber> into editorbox
    And User clicks RUN button in insertion
    Then The user is able to see the output insertion inside the console.

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |        27 |
@list14
  Scenario Outline: User in Insertion linked list invalid functionality
    Given The user is the editor page again
    When The user writes the invalid Insertion python code "<sheetname>" and <rownumber> into editorbox
    And User click run button in Insertion linkedlist page
    Then The user see error msg in alert window in insertion linked list

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |        29 |
      | Sheet3    |        30 |

  #Deletion
  @list15
  Scenario Outline: User in Deletion Linked List
    Given The user clicks Deletion Linked List in Python link
    When User click Try Button again
    And The user writes the valid Deletion python code "<sheetname>" and <rownumber> into editorbox
    And User clicks RUN button in deletion
    Then The user is able to see the output deletion inside the console.

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |        32 |
@list16
  Scenario Outline: user in Deletion LinkedList invalid functionality
    Given The user is EDitor page
    When The user writes the invalid Deletion python code "<sheetname>" and <rownumber> into editorbox
    And User click run button in Deletion linkedlist page
    Then the user see error msg in alert window in deletion

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |        34 |
      | Sheet3    |        35 |

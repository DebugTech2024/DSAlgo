@home
Feature: Home browser page functionality

 @home1
  Scenario: DS Algo home browser page
    Given user open browser page
    When user enter the DS Algo Portal
    When user should landed on the DS Algo Get Started page with message "you are the right place"
    Then user clicks the Get Started button
    Then user should land in Data Structure introduction page
    When user clicks Data Structure drop down arrow
    Then user should see different data structure entries in that drop down
    When user select any data structure item from the drop down without sign in
    Then user should able to see an warning message "you are not logged in"
    When user clicks any of the Get started buttons below the data structures
    Then It should alert the user with a message "you are not logged in"
    When user clicks Register
    Then user should be redirected to Register form

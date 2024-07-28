@reg
Feature: Register web page
  I want to use this template for my feature file

  Background: 
    Given User is in registration page link

  #@reg1
  Scenario Outline: Register with valid username,invalid password,invalid passwordconfirmation
    When User enter valid "<username>" into the textbox
    And User enter invalid "<password>" into the textbox
    And User enter invalid password confirmation "<confirmpassword>" into the textbox
    Then User clicks on register button
    Then The registration should be unsuccessful with error message "password_mismatch:The two password fields didn’t match"

    Examples: 
      | username | password    | confirmpassword |
      | ninja12  | password12  | pass12          |
      | ninja12  | password@12 | pass13          |

  #@reg2
  Scenario Outline: Register with valid username,valid password,invalid passwordconfirmation
    When User enter valid "<username1>" into the username textbox
    And User enter valid "<password1>" into the password textbox
    And User enter invalid password confirmation "<confirmpassword1>" into the confirmpassword textbox
    Then User clicks on RegisterButton
    Then The registration should be unsuccessfull with error messages with  "password_mismatch:The two password fields didn’t match"

    Examples: 
      | username1 | password1   | confirmpassword1 |
      | ninja12   | password123 | pass5            |
      | ninja12   | password123 | pass4            |

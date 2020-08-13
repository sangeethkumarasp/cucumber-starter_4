


Feature: Facebook Login Feature
As a user i can Signup and Login to FB So i can connect with my friends and share my posts




  @tag1 @Regression
  Scenario: Verify errormessage when user try to login in facebook  with invalid emailaddress

    Given User is in Facebook Loginpage
    When user enter "loginusername" in loginemail field
    And user enters "password" in loginpasword field
    And user click on loginbutton
    Then verify errormessage "The email address or phone number that you've entered doesn't match any account. Sign up for an account." in the screen


  @tag2 @Regression
  Scenario: Verify user is able to signup facebook Sucessfully
    Given User is in Facebook Loginpage
    When User enters "sangeeth" in firstname field
    And User enters "kumar" in Lastnamefield
    And User enters "sangeethkumar@gh.com" in emailaddress field
    And User enters "sangeethkumar@gh.com" in re-enteremailaddress field
    And user enters "password" in password field
    And user selects "male" radiobutton
    And user selcts "21" value in dropdown
    And user selects "Jan" value in dropdown
    And user selcts "1990" value in year dropdown
    Then user click on signup button and able to signup
    #Then verify otp is trigerred for user signup



  @tag20 @Regression
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

    
    @tag21
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
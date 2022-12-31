Feature: Register
  @Valid
  Scenario: Successful Register
    Given user enter the website
    And user enter firstname
    And user enter lastname
    And user enter valid-email
    And user enter mobile numnber
    And user choose how you hear about us
    And user click on register button
    Then user login successfully
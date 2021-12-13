Feature:  Login

  Scenario: In order to verify login to facebook
    Given User navigates to facebook website
    When User validates the homepage title
    Then User entered "valid" username
    And User entered "valid" password
    Then User "should be" successfully logged in

  Scenario: In order to verify login to facebook as invalid user
    Given User navigates to facebook website
    When User validates the homepage title
    Then User entered "invalid" username
    And User entered "invalid" password
    Then User "should not be" successfully logged in
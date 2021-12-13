Feature:  Login
  Scenario: In order to verify login to facebook
    Given User navigates to facebook website
    When User validates the homepage title
    Then User entered the username
    And User entered the password
    Then User should be successfully logged in
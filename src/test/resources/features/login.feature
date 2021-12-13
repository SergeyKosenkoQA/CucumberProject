Feature:  Login

  Scenario Outline: In order to verify login to facebook
    Given User navigates to facebook website
    When User validates the homepage title
    Then User entered "<username>" username
    And User entered "<password>" password
    Then User "<loginStatus>" successfully logged in

    Examples:
    |username|password|loginStatus|
    |valid   |valid   |should be  |
    |invalid |invalid |should not be|

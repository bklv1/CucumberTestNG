Feature: feature to test login functionality

#  Scenario: Check login is successful with valid credentials
#      Given user is on login page
#      When the user enters ceco and 12345
#      And clicks on login button
#      Then user is navigated to the home page
#  @regression
#  Scenario Outline:  Check login is successful with valid credentials
#    Given user is on login page
#    When user enters <username> and <password>
#    And clicks on login button
#    Then user is navigated to the home page
#
#    Examples:
#    |username|password|
#    | Ceco  |  12345  |
#    | Other |  12345  |
#
#    @special
#  Scenario Outline:  Check login is successful with valid credentials YOU SHOULDN'T see bc of tags
#    Given user is on login page
#    When user enters <username> and <password>
#    And clicks on login button
#    Then user is navigated to the home page
#
#    Examples:
#      |username|password|
#      | Dimitar  |  123455  |
#      | Dimitar1 |  123455  |

      Scenario: User enters address
        Given user is on login page
        When user enters ceco codes and doesn't know what he does and 12345
        And clicks on login button
        And user enters address
        Then user has entered address

      Scenario: User enters address
        Given user is on login page
        When user enters other and 12345
        And clicks on login button
        And user enters address
        Then user has entered address
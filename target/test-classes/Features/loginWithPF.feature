Feature: feature to test pagefactory functionality
  @smoke
  Scenario: Check pagefactory is successful with valid credentials
      Given user is on pagefactory page
      When the pagefactory enters username and password
      And clicks on pagefactory button
      Then pagefactory is navigated to the home page

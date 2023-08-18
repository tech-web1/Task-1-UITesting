@smoke
  Feature: Games Page
    As User I want to verify the Games page on canadiandollarbingo website

    Scenario: User should verify that Bingo games
      Given I am on home page
      When I mouse Hover on Games  Menu
      And I click on bingo
      Then I verify that "Bingo" message on bingo page

      Scenario: User should verify that Slots games
        Given I am on home page
        When I mouse Hover on Games  Menu
        And I click on bingo
        And I click on Parlay Slots
        And I get the all games name
        And I click on Fruity Frenzy game
        Then I verify that "Log in to Start Playing!" message will display







Feature: Belly

  Scenario: Full belly
    Given I have 2 cakes in my belly
    When I wait 1 hour
    Then my belly should not growl
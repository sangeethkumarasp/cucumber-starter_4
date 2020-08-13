Feature: Search by keyword

  Scenario: Searching for a term
    Given User is researching things on the internet
    When he looks up "India"
    Then he should see information about "India"

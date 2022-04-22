Feature: LabCorp

  Scenario: Search a job
    Given I navigate to MercadoLibre "Argentina"
    And I go to "Vehículos"
    And I click Search button
    And I set "2000000" as max price
    And I select "Córdoba" as location
    And I order by "Menor precio"
    And I print the number of results

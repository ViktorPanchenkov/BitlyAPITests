Feature: Get GroupByID

  Scenario: Get Group By ID
    Given I perform GET operation for "https://api-ssl.bitly.com/v4/groups/"
    Then Check that group guid is Equal to "Blb58VZzvFD"
    Then Check that name is Equal to "o_7hajmglt0v"
    Then Check that role is Equal to "org-admin"


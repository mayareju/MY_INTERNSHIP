Feature: Agent FrontEnd Link Functionality

  Background: 
    Given User Launch Chrome browser
    When user open url "https://phptravels.net/login"
    And User enters Email as "agent@phptravels.com" and password as "demoagent"
    And click Login button
     Scenario: Agent Search Hotels by City
    When user click on Hotels Link
    Then agent page url should contain "hotels"
    When user can enter "Sin" on city name field
    And click on search button
    Then agent page title should contain "Hotels in sindal - PHPTRAVELS"
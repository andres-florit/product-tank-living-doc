Feature: Show online ads in content search

  In order to get profits from the search engine
  As a revenue department manager
  I want to show customers' online advertising in search results

  Scenario: Online ads are shown as part of the content search results

    Given an anonymous user
    When he searches using the main page for content containing "hotels cordoba"
    Then online ads are shown
    And search results are shown
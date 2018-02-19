Feature: Search for any content

  In order to find relevant content
  As a Google Search user
  I want to search any content by keywords

  Scenario: Anonymous user searches for any content in the main page

    Given an anonymous user
    When he searches using the main page for content containing "product tank cordoba"
    Then search results are shown

  Scenario: Anonymous user searches for any content using the browser address bar

    Given an anonymous user
    When he searches using the browser address bar for content containing "product tank cordoba"
    Then search results are shown

  Scenario: Anonymous user refines previous content search

    Given an anonymous user
    And a previous content search containing "product tank"
    When he refines the search to "product tank cordoba"
    Then search results are shown
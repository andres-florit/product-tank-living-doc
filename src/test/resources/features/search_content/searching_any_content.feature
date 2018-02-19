Feature: Searching for any content

  In order to find relevant content in the web
  As a search engine user
  I want to search any content by keywords

  Scenario: Anonymous user searches for content in the main page

    Given an anonymous user
    When he searches using the main page for content containing "product tank cordoba"
    Then search results are shown

  Scenario: Anonymous user searches for content using the browser address bar

    Given an anonymous user
    When he searches using the browser address bar for content containing "product tank cordoba"
    Then search results are shown

  Scenario: Anonymous user refines previous content search

    Given an anonymous user
    And a previous content search containing "product tank"
    When he refines the search to "product tank cordoba"
    Then search results are shown
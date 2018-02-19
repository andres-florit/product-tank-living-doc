Feature: Searching for images

  In order to find relevant content in the web
  As a search engine user
  I want to search images by keywords

  @Manual
  Scenario: Anonymous user searches for images in the main page

    Given an anonymous user
    When he searches for images
    Then search results are shown
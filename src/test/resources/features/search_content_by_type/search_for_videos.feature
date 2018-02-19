Feature: Search for videos

  In order to find videos
  As a Google Search user
  I want to search for videos by keywords

  @Manual
  Scenario: Anonymous user searches for videos in the image page

    Given an anonymous user
    When he searches for "product tank cordoba" videos
    Then videos results are shown
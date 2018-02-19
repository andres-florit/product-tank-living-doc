Feature: Search for images

  In order to find images
  As a Google Search user
  I want to search for images by keywords

  @Manual
  Scenario: Anonymous user searches for images in the image page

    Given an anonymous user
    When he searches for "product tank cordoba" images
    Then image results are shown
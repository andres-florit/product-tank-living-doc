Feature: Refine any content search by content type

  In order to find relevant content
  As a Google Search user
  I want to refine any content search by content type

  Scenario: Refine any content search to images

    Given an anonymous user
    And a previous content search containing "product tank cordoba"
    When he refines search results to images
    Then image results are shown

  Scenario: Refine any content search to videos

    Given an anonymous user
    And a previous content search containing "product tank cordoba"
    When he refines search results to videos
    Then videos results are shown
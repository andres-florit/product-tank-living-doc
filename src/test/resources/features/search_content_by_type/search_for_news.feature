Feature: Search for news

  In order to find news
  As a Google Search user
  I want to search for news by keywords

  @Manual
  Scenario: Anonymous user searches for news in the news search page

    Given an anonymous user
    When he searches for "product tank cordoba" news
    Then news results are shown
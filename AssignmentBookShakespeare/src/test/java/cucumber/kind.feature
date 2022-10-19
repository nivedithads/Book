@GoogleBooks
Feature: Validate values from Google Books Website
  I want to use this template for my feature file

  @Books
  Scenario Outline: Validate kind from Google Books Website
    Given Request to Google Books Api
    When Extract kind from the Response
    Then verify <kindvalue> is same as extracted kind

    Examples: 
      | kindvalue         |
      | books#volumes     |

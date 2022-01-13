Feature: Google search functionality

Scenario: Validate the google search functionality is working
Given browser is open
And user is on google search page
When user enters the text in search box
And user hits enter
Then user is navigated to search results


Feature: Google search feature
Scenario: user wants to search an information on given topic
Given user should be on google page
When user entered "Java 8 features" in search box
And click on submit button
Then Multiple link should be displayed on "Java 8 features"
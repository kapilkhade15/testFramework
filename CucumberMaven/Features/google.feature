Feature: Google
Scenario: Successful google search
Given User launch chrome browser
When User open url "<https://www.google.com/>"
And User enter search value "<Test in Google>"
And click on Search
Then Page title should be "<Test in Google - Google Search>"
And Close browser
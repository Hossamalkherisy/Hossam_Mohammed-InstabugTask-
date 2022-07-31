@smoke
Feature: F01_Search | user can "search" UI functionality

  Scenario: Check the search box is clickable or not
    Given i stand on search page
    When I add cats to the search box and click the Search Button
    Then cats should be mentioned in the results

  Scenario: Check if the user is searching by entering the special character
    Given i stand on search page to test special character
    When I add special character to the search box click the Search Button
    Then check result successfully

  Scenario: Check  auto-suggestion
    Given i stand on search page to test  auto-suggestion
    When I add fac to the search box
    And click the Search Button and check facebook appear

  Scenario: Check that user can make search corresponding to different categories – web, images, videos,
    Given i stand on search page click on image
    When I add  Admin to the search box
    And click the Search Button and check Admin image appears successfully

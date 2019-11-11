#Author: rajireddy95@gmail.com

@demo
Feature: Registration to engineer ai
  As an user of the website, I should be able to register into the site successfully

  @demo1
  Scenario: Site Registration
    Given the user lands on engineer ai staging page
    And clicks on the skip tour button
    And selects the currency as USD
    When the user clicks on sign in and register
    And fills in the user details
    Then the user is successfully registered with the website

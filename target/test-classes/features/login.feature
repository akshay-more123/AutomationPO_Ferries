#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
Feature: login to nopCommerce
  I want to use this template for my feature file

  Background: Open Login page
    Given the user is on the nopCommerce login page

  Scenario: User is able to login to nopCommerce
    When the user enters valid credentials (username: "hasti@gmail.com", password: "Hasti@1234")
    And the user clicks on the Login button
    Then the user should be redirected to the My Account page
    And the user should see a welcome message

  Scenario: User is able to login to nopCommerce
    When the user enters invalid credentials
    And the user clicks on the Login button
    Then the user should see an error massage

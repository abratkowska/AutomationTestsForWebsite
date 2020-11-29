Feature: Log in to automationpractice website

  Scenario: Log in to the website with incorrect credentials
    Given User open main page
    And   I click on Sign In button
    And   I log in to the website using incorrect email "bratek@wp"
    And   I login in to website using correct password "Test12345"
    And   I click on Sign in button on Login Form
    Then  I check if error message for incorrect email
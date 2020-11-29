Feature: Register  to automationpractice website

  Scenario: Register to the website with required fields
    Given User open main page
    And   I click on Sign In button
    And   I enter email address "bratkowskaaleksandra+6@gmail.com" to create an account
    And   I check if Register button is visible, and user is on Register Page
    And   I fill Register form with personal information with name "Aleksandra" and lastName "Bratkowska" and password "TesterAut12345"
    And   I fill Register form with address information "PO Box 1242" and city "Wroclaw",and postCode "00000" phone"123456789"
    And   I check if user is registered to the website

  @RegisterWithIncorrectCredentials
  Scenario: Register with existing email
    Given User open main page
    And   I click on Sign In button
    And   I enter email address "bratkowskaaleksandra+6@gmail.com" to create an account
    Then  I check if alert with information that  email address has already been registered is showing


  @RegisterWithoutPassword
  Scenario: Register without email password
    Given User open main page
    And   I click on Sign In button
    And   I enter email address "bratkowskaaleksandra+9@gmail.com" to create an account
    And   I check if Register button is visible, and user is on Register Page
    And   I fill Register form with personal information with name "Aleksandra" and lastName "Bratkowska" and password ""
    And   I fill Register form with address information "PO Box 1242" and city "Wroclaw",and postCode "00000" phone"123456789"
    Then  I check if alert about mandatory password field is showing


  @RegisterWithoutValue
  Scenario: Register without any data
    Given User open main page
    And   I click on Sign In button
    And   I enter email address "tata@tata+2.com" to create an account
    And   I click on register button
    Then  I check if alert message about 8 errors data is showing

  @RegisterWithoutSpecialCharacters
  Scenario: Register without special characters
    Given User open main page
    And   I click on Sign In button
    And   I enter email address "tata+7@tata.com" to create an account
    And   I check if Register button is visible, and user is on Register Page
    And   I fill Register form with personal information with name "@#$$" and lastName " >:{}?)_+  " and password "TesterAut12345"
    And   I fill Register form with address information "PO Box 1242" and city "Wroclaw",and postCode "00000" phone"123456789"
    Then  I check if alert about mandatory name and lastName field is showing

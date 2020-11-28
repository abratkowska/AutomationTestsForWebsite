Feature: Sign Up Facebook

  Scenario: Register to the website with required fields
    Given User open main page
    And   I click on Sign In button
    And   I  enter your email address "bratkowskaaleksandra+5@gmail.com" to create an account
    And   I check if Register button is visible, and user is on Register Page
    And   I fill Register form with personal information with name "Aleksandra" and lastName "Bratkowska" and password "TesterAut12345"
    And   I fill Register form with address information "PO Box 1242" and city "Wroclaw",and postCode "00000" phone"123456789"
    And   I check if user is registered to the website

#    Scenario: Register with exsisting emails







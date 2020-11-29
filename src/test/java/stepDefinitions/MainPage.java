package stepDefinitions;

import PageObjects.PageObjects;
import cucumber.api.java8.En;


import static org.assertj.core.api.Assertions.assertThat;


public class MainPage implements En {
        private PageObjects pageObjects;

        public MainPage() {
            Before(() -> pageObjects = new PageObjects());

            Given("^User open main page$", () -> {
                pageObjects.mainPage.openPage();
                });

            And("^I click on Sign In button$", () -> {
                pageObjects.mainPage.clickOnSignInButton();
            });

            And("^I enter email address \"([^\"]*)\" to create an account$", (String email) -> {
                pageObjects.mainPage.enterEmailAddressFoRegister(email);
            });

            Then("^I check if alert with information that  email address has already been registered is showing$", () -> {
                assertThat(pageObjects.mainPage.checkIfAlertAccountErrorExist()).isTrue();
            });

            And("^I log in to the website using incorrect email \"([^\"]*)\"$", (String emailRegister) -> {
                pageObjects.mainPage.enterEmailAddressForLogin(emailRegister);
            });

            And("^I login in to website using correct password \"([^\"]*)\"$", (String passwdRegister) -> {
                pageObjects.mainPage.enterPasswordForLogin(passwdRegister);
            });

            And("^I click on Sign in button on Login Form$", () -> {
                pageObjects.mainPage.clickOnSignInButtonInLoginForm();
            });

            Then("^I check if error message for incorrect email$", () -> {
                assertThat(pageObjects.mainPage.checkIfErrorMessageForIncorrectEmail()).isTrue();
            });
        }
}



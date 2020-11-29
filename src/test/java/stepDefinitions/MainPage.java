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
                pageObjects.mainPage.enterEmailAddress(email);
            });

            Then("^I check if alert with information that  email address has already been registered is showing$", () -> {
                assertThat(pageObjects.mainPage.checkIfAlertAccountErrorExist()).isTrue();
            });
        }
}



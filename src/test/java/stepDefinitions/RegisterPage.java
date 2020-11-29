package stepDefinitions;


import PageObjects.PageObjects;
import cucumber.api.java8.En;

import static org.assertj.core.api.Assertions.assertThat;

public class RegisterPage implements En {
    private PageObjects pageObjects;

    public RegisterPage(){
        Before(() -> pageObjects = new PageObjects());

        And("^I check if Register button is visible, and user is on Register Page$", () -> {
            assertThat(pageObjects.registerPage.checkIfUserIsOnSignUpPage()).isTrue();
        });

        And("^I fill Register form with personal information with name \"([^\"]*)\" and lastName \"([^\"]*)\" and password \"([^\"]*)\"$", (String name, String lastName, String password) -> {
            pageObjects.registerPage.registerWithPersonalInfo(name,lastName,password);
        });

        And("^I fill Register form with address information \"([^\"]*)\" and city \"([^\"]*)\",and postCode \"([^\"]*)\" phone\"([^\"]*)\"$", (String address, String city,String postCode,String phone) -> {
            pageObjects.registerPage.registerWithAddressData(address,city,phone,postCode);
        });

        And("^I check if user is registered to the website$", () -> {
            assertThat(pageObjects.registerPage.checkIfUserIsRegistered()).isTrue();
        });

        Then("^I check if alert about mandatory password field is showing$", () -> {
            assertThat(pageObjects.registerPage.checkIfAlertPasswdRequiersIsShowing()).isTrue();
        });

        Then("^I click on register button$", () -> {
            pageObjects.registerPage.clickOnRegisterButton();
        });

        Then("^I check if alert message about 8 errors data is showing$", () -> {
            assertThat(pageObjects.registerPage.checkIfAlertWhereIsNoValueExist()).isTrue();
        });

        Then("^I check if alert about mandatory name and lastName field is showing$", () -> {
            assertThat(pageObjects.registerPage.checkIfAlertWithIncorrectLastNameIsShowing()).isTrue();
            assertThat(pageObjects.registerPage.checkIfAlertWithIncorrectLastNameIsShowing()).isTrue();
        });
    }
}

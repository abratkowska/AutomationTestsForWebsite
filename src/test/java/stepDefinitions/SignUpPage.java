package stepDefinitions;


import PageObjects.PageObjects;
import cucumber.api.java8.En;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpPage implements En {
    private PageObjects pageObjects;

    public  SignUpPage (){
        Before(() -> pageObjects = new PageObjects());

        And("^I check if Register button is visible, and user is on Register Page$", () -> {
            assertThat(pageObjects.signUpPage.checkIfUserIsOnSignUpPage()).isTrue();
        });

        And("^I fill Register form with personal information with name \"([^\"]*)\" and lastName \"([^\"]*)\" and password \"([^\"]*)\"$", (String name, String lastName, String password) -> {
            pageObjects.signUpPage.registerWithPersonalInfo(name,lastName,password);
        });

        And("^I fill Register form with address information \"([^\"]*)\" and city \"([^\"]*)\",and postCode \"([^\"]*)\" phone\"([^\"]*)\"$", (String address, String city,String postCode,String phone) -> {
            pageObjects.signUpPage.registerWithAddressData(address,city,phone,postCode);
        });

        And("^I check if user is registered to the website$", () -> {
            assertThat(pageObjects.signUpPage.checkIfUserIsRegistered()).isTrue();
        });
    }
}

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

    }
}

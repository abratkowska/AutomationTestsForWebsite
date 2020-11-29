package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement
            signInButton = $(By.xpath("//a[@class='login' and contains(text(),'Sign in')]")),
            inputEmailAddress = $(By.cssSelector("input[class='is_required validate account_input form-control']")),
            buttonCreateAccount = $(By.cssSelector("button[class='btn btn-default button button-medium exclusive']")),
            createAccountError =$(By.cssSelector("div[class='alert alert-danger']")),
            inputEmailForRegisterAccount =  $(By.xpath("//input[@id='email']")),
            inputPasswordForRegisterAccount = $(By.cssSelector("input[id='passwd']")),
            buttonConfirmSignIn = $(By.cssSelector("button[class='button btn btn-default button-medium']")),
            errorMessageForIncorrectUserEmail = $(By.xpath("//div[@class='alert alert-danger']/ol/li[contains(text(),'Invalid email address.')]"));


    public void openPage() {
        Selenide.open("http://automationpractice.com/index.php");
    }

    public void clickOnSignInButton() {
        signInButton.click();
    }

    public void enterEmailAddressFoRegister(String email){
        inputEmailAddress.sendKeys(email);
        buttonCreateAccount.click();
    }

    public boolean checkIfAlertAccountErrorExist(){
        createAccountError.shouldBe(Condition.exist);
        return true;
    }

    public void enterEmailAddressForLogin(String emailRegister){
        inputEmailForRegisterAccount.click();
        inputEmailForRegisterAccount.sendKeys(emailRegister);
    }

    public void enterPasswordForLogin(String passwdRegister){
        inputPasswordForRegisterAccount.click();
        inputPasswordForRegisterAccount.sendKeys(passwdRegister);
    }

    public void clickOnSignInButtonInLoginForm(){
        buttonConfirmSignIn.click();
    }

    public boolean checkIfErrorMessageForIncorrectEmail(){
        errorMessageForIncorrectUserEmail.shouldBe(Condition.exist);
        return true;
    }
}




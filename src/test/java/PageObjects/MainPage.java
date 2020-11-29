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
            createAccountError =$(By.cssSelector("div[class='alert alert-danger']"));

    public void openPage() {
        Selenide.open("http://automationpractice.com/index.php");
    }

    public void clickOnSignInButton() {
        signInButton.click();
    }

    public void enterEmailAddress(String email){
        inputEmailAddress.sendKeys(email);
        buttonCreateAccount.click();
    }

    public boolean checkIfAlertAccountErrorExsist(){
        createAccountError.shouldBe(Condition.exist);
        return true;
    }
}




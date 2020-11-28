package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {

    private SelenideElement
            buttonRegister = $(By.cssSelector("button[class='btn btn-default button button-medium']"));


    public boolean checkIfUserIsOnSignUpPage() {
        buttonRegister.shouldBe(Condition.exist);
        return true;
    }
}


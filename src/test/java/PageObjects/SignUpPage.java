package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.restassured.internal.assertion.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {

    private SelenideElement
            buttonRegister = $(By.cssSelector("button[class='btn btn-default button button-medium']")),
            titleCheckbox = $(By.cssSelector("input[id='id_gender2']")),
            inputName = $(By.cssSelector("input[id='customer_firstname']")),
            inputLastName = $(By.cssSelector("input[id='customer_lastname']")),
            inputEmail =$(By.cssSelector("input[id='email']")),
            inputPassword = $(By.cssSelector("input[id='passwd']")),
            dayOfBirth = $(By.cssSelector("select[id='days']")),
            monthOfBirth = $(By.cssSelector("select[id='months']")),
            yearOfBirth = $(By.cssSelector("select[id='years']")),
            inputAddress =$(By.cssSelector("input[id='address1']")),
            inputState  = $(By.cssSelector("select[name='id_state']")),
            inputCity = $(By.cssSelector("input[id='city']")),
            inputPostCode = $(By.cssSelector("input[id='postcode']")),
            inputPhone = $(By.cssSelector("input[id='phone_mobile']")),
            myAccountPage = $(By.xpath("//h1[@class='page-heading' and contains(text(),'My account')]"));


    public boolean checkIfUserIsOnSignUpPage() {
        buttonRegister.shouldBe(Condition.exist);
        return true;
    }
    public void registerWithPersonalInfo(String name, String lastName, String password){
        titleCheckbox.click();
        inputName.sendKeys(name);
        inputLastName.sendKeys(lastName);
        inputPassword.sendKeys(password);
        dayOfBirth.click();
        dayOfBirth.selectOptionByValue("1");
        monthOfBirth.click();
        monthOfBirth.selectOptionByValue("4");
        yearOfBirth.click();
        yearOfBirth.selectOptionByValue("1999");
    }

    public void registerWithAddressData(String address, String city,String phone, String postCode){
        inputAddress.click();
        inputAddress.sendKeys(address);
        inputCity.sendKeys(city);
        inputState.click();
        inputState.selectOptionByValue("2");
        inputPostCode.click();
        inputPostCode.sendKeys(postCode);
        inputPhone.click();
        inputPhone.sendKeys(phone);
        buttonRegister.click();
    }

    public boolean checkIfUserIsRegistered(){
        myAccountPage.shouldBe(Condition.visible);
        return true;
    }
}


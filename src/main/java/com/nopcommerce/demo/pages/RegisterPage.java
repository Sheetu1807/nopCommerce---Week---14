package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());


    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameRequired;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameRequired;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailRequired;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordRequired;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordRequired;
    @CacheLookup
    @FindBy(xpath = "//div[@class='form-fields']/div/div/span[2]")
    WebElement maleFemaleRadioButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompletedMessage;
    @CacheLookup
    @FindBy(className = "field-validation-error")
    List<WebElement> fielderrrormess;

    public String getvaliderrormess(String fields) {
        String validationmess = null;
        for (WebElement error : fielderrrormess) {
            if (error.getText().equalsIgnoreCase(fields)) {
                break;

            }
        }
        return validationmess;
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public String verifyRegisterText(String text) {
        return getTextFromElement(registerText);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String verifyFirstnameRequired(String First) {
        return getTextFromElement(firstNameRequired);
    }

    public String verifyLastNameRequired(String Last) {
        return getTextFromElement(lastNameRequired);
    }

    public String verifyEmailRequired(String mail) {
        return getTextFromElement(emailRequired);
    }

    public String verifyPasswordRequired(String pass) {
        return getTextFromElement(passwordRequired);
    }

    public String verifyConfirmPasswordRequired(String Cpass) {
        return getTextFromElement(confirmPasswordRequired);
    }

    public void selectMaleFemaleRadioButton() {
        clickOnElement(maleFemaleRadioButton);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameField, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastNameField, lastname);
    }

    public void selectDayofBirth(String day) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);

    }

    public void selectDateofBirthMonth(String month) {
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
    }

    public void selectDateofBirthYear(String year) {
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
    }

    public void enterEmailField(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void confirmPasswordField(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public String verifyRegistrationCompleteMsg(String completemess) {
        return getTextFromElement(registrationCompletedMessage);
    }


}


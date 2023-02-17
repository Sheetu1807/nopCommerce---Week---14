package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {
    }

    @When("^User click on Login link$")
    public void user_click_on_Login_link() {
        new LoginPage().clickOnLoginLink();
    }

    @Then("^User should verify welcome message \"([^\"]*)\"$")
    public void user_should_verify_welcome_message(String mes) {
        new LoginPage().verifyWelcomeText(mes);

    }


    @And("^User enter an email address \"([^\"]*)\"$")
    public void userEnterAnEmailAddress(String em1) {
        new LoginPage().enterEmailId(em1);

    }

    @And("^User enter a password field \"([^\"]*)\"$")
    public void userEnterAPasswordField(String pass1) {
        new LoginPage().enterPassword(pass1);

    }

    @And("^User click on Login Button$")
    public void userClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^User should verify the error message \"([^\"]*)\"$")
    public void userShouldVerifyTheErrorMessage(String errmessage) {
        new LoginPage().getErrorMessage(errmessage);

    }

    @Then("^User should verify logout link \"([^\"]*)\"$")
    public void userShouldVerifyLogoutLink(String logout) {
        new LoginPage().verifyLogOutLink(logout);

    }

    @And("^click on Logout link$")
    public void clickOnLogoutLink() {
        new LoginPage().clickOnLogOutLink();
    }

    @Then("^User to verify Login link \"([^\"]*)\"$")
    public void userToVerifyLoginLink(String loginlnk) {
        new LoginPage().verifyLogInLink(loginlnk);

    }
}

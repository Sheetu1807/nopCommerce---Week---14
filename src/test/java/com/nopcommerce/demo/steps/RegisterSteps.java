package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class RegisterSteps {

    @Given("^User is on HomePage$")
    public void user_Is_On_HomePage() {
    }

    @When("^User click on Register Link$")
    public void user_Click_On_Register_Link() {
        new RegisterPage().clickOnRegisterLink();
    }


    @And("^User click on Register Button$")
    public void user_Click_On_Register_Button() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("^User should verify the \"([^\"]*)\"$")
    public void user_Should_Verify_The(String text1) {
        new RegisterPage().getvaliderrormess(text1);
    }


    @And("^User select gender Female$")
    public void user_Select_Gender_Female() {
        new RegisterPage().selectMaleFemaleRadioButton();
    }


    @And("^User enter First \"([^\"]*)\"$")
    public void user_enter_First(String f1) {
        new RegisterPage().enterFirstName(f1);
    }

    @And("^User enter Last \"([^\"]*)\"$")
    public void user_enter_Last(String l1) {
        new RegisterPage().enterLastName(l1);
    }

    @And("^User should select d \"([^\"]*)\"$")
    public void user_should_select_d(String da) {
        new RegisterPage().selectDayofBirth(da);
    }

    @And("^User should select  m\"([^\"]*)\"$")
    public void user_should_select_m(String mon) {
        new RegisterPage().selectDateofBirthMonth(mon);
    }

    @And("^User should select y \"([^\"]*)\"$")
    public void user_should_select_y(String y1) {
        new RegisterPage().selectDateofBirthYear(y1);
    }

    @And("^User enter e\"([^\"]*)\"$")
    public void user_enter_e(String emai) {
        new RegisterPage().enterEmailField(emai);
    }

    @And("^User enter p\"([^\"]*)\"$")
    public void user_enter_p(String pass1) {
        new RegisterPage().enterPasswordField(pass1);
    }

    @And("^User enter cm\"([^\"]*)\"$")
    public void user_enter_cm(String cm) {
        new RegisterPage().confirmPasswordField(cm);
    }

    @Then("^User should verify Register Text \"([^\"]*)\"$")
    public void user_Should_Verify_Register_Text(String Rtext) {
        Assert.assertEquals(Rtext, new RegisterPage().verifyRegisterText(Rtext));

    }


    @Then("^User should verify the registration completed text\"([^\"]*)\"$")
    public void user_Should_Verify_The_Registration_Completed_Text(String cmplt) {
        new RegisterPage().verifyRegistrationCompleteMsg(cmplt);
    }
}
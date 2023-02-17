package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

public class ComputerSteps {

    @Given("^User is on home page$")
    public void userIsOnHomePage() {
    }

    @When("^User click on Computer Tab$")
    public void userClickOnComputerTab() {
        new ComputerPage().clickOnComputerTab();
    }

    @Then("^User should verify computer text \"([^\"]*)\"$")
    public void userShouldVerifyComputerText(String comtext) {
        new ComputerPage().verifyComputerText(comtext);

    }

    @And("^User click on desktop link$")
    public void userClickOnDesktopLink() {
        new ComputerPage().clickOnDesktopsLink();
    }

    @Then("^User should verify desktops text \"([^\"]*)\"$")
    public void userShouldVerifyDesktopsText(String desktext) {
        new ComputerPage().verifyDesktopsText(desktext);

    }

    @And("^User should click on build your own computer$")
    public void userShouldClickOnBuildYourOwnComputer() {
        new ComputerPage().clickOnBuildYourOwnComputerLink();
    }

    @And("^User should build own computer$")
    public void userShouldBuildOwnComputer(DataTable DataTable) throws InterruptedException {
        List<List<String>> data = DataTable.raw();
        for (int i = 0; i < data.size(); i++) {

            new ComputerPage().makeyourowncomp(data.get(i).get(0), data.get(i).get(1), data.get(i).get(2), data.get(i).get(3), data.get(i).get(4));
            new ComputerPage();

        }

    }
}



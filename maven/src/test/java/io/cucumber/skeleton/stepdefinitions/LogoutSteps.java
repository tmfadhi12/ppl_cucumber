package io.cucumber.skeleton.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.actions.LogoutPageActions;
import io.cucumber.skeleton.utils.HelperClass;

public class LogoutSteps {
    LogoutPageActions objLogout = new LogoutPageActions();

    @Given("User has logged in to the application {string} with username as {string} and password as {string}")
    public void userHasLoggedInToTheApplication(String url, String username, String password) {
        HelperClass.getDriver().get(url);
        objLogout.enterUsername(username);
        objLogout.enterPassword(password);
        objLogout.clickLoginButton();
    }

    @And("User at dashboard page")
    public void userAtDashboardPage() {
        objLogout.isDashboardPageVisible();
    }

    @When("User clicks on the logout button")
    public void userClicksOnLogoutButton() {
        objLogout.clickLogoutButton();
    }

    @And("User clicks 'Ya' button on the confirmation dialog")
    public void userConfirmsLogout() {
        objLogout.clickYesLogoutButton();
    }

    @Then("User should be redirected to the login page")
    public void userShouldBeRedirectedToTheLoginPage() {
        objLogout.isLoginPageTitleVisible();
    }

}

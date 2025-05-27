package io.cucumber.skeleton.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.actions.LoginPageActions;
import io.cucumber.skeleton.actions.LogoutPageActions;
import io.cucumber.skeleton.utils.HelperClass;

public class LoginSteps {
    // example
    LoginPageActions objLogin = new LoginPageActions();
	LogoutPageActions objHomePage = new LogoutPageActions();
	// String NIP = "12345678";
	// String password = "admin123";
	// String url = "http://ptbsp.ddns.net:6882/";
	
    @Given("User has navigated to the login page {string}")
    public void navigateToWebApp(String url) throws InterruptedException {
        HelperClass.openPage(url);
        Thread.sleep(2000);
    }

    @Then("User should be able to see login page")
    public void userShouldBeAbleToSeeLoginPage() {
        objLogin.isLoginPageTitleVisible();
    }

    @When("User enters NIP as {string} and password as {string}")
    public void userEntersNIPAsAndPasswordAs(String arg0, String arg1) {
        
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        
    }

    @Then("User should be able to see dashboard page")
    public void userShouldBeAbleToSeeDashboardPage() {
    }
}

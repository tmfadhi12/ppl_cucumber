package io.cucumber.skeleton.stepdefinitions;

import io.cucumber.java.en.Given;
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

}

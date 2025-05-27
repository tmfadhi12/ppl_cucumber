package io.cucumber.skeleton.actions;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.skeleton.locators.LoginPageLocators;
import io.cucumber.skeleton.utils.HelperClass;

public class LoginPageActions {
    LoginPageLocators loginPageLocators = null;

    public LoginPageActions() {
        this.loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
    }

    public boolean getPageTitle() {
        return loginPageLocators.pageTitle.getText().equals("Dasbor - Bendahara");
    }

}

package io.cucumber.skeleton.actions;

import io.cucumber.skeleton.locators.LoginPageLocators;
import io.cucumber.skeleton.locators.LogoutPageLocators;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.skeleton.utils.HelperClass;

public class LogoutPageActions {
    LogoutPageLocators logoutPageLocators = null;
    LoginPageLocators loginPageLocators = null;

public LogoutPageActions() {
    this.logoutPageLocators = new LogoutPageLocators();
    this.loginPageLocators = new LoginPageLocators(); 
    PageFactory.initElements(HelperClass.getDriver(), logoutPageLocators);
    PageFactory.initElements(HelperClass.getDriver(), loginPageLocators); 
}

    public void clickLogoutButton() {
        logoutPageLocators.logoutButton.click();
    }
    public void clickYesLogoutButton() {
        logoutPageLocators.yesLogoutButton.click();
    }

    public void enterUsername(String username) {
        loginPageLocators.usernameInput.clear();
        loginPageLocators.usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        loginPageLocators.passwordInput.clear();
        loginPageLocators.passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginPageLocators.loginButton.click();
    }

    public void isDashboardPageVisible() {
        HelperClass.isElementVisible(loginPageLocators.landingPageTitle);
    }
    
    public void isLoginPageTitleVisible() {
        loginPageLocators.usernameInput.isDisplayed();
        loginPageLocators.passwordInput.isDisplayed();
    }
}

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

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    public String getErrorMessage() {
        return loginPageLocators.errorMessage.getText();
    }

    public String getDashboardTitle() {
        return loginPageLocators.landingPageTitle.getText();
    }

    public String getDasborMenuText() {
        return loginPageLocators.dasborMenu.getText();
    }

    public String getTagihanMenuText() {
        return loginPageLocators.tagihanSiswaMenu.getText();
    }

    public String getTransaksiPenerimaanDanaText() {
        return loginPageLocators.transaksiPenerimaanDanaMenu.getText();
    }

    public String getPengaturanNotifikasiText() {
        return loginPageLocators.pengaturanNotifikasiMenu.getText();
    }

    public String getStatusPemabayaranMenuText() {
        return loginPageLocators.statusPemabayaranMenu.getText();
    }

    public String getRekapitulasiMenuText() {
        return loginPageLocators.rekapitulasiMenu.getText();
    }

    public String getProgresTransaksiPenerimaanDanaText() {
        return loginPageLocators.progresTransaksiPenerimaanDanaMenu.getText();
    }

    public boolean isLoginPageTitleVisible() {
        return loginPageLocators.pageTitle.isDisplayed();
    }
}

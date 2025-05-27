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

    public boolean getDashboardPageTitle() {
        return loginPageLocators.landingPageTitle.getText().equals("Dasbor - Bendahara");
    }

    public boolean isDasborMenuVisible() {
        return loginPageLocators.dasborMenu.isDisplayed();
    }

    public boolean isTagihanSiswaMenuVisible() {
        return loginPageLocators.tagihanSiswaMenu.isDisplayed();
    }

    public boolean isTransaksiPenerimaanDanaMenuVisible() {
        return loginPageLocators.transaksiPenerimaanDanaMenu.isDisplayed();
    }

    public boolean isPengaturanNotifikasiMenuVisible() {
        return loginPageLocators.pengaturanNotifikasiMenu.isDisplayed();
    }

    public boolean isStatusPemabayaranMenuVisible() {
        return loginPageLocators.statusPemabayaranMenu.isDisplayed();
    }

    public boolean isRekapitulasiMenuVisible() {
        return loginPageLocators.rekapitulasiMenu.isDisplayed();
    }

    public boolean isProgresTransaksiPenerimaanDanaMenuVisible() {
        return loginPageLocators.progresTransaksiPenerimaanDanaMenu.isDisplayed();
    }

    public boolean isLoginPageTitleVisible() {
        return loginPageLocators.pageTitle.isDisplayed();
    }
}

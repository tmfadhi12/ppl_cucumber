package io.cucumber.skeleton.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
    @FindBy(xpath = "/html/body/div[2]/main/div/div[1]/div/div/div[1]/h1")
    public WebElement landingPageTitle;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/a/span")
    public WebElement dasborMenu;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/ul/li[2]/a/span")
    public WebElement tagihanSiswaMenu;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/ul/li[3]/a/span")
    public WebElement transaksiPenerimaanDanaMenu;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/ul/li[4]/a/span")
    public WebElement pengaturanNotifikasiMenu;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/ul/li[5]/a/span")
    public WebElement statusPemabayaranMenu;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/ul/li[6]/a/span")
    public WebElement rekapitulasiMenu;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/ul/li[7]/a/span")
    public WebElement progresTransaksiPenerimaanDanaMenu;

    @FindBy(xpath = "/html/head/title")
    public WebElement pageTitle;

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/form/button")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div/p")
    public WebElement errorMessage;
}

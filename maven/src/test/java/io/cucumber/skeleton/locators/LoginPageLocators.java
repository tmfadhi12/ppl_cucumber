package io.cucumber.skeleton.locators;

import org.openqa.selenium.WebElement;

public class LoginPageLocators {
    // example

    //@FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div/div[1]/header/div/div/h3")
    //public WebElement pageTitle;

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

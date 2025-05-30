package io.cucumber.skeleton.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.actions.LoginPageActions;
import io.cucumber.skeleton.utils.HelperClass;
import org.testng.Assert;

public class LoginSteps {
    // example
    LoginPageActions objLogin = new LoginPageActions();
	// String NIP = "12345678";
	// String password = "admin123";
	// String url = "http://ptbsp.ddns.net:6882/";
	
    @Given("User has navigated to the login page {string}")
    public void navigateToWebApp(String url) throws InterruptedException {
        HelperClass.openPage(url);
        Thread.sleep(1000);
    }

    @Then("User should be able to see login page")
    public void userShouldBeAbleToSeeLoginPage() {
        objLogin.isLoginPageTitleVisible();
    }

    @When("User enters username as {string} and password as {string}")
    public void userEntersUsernameAsAndPasswordAs(String username, String password) {
        objLogin.enterUsername(username);
        objLogin.enterPassword(password);
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        objLogin.clickLoginButton();
    }

    @Then("User should be able to see dashboard page")
    public void userShouldBeAbleToSeeDashboardPage() throws InterruptedException {
        Assert.assertEquals(objLogin.getDashboardTitle(), "Dasbor - Bendahara");
        Assert.assertEquals(objLogin.getDasborMenuText(), "Dasbor");
        Assert.assertEquals(objLogin.getPengaturanNotifikasiText(), "Pengaturan Notifikasi");
        Assert.assertEquals(objLogin.getRekapitulasiMenuText(), "Rekapitulasi");
        Assert.assertEquals(objLogin.getStatusPemabayaranMenuText(), "Status Pembayaran");
        Assert.assertEquals(objLogin.getTagihanMenuText(), "Tagihan Siswa");
        Assert.assertEquals(objLogin.getProgresTransaksiPenerimaanDanaText(), "Progres Transaksi Penerimaan Dana");
        Assert.assertEquals(objLogin.getTransaksiPenerimaanDanaText(), "Transaksi Penerimaan Dana");
    }

    @Then("User should be able to see error message {string}")
    public void userShouldBeAbleToSeeErrorMessage(String errorMessage) {
        Assert.assertEquals(objLogin.getErrorMessage(), errorMessage);
    }
}

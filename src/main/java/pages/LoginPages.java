package pages;

import io.qameta.allure.Step;
import operation.BaseHomepage;
import operation.BaseLanding;
import operation.BaseLogin;
import utilities.finders.ElementAction;

public class LoginPages {

    BaseLanding baseLanding = new BaseLanding();
    BaseLogin baseLogin = new BaseLogin();
    BaseHomepage baseHomepage = new BaseHomepage();
    ElementAction action = new ElementAction();
    LandingPages landingPages = new LandingPages();

    @Step("User Do Valid Login Using Email or Switch Number")
    public void testValidLogin(String username, String pin, String otp1, String otp2,
                               String otp3, String otp4) throws InterruptedException {
        landingPages.testGoToLoginPage();
        action.sendKeys(baseLogin.inputUsername, username);
        action.click(baseLogin.btnSubmitLogin);
        action.sendKeys(baseLogin.inputPIN, pin);
        baseLogin.passOTPSection(otp1, otp2, otp3, otp4);
//        action.checkerEnabled(baseHomepage.icUserProfile);
    }

    @Step("User Do Invalid Login Input Username")
    public void testInvalidLogin(String username) throws InterruptedException {
        landingPages.testGoToLoginPage();
        action.sendKeys(baseLogin.inputUsername, username);
    }

    @Step("User Do Invalid Login Input PIN")
    public void testInvalidWrongUsernameAndPin(String username, String pin) throws InterruptedException {
        landingPages.testGoToLoginPage();
        testInvalidLogin(username);
        action.click(baseLogin.btnSubmitLogin);
        action.sendKeys(baseLogin.inputPIN, pin);
    }

    @Step("User Do Invalid Login Using Unregistered Email")
    public void testInvalidUnregisteredEmailLogin(String username) throws InterruptedException {
        landingPages.testGoToLoginPage();
        testInvalidLogin(username);
        action.click(baseLogin.btnSubmitLogin);
        baseLogin.checkValidationUnregisteredEmail();
    }

    @Step("User Do Invalid Login Button Disabled")
    public void testInvalidInputButtonDisabled(String username) throws InterruptedException {
        landingPages.testGoToLoginPage();
        testInvalidLogin(username);
        action.checkerDisabled(baseLogin.btnSubmitLogin);
    }

    @Step("User Do Invalid Login Button Disabled")
    public void testInvalidInputValidation(String username) throws InterruptedException {
        landingPages.testGoToLoginPage();
        testInvalidLogin(username);
        action.click(baseLogin.btnSubmitLogin);
        baseLogin.checkInvalidSwitchNumber();
    }

    @Step("User Do Sign Up With Registered Email")
    public void testInvalidSignUpWithRegisteredEmail(String username) throws InterruptedException {
        landingPages.testGoToLoginPage();
        action.sendKeys(baseLogin.inputUsername, username);
        action.click(baseLogin.btnSubmitLogin);
        baseLogin.checkValidationRegisteredEmail();
    }
}

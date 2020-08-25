package pages;

import constants.BaseData;
import io.qameta.allure.Allure;
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

    @Step("User Do Valid Login Using Email")
    public void testValidLogin(String username, String pin) throws InterruptedException {
        action.click(baseLanding.btnLogin);
        baseLanding.checkValidationWelcomeText();
        action.sendKeys(baseLogin.inputUsername, username);
        action.click(baseLogin.btnSubmitLogin);
        action.sendKeys(baseLogin.inputPIN, pin);
        action.checkerEnabled(baseHomepage.icUserProfile);
    }

    public void testInvalidLogin(String username) {
        action.click(baseLanding.btnLogin);
        baseLanding.checkValidationWelcomeText();
        action.sendKeys(baseLogin.inputUsername, username);
    }

    @Step("User Do Invalid Login Using Wrong Username")
    public void testInvalidWrongUsernameAndPin(String username, String pin) throws InterruptedException {
        testInvalidLogin(username);
        action.click(baseLogin.btnSubmitLogin);
        action.sendKeys(baseLogin.inputPIN, pin);
    }

    @Step("User Do Invalid Login Using Unregistered Email")
    public void testInvalidUnregisteredEmailLogin(String username) throws InterruptedException {
        testInvalidLogin(username);
        action.click(baseLogin.btnSubmitLogin);
        baseLogin.checkValidationUnregisteredEmail();
    }

    @Step("User Do Invalid Login Button Disabled")
    public void testInvalidInputButtonDisabled(String username) throws InterruptedException {
        testInvalidLogin(username);
        action.checkerDisabled(baseLogin.btnSubmitLogin);
    }

    @Step("User Do Invalid Login Button Disabled")
    public void testInvalidInputValidation(String username) throws InterruptedException {
        testInvalidLogin(username);
        action.click(baseLogin.btnSubmitLogin);
        baseLogin.checkInvalidSwitchNumber();
    }

    public void testInvalidSignUpWithRegisteredEmail(String username) throws InterruptedException {
        action.click(baseLanding.btnSignUp);
        action.sendKeys(baseLogin.inputUsername, username);
        action.click(baseLogin.btnSubmitLogin);
        baseLogin.checkValidationRegisteredEmail();
    }
}

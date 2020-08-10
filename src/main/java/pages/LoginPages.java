package pages;

import constants.BaseData;
import io.qameta.allure.Step;
import operation.BaseLanding;
import operation.BaseLogin;

public class LoginPages {

    BaseLanding baseLanding = new BaseLanding();
    BaseLogin baseLogin = new BaseLogin();

    @Step("User Do Valid Login Using Email")
    public void testValidLogin(String username, String pin) throws InterruptedException {
        baseLanding.clickButtonLogin();
        baseLanding.checkValidationWelcomeText();
        baseLogin.inputUsername(username);
        baseLogin.clickButtonSubmitLogin();
        baseLogin.inputPIN(pin);
        Thread.sleep(1500);
        baseLogin.checkSuccessLogin();
        Thread.sleep(1500);
    }

    public void testInvalidLogin(String username) {
        baseLanding.clickButtonLogin();
        baseLanding.checkValidationWelcomeText();
        baseLogin.inputUsername(username);
    }

    @Step("User Do Invalid Login Using Wrong Username")
    public void testInvalidWrongUsernameAndPin(String username, String pin) throws InterruptedException {
        testInvalidLogin(username);
        baseLogin.clickButtonSubmitLogin();
        Thread.sleep(1500);
        baseLogin.inputPIN(pin);
        Thread.sleep(1500);
    }

    @Step("User Do Invalid Login Using Unregistered Email")
    public void testInvalidUnregisteredEmailLogin(String username) throws InterruptedException {
        testInvalidLogin(username);
        baseLogin.clickButtonSubmitLogin();
        Thread.sleep(1500);
        baseLogin.checkValidationUnregisteredEmail();
        Thread.sleep(1500);
    }

    @Step("User Do Invalid Login Button Disabled")
    public void testInvalidInputButtonDisabled(String username) throws InterruptedException {
        testInvalidLogin(username);
        baseLogin.checkDisabledButtonSubmit();
        Thread.sleep(1500);
    }

    @Step("User Do Invalid Login Button Disabled")
    public void testInvalidInputValidation(String username) throws InterruptedException {
        testInvalidLogin(username);
        baseLogin.clickButtonSubmitLogin();
        Thread.sleep(1500);
        baseLogin.checkInvalidSwitchNumber();
        Thread.sleep(1500);
    }

    public void testInvalidSignUpWithRegisteredEmail() throws InterruptedException {
        baseLanding.clickButtonSignUp();
        baseLogin.inputUsername(BaseData.Login.EMAIL_ID);
        baseLanding.clickButtonSubmitSignUp();
        baseLogin.checkValidationRegisteredEmail();
        Thread.sleep(3000);
    }
}

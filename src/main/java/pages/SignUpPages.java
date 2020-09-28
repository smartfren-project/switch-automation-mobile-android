package pages;

import io.qameta.allure.Step;
import operation.BaseLanding;
import operation.BaseLogin;
import utilities.finders.ElementAction;
import utilities.generator.RandomAlphabet;

public class SignUpPages {

    ElementAction action = new ElementAction();
    BaseLanding baseLanding = new BaseLanding();
    BaseLogin baseLogin = new BaseLogin();

    @Step("User can sign up using email")
    public void testValidSignUpUsingEmail(String email) {
        action.click(baseLanding.btnSignUp);
        baseLanding.checkValidationWelcomeText();
        action.sendKeys(baseLogin.inputUsername, email);
        action.click(baseLogin.btnSubmitLogin);
    }

    @Step("User can sign up using other method")
    public void testValidSignUpUsingOtherMethod() {
        action.click(baseLanding.btnSignUp);
        baseLanding.checkValidationWelcomeText();
        action.click(baseLanding.btnOtherMethod);
    }

    @Step("User choose Google other method")
    public void testValidSignUpUsingGoogleAccount() {
        action.click(baseLanding.btnGoogle);
        action.click(baseLanding.btnGoogleAccount);
    }

    @Step("User choose Facebook other method")
    public void testValidSignUpUsingFacebookAccount() {
        action.click(baseLanding.btnFacebook);
    }

    @Step("User Invalid SignUp Username Disable Button")
    public void testInvalidSignUpUsername(String email) {
        action.click(baseLanding.btnSignUp);
        action.sendKeys(baseLogin.inputUsername, email);
        action.checkerDisabled(baseLogin.btnSubmitLogin);
    }

    @Step("User Invalid SignUp Username Validation")
    public void testInvalidSignUpUsernameNormalValidation(String email) {
        action.click(baseLanding.btnSignUp);
        action.sendKeys(baseLogin.inputUsername, email);
    }
}

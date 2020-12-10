package pages;

import constants.BaseData;
import io.qameta.allure.Step;
import operation.BaseHomepage;
import operation.BaseLanding;
import utilities.finders.ElementAction;

public class LandingPages {

    BaseLanding baseLanding = new BaseLanding();
    ElementAction action = new ElementAction();
    BaseHomepage baseHomepage = new BaseHomepage();

    @Step("Click Button Login")
    public void testGoToLoginPage() throws InterruptedException {
        Thread.sleep(5000);
        action.click(baseLanding.btnLogin);
        action.click(baseLanding.btnEmail);
        baseLanding.checkValidationWelcomeText();
    }

    @Step("Click Button Skip")
    public void testLoginAsGuest() throws InterruptedException{
        action.click(baseLanding.btnSkip);
//        action.checkerEqual(baseHomepage.txtUserProfile, BaseData.HomePage.GUEST_NAME);
    }

    @Step("Click Button Sign Up")
    public void testGoToSignUpPage() throws InterruptedException {
        Thread.sleep(5000);
        action.click(baseLanding.btnSignUp);
        action.click(baseLanding.btnEmail);
        baseLanding.checkValidationWelcomeText();
    }

    @Step("Click All Possible Button Landing Pages")
    public void testCheckHeaderFooterButton() throws InterruptedException {
        //From landing page to sign up page
        testGoToSignUpPage();
        //From sign up page to login page using button header
        action.click(baseLanding.btnHeadLogin);
        baseLanding.checkValidationWelcomeText();
        //From login page to sign up using button header
        action.click(baseLanding.btnHeadLogin);
        baseLanding.checkValidationWelcomeText();
        //From sign up page to login page using button footer
        action.click(baseLanding.btnLoginHere);
        baseLanding.checkValidationWelcomeText();
        //From login page to sign up page using button footer
        action.click(baseLanding.btnLoginHere);
        baseLanding.checkValidationWelcomeText();
    }

    @Step("Sign Up With Google")
    public void testSignInWithGoogle() throws InterruptedException {
        testGoToLoginPage();
        action.click(baseLanding.btnOtherMethod);
        action.click(baseLanding.btnGoogle);
        action.click(baseLanding.btnGoogleAccount);
    }

    @Step("Sign Up With Facebook")
    public void testSignInWithFacebook() throws InterruptedException{
        testGoToLoginPage();
        action.click(baseLanding.btnOtherMethod);
        action.click(baseLanding.btnFacebook);
    }

    @Step("Check Validation Welcome Text")
    public void testCheckLoginPage() {
        baseLanding.checkValidationWelcomeText();
    }

    @Step("Go Back")
    public void clickButtonBack() {
        action.click(baseLanding.btnBack);
    }
}

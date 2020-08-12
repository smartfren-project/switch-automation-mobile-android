package pages;

import constants.BaseData;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import operation.BaseLanding;

public class LandingPages {

    BaseLanding baseLanding = new BaseLanding();

    @Step("Click Button Login")
    public void testGoToLoginPage() throws InterruptedException {
        baseLanding.clickButtonLogin();
        baseLanding.checkValidationWelcomeText();
        Thread.sleep(3000);
        System.out.println("Click Button Login");
    }

    @Step("Click Button Skip")
    public void testLoginAsGuest() throws InterruptedException{
        baseLanding.clickButtonSkip();
        baseLanding.checkUserProfile(BaseData.HomePage.GUEST_NAME);
        Thread.sleep(3000);
    }

    @Step("Click Button Sign Up")
    public void testGoToSignUpPage() throws InterruptedException {
        Thread.sleep(3000);
        baseLanding.clickButtonSignUp();
        baseLanding.checkValidationWelcomeText();
        Thread.sleep(3000);
    }

    @Step("Click All Possible Button Landing Pages")
    public void testCheckHeaderFooterButton() throws InterruptedException {
        //From landing page to sign up page
        baseLanding.clickButtonSignUp();
        baseLanding.checkTitlePage(BaseData.Validation.VALIDATION_REGISTER_PAGE);
        //From sign up page to login page using button header
        baseLanding.clickButtonHeaderCredential();
        baseLanding.checkTitlePage(BaseData.Validation.VALIDATION_LOGIN_PAGE);
        //From login page to sign up using button header
        baseLanding.clickButtonHeaderCredential();
        baseLanding.checkTitlePage(BaseData.Validation.VALIDATION_REGISTER_PAGE);
        //From sign up page to login page using button footer
        baseLanding.clickButtonFooterCredential();
        baseLanding.checkTitlePage(BaseData.Validation.VALIDATION_LOGIN_PAGE);
        //From login page to sign up page using button footer
        baseLanding.clickButtonFooterCredential();
        baseLanding.checkTitlePage(BaseData.Validation.VALIDATION_REGISTER_PAGE);
        Thread.sleep(3000);
    }

    @Step("Sign Up With Google")
    public void testSignUpWithGoogle() throws InterruptedException {
        baseLanding.clickButtonSignUp();
        Thread.sleep(3000);
        baseLanding.clickButtonOtherMethod();
        baseLanding.clickButtonGoogle();
        Thread.sleep(3000);
//        clickButtonGoogleAccount();
    }

    @Step("Sign Up With Facebook")
    public void testSignUpWithFacebook() throws InterruptedException{
        baseLanding.clickButtonSignUp();
        Thread.sleep(2000);
        baseLanding.clickButtonOtherMethod();
        baseLanding.clickButtonFacebook();
        Thread.sleep(3000);
    }
}

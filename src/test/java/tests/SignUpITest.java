package tests;

import constants.BaseData;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SignUpPages;
import static utilities.generator.RandomAlphabet.randomAlphabet;

@Listeners({TestAllureListener.class})
public class SignUpITest extends TestSetup {

    SignUpPages signUp = new SignUpPages();
    LandingITest landing = new LandingITest();

    @Test(priority = 25, description = "Switch_SignUp_001 - User able to sign up using valid unregistered email")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User can sign up using email.")
    @Story("Story Name : Check On SignUp Page")
    public void checkValidSignUpUsingEmail() throws InterruptedException {
        landing.checkGoToSignUpPage();
        signUp.testValidSignUpUsingEmail(randomAlphabet(6) + "@mailinator.com");
    }

    @Test(priority = 26, description = "Switch_SignUp_002 - User able to sign up using valid unregistered google account")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User can sign up using google account.")
    @Story("Story Name : Check On SignUp Page")
    public void checkValidSignUpUsingGoogle() throws InterruptedException {
        landing.checkGoToSignUpPage();
        signUp.testValidSignUpUsingOtherMethod();
        signUp.testValidSignUpUsingGoogleAccount();
    }

    @Test(priority = 27, description = "Switch_SignUp_003 - User able to sign up using valid unregistered facebook account")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User can sign up using facebook account.")
    @Story("Story Name : Check On SignUp Page")
    public void checkValidSignUpUsingFacebook() throws InterruptedException {
        landing.checkGoToSignUpPage();
        signUp.testValidSignUpUsingOtherMethod();
        signUp.testValidSignUpUsingFacebookAccount();
    }

    @Test(priority = 28, description = "Switch_SignUp_004 - User unable to sign up using alphabet")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User can't sign up using alphabet.")
    @Story("Story Name : Check On SignUp Page")
    public void checkInvalidSignUpUsingAlphabet() throws InterruptedException {
        landing.checkGoToSignUpPage();
        signUp.testInvalidSignUpUsername(BaseData.Login.ALPHABET);
    }

    @Test(priority = 29, description = "Switch_SignUp_005 - User unable to sign up using valid registered email")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User can't sign up using registered email.")
    @Story("Story Name : Check On SignUp Page")
    public void checkInvalidSignUpUsingRegisteredEmail() throws InterruptedException {
        landing.checkGoToSignUpPage();
        signUp.testInvalidSignUpUsernameNormalValidation(BaseData.Login.EMAIL_ID);
    }

    @Test(priority = 30, description = "Switch_SignUp_006 - User unable to sign up using invalid switch number")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User can't sign up using wrong number")
    @Story("Story Name : Check On SignUp Page")
    public void checkInvalidSignUpUsingSwitchNumber() throws InterruptedException {
        landing.checkGoToSignUpPage();
        signUp.testInvalidSignUpUsername(BaseData.Login.SWITCH_NUMBER);
    }

    @Test(priority = 31, description = "Switch_SignUp_007 - User unable to sign up using less email")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User can't sign up using less email.")
    @Story("Story Name : Check On SignUp Page")
    public void checkInvalidSignUpUsingLessChar() throws InterruptedException {
        landing.checkGoToSignUpPage();
        signUp.testInvalidSignUpUsernameNormalValidation(BaseData.Login.LESS_EMAIL);
    }
}

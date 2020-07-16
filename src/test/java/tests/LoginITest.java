package tests;

import constants.BaseData;
import listeners.TestAllureListener;
import operation.BaseLogin;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.*;

@Listeners({TestAllureListener.class})
public class LoginITest extends TestSetup {

    BaseLogin baseLogin = new BaseLogin();

    @Test(priority = 17, description = "Switch_Login_001 - User able to pass HOMEPAGE from VALID LOGIN EMAIL")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Successfully Using Valid Email and Password.")
    @Story("Story Name : Check Credential")
    public void checkValidLoginUsingEmail() throws InterruptedException {
        baseLogin.testValidLogin(BaseData.Login.EMAIL_ID, BaseData.Login.PIN);
    }

    @Test(priority = 16, description = "Switch_Login_002 - User able to pass HOMEPAGE from VALID LOGIN SWITCH NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Successfully Using Valid Switch Number and Password.")
    @Story("Story Name : Check Credential")
    public void checkValidLoginUsingSwitchNumber() throws InterruptedException {
        baseLogin.testValidLogin(BaseData.Login.SWITCH_NUMBER, BaseData.Login.PIN2);
    }

    @Test(priority = 15, description = "Switch_Login_003 - User unable to pass HOMEPAGE from INVALID LOGIN UNREGISTERED EMAIL")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Unsuccessfully Using Invalid Email")
    @Story("Story Name : Check Credential")
    public void checkInvalidEmail() throws InterruptedException {
        baseLogin.testInvalidUnregisteredEmailLogin(BaseData.Login.UNREGISTERED_EMAIL_ID);
    }

    @Test(priority = 14, description = "Switch_Login_004 - User unable to SIGN UP using registered email")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is unable to Navigate to Next SignUp Page.")
    @Story("Story Name : Check Credential")
    public void checkSignUpUsingRegisteredEmail() throws InterruptedException {
        baseLogin.testInvalidSignUpWithRegisteredEmail();
    }

    @Test(priority = 13, description = "Switch_Login_005 - User unable to click button SUBMIT LOGIN when input False EMAIL Specification")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Button Submit Login Is Disabled When Input Wrong Email Criteria")
    @Story("Story Name : Check Credential")
    public void checkInvalidAlphabetOnly() throws InterruptedException {
        baseLogin.testInvalidInputButtonDisabled(BaseData.Login.ALPHABET);
    }

    @Test(priority = 12, description = "Switch_Login_006 - User unable to click button SUBMIT LOGIN when input LESS THAN 8 NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Button Submit Login Is Disabled When Input Less than 8 NUMBER")
    @Story("Story Name : Check Credential")
    public void checkInvalidSwitchNumberLessThanEqual() throws InterruptedException {
        baseLogin.testInvalidInputButtonDisabled(BaseData.Login.LESS_SWITCH_NUMBER);
    }

    @Test(priority = 11, description = "Switch_Login_007 - User unable to click button SUBMIT LOGIN when input NUMBER with String")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Button Submit Login Is Disabled When Input SWITCH NUMBER with String")
    @Story("Story Name : Check Credential")
    public void checkInvalidSwitchNumberWithString() throws InterruptedException {
        baseLogin.testInvalidInputButtonDisabled(BaseData.Login.SWITCH_NUMBER + "a");
    }

    @Test(priority = 10, description = "Switch_Login_008 - User unable to click button SUBMIT LOGIN when input Email Less Than 8 Character")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Button Submit Login Is Disabled When Input Email Less Than 8 Character")
    @Story("Story Name : Check Credential")
    public void checkInvalidLessCharacterEmail() throws InterruptedException {
        baseLogin.testInvalidInputButtonDisabled(BaseData.Login.LESS_EMAIL);
    }

    @Test(priority = 9, description = "Switch_Login_009 - User unable to login using INVALID PIN EMAIL")
    @Severity(SeverityLevel.CRITICAL)
    @Description("User Unable to Login Using WRONG PIN From Email")
    @Story("Story Name : Check Credential")
    public void checkInvalidCredentialEmailPin() throws InterruptedException {
        baseLogin.testInvalidWrongUsernameAndPin(BaseData.Login.EMAIL_ID, BaseData.Login.PIN2);
    }

    @Test(priority = 8, description = "Switch_Login_010 - User unable to login using INVALID PIN SWITCH NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("User Unable to Login Using WRONG PIN From SWITCH NUMBER")
    @Story("Story Name : Check Credential")
    public void checkInvalidCredentialSwitchNumberPin() throws InterruptedException {
        baseLogin.testInvalidWrongUsernameAndPin(BaseData.Login.SWITCH_NUMBER, BaseData.Login.PIN);
    }

    @Test(priority = 7, description = "Switch_Login_011 - User unable to login using INVALID SWITCH NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("User Unable to Login Using WRONG PIN From SWITCH NUMBER")
    @Story("Story Name : Check Credential")
    public void checkInvalidCredentialSwitchNumber() throws InterruptedException {
        baseLogin.testInvalidInputValidation(BaseData.Login.WRONG_NUMBER);
    }
}

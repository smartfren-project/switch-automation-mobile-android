package tests;

import constants.BaseData;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPages;

@Listeners({TestAllureListener.class})
public class LoginITest extends TestSetup {

    LoginPages loginPages = new LoginPages();

    @Test(priority = 51, description = "Switch_Login_001 - User able to pass HOMEPAGE from VALID LOGIN EMAIL")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Successfully Using Valid Email and Password.")
    @Story("Story Name : Check Login")
    public void checkValidLoginUsingEmail() throws InterruptedException {
        loginPages.testValidLogin(BaseData.Login.EMAIL_ID, BaseData.Login.PIN, "1", "2", "3", "4");
    }

    @Test(priority = 52, description = "Switch_Login_002 - User able to pass HOMEPAGE from VALID LOGIN SWITCH NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Successfully Using Valid Switch Number and Password.")
    @Story("Story Name : Check Login")
    public void checkValidLoginUsingSwitchNumber() throws InterruptedException {
        loginPages.testValidLogin("tan.rafel@gmail.com", "270413", "1", "2", "3", "4");
    }

    @Test(priority = 53, description = "Switch_Login_003 - User unable to pass HOMEPAGE from INVALID LOGIN UNREGISTERED EMAIL")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Unsuccessfully Using Invalid Email")
    @Story("Story Name : Check Login")
    public void checkInvalidUnregisteredEmail() throws InterruptedException {
        loginPages.testInvalidUnregisteredEmailLogin(BaseData.Login.UNREGISTERED_EMAIL_ID);
    }

    @Test(priority = 54, description = "Switch_Login_004 - User unable to Login using wrong type of email")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is unable to Go To Home Page.")
    @Story("Story Name : Check Login")
    public void checkInvalidSignInUsingInvalidEmail() throws InterruptedException {
        loginPages.testInvalidLogin("alpha@@a.");
    }

    @Test(priority = 55, description = "Switch_Login_005 - User unable to click button SUBMIT LOGIN when input Alphabet Only")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Button Submit Login Is Disabled When Input Wrong Email Criteria")
    @Story("Story Name : Check Login")
    public void checkInvalidAlphabetOnly() throws InterruptedException {
        loginPages.testInvalidInputButtonDisabled(BaseData.Login.ALPHABET);
    }

    @Test(priority = 56, description = "Switch_Login_006 - User unable to click button SUBMIT LOGIN when input LESS THAN 8 NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Button Submit Login Is Disabled When Input Less than 8 NUMBER")
    @Story("Story Name : Check Login")
    public void checkInvalidSwitchNumberLessThanEqual() throws InterruptedException {
        loginPages.testInvalidInputButtonDisabled(BaseData.Login.LESS_SWITCH_NUMBER);
    }

    @Test(priority = 57, description = "Switch_Login_007 - User unable to click button SUBMIT LOGIN when input NUMBER with String")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Button Submit Login Is Disabled When Input SWITCH NUMBER with String")
    @Story("Story Name : Check Login")
    public void checkInvalidSwitchNumberWithString() throws InterruptedException {
        loginPages.testInvalidInputButtonDisabled(BaseData.Login.SWITCH_NUMBER + "a");
    }

    @Test(priority = 58, description = "Switch_Login_008 - User unable to click button SUBMIT LOGIN when input Email Less Than 8 Character")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Button Submit Login Is Disabled When Input Email Less Than 8 Character")
    @Story("Story Name : Check Login")
    public void checkInvalidLessCharacterEmail() throws InterruptedException {
        loginPages.testInvalidInputButtonDisabled(BaseData.Login.LESS_EMAIL);
    }

    @Test(priority = 59, description = "Switch_Login_009 - User unable to login using INVALID PIN EMAIL")
    @Severity(SeverityLevel.CRITICAL)
    @Description("User Unable to Login Using WRONG PIN From Email")
    @Story("Story Name : Check Login")
    public void checkInvalidCredentialEmailPin() throws InterruptedException {
        loginPages.testInvalidWrongUsernameAndPin(BaseData.Login.EMAIL_ID, BaseData.Login.PIN2);
    }

    @Test(priority = 60, description = "Switch_Login_010 - User unable to login using INVALID PIN SWITCH NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("User Unable to Login Using WRONG PIN From SWITCH NUMBER")
    @Story("Story Name : Check Login")
    public void checkInvalidCredentialSwitchNumberPin() throws InterruptedException {
        loginPages.testInvalidWrongUsernameAndPin(BaseData.Login.SWITCH_NUMBER, BaseData.Login.PIN);
    }

    @Test(priority = 61, description = "Switch_Login_011 - User unable to login using INVALID SWITCH NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("User Unable to Login Using WRONG PIN From SWITCH NUMBER")
    @Story("Story Name : Check Login")
    public void checkInvalidCredentialSwitchNumber() throws InterruptedException {
        loginPages.testInvalidInputValidation(BaseData.Login.WRONG_NUMBER);
    }

    @Test(priority = 62, description = "Switch_Login_012 - User unable to login using INVALID DOMAIN")
    @Severity(SeverityLevel.CRITICAL)
    @Description("User Unable to Login Using INVALID DOMAIN")
    @Story("Story Name : Check Login")
    public void checkInvalidDomainEmail() throws InterruptedException {
        loginPages.testInvalidInputButtonDisabled("abcd@abc");
    }
}

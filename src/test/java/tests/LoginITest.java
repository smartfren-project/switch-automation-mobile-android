package tests;

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

    @Test(priority = 6, description = "Switch_Login_001 - User able to pass HOMEPAGE from VALID LOGIN EMAIL")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Successfully Using Valid Email and Password.")
    @Story("Story Name : Check Credential")
    public void checkValidLoginUsingEmail() throws InterruptedException {
        baseLogin.testValidLoginEmail();
    }

    @Test(priority = 7, description = "Switch_Login_002 - User able to pass HOMEPAGE from VALID LOGIN SWITCH NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Successfully Using Valid Switch Number and Password.")
    @Story("Story Name : Check Credential")
    public void checkValidLoginUsingSwitchNumber() throws InterruptedException {
        baseLogin.testValidLoginSwitchNumber();
    }

    @Test(priority = 8, description = "Switch_Login_003 - User unable to pass HOMEPAGE from INVALID LOGIN")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Unsuccessfully Using Invalid Email")
    @Story("Story Name : Check Credential")
    public void checkInvalidEmail() throws InterruptedException {
        baseLogin.testInvalidEmailLogin();
    }

    @Test(priority = 5, description = "Switch_Login_004 - User unable to SIGN UP using registered email")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is unable to Navigate to Next SignUp Page.")
    @Story("Story Name : Check Credential")
    public void checkSignUpUsingRegisteredEmail() throws InterruptedException {
        baseLogin.testInvalidSignUpWithRegisteredEmail();
    }
}

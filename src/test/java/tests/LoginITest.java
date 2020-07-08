package tests;

import listeners.TestAllureListener;
import operation.BaseLogin;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.*;

import java.net.MalformedURLException;

@Listeners({TestAllureListener.class})
public class LoginITest extends BaseLogin {

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        launchAppSwitch();
    }

    @Test(priority = 6, description = "Switch_Login_001 - User able to pass HOMEPAGE from VALID LOGIN EMAIL")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Successfully Using Valid Email and Password.")
    @Story("Story Name : Check Credential")
    public void checkValidLoginUsingEmail() throws InterruptedException {
        testValidLoginEmail();
    }

    @Test(priority = 7, description = "Switch_Login_002 - User able to pass HOMEPAGE from VALID LOGIN SWITCH NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Successfully Using Valid Switch Number and Password.")
    @Story("Story Name : Check Credential")
    public void checkValidLoginUsingSwitchNumber() throws InterruptedException {
        testValidLoginSwitchNumber();
    }

    @Test(priority = 8, description = "Switch_Login_003 - User unable to pass HOMEPAGE from INVALID LOGIN")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Unsuccessfully Using Invalid Email")
    @Story("Story Name : Check Credential")
    public void checkInvalidEmail() throws InterruptedException {
        testInvalidEmailLogin();
    }

    @AfterMethod
    public void closeAppSwitch() throws InterruptedException {
        driver.resetApp();
    }
}

package tests;

import listeners.TestAllureListener;
import operation.BaseLanding;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.testng.annotations.*;

import java.net.MalformedURLException;

@Listeners({TestAllureListener.class})
public class LandingITest extends BaseLanding {
    @BeforeSuite
    public void setUp() throws MalformedURLException {
        launchAppSwitch();
    }

    @Test(priority = 1, description = "Switch_Land_001 - User able to go to Login/SignUp")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to Sign Up Page on Clicking on Sign Up Button in any storyboard.")
    @Story("Story Name : Check On Landing Page")
    public void checkGoToSignUpPage() throws InterruptedException {
        testGoToSignUpPage();
    }

    @Test(priority = 2, description = "Switch_Land_002 - User able to go to LOGIN PAGE")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to Login Page on Clicking on Login Button in any storyboard.")
    @Story("Story Name : Check On Landing Page")
    public void checkGoToLoginPage() throws InterruptedException {
        testGoToLoginPage();
    }

    @Test(priority = 3, description = "Switch_Land_003 - User able to login as GUEST")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to GuestPage on Clicking on Skip Button in any storyboard.")
    @Story("Story Name : Check On Landing Page")
    public void checkLoginAsGuest() throws InterruptedException {
        testLoginAsGuest();
    }

    @Test(priority = 4, description = "Switch_Land_004 - User able to go to any page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to Navigate to Sign Up/Login page simultneously.")
    @Story("Story Name : Check On Landing Page")
    public void checkMoveToPageFrequently() throws InterruptedException {
        testCheckHeaderFooterButton();
    }

    @Test(priority = 5, description = "Switch_Land_007 - User unable to SIGN UP using registered email")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is unable to Navigate to Next SignUp Page.")
    @Story("Story Name : Check On Landing Page")
    public void checkSignUpUsingRegisteredEmail() throws InterruptedException {
        testInvalidSignUpWithRegisteredEmail();
    }

    @Test(priority = 14, description = "Switch_Land_005 - User able to SIGN UP using Unregistered Google Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to Capture Google account in Sign Up flow.")
    @Story("Story Name : Check On Landing Page")
    public void checkSignUpWithUnregisteredGoogleAccount() throws InterruptedException {
        testSignUpWithGoogle();
    }

    @Test(priority = 15, description = "Switch_Land_006 - User able to SIGN UP using Unregistered Facebook Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to Capture Facebook account in Sign Up flow.")
    @Story("Story Name : Check On Landing Page")
    public void checkSignUpWithUnregisteredFacebookAccount() throws InterruptedException {
        testSignUpWithFacebook();
    }

    @AfterMethod
    public void closeAppSwitch() {
        driver.resetApp();
    }
}

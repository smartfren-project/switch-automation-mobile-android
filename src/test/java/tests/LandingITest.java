package tests;

import listeners.TestAllureListener;
import operation.BaseLanding;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

@Listeners({TestAllureListener.class})
public class LandingITest extends BaseLanding {
    @BeforeSuite
    public void setUp() throws MalformedURLException {
        launchAppSwitch();
    }

    @Test(priority = 1, description = "Switch_Land_001 - User able to go to REGISTER PAGE")
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
    public void checkGoToLoginPage() {
        testGoToLoginPage();
    }

    @Test(priority = 3, description = "Switch_Land_003 - User able to login as GUEST")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to GuestPage on Clicking on Skip Button in any storyboard.")
    @Story("Story Name : Check On Landing Page")
    public void checkLoginAsGuest() {
        testLoginAsGuest();
    }

    @Test(priority = 4, description = "Switch_Land_004 - User able to go to any page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to Navigate to Sign Up/Login page simultneously.")
    @Story("Story Name : Check On Landing Page")
    public void checkMoveToPageFrequently() {
        testCheckHeaderFooterButton();
    }

    @Test(priority = 5, description = "Switch_Land_005 - User able to SIGN UP using Unregistered Google Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to Capture Google account in Sign Up flow.")
    @Story("Story Name : Check On Landing Page")
    public void checkSignUpWithUnregisteredGoogleAccount() throws InterruptedException {
        testSignUpWithGoogle();
    }

    @Test(priority = 5, description = "Switch_Land_006 - User able to SIGN UP using Unregistered Facebook Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to Capture Facebook account in Sign Up flow.")
    @Story("Story Name : Check On Landing Page")
    public void checkSignUpWithUnregisteredFacebookAccount() throws InterruptedException {
        testSignUpWithFacebook();
    }

    @AfterSuite
    public void closeApp() throws InterruptedException {
        testCloseAppSwitch();
    }
}

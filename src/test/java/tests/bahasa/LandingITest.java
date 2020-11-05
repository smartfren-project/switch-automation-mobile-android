package tests.bahasa;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import operation.BaseLanding;
import org.testng.annotations.Test;
import pages.LandingPages;
import pages.ProfilePages;
import tests.ProfileITest;

public class LandingITest {

    LandingPages landingPages = new LandingPages();
    ProfilePages profilePages = new ProfilePages();
    ProfileITest profile = new ProfileITest();
    BaseLanding baseLanding = new BaseLanding();

    @Test(priority = 501, description = "Switch_Land_007 - User able to go to Login/SignUp with Bahasa Language")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to Sign Up Page on Clicking on Sign Up Button in any storyboard.")
    @Story("Story Name : Check On Landing Page")
    public void checkGoToLoginPage() throws InterruptedException {
        profile.checkChangeLanguage();
        profilePages.testLogout();
        profilePages.testClickButtonLoginHere();
        landingPages.testCheckLoginPage();
    }
}

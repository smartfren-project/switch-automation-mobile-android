package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePages;

@Listeners({TestAllureListener.class})
public class HomepageITest extends TestSetup {

    HomePages homePages = new HomePages();
    LandingITest landing = new LandingITest();
    LoginITest login = new LoginITest();

    @Test(priority = 151, description = "Switch_Home_001 - User able to go to All Menu Page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to All Menu Page by Clicking on Any Available Main Menu.")
    @Story("Story Name : Check On Home Page")
    public void checkGoToSignUpPage() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        homePages.testUserCanMoveToMainMenuPage();
    }

    @Test(priority = 152, description = "Switch_Home_001 - User able to go to All Menu Page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to All Menu Page by Clicking on Any Available Main Menu.")
    @Story("Story Name : Check On Home Page")
    public void checkGoToSignUpPageUsingGuest() throws InterruptedException {
        landing.checkLoginAsGuest();
        homePages.testUserUnableMoveToAllMenuExceptMainMenu();
    }
}

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

    @Test(priority = 66, description = "Switch_Home_001 - User able to go to All Menu Page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to All Menu Page by Clicking on Any Available Main Menu.")
    @Story("Story Name : Check On Home Page")
    public void checkGoToSignUpPage() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        homePages.testUserCanMoveToMainMenuPage();
    }

    @Test(priority = 67, description = "Switch_Home_002 - User unable to go to All Menu Page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is can't navigating to All Menu Page by Clicking on Any Available Main Menu.")
    @Story("Story Name : Check On Home Page")
    public void checkGoToSignUpPageUsingGuest() throws InterruptedException {
        landing.checkLoginAsGuest();
        homePages.testUserUnableMoveToAllMenuExceptMainMenu();
    }

    @Test(priority = 68, description = "Switch_Home_003 - User able to check detail plan")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is can check detail plan.")
    @Story("Story Name : Check On Home Page")
    public void checkDetailPlan() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        homePages.testUserCanCheckDetailPlan();
    }

    @Test(priority = 69, description = "Switch_Home_004 - User able to check balance remaining")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is can check balance remaining.")
    @Story("Story Name : Check On Home Page")
    public void checkBalanceRemaining() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        homePages.testUserCanCheckBalanceRemaining();
    }

    @Test(priority = 70, description = "Switch_Home_005 - User able to check sms remaining")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is can check sms remaining.")
    @Story("Story Name : Check On Home Page")
    public void checkSMSRemaining() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        homePages.testUserCanCheckMessageRemaining();
    }

    @Test(priority = 71, description = "Switch_Home_006 - User able to check call remaining")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is can check call remaining.")
    @Story("Story Name : Check On Home Page")
    public void checkCallRemaining() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        homePages.testUserCanCheckCallRemaining();
    }

    @Test(priority = 72, description = "Switch_Home_007 - User able to check custom now")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is can check custom now.")
    @Story("Story Name : Check On Home Page")
    public void checkCustomNow() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        homePages.testUserCanClickCustomNow();
    }

    @Test(priority = 73, description = "Switch_Home_008 - User able to check big mission")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is can check big mission.")
    @Story("Story Name : Check On Home Page")
    public void checkBigMission() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        homePages.testUserCanClickBigMission();
    }

    @Test(priority = 74, description = "Switch_Home_009 - User able to check e-commerce")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is can check e-commerce.")
    @Story("Story Name : Check On Home Page")
    public void checkECommerce() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        homePages.testUserCanClickECommerce();
    }

    @Test(priority = 75, description = "Switch_Home_010 - User able to check data remaining")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is can check data remaining.")
    @Story("Story Name : Check On Home Page")
    public void checkDataRemaining() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        homePages.testUserCanCheckDataRemaining();
    }

    @Test(priority = 76, description = "Switch_Home_011 - User able to check mix and max")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is can check mix and max.")
    @Story("Story Name : Check On Home Page")
    public void checkMixAndMax() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        homePages.testUserCanClickMixAndMax();
    }

    @Test(priority = 77, description = "Switch_Home_012 - User able to see all news")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify that User is can see all news.")
    @Story("Story Name : Check On Home Page")
    public void checkSeeAllNews() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        homePages.testUserCanClickSeeAllNewsButton();
    }

    @Test(priority = 78, description = "Switch_Home_013 - User able to see first news")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify that User is can see first news.")
    @Story("Story Name : Check On Home Page")
    public void checkSeeFirstNews() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        homePages.testUserCanClickSeeAllNewsButton();
        homePages.testUserCanClickFirstNews();
    }
}

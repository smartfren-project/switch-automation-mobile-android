package tests;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.QuestPages;

@Listeners({TestAllureListener.class})
public class QuestITest extends TestSetup {

    LoginITest login = new LoginITest();
    QuestPages questPages = new QuestPages();

    @Test(priority = 301, description = "Switch_Quest_001 - User able to Cancel to Change Avatar")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can cancel do change avatar")
    @Story("Story Name : Check Quest")
    public void checkCancelChangeAvatar() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testCancelChangeAvatar();
    }

    @Test(priority = 302, description = "Switch_Quest_002 - User able to Change Avatar")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can do change avatar")
    @Story("Story Name : Check Quest")
    public void checkDoChangeAvatar() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testDoChangeAvatar();
    }

    @Test(priority = 303, description = "Switch_Quest_003 - User able to Check All Big Mission")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can check all Big Mission")
    @Story("Story Name : Check Quest")
    public void checkBigMission() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testCheckAllBigMission();
    }

    @Test(priority = 304, description = "Switch_Quest_004 - User able to Check All Mission")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can check all Mission")
    @Story("Story Name : Check Quest")
    public void checkMission() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testCheckMission();
    }

    @Test(priority = 305, description = "Switch_Quest_005 - User able to Check Progress")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can check progress")
    @Story("Story Name : Check Quest")
    public void checkProgress() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testCheckProgress();
    }

    @Test(priority = 306, description = "Switch_Quest_006 - User able to Check Games")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can check games")
    @Story("Story Name : Check Quest")
    public void checkGames() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testCheckGames();
    }

    @Test(priority = 307, description = "Switch_Quest_007 - User able to Check Rank")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can check rank")
    @Story("Story Name : Check Quest")
    public void checkRank() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testCheckRank();
    }

    @Test(priority = 308, description = "Switch_Quest_008 - User able to Check Daily Login Quest")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can check daily login quest")
    @Story("Story Name : Check Quest")
    public void checkDailyLoginQuest() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testDailyLoginQuest();
    }

    @Test(priority = 309, description = "Switch_Quest_009 - User able to Check Mission")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can check all Mission")
    @Story("Story Name : Check Quest")
    public void checkMainMission() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testCheckMission();
    }

    @Test(priority = 310, description = "Switch_Quest_010 - User able to Check All Games")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can check all games")
    @Story("Story Name : Check Quest")
    public void checkAllUIGames() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testCheckAllGames();
    }

    @Test(priority = 311, description = "Switch_Quest_011 - User able to See Popup after click on Any Games")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can see popup after click on any games")
    @Story("Story Name : Check Quest")
    public void checkPopupStartGames() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testCheckPopupGames();
    }

    @Test(priority = 312, description = "Switch_Quest_012 - User able to See Games when click selected games")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can see Selected Games")
    @Story("Story Name : Check Quest")
    public void checkGoStartGames() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testGoToSelectedGames();
    }

    @Test(priority = 313, description = "Switch_Quest_013 - User able to Go Back From Games")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can Go Back To Games Page")
    @Story("Story Name : Check Quest")
    public void checkGoBackFromGameplay() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testGoToSelectedGames();
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    }

    @Test(priority = 314, description = "Switch_Quest_014 - User able to Do Active Mission")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can Do Active Mission")
    @Story("Story Name : Check Quest")
    public void checkDoActiveMission() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        questPages.testCheckMission();
        questPages.testClickPlayMission();
    }
}

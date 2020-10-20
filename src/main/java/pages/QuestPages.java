package pages;

import io.qameta.allure.Step;
import operation.BaseHomepage;
import operation.BaseQuest;
import utilities.finders.ElementAction;

public class QuestPages {

    ElementAction action = new ElementAction();
    BaseQuest baseQuest = new BaseQuest();
    BaseHomepage baseHomepage = new BaseHomepage();

    @Step("Do Change Avatar")
    public void testDoChangeAvatar() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.imgAvatar);
        action.click(baseQuest.btnLetsStartQuestWorld);
    }

    @Step("Do Cancel Change Avatar")
    public void testCancelChangeAvatar() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.imgAvatar);
        action.click(baseQuest.btnCancelStartQuestWorld);
    }

    @Step("Do Click Mission")
    public void testCheckMission() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnMission);
    }

    @Step("Do Click Progress")
    public void testCheckProgress() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnProgress);
    }

    @Step("Do Click Games")
    public void testCheckGames() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnGames);
    }

    @Step("Do Click Rank")
    public void testCheckRank() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnRank);
    }

    @Step("Do Click Daily Login Quest")
    public void testDailyLoginQuest() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnCheckLoginQuest);
    }

    @Step("Do Click All Big Mission")
    public void testCheckAllBigMission() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnSeeAll);
    }

    @Step("Do Check All Games")
    public void testCheckAllGames() {
        testCheckGames();
        action.scrollOnly(baseQuest.btnCheckFinalGames);
        action.click(baseQuest.btnActionGames);
        action.scrollOnly(baseQuest.btnCheckFinalActionGames);
    }

    @Step("Do Check Popup Games")
    public void testCheckPopupGames() {
        testCheckGames();
        action.clickElementScroll(baseQuest.btnCheckFinalGames);
    }

    @Step("Do Check Click Play Games")
    public void testGoToSelectedGames() {
        testCheckGames();
        action.clickElementScroll(baseQuest.btnCheckFirstGames);
        action.click(baseQuest.btnLetsPlay);
    }

    @Step("Do Click Play Mission")
    public void testClickPlayMission() {
        action.click(baseQuest.btnDoPageMission);
    }
}

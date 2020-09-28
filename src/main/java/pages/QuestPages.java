package pages;

import operation.BaseHomepage;
import operation.BaseQuest;
import utilities.finders.ElementAction;

public class QuestPages {

    ElementAction action = new ElementAction();
    BaseQuest baseQuest = new BaseQuest();
    BaseHomepage baseHomepage = new BaseHomepage();

    public void testDoChangeAvatar() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.imgAvatar);
        action.click(baseQuest.btnLetsStartQuestWorld);
    }

    public void testCancelChangeAvatar() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.imgAvatar);
        action.click(baseQuest.btnCancelStartQuestWorld);
    }

    public void testCheckMission() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnMission);
    }

    public void testCheckProgress() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnProgress);
    }

    public void testCheckGames() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnGames);
    }

    public void testCheckRank() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnRank);
    }

    public void testDailyLoginQuest() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnCheckLoginQuest);
    }

    public void testCheckAllBigMission() {
        action.click(baseHomepage.btnQuest);
        action.click(baseQuest.btnSeeAll);
    }
}

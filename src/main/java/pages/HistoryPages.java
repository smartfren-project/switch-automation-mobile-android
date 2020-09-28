package pages;

import io.qameta.allure.Step;
import operation.BaseHistory;
import operation.BaseHomepage;
import operation.BaseProfile;
import utilities.finders.ElementAction;

public class HistoryPages {

    ElementAction action = new ElementAction();
    BaseHomepage baseHomepage = new BaseHomepage();
    BaseHistory baseHistory = new BaseHistory();
    BaseProfile baseProfile = new BaseProfile();

    @Step("User Do Check All History Transaction")
    public void testCheckHistoryAllTrx() throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnTrxHistory);
        baseHistory.clickButtonAll();
    }

    @Step("User Do Check Waiting History Transaction")
    public void testCheckHistoryWaitingTrx() throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnTrxHistory);
        baseHistory.clickButtonWaiting();
    }

    @Step("User Do Check Processed History Transaction")
    public void testCheckHistoryProcessedTrx() throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnTrxHistory);
        baseHistory.clickButtonProcess();
    }

    @Step("User Do Check Finished History Transaction")
    public void testCheckHistoryFinishTrx() throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnTrxHistory);
        baseHistory.clickButtonFinishTrx();
    }
}

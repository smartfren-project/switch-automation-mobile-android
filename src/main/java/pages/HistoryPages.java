package pages;

import operation.BaseHistory;
import operation.BaseHomepage;

public class HistoryPages {

    BaseHomepage baseHomepage = new BaseHomepage();
    BaseHistory baseHistory = new BaseHistory();

    public void testCheckHistoryAllTrx() throws InterruptedException {
        baseHomepage.clickButtonHistory();
        Thread.sleep(3000);
        baseHistory.clickButtonAll();
    }

    public void testCheckHistoryWaitingTrx() throws InterruptedException {
        baseHomepage.clickButtonHistory();
        Thread.sleep(3000);
        baseHistory.clickButtonWaiting();
    }

    public void testCheckHistoryProcessedTrx() throws InterruptedException {
        baseHomepage.clickButtonHistory();
        Thread.sleep(3000);
        baseHistory.clickButtonProcess();
    }

    public void testCheckHistoryFinishTrx() throws InterruptedException {
        baseHomepage.clickButtonHistory();
        Thread.sleep(3000);
        baseHistory.clickButtonFinishTrx();
    }
}

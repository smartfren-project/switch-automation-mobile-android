package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import operation.BaseHistory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HistoryPages;

@Listeners({TestAllureListener.class})
public class HistoryITest extends TestSetup {
    LoginITest login = new LoginITest();
    HistoryPages historyPages = new HistoryPages();

    @Test(priority = 251, description = "Switch_History_001 - User able to see all Transaction History")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to see All Transaction by Clicking All on History Menu.")
    @Story("Story Name : Check On History Page")
    public void checkAllHistoryTransaction() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        historyPages.testCheckHistoryAllTrx();
    }

    @Test(priority = 252, description = "Switch_History_002 - User able to see Waiting Transaction History")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to see Waiting Transaction by Clicking Waiting on History Menu.")
    @Story("Story Name : Check On History Page")
    public void checkWaitingHistoryTransaction() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        historyPages.testCheckHistoryWaitingTrx();
    }

    @Test(priority = 253, description = "Switch_History_003 - User able to see Processed Transaction History")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to see Processed Transaction by Clicking Processed on History Menu.")
    @Story("Story Name : Check On History Page")
    public void checkProcessedHistoryTransaction() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        historyPages.testCheckHistoryProcessedTrx();
    }

    @Test(priority = 254, description = "Switch_History_004 - User able to see Finished Transaction History")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to see Finished Transaction by Clicking Finished on History Menu.")
    @Story("Story Name : Check On History Page")
    public void checkFinishedHistoryTransaction() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        historyPages.testCheckHistoryFinishTrx();
    }
}

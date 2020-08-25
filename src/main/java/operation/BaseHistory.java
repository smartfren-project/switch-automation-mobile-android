package operation;

import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utilities.finders.ElementAction;

public class BaseHistory extends BaseTest {

    ElementAction action = new ElementAction();

    public By textHistoryMenuTitle = By.id(ObjectElement.HistoryPageObject.textHistoryMenuTitle);


    public String getHistoryTitle() {
        String hTitle = action.getText(textHistoryMenuTitle);
        try {
            return String.valueOf(hTitle);
        } catch (Exception e) {
            return null;
        }
    }

    public void clickButtonAll() {
        if (getHistoryTitle().equals("Transaction History")) {
            action.scrollAndClick(ObjectElement.HistoryPageObject.btnTabAll);
        } else {
            action.scrollAndClick(ObjectElement.HistoryPageObject.btnTabSemua);
        }
    }

    public void clickButtonWaiting() {
        if (getHistoryTitle().equals("Transaction History")) {
            action.scrollAndClick(ObjectElement.HistoryPageObject.btnTabWaiting);
        } else {
            action.scrollAndClick(ObjectElement.HistoryPageObject.btnTabMenunggu);
        }
    }

    public void clickButtonProcess() {
        if (getHistoryTitle().equals("Transaction History")) {
            action.scrollAndClick(ObjectElement.HistoryPageObject.btnTabProcessTrx);
        } else {
            action.scrollAndClick(ObjectElement.HistoryPageObject.btnTabDiProses);
        }
    }

    public void clickButtonFinishTrx() {
        if (getHistoryTitle().equals("Transaction History")) {
            action.scrollAndClick(ObjectElement.HistoryPageObject.btnFinishTrx);
        } else {
            action.scrollAndClick(ObjectElement.HistoryPageObject.btnTabSelesai);
        }
    }
}

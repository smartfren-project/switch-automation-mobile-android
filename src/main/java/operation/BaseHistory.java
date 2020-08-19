package operation;

import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BaseHistory extends BaseTest {

    public By btnTabAll = By.id(ObjectElement.HistoryPageObject.btnTabAll);

    public By btnTabWaiting = By.id(ObjectElement.HistoryPageObject.btnTabWaiting);

    public By btnTabProcessTrx = By.id(ObjectElement.HistoryPageObject.btnTabProcessTrx);

    public By btnFinishTrx = By.id(ObjectElement.HistoryPageObject.btnFinishTrx);

    public By textHistoryMenuTitle = By.id(ObjectElement.HistoryPageObject.textHistoryMenuTitle);


    public String getHistoryTitle() {
        String hTitle = driver.findElement(By.id(ObjectElement.HistoryPageObject.textHistoryMenuTitle)).getText();
        try {
            return String.valueOf(hTitle);
        } catch (Exception e) {
            return null;
        }
    }

    public void clickButtonAll() {
        if (getHistoryTitle().equals("Transaction History")) {
            MobileElement elementToClick = (MobileElement) driver
                    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                            + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                            + "new UiSelector().text(\"All\"));");
            elementToClick.click();
        } else {
            MobileElement elementToClick = (MobileElement) driver
                    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                            + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                            + "new UiSelector().text(\"Semua\"));");
            elementToClick.click();
        }

    }

    public void clickButtonWaiting() {
        if (getHistoryTitle().equals("Transaction History")) {
            MobileElement elementToClick = (MobileElement) driver
                    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                            + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                            + "new UiSelector().text(\"Waiting\"));");
            elementToClick.click();
        } else {
            MobileElement elementToClick = (MobileElement) driver
                    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                            + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                            + "new UiSelector().text(\"Menunggu\"));");
            elementToClick.click();
        }
    }

    public void clickButtonProcess() {
        if (getHistoryTitle().equals("Transaction History")) {
            MobileElement elementToClick = (MobileElement) driver
                    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                            + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                            + "new UiSelector().text(\"In Process\"));");
            elementToClick.click();
        } else {
            MobileElement elementToClick = (MobileElement) driver
                    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                            + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                            + "new UiSelector().text(\"Pesanan Diproses\"));");
            elementToClick.click();
        }
    }

    public void clickButtonFinishTrx() {
        if (getHistoryTitle().equals("Transaction History")) {
            MobileElement elementToClick = (MobileElement) driver
                    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                            + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                            + "new UiSelector().text(\"Completed\"));");
            elementToClick.click();
        } else {
            MobileElement elementToClick = (MobileElement) driver
                    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                            + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                            + "new UiSelector().text(\"Pesanan Selesai\"));");
            elementToClick.click();
        }
    }
}

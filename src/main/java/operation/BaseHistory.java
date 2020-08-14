package operation;

import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BaseHistory extends BaseTest {
    BaseHomepage baseHomepage = new BaseHomepage();

    public String getHistoryTitle() {
        driver.findElement(By.id(ObjectElement.HistoryPageObject.btnTabAll)).getText();
        return getHistoryTitle();
    }

    public void clickButtonAll() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                        + "new UiSelector().text(\"All\"I\"Semua\"));");
        elementToClick.click();
    }

    public void clickButtonWaiting() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                        + "new UiSelector().text(\"Waiting\"));");
        elementToClick.click();
    }

    public void clickButtonProcess() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                        + "new UiSelector().text(\"In Process\"));");
        elementToClick.click();
    }

    public void clickButtonFinishTrx() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                        + "new UiSelector().text(\"Completed\"));");
        elementToClick.click();
    }
}

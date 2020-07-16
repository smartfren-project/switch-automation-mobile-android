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
                        + "new UiSelector().text(\"Semua\"));");
        elementToClick.click();
    }

    public void clickButtonWaiting() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                        + "new UiSelector().text(\"Menunggu\"));");
        elementToClick.click();
    }

    public void clickButtonProcess() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                        + "new UiSelector().text(\"Pesanan Diproses\"));");
        elementToClick.click();
    }

    public void clickButtonFinishTrx() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                        + "new UiSelector().text(\"Pesanan Selesai\"));");
        elementToClick.click();
    }

    public void testCheckHistoryAllTrx() throws InterruptedException {
        baseHomepage.clickButtonHistory();
        Thread.sleep(3000);
        clickButtonAll();
    }

    public void testCheckHistoryWaitingTrx() throws InterruptedException {
        baseHomepage.clickButtonHistory();
        Thread.sleep(3000);
        clickButtonWaiting();
    }

    public void testCheckHistoryProcessedTrx() throws InterruptedException {
        baseHomepage.clickButtonHistory();
        Thread.sleep(3000);
        clickButtonProcess();
    }

    public void testCheckHistoryFinishTrx() throws InterruptedException {
        baseHomepage.clickButtonHistory();
        Thread.sleep(3000);
        clickButtonFinishTrx();
    }
}

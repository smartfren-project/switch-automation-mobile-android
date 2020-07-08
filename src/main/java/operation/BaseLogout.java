package operation;

import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;

public class BaseLogout extends BaseTest {

    BaseLogin baseLogin = new BaseLogin();
    BaseHomepage baseHomepage = new BaseHomepage();

    public void launchAppSwitch() throws MalformedURLException {
        setupAppium();
    }

    public void clickButtonProfile() {
        driver.findElement(By.id(ObjectElement.MenuPageObject.btnProfile)).click();
    }

    public void clickButtonLogout() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/logout\"));");
        elementToClick.click();
    }

    public void clickButtonConfirmLogout() {
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnConfirmLogout)).click();
    }

    public void testValidLogout() throws InterruptedException {
        baseLogin.testValidLoginEmail();
        baseHomepage.clickButtonProfile();
        clickButtonLogout();
        clickButtonConfirmLogout();
        resetApp();
        uninstallApp();
    }
}

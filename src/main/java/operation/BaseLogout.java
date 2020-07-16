package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;

public class BaseLogout extends BaseTest {

    BaseHomepage baseHomepage = new BaseHomepage();

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
        baseHomepage.clickButtonProfile();
        clickButtonLogout();
        clickButtonConfirmLogout();
    }
}

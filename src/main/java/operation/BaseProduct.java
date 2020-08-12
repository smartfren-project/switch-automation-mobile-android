package operation;

import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BaseProduct extends BaseTest {
    public void clickDetailPromoSuperBundle() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                        + "new UiSelector().text(\"Super Bundle\"));");
        elementToClick.click();
    }

    public void clickDetailPromoPowerBundle() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                        + "new UiSelector().text(\"Power Bundle\"));");
        elementToClick.click();
    }

    public void clickDetailPromoStandardBundle() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                        + "new UiSelector().text(\"Standard Bundle\"));");
        elementToClick.click();
    }

    public void clickDetailPromoLiteBundle() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                        + "new UiSelector().text(\"Lite Bundle\"));");
        elementToClick.click();
    }

    public void checkProductTitle(String productTitle) {
        String productName = driver.findElement(By.id(ObjectElement.ProductPageObject.txtProductTitle)).getText();
        Assert.assertEquals(productTitle, productName);
    }
}

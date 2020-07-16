package operation;

import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BaseProduct extends BaseTest {
    public void clickDetailPromoSuperBundle() {
        driver.findElement(By.xpath(ObjectElement.ProductPageObject.productCardOne)).click();
    }

    public void clickDetailPromoPowerBundle() {
        driver.findElement(By.xpath(ObjectElement.ProductPageObject.productCardTwo)).click();
    }

    public void clickDetailPromoStandardBundle() {
//        MobileElement elementToClick = (MobileElement) driver
//                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
//                        + ".resourceId(\"com.smartfren.switchmobile:id/viewpager\")).scrollIntoView("
//                        + "new UiSelector().xpath(\"//android.widget.FrameLayout[@index='2']\"));");
//        elementToClick.click();
        driver.findElement(By.xpath(ObjectElement.ProductPageObject.productCardThree)).click();
    }

    public void clickDetailPromoLiteBundle() {
    }

    public void checkProductTitle(String productTitle) {
        String productName = driver.findElement(By.id(ObjectElement.ProductPageObject.txtProductTitle)).getText();
        Assert.assertEquals(productTitle, productName);
    }
}

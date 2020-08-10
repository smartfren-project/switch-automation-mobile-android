package operation;

import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BasePurchase extends BaseTest {
    BaseLogin baseLogin = new BaseLogin();
    BaseHomepage baseHomepage = new BaseHomepage();
    BaseProduct baseProduct = new BaseProduct();

    public void clickButtonAddToCart() {
        driver.findElement(By.id(ObjectElement.ProductPageObject.btnAddToCart)).click();
    }

    public void clickButtonConfirmBuy() {
        driver.findElement(By.id(ObjectElement.ProductPageObject.btnConfirmBuy)).click();
    }

    public void clickButtonIncreaseCountProduct(int increase) {
        int i;
        for(i=0;i<=increase;i++) {
            driver.findElement(By.id(ObjectElement.ProductPageObject.btnIncrease)).click();
        }
    }

    public void clickButtonDecreaseCountProduct(int decrease) {
        int i;
        for(i=0;i<=decrease;i++) {
            driver.findElement(By.id(ObjectElement.ProductPageObject.btnDecrease)).click();
        }
    }

    public void clickButtonOrderSIMCard() {
        driver.findElement(By.id(""));
    }

    public void clickButtonChoosePayment() {
        driver.findElement(By.id(ObjectElement.ProductPageObject.btnChoosePayment)).click();
    }

    public void clickButtonChooseGoPay() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"GoPay\"));");
        elementToClick.click();
    }

    public void clickButtonChooseDana() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"DANA\"));");
        elementToClick.click();
    }

    public void clickButtonChooseOVO() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"OVO\"));");
        elementToClick.click();
    }

    public void clickButtonChooseCC() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"Visa/Master/JCB\"));");
        elementToClick.click();
    }

    public void clickButtonChoosePermataVA() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"Permata VA\"));");
        elementToClick.click();
    }

    public void clickButtonChooseDanamonVA() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"Danamon VA\"));");
        elementToClick.click();
    }

    public void clickButtonChooseMandiriVA() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"Mandiri VA\"));");
        elementToClick.click();
    }

    public void clickButtonChooseAlfamart() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"Alfamart\"));");
        elementToClick.click();
    }
}

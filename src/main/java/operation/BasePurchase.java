package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BasePurchase extends BaseTest {

    public By btnAddToCart = By.id(ObjectElement.ProductPageObject.btnAddToCart);

    public By btnConfirmBuy = By.id(ObjectElement.ProductPageObject.btnConfirmBuy);

    public By btnChoosePayment = By.id(ObjectElement.ProductPageObject.btnChoosePayment);

    public By btnSeeDetailPurchase = By.id(ObjectElement.ProductPageObject.btnSeeDetail);

    public By btnCloseSeeDetailPurchase = By.id(ObjectElement.PaymentDetailObject.btnCloseDetail);

    public String btnPaymentWithGoPay = ObjectElement.PaymentDetailObject.btnGopay;

    public String btnPaymentWithDana = ObjectElement.PaymentDetailObject.btnDana;

    public String btnPaymentWithOVO = ObjectElement.PaymentDetailObject.btnOVO;

    public String btnPaymentWithCC = ObjectElement.PaymentDetailObject.btnCC;

    public String btnPaymentWithPermataVA = ObjectElement.PaymentDetailObject.btnVAPermata;

    public String btnPaymentWithDanamonVA = ObjectElement.PaymentDetailObject.btnVADanamon;

    public String btnPaymentWithMandiriVA = ObjectElement.PaymentDetailObject.btnVAMandiri;

    public String btnPaymentWithAlfamart = ObjectElement.PaymentDetailObject.btnAlfamart;

    public void clickButtonLetsSwitch() {
        driver.findElement(By.xpath("//*[@text = 'LET'S SWITCH']")).click();
//        MobileElement elementToClick = (MobileElement) driver
//                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
//                        + ".resourceId(\"com.smartfren.switchmobile:id/rv_section_one\")).scrollIntoView("
//                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/button_activate\"));");
//        elementToClick.click();
    }

    public void clickChooseYourNumber(String mainNumber) {
        driver.findElement(By.id(ObjectElement.OrderSIMNumberPage.btnMainNumber)).click();
        driver.findElement(By.xpath(String.format("//*[@text = '%mainNumber']", mainNumber))).click();
    }
}

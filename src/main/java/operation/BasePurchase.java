package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.finders.ElementAction;

public class BasePurchase extends BaseTest {

    ElementAction action = new ElementAction();
    BaseLanding baseLanding = new BaseLanding();

    public By txtDealsTitle = By.id(ObjectElement.MenuPageObject.txtDealsTitle);

    public By btnAddToCart = By.id(ObjectElement.ProductPageObject.btnAddToCart);

    public By btnConfirmBuy = By.id(ObjectElement.ProductPageObject.btnConfirmBuy);

    public By btnChoosePayment = By.id(ObjectElement.ProductPageObject.btnChoosePayment);

    public By btnSeeDetailPurchase = By.id(ObjectElement.ProductPageObject.btnSeeDetail);

    public By btnCloseSeeDetailPurchase = By.id(ObjectElement.PaymentDetailObject.btnCloseDetail);

    public By btnOrderSIMHomeID = By.xpath(ObjectElement.ProductPageObject.btnOrderSIMHomeID);

    public By btnOrderSIMHomeEN = By.xpath(ObjectElement.ProductPageObject.btnOrderSIMHomeEN);

    public By btnMainNumber = By.id(ObjectElement.OrderSIMNumberPage.btnMainNumber);

    public By inputNumber1 = By.id(ObjectElement.OrderSIMNumberPage.btnFirstNumber);

    public By inputNumber2 = By.id(ObjectElement.OrderSIMNumberPage.btnSecondNumber);

    public By inputNumber3 = By.id(ObjectElement.OrderSIMNumberPage.btnThirdNumber);

    public By inputNumber4 = By.id(ObjectElement.OrderSIMNumberPage.btnFourthNumber);

    public By inputNumber5 = By.id(ObjectElement.OrderSIMNumberPage.btnFifthNumber);

    public By inputNumber6 = By.id(ObjectElement.OrderSIMNumberPage.btnSixthNumber);

    public By btnRefresh = By.id(ObjectElement.OrderSIMNumberPage.btnRefresh);

    public String btnPaymentWithGoPay = ObjectElement.PaymentDetailObject.btnGopay;

    public String btnPaymentWithDana = ObjectElement.PaymentDetailObject.btnDana;

    public String btnPaymentWithOVO = ObjectElement.PaymentDetailObject.btnOVO;

    public String btnPaymentWithCC = ObjectElement.PaymentDetailObject.btnCC;

    public String btnPaymentWithPermataVA = ObjectElement.PaymentDetailObject.btnVAPermata;

    public String btnPaymentWithDanamonVA = ObjectElement.PaymentDetailObject.btnVADanamon;

    public String btnPaymentWithMandiriVA = ObjectElement.PaymentDetailObject.btnVAMandiri;

    public String btnPaymentWithAlfamart = ObjectElement.PaymentDetailObject.btnAlfamart;

    public void clickButtonLetsSwitch() {
        if (baseLanding.langCenter().equals("atau bisa pakai")) {
            action.click(btnOrderSIMHomeID);
        } else {
            action.click(btnOrderSIMHomeEN);
        }
    }

    public void clickChooseYourNumber(String mainNumber) {
        driver.findElement(By.xpath(String.format("//*[@text = '%s']", mainNumber))).click();
    }
}

package operation;

import constants.ObjectElement;
import org.openqa.selenium.By;
import utilities.finders.ElementAction;

import java.text.DecimalFormat;
import java.text.ParseException;

public class BasePurchase extends BaseTest {
    ElementAction action = new ElementAction();
    BaseLanding baseLanding = new BaseLanding();

    public By txtDealsTitle = By.id(ObjectElement.MenuPageObject.txtDealsTitle);

    public By btnAddToCart = By.id(ObjectElement.ProductPageObject.btnAddToCart);

    public By btnConfirmBuy = By.id(ObjectElement.ProductPageObject.btnConfirmBuy);

    public By btnChoosePayment = By.id(ObjectElement.ProductPageObject.btnChoosePayment);

    public By btnSeeDetailPurchase = By.id(ObjectElement.ProductPageObject.btnSeeDetail);

    public By btnCloseSeeDetailPurchase = By.id(ObjectElement.PaymentDetailObject.btnCloseDetail);

    public By btnDeliveryOption = By.id(ObjectElement.PaymentDetailObject.btnDelivery);

    public By btnSelectDeliveryJNEReg = By.xpath(ObjectElement.PaymentDetailObject.btnSelecrJNEReg);

    public By btnGoPay = By.xpath(ObjectElement.PaymentDetailObject.btnSimGoPay);

    public By btnDana = By.xpath(ObjectElement.PaymentDetailObject.btnSimDana);

    public By btnOVO = By.xpath(ObjectElement.PaymentDetailObject.btnSimOVO);

    public By btnCC = By.xpath(ObjectElement.PaymentDetailObject.btnSimCC);

    public By btnPay = By.id(ObjectElement.PaymentDetailObject.btnPay);

    public By btnSeeTrxStats = By.id(ObjectElement.PaymentDetailObject.btnSeeTrxStat);

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

    public By btnSelectFilteredNumber = By.id(ObjectElement.OrderSIMNumberPage.btnSelectNumber);

    public By btnNext = By.id(ObjectElement.OrderSIMNumberPage.btnNext);

    public By inputRecipientName = By.id(ObjectElement.DeliveryAddressObject.inputRecipientName);

    public By inputRecipientPhoneNumber = By.id(ObjectElement.DeliveryAddressObject.inputRecipientPhoneNumber);

    public By btnContinue =  By.id(ObjectElement.ConfirmationAddressObject.btnContinue);

    public By txtJNERegularPrice = By.id(ObjectElement.PaymentDetailObject.txtJNERegPrice);

    public By btnCustomPlan = By.id(ObjectElement.ProductPageObject.btnCustomPlan);

    public String btnCityOrDistrict = ObjectElement.DeliveryAddressObject.btnCity;

    public String inputPostalCode = ObjectElement.DeliveryAddressObject.inputZipCode;

    public String inputAddressDetail = ObjectElement.DeliveryAddressObject.inputAddressDetail;

    public String btnGoogleLocation = ObjectElement.DeliveryAddressObject.btnGoogleLocation;

    public String cbTermsAndCondition = ObjectElement.DeliveryAddressObject.cbTermsAndConditions;

    public String btnPaymentWithGoPay = ObjectElement.PaymentDetailObject.btnGopay;

    public String btnPaymentWithDana = ObjectElement.PaymentDetailObject.btnDana;

    public String btnPaymentWithOVO = ObjectElement.PaymentDetailObject.btnOVO;

    public String btnPaymentWithCC = ObjectElement.PaymentDetailObject.btnCC;

    public String btnPaymentWithPermataVA = ObjectElement.PaymentDetailObject.btnVAPermata;

    public String btnPaymentWithDanamonVA = ObjectElement.PaymentDetailObject.btnVADanamon;

    public String btnPaymentWithMandiriVA = ObjectElement.PaymentDetailObject.btnVAMandiri;

    public String btnPaymentWithAlfamart = ObjectElement.PaymentDetailObject.btnAlfamart;

    public String btnPaymentWithShopeePay = ObjectElement.PaymentDetailObject.btnShopeePay;

    public String btnPaymentWithCCJCB = ObjectElement.PaymentDetailObject.btnCCWithJCB;

    public String btnBasePlan = ObjectElement.ProductPageObject.btnBasePlan;

    public String btnAddOn = ObjectElement.ProductPageObject.btnAddOn;

    public String btnBalancePlan = ObjectElement.ProductPageObject.btnBalancePlan;

    public String btnRoaming = ObjectElement.ProductPageObject.btnRoaming;

    public String btnToken100 = ObjectElement.ProductPageObject.btnToken100;

    public String btnToken50 = ObjectElement.ProductPageObject.btnToken50;

    public String btnToken20 = ObjectElement.ProductPageObject.btnToken20;

    public String btnToken10 = ObjectElement.ProductPageObject.btnToken10;

    public String btnInfluencer = ObjectElement.ProductPageObject.btnInfluencer;

    public String btnMovieMania = ObjectElement.ProductPageObject.btnMovieMania;

    public String btnGamer = ObjectElement.ProductPageObject.btnGamer;

    public String btnExecutive = ObjectElement.ProductPageObject.btnExecutive;

    public By btnEditAddress = By.id(ObjectElement.DeliveryAddressObject.btnEditAddress);

    public By btnEditNumber = By.id(ObjectElement.ProductPageObject.btnEditNumber);

    public String btnEditCustomPlan = ObjectElement.ProductPageObject.btnEditCustomPlan;

    public By btnBuy = By.id(ObjectElement.PaymentDetailObject.btnBuy);

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

    public String getJNERegAmount() {
        String delAmount = action.getText(txtJNERegularPrice);
        DecimalFormat currencyIDR = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        try {
            String amount = delAmount.replace("Rp ", "");
            return amount;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void selectPayment(String paymentType) {
        switch (paymentType) {
            case "GoPay" :
                action.click(btnGoPay);
                break;
            case "DANA" :
                action.click(btnDana);
                break;
            case "OVO" :
                action.click(btnOVO);
                break;
            case "CC" :
                action.click(btnCC);
                break;
        }
    }

    public void selectPaymentMethod(String paymentMethod) {
        switch (paymentMethod) {
            case "GoPay" :
                action.clickElementScroll(btnPaymentWithGoPay);
                break;
            case "Dana" :
                action.clickElementScroll(btnPaymentWithDana);
                break;
            case "OVO" :
                action.clickElementScroll(btnPaymentWithOVO);
                break;
            case "ShopeePay" :
                action.clickElementScroll(btnPaymentWithShopeePay);
                break;
            case "CC" :
                action.clickElementScroll(btnPaymentWithCC);
                break;
            case "CC-JCB" :
                action.clickElementScroll(btnPaymentWithCCJCB);
                break;
            case "PermataVA" :
                action.clickElementScroll(btnPaymentWithPermataVA);
                break;
            case "DanamonVA" :
                action.clickElementScroll(btnPaymentWithDanamonVA);
                break;
            case "MandiriVA" :
                action.clickElementScroll(btnPaymentWithMandiriVA);
                break;
            case "Alfamart" :
                action.clickElementScroll(btnPaymentWithAlfamart);
                break;
        }
    }

    public void selectService(String service) {
        switch (service) {
            case "BasePlan" :
                action.clickElementScroll(btnBasePlan);
                break;
            case "AddOn" :
                action.clickElementScroll(btnAddOn);
                break;
            case "BalancePlan" :
                action.clickElementScroll(btnBalancePlan);
                break;
            case "Roaming" :
                action.clickElementScroll(btnRoaming);
                break;
        }
    }

    public void selectBalancePlan(String bPlan) {
        switch (bPlan) {
            case "Token100" :
                action.clickElementScroll(btnToken100);
                break;
            case "Token50" :
                action.clickElementScroll(btnToken50);
                break;
            case "Token20" :
                action.clickElementScroll(btnToken20);
                break;
            case "Token10" :
                action.clickElementScroll(btnToken10);
                break;
        }
    }


    public void selectCustomPlan(String cPlan) {
        switch (cPlan) {
            case "Influencer" :
                action.clickElementScroll(btnInfluencer);
                break;
            case "Movie Mania" :
                action.clickElementScroll(btnMovieMania);
                break;
            case "Gamer" :
                action.clickElementScroll(btnGamer);
                break;
            case "Executive" :
                action.clickElementScroll(btnExecutive);
                break;
        }
    }
}

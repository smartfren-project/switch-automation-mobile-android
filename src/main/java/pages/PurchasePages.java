package pages;

import io.qameta.allure.Step;
import operation.BaseHomepage;
import operation.BaseProduct;
import operation.BaseProfile;
import operation.BasePurchase;
import utilities.finders.ElementAction;
import utilities.generator.RandomNumber;

public class PurchasePages {

    BaseHomepage baseHomepage = new BaseHomepage();
    BaseProduct baseProduct = new BaseProduct();
    BasePurchase basePurchase = new BasePurchase();
    BaseProfile baseProfile = new BaseProfile();
    ElementAction action = new ElementAction();

    @Step("User Do Add Promo Super Bundle To Cart")
    public void testAddToCartPromoSuperBundle(String productTitle, int increase) throws InterruptedException {
        action.click(baseHomepage.btnPlan);
        action.clickElementScroll(baseProduct.btnPromoSuperBundle);
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        action.countClick(baseProduct.btnIncrease, increase);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
    }

    @Step("User Do Add Promo Power Bundle To Cart")
    public void testAddToCartPromoPowerBundle(String productTitle, int increase) throws InterruptedException {
        action.click(baseHomepage.btnPlan);
        action.clickElementScroll(baseProduct.btnPromoPowerBundle);
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        action.countClick(baseProduct.btnIncrease, increase);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
        action.click(basePurchase.btnCloseSeeDetailPurchase);
    }

    @Step("User Do Add Promo Standard Bundle To Cart")
    public void testAddToCartPromoStandardBundle(String productTitle, int increase, int decrease) throws InterruptedException {
        action.click(baseHomepage.btnPlan);
        action.clickElementScroll(baseProduct.btnPromoStandardBundle);
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        action.countClick(baseProduct.btnIncrease, increase);
        action.countClick(baseProduct.btnDecrease, decrease);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
        action.click(basePurchase.btnCloseSeeDetailPurchase);
    }

    @Step("User Do Add Promo Lite Bundle To Cart")
    public void testAddToCartPromoLiteBundle(String productTitle, int increase) throws InterruptedException {
        action.click(baseHomepage.btnPlan);
        action.clickElementScroll(baseProduct.btnPromoLiteBundle);
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        action.countClick(baseProduct.btnIncrease, increase);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
        action.click(basePurchase.btnCloseSeeDetailPurchase);
    }

    @Step("User Do Checkout Payment With")
    public void testConfirmPaymentMethod(String paymentMethod) {
        basePurchase.selectPaymentMethod(paymentMethod);
    }

    @Step("User Do Checkout Payment With GoPay")
    public void testConfirmPaymentGopay() {
        action.clickElementScroll(basePurchase.btnPaymentWithGoPay);
    }

    @Step("User Do Checkout Payment With Dana")
    public void testConfirmPaymentDana() {
        action.clickElementScroll(basePurchase.btnPaymentWithDana);
    }

    @Step("User Do Checkout Payment With OVO")
    public void testConfirmPaymentOVO() {
        action.clickElementScroll(basePurchase.btnPaymentWithOVO);
    }

    @Step("User Do Checkout Payment With CC")
    public void testConfirmPaymentCC() {
        action.clickElementScroll(basePurchase.btnPaymentWithCC);
    }

    @Step("User Do Checkout Payment With PermataVA")
    public void testConfirmPermataVA() {
        action.clickElementScroll(basePurchase.btnPaymentWithPermataVA);
    }

    @Step("User Do Checkout Payment With DanamonVA")
    public void testConfirmDanamonVA() {
        action.clickElementScroll(basePurchase.btnPaymentWithDanamonVA);
    }

    @Step("User Do Checkout Payment With MandiriVA")
    public void testConfirmMandiriVA() {
        action.clickElementScroll(basePurchase.btnPaymentWithMandiriVA);
    }

    @Step("User Do Checkout Payment With Alfamart")
    public void testConfirmAlfamart() {
        action.clickElementScroll(basePurchase.btnPaymentWithAlfamart);
    }

    @Step("User Do Order SIM First Time Using Input Number")
    public void testOrderSIM(String mainNumber, String recName, String recPhone, String city,
                             String address, String paymentType) {
        testGoToOrderSIM();
        testChooseNumberByInput(mainNumber);
        testInputAddress(recName, recPhone, city, address);
        action.click(basePurchase.btnDeliveryOption);
        System.out.println(basePurchase.getJNERegAmount());
        action.click(basePurchase.btnSelectDeliveryJNEReg);
        action.click(basePurchase.btnNext);
        basePurchase.selectPayment(paymentType);
//        action.click(basePurchase.btnPay);
//        action.click(basePurchase.btnSeeTrxStats);
    }

    public void testGoToCheckOut(String mainNumber, String recName, String recPhone, String city,
                                 String address) {
        testGoToOrderSIM();
        testChooseNumberByInput(mainNumber);
        testInputAddress(recName, recPhone, city, address);
    }

    public void testAddToCartCustomPlan() {
        action.click(baseHomepage.btnPlan);
        action.click(basePurchase.btnCustomPlan);
    }

    public void testGoToServicePlan(String service) {
        action.click(baseHomepage.btnPlan);
        basePurchase.selectService(service);
    }

    public void testSelectBalancePlan(String bPlan) {
        basePurchase.selectBalancePlan(bPlan);
    }

    public void testSelectCustomPlan(String cPlan) {
        basePurchase.selectCustomPlan(cPlan);
    }

    public void testClickBackFromMixAndMatch() {
        action.click(baseHomepage.btnBack);
    }

    public void testGoToOrderSIM() {
        action.click(baseHomepage.btnLetsSwitch);
        action.click(baseHomepage.btnOrderSIM);
    }

    public void testChooseNumberByInput(String mainNumber) {
        action.click(basePurchase.btnMainNumber);
        basePurchase.clickChooseYourNumber(mainNumber);
        action.sendKeys(basePurchase.inputNumber1, "6");
        action.sendKeys(basePurchase.inputNumber2, "1");
        action.sendKeys(basePurchase.inputNumber3, "0");
        action.sendKeys(basePurchase.inputNumber4, RandomNumber.randomNumber(1));
        action.sendKeys(basePurchase.inputNumber5, RandomNumber.randomNumber(1));
        action.sendKeys(basePurchase.inputNumber6, RandomNumber.randomNumber(1));
        action.click(basePurchase.btnRefresh);
        action.click(basePurchase.btnSelectFilteredNumber);
        action.click(basePurchase.btnNext);
    }

    public void testInputAddress(String recName, String recPhone, String city, String address) {
        action.sendKeys(basePurchase.inputRecipientName, recName);
        action.sendKeys(basePurchase.inputRecipientPhoneNumber, recPhone);
        action.clickElementScroll(basePurchase.btnCityOrDistrict);
        action.inputElementScroll(baseProfile.inputSrcCityOrDistrict, city);
        action.click(baseProfile.btnSelectCityOrDistrict);
        action.inputElementScroll(basePurchase.inputAddressDetail, address);
        action.clickElementScroll(basePurchase.btnGoogleLocation);
        action.click(baseProfile.btnSelectThisLocation);
        action.clickElementScroll(basePurchase.cbTermsAndCondition);
        action.click(basePurchase.btnNext);
        action.click(basePurchase.btnContinue);
    }

    public void testEditAddressCheckout(String mainNumber, String recName, String recPhone, String city,
                                        String address, String upRecName, String upRecPhone, String upCity,
                                        String upAddress) {
        testGoToCheckOut(mainNumber, recName, recPhone, city, address);
        action.click(basePurchase.btnEditAddress);
        testInputAddress(upRecName, upRecPhone, upCity, upAddress);
    }

    public void testEditMDNCheckout(String mainNumber, String recName, String recPhone, String city,
                                    String address, String upMainNumber) {
        testGoToCheckOut(mainNumber, recName, recPhone, city, address);
        action.click(basePurchase.btnEditNumber);
        testChooseNumberByInput(upMainNumber);
    }

    public void testEditCustomPlan() {
        action.clickElementScroll(basePurchase.btnEditCustomPlan);
    }

    public void testBuyCustomPlan() {
        action.click(basePurchase.btnBuy);
    }
}

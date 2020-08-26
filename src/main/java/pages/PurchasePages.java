package pages;

import operation.BaseHomepage;
import operation.BaseProduct;
import operation.BasePurchase;
import utilities.finders.ElementAction;

public class PurchasePages {

    BaseHomepage baseHomepage = new BaseHomepage();
    BaseProduct baseProduct = new BaseProduct();
    BasePurchase basePurchase = new BasePurchase();
    ElementAction action = new ElementAction();

    public void testAddToCartPromoSuperBundle(String productTitle, int increase) throws InterruptedException {
        action.click(baseHomepage.btnBuyPlan);
        action.scrollAndClick(baseProduct.btnPromoSuperBundle);
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        action.countClick(baseProduct.btnIncrease, increase);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
    }

    public void testAddToCartPromoPowerBundle(String productTitle, int increase) throws InterruptedException {
        action.click(baseHomepage.btnBuyPlan);
        action.scrollAndClick(baseProduct.btnPromoPowerBundle);
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        action.countClick(baseProduct.btnIncrease, increase);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
        action.click(basePurchase.btnCloseSeeDetailPurchase);
    }

    public void testAddToCartPromoStandardBundle(String productTitle, int increase, int decrease) throws InterruptedException {
        action.click(baseHomepage.btnBuyPlan);
        action.scrollAndClick(baseProduct.btnPromoStandardBundle);
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        action.countClick(baseProduct.btnIncrease, increase);
        action.countClick(baseProduct.btnDecrease, decrease);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
        action.click(basePurchase.btnCloseSeeDetailPurchase);
    }

    public void testAddToCartPromoLiteBundle(String productTitle, int increase) throws InterruptedException {
        action.click(baseHomepage.btnBuyPlan);
        action.scrollAndClick(baseProduct.btnPromoLiteBundle);
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        action.countClick(baseProduct.btnIncrease, increase);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
        action.click(basePurchase.btnCloseSeeDetailPurchase);
    }

    public void testConfirmPaymentGopay() {
        action.scrollAndClick(basePurchase.btnPaymentWithGoPay);
    }

    public void testConfirmPaymentDana() {
        action.scrollAndClick(basePurchase.btnPaymentWithDana);
    }

    public void testConfirmPaymentOVO() {
        action.scrollAndClick(basePurchase.btnPaymentWithOVO);
    }

    public void testConfirmPaymentCC() {
        action.scrollAndClick(basePurchase.btnPaymentWithCC);
    }

    public void testConfirmPermataVA() {
        action.scrollAndClick(basePurchase.btnPaymentWithPermataVA);
    }

    public void testConfirmDanamonVA() {
        action.scrollAndClick(basePurchase.btnPaymentWithDanamonVA);
    }

    public void testConfirmMandiriVA() {
        action.scrollAndClick(basePurchase.btnPaymentWithMandiriVA);
    }

    public void testConfirmAlfamart() {
        action.scrollAndClick(basePurchase.btnPaymentWithAlfamart);
    }

    public void testOrderSIM(String mainNumber) {
//        basePurchase.clickButtonLetsSwitch();
        basePurchase.clickChooseYourNumber(mainNumber);
    }
}

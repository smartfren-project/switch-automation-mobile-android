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
        action.clickElementScroll(baseProduct.btnPromoSuperBundle);
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        action.countClick(baseProduct.btnIncrease, increase);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
    }

    public void testAddToCartPromoPowerBundle(String productTitle, int increase) throws InterruptedException {
        action.click(baseHomepage.btnBuyPlan);
        action.clickElementScroll(baseProduct.btnPromoPowerBundle);
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

    public void testAddToCartPromoLiteBundle(String productTitle, int increase) throws InterruptedException {
        action.click(baseHomepage.btnBuyPlan);
        action.clickElementScroll(baseProduct.btnPromoLiteBundle);
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        action.countClick(baseProduct.btnIncrease, increase);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
        action.click(basePurchase.btnCloseSeeDetailPurchase);
    }

    public void testConfirmPaymentGopay() {
        action.clickElementScroll(basePurchase.btnPaymentWithGoPay);
    }

    public void testConfirmPaymentDana() {
        action.clickElementScroll(basePurchase.btnPaymentWithDana);
    }

    public void testConfirmPaymentOVO() {
        action.clickElementScroll(basePurchase.btnPaymentWithOVO);
    }

    public void testConfirmPaymentCC() {
        action.clickElementScroll(basePurchase.btnPaymentWithCC);
    }

    public void testConfirmPermataVA() {
        action.clickElementScroll(basePurchase.btnPaymentWithPermataVA);
    }

    public void testConfirmDanamonVA() {
        action.clickElementScroll(basePurchase.btnPaymentWithDanamonVA);
    }

    public void testConfirmMandiriVA() {
        action.clickElementScroll(basePurchase.btnPaymentWithMandiriVA);
    }

    public void testConfirmAlfamart() {
        action.clickElementScroll(basePurchase.btnPaymentWithAlfamart);
    }

    public void testOrderSIM(String mainNumber) {
//        basePurchase.clickButtonLetsSwitch();
        basePurchase.clickChooseYourNumber(mainNumber);
    }
}

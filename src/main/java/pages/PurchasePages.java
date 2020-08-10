package pages;

import operation.BaseHomepage;
import operation.BaseProduct;
import operation.BasePurchase;

public class PurchasePages {

    BaseHomepage baseHomepage = new BaseHomepage();
    BaseProduct baseProduct = new BaseProduct();
    BasePurchase basePurchase = new BasePurchase();

    public void testAddToCartPromoSuperBundle(String productTitle) throws InterruptedException {
        baseHomepage.clickButtonBuyProduct();
        Thread.sleep(2000);
        baseProduct.clickDetailPromoSuperBundle();
        baseProduct.checkProductTitle(productTitle);
        basePurchase.clickButtonAddToCart();
        basePurchase.clickButtonConfirmBuy();
    }

    public void testAddToCartPromoSuperBundleMax(String productTitle, int increase) throws InterruptedException {
        baseHomepage.clickButtonBuyProduct();
        Thread.sleep(2000);
        baseProduct.clickDetailPromoSuperBundle();
        baseProduct.checkProductTitle(productTitle);
        basePurchase.clickButtonIncreaseCountProduct(increase);
        basePurchase.clickButtonAddToCart();
        basePurchase.clickButtonConfirmBuy();
    }

    public void testAddToCartPromoSuperBundleMin(String productTitle, int increase, int decrease) throws InterruptedException {
        baseHomepage.clickButtonBuyProduct();
        Thread.sleep(2000);
        baseProduct.clickDetailPromoSuperBundle();
        baseProduct.checkProductTitle(productTitle);
        basePurchase.clickButtonIncreaseCountProduct(increase);
        Thread.sleep(2000);
        basePurchase.clickButtonDecreaseCountProduct(decrease);
        basePurchase.clickButtonAddToCart();
        basePurchase.clickButtonConfirmBuy();
    }

    public void testAddToCartPromoPowerBundle(String productTitle) throws InterruptedException {
        baseHomepage.clickButtonBuyProduct();
        baseProduct.clickDetailPromoPowerBundle();
        baseProduct.checkProductTitle(productTitle);
        Thread.sleep(3000);
        basePurchase.clickButtonAddToCart();
        basePurchase.clickButtonConfirmBuy();
    }

    public void testAddToCartPromoStandardBundle(String productTitle) throws InterruptedException {
        baseHomepage.clickButtonBuyProduct();
        baseProduct.clickDetailPromoStandardBundle();
        baseProduct.checkProductTitle(productTitle);
        Thread.sleep(3000);
        basePurchase.clickButtonAddToCart();
        basePurchase.clickButtonConfirmBuy();
    }

    public void testConfirmPaymentGopay() {
        basePurchase.clickButtonChooseGoPay();
    }

    public void testConfirmPaymentDana() {
        basePurchase.clickButtonChooseDana();
    }

    public void testConfirmPaymentOVO() {
        basePurchase.clickButtonChooseOVO();
    }

    public void testConfirmPaymentCC() {
        basePurchase.clickButtonChooseCC();
    }

    public void testConfirmPermataVA() {
        basePurchase.clickButtonChoosePermataVA();
    }

    public void testConfirmDanamonVA() {
        basePurchase.clickButtonChooseDanamonVA();
    }

    public void testConfirmMandiriVA() {
        basePurchase.clickButtonChooseMandiriVA();
    }

    public void testConfirmAlfamart() {
        basePurchase.clickButtonChooseAlfamart();
    }
}

package operation;

import constants.ObjectElement;
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

    public void testAddToCartPromoSuperBundle(String productTitle) throws InterruptedException {
        baseHomepage.clickButtonBuyProduct();
        Thread.sleep(2000);
        baseProduct.clickDetailPromoSuperBundle();
        baseProduct.checkProductTitle(productTitle);
        clickButtonAddToCart();
        clickButtonConfirmBuy();
    }

    public void testAddToCartPromoSuperBundleMax(String productTitle, int increase) throws InterruptedException {
        baseHomepage.clickButtonBuyProduct();
        Thread.sleep(2000);
        baseProduct.clickDetailPromoSuperBundle();
        baseProduct.checkProductTitle(productTitle);
        clickButtonIncreaseCountProduct(increase);
        clickButtonAddToCart();
        clickButtonConfirmBuy();
    }

    public void testAddToCartPromoSuperBundleMin(String productTitle, int increase, int decrease) throws InterruptedException {
        baseHomepage.clickButtonBuyProduct();
        Thread.sleep(2000);
        baseProduct.clickDetailPromoSuperBundle();
        baseProduct.checkProductTitle(productTitle);
        clickButtonIncreaseCountProduct(increase);
        Thread.sleep(2000);
        clickButtonDecreaseCountProduct(decrease);
        clickButtonAddToCart();
        clickButtonConfirmBuy();
    }

    public void testAddToCartPromoPowerBundle(String productTitle) throws InterruptedException {
        baseHomepage.clickButtonBuyProduct();
        baseProduct.clickDetailPromoPowerBundle();
        baseProduct.checkProductTitle(productTitle);
        Thread.sleep(3000);
        clickButtonAddToCart();
        clickButtonConfirmBuy();
    }

    public void testAddToCartPromoStandardBundle(String productTitle) throws InterruptedException {
        baseHomepage.clickButtonBuyProduct();
        baseProduct.clickDetailPromoStandardBundle();
        baseProduct.checkProductTitle(productTitle);
        Thread.sleep(3000);
        clickButtonAddToCart();
        clickButtonConfirmBuy();
    }
}

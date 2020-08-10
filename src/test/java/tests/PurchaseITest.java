package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.PurchasePages;

@Listeners({TestAllureListener.class})
public class PurchaseITest extends TestSetup {
    PurchasePages purchasePages = new PurchasePages();
    LoginITest login = new LoginITest();

    @Test(priority = 351,description = "Switch_Purchase_001 - User able to Add Product Super Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddSuperBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundle("Super Bundle");
    }

    @Test(priority = 352, description = "Switch_Purchase_002 - User able to Add Product Power Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddPowerBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoPowerBundle("Power Bundle");
    }

    @Test(priority = 353, description = "Switch_Purchase_003 - User able to Add Product Standard Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddStandardBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoStandardBundle("Standard Bundle");
    }

    @Test(priority = 354, description = "Switch_Purchase_004 - User able to Add Product Super Bundle To Cart With Max 5")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddPowerBundleToCartMax() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundleMax("Super Bundle", 4);
    }

    @Test(priority = 355, description = "Switch_Purchase_005 - User able to Pay Choose GoPay")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using GoPay.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseGoPay() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundleMax("Super Bundle", 1);
        purchasePages.testConfirmPaymentGopay();
    }
    @Test(priority = 356, description = "Switch_Purchase_006 - User able to Pay Choose OVO")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using OVO.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseOvo() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundleMax("Super Bundle", 2);
        purchasePages.testConfirmPaymentOVO();
    }
    @Test(priority = 357, description = "Switch_Purchase_007 - User able to Pay Choose Dana")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Dana.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseDana() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundleMax("Super Bundle", 1);
        purchasePages.testConfirmPaymentDana();
    }
    @Test(priority = 358, description = "Switch_Purchase_008 - User able to Pay Choose Credit Card")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Credit Card.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseCreditCard() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundleMax("Super Bundle", 1);
        purchasePages.testConfirmPaymentCC();
    }
    @Test(priority = 359, description = "Switch_Purchase_009 - User able to Pay Choose Mandiri VA")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Mandiri VA.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseMandiriVA() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundleMax("Super Bundle", 2);
        purchasePages.testConfirmMandiriVA();
    }
    @Test(priority = 360, description = "Switch_Purchase_010 - User able to Pay Choose Danamon VA")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Danamon VA.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseDanamonVA() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundleMax("Super Bundle", 1);
        purchasePages.testConfirmDanamonVA();
    }
    @Test(priority = 361, description = "Switch_Purchase_011 - User able to Pay Choose Permata VA")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Permata VA.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUsePermataVA() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundleMax("Super Bundle", 1);
        purchasePages.testConfirmPermataVA();
    }
    @Test(priority = 362, description = "Switch_Purchase_012 - User able to Pay Choose Alfamart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Alfamart.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseAlfamart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundleMax("Super Bundle", 2);
        purchasePages.testConfirmAlfamart();
    }
}

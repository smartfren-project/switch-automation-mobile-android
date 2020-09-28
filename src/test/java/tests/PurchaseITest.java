package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.PurchasePages;

@Listeners({TestAllureListener.class})
public class PurchaseITest extends TestSetup {
    PurchasePages purchasePages = new PurchasePages();
    LoginITest login = new LoginITest();

    @Test(priority = 101,description = "Switch_Purchase_001 - User able to Add Product Super Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddSuperBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundle("Super Bundle", 2);
    }

    @Test(priority = 102, description = "Switch_Purchase_002 - User able to Add Product Power Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddPowerBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoPowerBundle("Power Bundle", 2);
    }

    @Test(priority = 103, description = "Switch_Purchase_003 - User able to Add Product Standard Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddStandardBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoStandardBundle("Standard Bundle", 4, 2);
    }

    @Test(priority = 104, description = "Switch_Purchase_004 - User able to Add Product Lite Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddLiteBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bundle", 3);
    }

    @Test(priority = 105, description = "Switch_Purchase_005 - User can Verify Payment Screen")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that user can see Payment Screen")
    @Story("Story Name : Check Purchase")
    public void checkSeePaymentScreen() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bundle", 2);
//        login.checkValidLoginUsingEmail();
//        purchasePages.testOrderSIM("0889-07");
    }

    @Test(priority = 106, description = "Switch_Purchase_006 - User able to Pay Choose GoPay")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using GoPay.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseGoPay() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bundle", 1);
        purchasePages.testConfirmPaymentGopay();
        Thread.sleep(3500);
    }

    @Test(priority = 107, description = "Switch_Purchase_007 - User able to Pay Choose OVO")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using OVO.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseOvo() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bundle", 2);
        purchasePages.testConfirmPaymentOVO();
    }
    @Test(priority = 108, description = "Switch_Purchase_008 - User able to Pay Choose Dana")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Dana.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseDana() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bundle", 1);
        purchasePages.testConfirmPaymentDana();
    }
    @Test(priority = 109, description = "Switch_Purchase_009 - User able to Pay Choose Credit Card")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Credit Card.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseCreditCard() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bundle", 1);
        purchasePages.testConfirmPaymentCC();
    }
    @Test(priority = 110, description = "Switch_Purchase_010 - User able to Pay Choose Mandiri VA")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Mandiri VA.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseMandiriVA() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bundle", 2);
        purchasePages.testConfirmMandiriVA();
    }
    @Test(priority = 111, description = "Switch_Purchase_011 - User able to Pay Choose Danamon VA")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Danamon VA.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseDanamonVA() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bundle", 1);
        purchasePages.testConfirmDanamonVA();
    }
    @Test(priority = 112, description = "Switch_Purchase_012 - User able to Pay Choose Permata VA")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Permata VA.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUsePermataVA() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bundle", 1);
        purchasePages.testConfirmPermataVA();
    }
    @Test(priority = 113, description = "Switch_Purchase_013 - User able to Pay Choose Alfamart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Alfamart.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseAlfamart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bundle", 2);
        purchasePages.testConfirmAlfamart();
    }

    @Test(priority = 114, description = "Switch_Purchase_014 - User able to Order SIM First Time GoPay")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Order SIM First Time.")
    @Story("Story Name : Check Purchase")
    public void checkPurchaseSIMFirstTimeGoPay() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "GoPay");
    }

    @Test(priority = 115, description = "Switch_Purchase_015 - User able to Order SIM First Time DANA")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Order SIM First Time.")
    @Story("Story Name : Check Purchase")
    public void checkPurchaseSIMFirstTimeDANA() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "DANA");
    }

    @Test(priority = 116, description = "Switch_Purchase_016 - User able to Order SIM First Time OVO")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Order SIM First Time.")
    @Story("Story Name : Check Purchase")
    public void checkPurchaseSIMFirstTimeOVO() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "OVO");
    }

    @Test(priority = 117, description = "Switch_Purchase_017 - User able to Order SIM First Time CC")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Order SIM First Time.")
    @Story("Story Name : Check Purchase")
    public void checkPurchaseSIMFirstTimeCC() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "CC");
    }

    @Test(priority = 118, description = "Switch_Purchase_018 - User able to Max Qty Product Power Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddMaxPowerBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoPowerBundle("Power Bundle", 4);
    }

    @Test(priority = 119, description = "Switch_Purchase_019 - User able to Cancel Order by Decrease Product Standard Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkCancelOrderStandardBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoStandardBundle("Standard Bundle", 4, 4);
    }
}

package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import operation.BaseProduct;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.PurchasePages;
import utilities.finders.ElementAction;

@Listeners({TestAllureListener.class})
public class PurchaseITest extends TestSetup {
    PurchasePages purchasePages = new PurchasePages();
    LoginITest login = new LoginITest();
    ElementAction action = new ElementAction();
    BaseProduct baseProduct = new BaseProduct();

    @Test(priority = 101,description = "Switch_Purchase_001 - User able to Add Product Super Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddSuperBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoSuperBundle("Super Bar", 2);
    }

    @Test(priority = 102, description = "Switch_Purchase_002 - User able to Add Product Power Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddPowerBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoPowerBundle("Power Bar", 2);
    }

    @Test(priority = 103, description = "Switch_Purchase_003 - User able to Add Product Standard Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddStandardBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoStandardBundle("Standard Bar", 4, 2);
    }

    @Test(priority = 104, description = "Switch_Purchase_004 - User able to Add Product Lite Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddLiteBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 3);
    }

    @Test(priority = 105, description = "Switch_Purchase_005 - User can Verify Payment Screen")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that user can see Payment Screen")
    @Story("Story Name : Check Purchase")
    public void checkSeePaymentScreen() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 2);
//        login.checkValidLoginUsingEmail();
//        purchasePages.testOrderSIM("0889-07");
    }

    @Test(priority = 106, description = "Switch_Purchase_006 - User able to Pay Choose GoPay")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using GoPay.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseGoPay() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 1);
        purchasePages.testConfirmPaymentMethod("GoPay");
        Thread.sleep(3500);
    }

    @Test(priority = 107, description = "Switch_Purchase_007 - User able to Pay Choose OVO")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using OVO.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseOvo() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 2);
        purchasePages.testConfirmPaymentMethod("OVO");
    }

    @Test(priority = 108, description = "Switch_Purchase_008 - User able to Pay Choose Dana")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Dana.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseDana() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 1);
        purchasePages.testConfirmPaymentMethod("Dana");
    }

    @Test(priority = 109, description = "Switch_Purchase_009 - User able to Pay Choose Credit Card")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Credit Card.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseCreditCard() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 1);
        purchasePages.testConfirmPaymentMethod("CC");
    }

    @Test(priority = 110, description = "Switch_Purchase_010 - User able to Pay Choose Mandiri VA")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Mandiri VA.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseMandiriVA() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 2);
        purchasePages.testConfirmPaymentMethod("MandiriVA");
    }

    @Test(priority = 111, description = "Switch_Purchase_011 - User able to Pay Choose Danamon VA")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Danamon VA.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseDanamonVA() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 1);
        purchasePages.testConfirmPaymentMethod("DanamonVA");
    }

    @Test(priority = 112, description = "Switch_Purchase_012 - User able to Pay Choose Permata VA")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Permata VA.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUsePermataVA() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 1);
        purchasePages.testConfirmPaymentMethod("PermataVA");
    }

    @Test(priority = 113, description = "Switch_Purchase_013 - User able to Pay Choose Alfamart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using Alfamart.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseAlfamart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 2);
        purchasePages.testConfirmPaymentMethod("Alfamart");
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
        purchasePages.testAddToCartPromoStandardBundle("Standard Bar", 4, 4);
    }

    @Test(priority = 120, description = "Switch_Purchase_020 - User able to do custom plan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can custom the plan.")
    @Story("Story Name : Check Purchase")
    public void checkOrderCustomPlan() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartCustomPlan();
    }

    @Test(priority = 121, description = "Switch_Purchase_021 - User able go to Add On Service")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can go to Add On Service.")
    @Story("Story Name : Check Purchase")
    public void checkOrderAddOnService() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testGoToServicePlan("AddOn");
    }

    @Test(priority = 122, description = "Switch_Purchase_022 - User able go to Balance Plan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can go to Balance Plan Service.")
    @Story("Story Name : Check Purchase")
    public void checkOrderBalancePlanService() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testGoToServicePlan("BalancePlan");
    }

    @Test(priority = 123, description = "Switch_Purchase_023 - User able to go to Roaming Service")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can go to Roaming Service.")
    @Story("Story Name : Check Purchase")
    public void checkOrderRoamingService() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testGoToServicePlan("Roaming");
    }

    @Test(priority = 124, description = "Switch_Purchase_024 - User able to add Token 100 to cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can add token 100 to cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddToken100ToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testGoToServicePlan("BalancePlan");
        purchasePages.testSelectBalancePlan("Token100");
    }

    @Test(priority = 125, description = "Switch_Purchase_025 - User able to add Token 50 to cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can add token 50 to cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddToken50ToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testGoToServicePlan("BalancePlan");
        purchasePages.testSelectBalancePlan("Token50");
    }

    @Test(priority = 126, description = "Switch_Purchase_026 - User able to add Token 20 to cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can add token 20 to cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddToken20ToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testGoToServicePlan("BalancePlan");
        purchasePages.testSelectBalancePlan("Token20");
    }

    @Test(priority = 127, description = "Switch_Purchase_027 - User able to add Token 10 to cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can add token 10 to cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddToken10ToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testGoToServicePlan("BalancePlan");
        purchasePages.testSelectBalancePlan("Token10");
    }

    @Test(priority = 128, description = "Switch_Purchase_028 - User can increase cart amount")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can increase amount token.")
    @Story("Story Name : Check Purchase")
    public void checkIncreaseAddToken10ToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testGoToServicePlan("BalancePlan");
        purchasePages.testSelectBalancePlan("Token10");
        action.countClick(baseProduct.btnIncrease, 4);
    }

    @Test(priority = 129, description = "Switch_Purchase_029 - User can decrease cart amount")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can decrease amount token.")
    @Story("Story Name : Check Purchase")
    public void checkDecreaseAddToken10ToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testGoToServicePlan("BalancePlan");
        purchasePages.testSelectBalancePlan("Token10");
        action.countClick(baseProduct.btnIncrease, 4);
        action.countClick(baseProduct.btnDecrease, 2);
    }

    @Test(priority = 131, description = "Switch_Purchase_030 - User able to Pay Choose CC JCB")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using CC JCB.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePlanWithCCJCB() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 1);
        purchasePages.testConfirmPaymentMethod("CC-JCB");
    }

    @Test(priority = 130, description = "Switch_Purchase_031 - User can buy Token using Go Pay")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can buy token using go pay.")
    @Story("Story Name : Check Purchase")
    public void checkBuyTokenUsingGoPay() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartCustomPlan();
        purchasePages.testSelectBalancePlan("Token10");
    }

    @Test(priority = 131, description = "Switch_Purchase_032 - User able to Pay Choose ShopeePay")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using ShopeePay.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseShopeePay() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 2);
        purchasePages.testConfirmPaymentMethod("ShopeePay");
    }

    @Test(priority = 132, description = "Switch_Purchase_031 - User can buy Token using OVO")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can buy token using OVO.")
    @Story("Story Name : Check Purchase")
    public void checkBuyTokenUsingOVO() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartCustomPlan();
        purchasePages.testSelectBalancePlan("Token10");
    }
}

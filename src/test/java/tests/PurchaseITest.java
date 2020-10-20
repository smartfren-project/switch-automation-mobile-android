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
    HomepageITest homepage = new HomepageITest();

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

    @Test(priority = 118, description = "Switch_Purchase_018 - User able to Max Qty Product Power Bar To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddMaxPowerBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoPowerBundle("Power Bar", 4);
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

    @Test(priority = 130, description = "Switch_Purchase_030 - User able to Pay Choose CC JCB")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using CC JCB.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePlanWithCCJCB() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 1);
        purchasePages.testConfirmPaymentMethod("CC-JCB");
    }

    @Test(priority = 131, description = "Switch_Purchase_031 - User can buy Token using Go Pay")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can buy token using go pay.")
    @Story("Story Name : Check Purchase")
    public void checkBuyTokenUsingGoPay() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartCustomPlan();
        purchasePages.testSelectBalancePlan("Token10");
    }

    @Test(priority = 132, description = "Switch_Purchase_032 - User able to Pay Choose ShopeePay")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Pay using ShopeePay.")
    @Story("Story Name : Check Purchase")
    public void checkPurchasePowerBundleUseShopeePay() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 2);
        purchasePages.testConfirmPaymentMethod("ShopeePay");
    }

    @Test(priority = 133, description = "Switch_Purchase_033 - User can buy Token using OVO")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can buy token using OVO.")
    @Story("Story Name : Check Purchase")
    public void checkBuyTokenUsingOVO() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartCustomPlan();
        purchasePages.testSelectBalancePlan("Token10");
    }

    @Test(priority = 134, description = "Switch_Purchase_034 - User can buy Token using OVO")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can buy token using OVO.")
    @Story("Story Name : Check Purchase")
    public void checkServicePlanContent() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testGoToServicePlan("BalancePlan");
        purchasePages.testGoToServicePlan("Roaming");
        purchasePages.testGoToServicePlan("AddOn");
    }

    @Test(priority = 135, description = "Switch_Purchase_035 - Check change selected custom plan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can change selected custom plan.")
    @Story("Story Name : Check Purchase")
    public void checkChangeSelectedCustomPlan() throws InterruptedException {
        homepage.checkMixAndMax();
        purchasePages.testSelectCustomPlan("Influencer");
        purchasePages.testSelectCustomPlan("Movie Mania");
        purchasePages.testSelectCustomPlan("Influencer");
    }

    @Test(priority = 136, description = "Switch_Purchase_036 - Go Back From Mix And Match")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can go back from mix and match.")
    @Story("Story Name : Check Purchase")
    public void checkGoBackFromMixAndMatch() throws InterruptedException {
        homepage.checkMixAndMax();
        purchasePages.testClickBackFromMixAndMatch();
    }

    @Test(priority = 137, description = "Switch_Purchase_037 - Check buy Influencer Custom Plan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can buy Influencer Custom Plan.")
    @Story("Story Name : Check Purchase")
    public void checkBuyInfluencerCustomPlan() throws InterruptedException {
        homepage.checkMixAndMax();
        purchasePages.testSelectCustomPlan("Influencer");
        purchasePages.testBuyCustomPlan();
    }

    @Test(priority = 138, description = "Switch_Purchase_038 - Check edit Influencer Custom Plan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can edit Influencer Custom Plan.")
    @Story("Story Name : Check Purchase")
    public void checkEditInfluencerCustomPlan() throws InterruptedException {
        homepage.checkMixAndMax();
        purchasePages.testSelectCustomPlan("Influencer");
        purchasePages.testEditCustomPlan();
    }

    @Test(priority = 139, description = "Switch_Purchase_039 - Check cancel Influencer Custom Plan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can cancel Influencer Custom Plan.")
    @Story("Story Name : Check Purchase")
    public void checkCancelInfluencerCustomPlan() throws InterruptedException {
        homepage.checkMixAndMax();
        purchasePages.testSelectCustomPlan("Influencer");
        purchasePages.testClickBackFromMixAndMatch();
    }

    @Test(priority = 140, description = "Switch_Purchase_040 - Check Slide Quota and Call Influencer Custom Plan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can Slide Quota and Call Influencer Custom Plan.")
    @Story("Story Name : Check Purchase")
    public void checkSlideQuotaAndCallInfluencerCustomPlan() throws InterruptedException {
        homepage.checkMixAndMax();
        purchasePages.testSelectCustomPlan("Influencer");
    }

    @Test(priority = 141, description = "Switch_Purchase_041 - User able to Order SIM First Time")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Order SIM First Time.")
    @Story("Story Name : Check Purchase")
    public void checkPurchaseSIMFirstTime() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "GoPay");
    }

    @Test(priority = 142, description = "Switch_Purchase_042 - User able to Fill Delivery Address Order SIM")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Fill Delivery Address Order SIM First Time.")
    @Story("Story Name : Check Purchase")
    public void checkDeliveryAddress() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "GoPay");
    }

    @Test(priority = 143, description = "Switch_Purchase_043 - User able to Fill Address Without Drop PIN")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Fill Delivery Address Without Drop PIN.")
    @Story("Story Name : Check Purchase")
    public void checkInputAddressNotSelectDropPin() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "GoPay");
    }

    @Test(priority = 144, description = "Switch_Purchase_044 - User able to Fill Address With Drop PIN")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Fill Delivery Address Drop PIN.")
    @Story("Story Name : Check Purchase")
    public void checkInputAddressSelectDropPin() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "GoPay");
    }

    @Test(priority = 145, description = "Switch_Purchase_045 - User unable to Fill Invalid Address")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user unable to Fill Invalid Delivery Address.")
    @Story("Story Name : Check Purchase")
    public void checkInputInvalidAddress() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "GoPay");
    }

    @Test(priority = 146, description = "Switch_Purchase_046 - User able to Edit Address On Checkout Page")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that User able to Edit Address On Checkout Page.")
    @Story("Story Name : Check Purchase")
    public void checkEditAddressOnCheckoutPage() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testEditAddressCheckout("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "Yadi", "08881850440",
                "pasirtangkil", "JL. PasirTangkil");
    }

    @Test(priority = 147, description = "Switch_Purchase_047 - User able to Edit MDN On Checkout Page")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that User able to Edit Address On Checkout Page.")
    @Story("Story Name : Check Purchase")
    public void checkEditMDNOnCheckoutPage() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testEditMDNCheckout("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "0889-08");
    }

    @Test(priority = 148, description = "Switch_Purchase_048 - User able to Check Terms and Condition Address Page")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that User able to Check Terms and Condition On Address Page.")
    @Story("Story Name : Check Purchase")
    public void checkTermsAndConditionAddressPage() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testGoToOrderSIM();
        purchasePages.testChooseNumberByInput("0889-07");
        purchasePages.testInputAddress("Andi", "088906011294",
                "pringgodani", "JL. Pringgodani");
    }

    @Test(priority = 149, description = "Switch_Purchase_049 - User able to Pre Filled Cancelled Order SIM")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that User able to Pre Filled Re Order SIM.")
    @Story("Story Name : Check Purchase")
    public void checkPreFilledCancelledOrderSIM() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testGoToOrderSIM();
        purchasePages.testChooseNumberByInput("0889-07");
    }

    @Test(priority = 150, description = "Switch_Purchase_050 - User able to Pre Filled Cancelled Order SIM Profile Address")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that User able to Pre Filled Re Order SIM Address Profile.")
    @Story("Story Name : Check Purchase")
    public void checkPreFilledCancelledOrderSIMAddressProfile() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "GoPay");
    }

    @Test(priority = 151, description = "Switch_Purchase_051 - User able to Pre Filled Cancelled Order SIM Profile Address")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that User able to Pre Filled Re Order SIM Address Profile.")
    @Story("Story Name : Check Purchase")
    public void checkCancelOrderSIMPayment() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "GoPay");
        purchasePages.testClickButtonCancel();
    }

    @Test(priority = 152, description = "Switch_Purchase_052 - User able click Continue ")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that User able to Pre Filled Re Order SIM Address Profile.")
    @Story("Story Name : Check Purchase")
    public void checkContinueOrderSIMPayment() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        purchasePages.testOrderSIM("0889-07", "Andi", "088906011294",
                "pringgodani", "JL. Pringgodani", "GoPay");
        purchasePages.testClickButtonContinue();
    }

    @Test(priority = 153, description = "Switch_Purchase_053 - User able to Pay Choose Credit Card With Doku Payment Gateway")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can pay using CC with Doku Payment Gateway.")
    @Story("Story Name : Check Purchase")
    public void checkDokuPaymentGateway() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        purchasePages.testAddToCartPromoLiteBundle("Lite Bar", 1);
        purchasePages.testConfirmPaymentMethod("CC");
    }
}

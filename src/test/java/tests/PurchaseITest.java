package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import operation.BasePurchase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestAllureListener.class})
public class PurchaseITest extends TestSetup {
    BasePurchase basePurchase = new BasePurchase();
    LoginITest login = new LoginITest();

    @Test(priority = 23, description = "Switch_Purchase_001 - User able to Add Product Super Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddSuperBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        basePurchase.testAddToCartPromoSuperBundle("Super Bundle");
    }

    @Test(priority = 24, description = "Switch_Purchase_002 - User able to Add Product Power Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddPowerBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        basePurchase.testAddToCartPromoPowerBundle("Power Bundle");
    }

    @Test(priority = 35, description = "Switch_Purchase_003 - User able to Add Product Standard Bundle To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddStandardBundleToCart() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        basePurchase.testAddToCartPromoStandardBundle("Standard Bundle");
    }

    @Test(priority = 27, description = "Switch_Purchase_004 - User able to Add Product Super Bundle To Cart With Max 5")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success Add Product To Cart.")
    @Story("Story Name : Check Purchase")
    public void checkAddPowerBundleToCartMax() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        basePurchase.testAddToCartPromoSuperBundleMax("Super Bundle", 4);
    }
}

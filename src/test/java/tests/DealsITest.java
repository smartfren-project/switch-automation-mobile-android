package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.DealsPages;

@Listeners({TestAllureListener.class})
public class DealsITest extends TestSetup {
    LoginITest login = new LoginITest();
    DealsPages dealsPages = new DealsPages();

    @Test(priority = 151, description = "Switch_Deals_001 - User able to see all SPECIAL DEALS Menu Page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to see All SPECIAL DEALS by Clicking on See All DEALS Menu.")
    @Story("Story Name : Check On Deals Page")
    public void checkSeeAllSpecialDeals() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        dealsPages.testCheckVoucherList();
    }

    @Test(priority = 152, description = "Switch_Deals_002 - User able to see all POINTS on POINT Page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to see All POINTS by Clicking on See POINT Menu.")
    @Story("Story Name : Check On Point Page")
    public void checkSeePointsValue() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        dealsPages.testCheckPointsValue();
    }

    @Test(priority = 153, description = "Switch_Deals_003 - User able to see all RUBIES on RUBY Page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to see All RUBIES by Clicking on See RUBY Menu.")
    @Story("Story Name : Check On Ruby Page")
    public void checkSeeRubiesValue() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        dealsPages.testCheckRubyValue();
    }

    @Test(priority = 154, description = "Switch_Deals_004 - User able to buy Voucher using Points and Rubies")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to buy Voucher using RUBIES and POINTS by Clicking on Voucher Product.")
    @Story("Story Name : Check On Deals Page")
    public void checkBuyVoucherUsingRubyAndPoints() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        dealsPages.testBuyVoucherUsingRubyAndPoint();
    }

    @Test(priority = 155, description = "Switch_Deals_005 - User able to buy Voucher using Points")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to buy Voucher using RUBIES or POINTS by Clicking on Voucher Product.")
    @Story("Story Name : Check On Deals Page")
    public void checkBuyVoucherUsingPoints() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        dealsPages.testBuyVoucherUsingRubyOrPoint();
    }

    @Test(priority = 156, description = "Switch_Deals_006 - User able to buy Voucher using Rubies")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to buy Voucher using RUBIES or POINTS by Clicking on Voucher Product.")
    @Story("Story Name : Check On Deals Page")
    public void checkBuyVoucherUsingRubies() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        dealsPages.testBuyVoucherUsingRubyOrPoint();
    }

    @Test(priority = 157, description = "Switch_Deals_007 - User unable to buy Voucher using less Points")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is unable to buy Voucher using less POINTS by Clicking on Voucher Product.")
    @Story("Story Name : Check On Deals Page")
    public void checkBuyVoucherUsingPointsWithInsufficientBalance() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        dealsPages.testBuyVoucherUsingRubyOrPoint();
    }

    @Test(priority = 158, description = "Switch_Deals_008 - User unable to buy Voucher using less Rubies")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is unable to buy Voucher using less RUBIES by Clicking on Voucher Product.")
    @Story("Story Name : Check On Deals Page")
    public void checkBuyVoucherUsingRubiesWithInsufficientBalance() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        dealsPages.testBuyVoucherUsingRubyOrPoint();
    }
}

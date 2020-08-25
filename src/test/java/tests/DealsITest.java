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
}

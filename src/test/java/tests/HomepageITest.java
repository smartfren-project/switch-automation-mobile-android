package tests;

import constants.BaseData;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import operation.BaseHomepage;
import org.testng.annotations.*;

@Listeners({TestAllureListener.class})
public class HomepageITest extends TestSetup {

    BaseHomepage baseHomepage = new BaseHomepage();

    @Test(priority = 18, description = "Switch_Home_001 - User able to go to All Menu Page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to All Menu Page by Clicking on Any Available Main Menu.")
    @Story("Story Name : Check On Home Page")
    public void checkGoToSignUpPage() throws InterruptedException {
        baseHomepage.testUserCanMoveToMainMenuPage(BaseData.Login.EMAIL_ID, BaseData.Login.PIN);
    }
}

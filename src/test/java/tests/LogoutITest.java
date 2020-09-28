package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import operation.BaseLogin;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ProfilePages;
import utilities.finders.ElementAction;

@Listeners({TestAllureListener.class})
public class LogoutITest extends TestSetup {
    LoginITest login = new LoginITest();
    ProfilePages profilePages = new ProfilePages();
    ElementAction action = new ElementAction();
    BaseLogin baseLogin = new BaseLogin();

    @Test(priority = 62, description = "Switch_Profile_001 - User able to LOGOUT and go back to PIN Page")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success logout from profile menu.")
    @Story("Story Name : Check Credential")
    public void checkValidLogout() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testValidLogout();
    }

    @Test(priority = 63, description = "Switch_Profile_001 - User able to LOGOUT and go back to HomePage")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success logout from profile menu and go back to HomePage.")
    @Story("Story Name : Check Credential")
    public void checkValidLogoutEnterPin() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testValidLogout();
        action.sendKeys(baseLogin.inputPIN, "111111");
    }
}

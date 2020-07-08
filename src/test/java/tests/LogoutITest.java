package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import operation.BaseLogin;
import operation.BaseLogout;
import org.testng.annotations.*;

import java.net.MalformedURLException;

@Listeners({TestAllureListener.class})
public class LogoutITest extends BaseLogout {

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        launchAppSwitch();
    }

    @Test(priority = 9, description = "Switch_Profile_001 - User able to LOGOUT and go back to PIN Page")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success logout from profile menu.")
    @Story("Story Name : Check Credential")
    public void checkValidLogout() throws InterruptedException {
        testValidLogout();
    }

    @AfterMethod
    public void closeAppSwitch() throws InterruptedException {
        driver.resetApp();
    }
}

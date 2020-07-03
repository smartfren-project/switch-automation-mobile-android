package Runner;

import operation.BaseLogin;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class LoginITest extends BaseLogin {

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        launchAppSwitch();
    }

    @Test(priority = 1, description = "User able to pass HOMEPAGE from VALID LOGIN")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Successfully Using Valid Email and Password")
    @Story("Story Name : Check Credential")
    public void checkValidLogin() throws InterruptedException {
        testValidLogin();
    }

    @Test(priority = 2, description = "User unable to pass HOMEPAGE from INVALID LOGIN")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Go To Homepage Unsuccessfully Using Invalid Email")
    @Story("Story Name : Check Credential")
    public void checkInvalidEmail() throws InterruptedException {
        testInvalidEmailLogin();
    }

    @AfterSuite
    public void closeApp() {
        testCloseAppSwitch();
    }
}

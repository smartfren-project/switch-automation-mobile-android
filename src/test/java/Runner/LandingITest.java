package Runner;

import Operation.BaseLanding;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LandingITest extends BaseLanding {
    @BeforeSuite
    public void setUp() throws MalformedURLException {
        launchAppSwitch();
    }

    @Test(priority = 1, description = "User able to go to LOGIN PAGE")
    @Severity(SeverityLevel.NORMAL)
    @Description("Go To Login Page")
    @Story("Story Name : Check On Landing Page")
    public void checkGoToLoginPage() {
        testGoToLoginPage();
    }

    @Test(priority = 2, description = "User able to login as GUEST")
    @Severity(SeverityLevel.NORMAL)
    @Description("Go To Homepage As Guest")
    @Story("Story Name : Check On Landing Page")
    public void checkLoginAsGuest() {
        testLoginAsGuest();
    }

    @Test(priority = 3, description = "User able to go to REGISTER PAGE")
    @Severity(SeverityLevel.NORMAL)
    @Description("Go To Register Page")
    @Story("Story Name : Check On Landing Page")
    public void checkGoToSignUpPage() throws InterruptedException {
        testGoToSignUpPage();
    }

    @AfterSuite
    public void closeApp() {
        testCloseAppSwitch();
    }
}

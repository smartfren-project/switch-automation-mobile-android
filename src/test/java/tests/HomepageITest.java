package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import operation.BaseHomepage;
import operation.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

@Listeners({TestAllureListener.class})
public class HomepageITest extends BaseHomepage {

    BaseTest baseTest = new BaseTest();

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        baseTest.setupAppium();
    }

    @Test(priority = 13, description = "Switch_Home_001 - User able to go to All Page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to Sign Up Page on Clicking on Sign Up Button in any storyboard.")
    @Story("Story Name : Check On Landing Page")
    public void checkGoToSignUpPage() throws InterruptedException {
        testUserCanMoveToMainMenuPage();
    }

    @AfterMethod
    public void closeAppSwitch() {
        driver.resetApp();
    }
}

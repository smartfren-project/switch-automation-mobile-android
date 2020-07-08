package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import operation.BaseProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

@Listeners({TestAllureListener.class})
public class ProfileITest extends BaseProfile {

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        launchAppSwitch();
    }

    @Test(priority = 10, description = "Switch_Profile_001 - User able to EDIT FULL NAME")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success logout from profile menu.")
    @Story("Story Name : Check Credential")
    public void checkChangeFullName() throws InterruptedException {
        testUpdateFullName();
    }

    @Test(priority = 11, description = "Switch_Profile_002 - User able to EDIT ALT PHONE NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success logout from profile menu.")
    @Story("Story Name : Check Credential")
    public void checkChangeAlternatePhoneNumber() throws InterruptedException {
        testUpdateAlternatePhoneNumber();
    }

    @Test(priority = 12, description = "Switch_Profile_002 - User able to EDIT ALT PHONE NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success logout from profile menu.")
    @Story("Story Name : Check Credential")
    public void checkChangeLanguage() throws InterruptedException {
        testChangeLanguage();
    }

    @AfterMethod
    public void closeAppSwitch() {
        driver.resetApp();
    }
}

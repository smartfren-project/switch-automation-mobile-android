package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import operation.BaseProfile;
import org.testng.annotations.*;

@Listeners({TestAllureListener.class})
public class ProfileITest extends TestSetup {

    BaseProfile baseProfile = new BaseProfile();

    @Test(priority = 10, description = "Switch_Profile_001 - User able to EDIT FULL NAME")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success EDIT FULL NAME from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeFullName() throws InterruptedException {
        baseProfile.testUpdateFullName();
    }

    @Test(priority = 11, description = "Switch_Profile_002 - User able to EDIT ALT PHONE NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success EDIT ALT PHONE NUMBER from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeAlternatePhoneNumber() throws InterruptedException {
        baseProfile.testUpdateAlternatePhoneNumber();
    }

    @Test(priority = 12, description = "Switch_Profile_003 - User able to CHANGE LANGUAGE")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success CHANGE LANGUAGE from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeLanguage() throws InterruptedException {
        baseProfile.testChangeLanguage();
    }
}

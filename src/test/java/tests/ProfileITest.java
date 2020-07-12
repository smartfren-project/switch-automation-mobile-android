package tests;

import constants.BaseData;
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

    @Test(priority = 19, description = "Switch_Profile_001 - User able to EDIT FULL NAME")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success EDIT FULL NAME from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeFullName() throws InterruptedException {
        baseProfile.testUpdateFullName(BaseData.Login.EMAIL_ID, BaseData.Login.PIN);
    }

    @Test(priority = 20, description = "Switch_Profile_002 - User able to EDIT ALT PHONE NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success EDIT ALT PHONE NUMBER from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeAlternatePhoneNumber() throws InterruptedException {
        baseProfile.testUpdateAlternatePhoneNumber(BaseData.Login.EMAIL_ID, BaseData.Login.PIN);
    }

    @Test(priority = 21, description = "Switch_Profile_003 - User able to CHANGE LANGUAGE")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success CHANGE LANGUAGE from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeLanguage() throws InterruptedException {
        baseProfile.testChangeLanguage(BaseData.Login.EMAIL_ID, BaseData.Login.PIN);
    }
}

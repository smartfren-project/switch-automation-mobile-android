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
    LoginITest login = new LoginITest();

    @Test(priority = 19, description = "Switch_Profile_001 - User able to EDIT FULL NAME")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success EDIT FULL NAME from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeFullName() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        baseProfile.testUpdateFullName();
    }

    @Test(priority = 20, description = "Switch_Profile_002 - User able to EDIT ALT PHONE NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success EDIT ALT PHONE NUMBER from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeAlternatePhoneNumber() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        baseProfile.testUpdateAlternatePhoneNumber();
    }

    @Test(priority = 21, description = "Switch_Profile_003 - User able to CHANGE LANGUAGE")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success CHANGE LANGUAGE from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeLanguage() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        baseProfile.testChangeLanguage();
    }

    @Test(priority = 25, description = "Switch_Profile_003 - User unable to EMPTY FULLNAME")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can't EMPTY FULL NAME from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkEmptyFullName() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        baseProfile.testInputFullName("");
    }
}

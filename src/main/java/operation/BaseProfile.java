package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class BaseProfile extends BaseTest{

    BaseLogin baseLogin = new BaseLogin();
    BaseHomepage baseHomepage = new BaseHomepage();

    public void launchAppSwitch() throws MalformedURLException {
        setupAppium();
    }

    public void clickButtonEditProfile() {
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnEdit)).click();
    }

    public void updateFullNameProfile() {
        String UserFullName = driver.findElement(By.id(ObjectElement.EditProfileObject.inputFullName)).getText();
        if (UserFullName.equals(BaseData.Validation.VALIDATION_USERNAME_1)) {
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputFullName)).sendKeys(BaseData.Validation.VALIDATION_USERNAME_2);
        } else if (UserFullName.equals(BaseData.Validation.VALIDATION_USERNAME_2)) {
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputFullName)).sendKeys(BaseData.Validation.VALIDATION_USERNAME_1);
        }
    }

    public void updateAlternatePhoneNumber() {
        String AlternatePhone = driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).getText();
        if (AlternatePhone.equals(BaseData.Validation.VALIDATION_ALT_PHONE_1)) {
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).sendKeys(BaseData.Validation.VALIDATION_ALT_PHONE_2);
        } else if (AlternatePhone.equals(BaseData.Validation.VALIDATION_ALT_PHONE_2)){
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).sendKeys(BaseData.Validation.VALIDATION_ALT_PHONE_1);
        } else {
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).sendKeys(BaseData.Validation.VALIDATION_ALT_PHONE_2);
        }
    }

    public void clickButtonSubmitEditProfile() {
        driver.findElement(By.id(ObjectElement.EditProfileObject.btnSubmitChangeProfile)).click();
    }

    private void clickButtonLanguage() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/language\"));");
        String txtLangNow = driver.findElement(By.id(ObjectElement.ProfilePageObject.btnLanguage)).getText();
        elementToClick.click();
        if (txtLangNow.equals("English")) {
            driver.findElement(By.id(ObjectElement.ProfilePageObject.btnBahasa)).click();
        } else if (txtLangNow.equals("Bahasa")) {
            driver.findElement(By.id(ObjectElement.ProfilePageObject.btnEnglish)).click();
        } else {
            driver.findElement(By.id(ObjectElement.ProfilePageObject.btnCancelChangeLang)).click();
        }
    }

    public void testUpdateFullName() throws InterruptedException{
        baseLogin.testValidLoginEmail();
        baseHomepage.clickButtonProfile();
        clickButtonEditProfile();
        updateFullNameProfile();
        clickButtonSubmitEditProfile();
    }

    public void testUpdateAlternatePhoneNumber() throws InterruptedException{
        baseLogin.testValidLoginEmail();
        baseHomepage.clickButtonProfile();
        clickButtonEditProfile();
        updateAlternatePhoneNumber();
        clickButtonSubmitEditProfile();
    }

    public void testChangeLanguage() throws InterruptedException{
        baseLogin.testValidLoginEmail();
        baseHomepage.clickButtonProfile();
        clickButtonLanguage();
    }
}

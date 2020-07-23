package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.MalformedURLException;

public class BaseProfile extends BaseTest{

    BaseLogin baseLogin = new BaseLogin();
    BaseHomepage baseHomepage = new BaseHomepage();

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
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).click();
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).sendKeys("881850440");
        } else if (AlternatePhone.equals(BaseData.Validation.VALIDATION_ALT_PHONE_2)){
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).click();
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).sendKeys("8194120194");
        } else if (AlternatePhone.equals("+62")){
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).click();
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).sendKeys("8194120194");
        }
    }

    public void inputFullName(String fullName) {
        driver.findElement(By.id(ObjectElement.EditProfileObject.inputFullName)).sendKeys(fullName);
    }

    public void clickButtonSubmitEditProfile() {
        driver.findElement(By.id(ObjectElement.EditProfileObject.btnSubmitChangeProfile)).click();
    }

    public void clickButtonLanguage() throws InterruptedException{
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/language\"));");
        String txtLangNow = driver.findElement(By.id(ObjectElement.ProfilePageObject.btnLanguage)).getText();
        elementToClick.click();
        if (txtLangNow.equals("English")) {
            driver.findElement(By.id(ObjectElement.ProfilePageObject.btnBahasa)).click();
            Assert.assertEquals(txtLangNow, "Bahasa");
        } else if (txtLangNow.equals("Bahasa")) {
            driver.findElement(By.id(ObjectElement.ProfilePageObject.btnEnglish)).click();
            Assert.assertEquals(txtLangNow, "English");
        } else {
            driver.findElement(By.id(ObjectElement.ProfilePageObject.btnCancelChangeLang)).click();
        }
        Thread.sleep(4000);
    }

    public void clickButtonBahasa() throws InterruptedException {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/language\"));");
        String txtLangNow = driver.findElement(By.id(ObjectElement.ProfilePageObject.btnLanguage)).getText();
        elementToClick.click();
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnBahasa)).click();
        Thread.sleep(4000);
    }

    public void testUpdateFullName() {
        baseHomepage.clickButtonProfile();
        clickButtonEditProfile();
        updateFullNameProfile();
        clickButtonSubmitEditProfile();
    }

    public void testUpdateAlternatePhoneNumber() {
        baseHomepage.clickButtonProfile();
        clickButtonEditProfile();
        updateAlternatePhoneNumber();
        clickButtonSubmitEditProfile();
    }

    public void testChangeLanguage() throws InterruptedException{
        baseHomepage.clickButtonProfile();
        clickButtonBahasa();
    }

    public void testInputFullName(String fullName) {
        baseHomepage.clickButtonProfile();
        clickButtonEditProfile();
        inputFullName(fullName);
        clickButtonSubmitEditProfile();
    }
}

package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.MalformedURLException;

public class BaseProfile extends BaseTest {

    /* profile-menu-page */

    public void clickButtonEditProfile() {
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnEdit)).click();
    }

    public void clickSeeAllFavorite() {
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnSeeAllFavorite)).click();
    }

    public void clickReferralCode() throws InterruptedException {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/button3\"));");
        elementToClick.click();
    }

    public void clickButtonYourWishlist() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/wishlist\"));");
        elementToClick.click();
    }

    public void clickButtonSolveMission() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/textView119\"));");
        elementToClick.click();
    }

    public void clickButtonAccount() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/account_txt\"));");
        elementToClick.click();
    }

    public void clickButtonSIMSettings() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/sim_setting\"));");
        elementToClick.click();
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
            Thread.sleep(4000);
        } else if (txtLangNow.equals("Bahasa")) {
            driver.findElement(By.id(ObjectElement.ProfilePageObject.btnEnglish)).click();
            Assert.assertEquals(txtLangNow, "English");
            Thread.sleep(4000);
        } else {
            driver.findElement(By.id(ObjectElement.ProfilePageObject.btnCancelChangeLang)).click();
        }
    }

    public void clickButtonHelp() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/help\"));");
        elementToClick.click();
    }

    public void clickButtonLogout() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/logout\"));");
        elementToClick.click();
    }

    /* menu-config */

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

    public void clickButtonCopyRefCode() {
        final String referralCode = driver.findElement(By.id(ObjectElement.ReferralObject.txtReferralCode)).getText();
        Assert.assertEquals(referralCode, "fgyRpcHC");
        driver.findElement(By.id(ObjectElement.ReferralObject.btnCopyRef)).click();
    }

    public void clickButtonShareRefCode() {
        final String referralCode = driver.findElement(By.id(ObjectElement.ReferralObject.txtReferralCode)).getText();
        Assert.assertEquals(referralCode, "fgyRpcHC");
        driver.findElement(By.id(ObjectElement.ReferralObject.btnShareRef)).click();
    }

    public void clickButtonChangePIN() {
        driver.findElement(By.id(ObjectElement.AccountObject.btnChangePin)).click();
    }

    public void inputChangePIN(String pin) {
        driver.findElement(By.id(ObjectElement.AccountObject.inputPin)).sendKeys(pin);
    }

    public void clickButtonConfirmChangePIN() {
        driver.findElement(By.id(ObjectElement.AccountObject.btnNext)).click();
    }

    public void clickButtonDeliveryAddress() {
        driver.findElement(By.id(ObjectElement.AccountObject.btnDeliveryAddress)).click();
    }

    public void clickButtonAdd() {
        driver.findElement(By.id(ObjectElement.AccountObject.btnAddAddress)).click();
    }

    public void inputHomeOrOffice(String homeOfficeName) {
        Object officeName = driver.findElement(By.id(ObjectElement.AccountObject.inputHomeOrOfficeName));
        Assert.assertNotNull(officeName);
        driver.findElement(By.id(ObjectElement.AccountObject.inputHomeOrOfficeName)).sendKeys(homeOfficeName);
    }

    public void inputRecipientName(String recipientName) {
        Object recName = driver.findElement(By.id(ObjectElement.AccountObject.inputRecipientName));
        Assert.assertNotNull(recName);
        driver.findElement(By.id(ObjectElement.AccountObject.inputRecipientName)).sendKeys(recipientName);
    }

    public void inputRecipientPhoneNumber(String recipientNumber) {
        Object recNumber = driver.findElement(By.id(ObjectElement.AccountObject.inputRecipientNumber));
        Assert.assertNotNull(recNumber);
        driver.findElement(By.id(ObjectElement.AccountObject.inputRecipientNumber)).sendKeys(recipientNumber);
    }

    public void clickButtonCityOrDistrict() {
        Object btnSelectCity = driver.findElement(By.id(ObjectElement.AccountObject.btnCityOrDistrict));
        Assert.assertNotNull(btnSelectCity);
        driver.findElement(By.id(ObjectElement.AccountObject.btnCityOrDistrict)).click();
    }

    public void inputSearchCityOrDistrict(String city) {
        Object inputCity = driver.findElement(By.id(ObjectElement.AccountObject.inputSearchCityOrDistrict));
        Assert.assertNotNull(inputCity);
        driver.findElement(By.id(ObjectElement.AccountObject.inputSearchCityOrDistrict)).sendKeys(city);
    }

    public void clickSelectedCityOrDistrict() {
        Object btnSelectCity = driver.findElement(By.id(ObjectElement.AccountObject.btnSelectCityOrDistrict));
        Assert.assertNotNull(btnSelectCity);
        driver.findElement(By.id(ObjectElement.AccountObject.btnSelectCityOrDistrict)).click();
    }

    public void inputAddressDetail(String address) {
        Object inputAddress = driver.findElement(By.id(ObjectElement.AccountObject.inputAddressDetail));
        Assert.assertNotNull(inputAddress);
        driver.findElement(By.id(ObjectElement.AccountObject.inputAddressDetail)).sendKeys(address);
    }

    public void clickButtonChooseLocation() {
        driver.findElement(By.id(ObjectElement.AccountObject.btnChooseLocation)).click();
    }

    public void clickButtonSelectThisLocation() {
        driver.findElement(By.id(ObjectElement.AccountObject.btnSelectThisLocation)).click();
    }

    public void clickCheckboxTermsAndCondition() {
        driver.findElement(By.id(ObjectElement.AccountObject.cbTermsAndCondition)).click();
    }

    public void clickButtonSave() {
        driver.findElement(By.id(ObjectElement.AccountObject.btnSave)).click();
    }

    public void clickButtonSIMInfo() {
        driver.findElement(By.id(ObjectElement.SIMSettingObject.btnSimInfo)).click();
    }

    public void checkSIMInfo() {

    }

    public void clickButtonCheckCompatibility() {
        driver.findElement(By.id(ObjectElement.SIMSettingObject.btnCheckCompatibility)).click();
    }

    private By clickButtonCheckCompatibility = By.id(ObjectElement.SIMSettingObject.btnCheckCompatibility);

    public void checkCompatibility() {

    }

    public void clickButtonChatWithShely() {

    }

    public void clickButtonChat() {

    }

    public void clickButtonEmail() {

    }

    public void checkValueAddress() {

    }

}

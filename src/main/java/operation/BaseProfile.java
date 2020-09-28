package operation;

import constants.BaseData;
import constants.ObjectElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.finders.ElementAction;

public class BaseProfile extends BaseTest {
    ElementAction action = new ElementAction();

    public By txtGetPoints = By.id(ObjectElement.ProfilePageObject.txtPointsValue);

    public By txtGetRubies = By.id(ObjectElement.ProfilePageObject.txtRubiesValue);

    public By txtHeaderTitle = By.id(ObjectElement.ProfilePageObject.txtHeaderTitle);

    public By txtNameUserTitle = By.id(ObjectElement.ProfilePageObject.txtNameUserTitle);

    public By txtEmailUserTitle = By.id(ObjectElement.ProfilePageObject.txtEmailUserTitle);

    public By btnEdit = By.id(ObjectElement.ProfilePageObject.btnEdit);

    public By btnTrxHistory = By.id(ObjectElement.ProfilePageObject.btnTrxHistory);

    public By txtDealsTitle = By.id(ObjectElement.ProfilePageObject.txtDealsTitle);

    public By btnConfirmLogout = By.id(ObjectElement.ProfilePageObject.btnConfirmLogout);

    public By btnLanguage = By.id(ObjectElement.ProfilePageObject.btnLanguage);

    public By btnBahasa = By.id(ObjectElement.ProfilePageObject.btnBahasa);

    public By btnEnglish = By.id(ObjectElement.ProfilePageObject.btnEnglish);

    public By btnCancelChangeLang = By.id(ObjectElement.ProfilePageObject.btnCancelChangeLang);

    public By btnSeeAllFavorite = By.id(ObjectElement.ProfilePageObject.btnSeeAllFavorite);

    public By scrollView = By.id(ObjectElement.ProfilePageObject.scrollView);

    public By btnLoginHere = By.id(ObjectElement.ProfilePageObject.btnLoginHere);

    public By inputFullName = By.id(ObjectElement.EditProfileObject.inputFullName);

    public By btnSubmitChangeProfile = By.id(ObjectElement.EditProfileObject.btnSubmitChangeProfile);

    public By inputAlternatePhoneNumber = By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber);

    public By txtReferralCode = By.id(ObjectElement.ReferralObject.txtReferralCode);

    public By btnCopyReferralCode = By.id(ObjectElement.ReferralObject.btnCopyRef);

    public By btnShareReferralCode = By.id(ObjectElement.ReferralObject.btnShareRef);

    public By btnChangePIN = By.id(ObjectElement.AccountObject.btnChangePin);

    public By inputChangePIN = By.id(ObjectElement.AccountObject.inputPin);

    public By btnConfirmChangePIN = By.id(ObjectElement.AccountObject.btnNext);

    public By btnDeliveryAddress = By.id(ObjectElement.AccountObject.btnDeliveryAddress);

    public By btnAddAddress = By.id(ObjectElement.AccountObject.btnAddAddress);

    public By btnSIMInfo = By.id(ObjectElement.SIMSettingObject.btnSimInfo);

    public By btnCheckCompatibility = By.id(ObjectElement.SIMSettingObject.btnCheckCompatibility);

    public String btnLogout = ObjectElement.ProfilePageObject.btnLogout;

    public String btnReferral = ObjectElement.ProfilePageObject.btnReferral;

    public String btnYourWishList = ObjectElement.ProfilePageObject.btnYourWishList;

    public String btnSolveMission = ObjectElement.ProfilePageObject.btnSolveMission;

    public String btnAccount = ObjectElement.ProfilePageObject.btnAccount;

    public String btnSIMSetting = ObjectElement.ProfilePageObject.btnSIMSetting;

    public String btnCLanguage = ObjectElement.ProfilePageObject.btnCLanguage;

    public String btnHelp = ObjectElement.ProfilePageObject.btnHelp;

    public String inputHomeOrOffice = ObjectElement.ProfilePageObject.inputHomeOrOffice;

    public String inputRecipientName = ObjectElement.ProfilePageObject.inputRecipientName;

    public String inputRecipientPhoneNumber = ObjectElement.ProfilePageObject.inputRecipientNumber;

    public String btnCityOrDistrict = ObjectElement.ProfilePageObject.btnCityOrDistrict;

    public String inputSrcCityOrDistrict = ObjectElement.ProfilePageObject.inputCityOrDistrict;

    public By btnSelectCityOrDistrict = By.id(ObjectElement.AccountObject.btnSelectCityOrDistrict);

    public String inputAddressDetail = ObjectElement.ProfilePageObject.inputAddressDetail;

    public String btnChooseLocation = ObjectElement.ProfilePageObject.btnChooseLocation;

    public By btnSelectThisLocation = By.id(ObjectElement.AccountObject.btnSelectThisLocation);

    public String cbTermsAndConditions = ObjectElement.ProfilePageObject.cbTermsAndConditions;

    public String btnSave = ObjectElement.ProfilePageObject.btnSave;
    /* profile-menu-page */

    public String activeLang() {
        String langNow = action.getText(btnLanguage);
        try {
            return String.valueOf(langNow);
        } catch (Exception e) {
            return null;
        }
    }

    public String currentName() {
        String curName = action.getText(inputFullName);
        try {
            return String.valueOf(curName);
        } catch (Exception e) {
            return null;
        }
    }

    public String currentPhoneNumber() {
        String curNumber = action.getText(inputAlternatePhoneNumber);
        try {
            return String.valueOf(curNumber);
        } catch (Exception e) {
            return null;
        }
    }

    public void clickButtonLanguage() throws InterruptedException{
        action.scrollOnly(btnCLanguage);
        System.out.println(activeLang());
        if (activeLang().equals("English")) {
            action.clickElementScroll(btnCLanguage);
            action.click(btnBahasa);
            action.scrollOnly(btnCLanguage);
            Assert.assertEquals(activeLang(), "Bahasa");
        } else {
            action.clickElementScroll(btnCLanguage);
            action.click(btnEnglish);
            action.scrollOnly(btnCLanguage);
            Assert.assertEquals(activeLang(), "English");
        }
    }

    /* menu-config */

    public void updateFullNameProfile() {
        if (currentName().equals(BaseData.Validation.VALIDATION_USERNAME_1)) {
            action.sendKeys(inputFullName, BaseData.Validation.VALIDATION_USERNAME_2);
        } else if (currentName().equals(BaseData.Validation.VALIDATION_USERNAME_2)) {
            action.sendKeys(inputFullName, BaseData.Validation.VALIDATION_USERNAME_1);
        }
    }

    public void updateAlternatePhoneNumber() {
        if (currentPhoneNumber().equals(BaseData.Validation.VALIDATION_ALT_PHONE_1)) {
            action.click(inputAlternatePhoneNumber);
            action.sendKeys(inputAlternatePhoneNumber, "881850440");
        } else if (currentPhoneNumber().equals(BaseData.Validation.VALIDATION_ALT_PHONE_2)){
            action.click(inputAlternatePhoneNumber);
            action.sendKeys(inputAlternatePhoneNumber, "8194120194");
        } else if (currentPhoneNumber().equals("+62")){
            action.click(inputAlternatePhoneNumber);
            action.sendKeys(inputAlternatePhoneNumber, "8194120194");
        }
    }

    public void clickButtonChatWithShely() {

    }

    public void clickButtonChat() {

    }

    public void clickButtonEmail() {

    }

    public String getReferralTitle() {
        String refTitle = driver.findElement(By.id("")).getText();
        try {
            return String.valueOf(refTitle);
        } catch (Exception e) {
            return null;
        }
    }

    public void checkValidationReferralPage() {

    }
}

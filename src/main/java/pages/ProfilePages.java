package pages;

import operation.BaseHomepage;
import operation.BaseLanding;
import operation.BaseLogout;
import operation.BaseProfile;

public class ProfilePages {
    BaseHomepage baseHomepage = new BaseHomepage();
    BaseProfile baseProfile = new BaseProfile();
    BaseLogout baseLogout = new BaseLogout();
    BaseLanding baseLanding = new BaseLanding();

    public void testUpdateFullName() {
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonEditProfile();
        baseProfile.updateFullNameProfile();
        baseProfile.clickButtonSubmitEditProfile();
    }

    public void testUpdateAlternatePhoneNumber() {
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonEditProfile();
        baseProfile.updateAlternatePhoneNumber();
        baseProfile.clickButtonSubmitEditProfile();
    }

    public void testChangeLanguage() throws InterruptedException{
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonLanguage();
    }

    public void testInputFullName(String fullName) {
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonEditProfile();
        baseProfile.inputFullName(fullName);
        baseProfile.clickButtonSubmitEditProfile();
    }

    public void testChooseFavorite() {
        baseHomepage.clickButtonProfile();
    }

    public void testCopyReferralCode() throws InterruptedException {
        baseHomepage.clickButtonProfile();
        baseProfile.clickReferralCode();
        baseProfile.clickButtonCopyRefCode();
    }

    public void testShareReferralCode() throws InterruptedException {
        baseHomepage.clickButtonProfile();
        baseProfile.clickReferralCode();
        baseProfile.clickButtonShareRefCode();
    }

    public void testCheckWishlist() {
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonYourWishlist();
    }

    public void testChangePin(String pin) {
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonAccount();
        baseProfile.clickButtonChangePIN();
        baseProfile.inputChangePIN(pin);
        baseProfile.clickButtonConfirmChangePIN();
    }

    public void testPhaseTwoChangePin(String pin) {
        testChangePin(pin);
        baseProfile.inputChangePIN(pin);
        baseProfile.clickButtonConfirmChangePIN();
    }

    public void testCompleteChangePin(String pin) {
        testChangePin(pin);
        baseProfile.inputChangePIN(pin);
        baseProfile.clickButtonConfirmChangePIN();
        baseProfile.inputChangePIN(pin);
        baseProfile.clickButtonConfirmChangePIN();
    }

    public void testAddDeliveryAddress(String homeOfficeName, String recipientName, String recipientNumber) {
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonAccount();
        baseProfile.clickButtonDeliveryAddress();
        baseProfile.clickButtonAdd();
        baseProfile.inputHomeOrOffice(homeOfficeName);
        baseProfile.inputRecipientName(recipientName);
        baseProfile.inputRecipientPhoneNumber(recipientNumber);
    }

    public void testDeliveryAddress(String city, String address) {
        baseProfile.clickButtonCityOrDistrict();
        baseProfile.inputSearchCityOrDistrict(city);
        baseProfile.clickSelectedCityOrDistrict();
        baseProfile.inputAddressDetail(address);
        baseProfile.clickButtonChooseLocation();
        baseProfile.clickButtonSelectThisLocation();
        baseProfile.clickCheckboxTermsAndCondition();
        baseProfile.clickButtonSave();
    }

    public void testCheckSIMInfo() {
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonSIMSettings();
        baseProfile.clickButtonSIMInfo();
//        baseProfile.checkSIMInfo();
    }

    public void testCheckCompatibility() {
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonSIMSettings();
        baseProfile.clickButtonCheckCompatibility();
//        baseProfile.checkCompatibility();
    }

    public void testChatWithShely() {
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonHelp();
        baseProfile.clickButtonChatWithShely();
        baseProfile.clickButtonChat();
    }

    public void testEmailUs() {
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonHelp();
        baseProfile.clickButtonChatWithShely();
        baseProfile.clickButtonEmail();
    }

    public void testValidLogout() throws InterruptedException {
        baseHomepage.clickButtonProfile();
        baseProfile.clickButtonLogout();
        baseLogout.clickButtonConfirmLogout();
    }

    public void testLogout() {
        baseProfile.clickButtonLogout();
        baseLogout.clickButtonConfirmLogout();
    }

    public void testClickButtonLoginHere() {
        baseLogout.clickButtonLoginHere();
        baseLanding.checkValidationWelcomeText();
    }
}

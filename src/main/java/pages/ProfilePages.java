package pages;

import io.qameta.allure.Step;
import operation.BaseHomepage;
import operation.BaseLanding;
import operation.BaseLogout;
import operation.BaseProfile;
import utilities.finders.ElementAction;

public class ProfilePages {
    BaseHomepage baseHomepage = new BaseHomepage();
    BaseProfile baseProfile = new BaseProfile();
    BaseLogout baseLogout = new BaseLogout();
    BaseLanding baseLanding = new BaseLanding();
    ElementAction action = new ElementAction();

    @Step("User Do Update FullName")
    public void testUpdateFullName() {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnEdit);
        baseProfile.updateFullNameProfile();
        action.click(baseProfile.btnSubmitChangeProfile);
    }

    @Step("User Do Update Alternate Phone Number")
    public void testUpdateAlternatePhoneNumber() {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnEdit);
        baseProfile.updateAlternatePhoneNumber();
        action.click(baseProfile.btnSubmitChangeProfile);
    }

    @Step("User Do Change Language")
    public void testChangeLanguage() throws InterruptedException{
        action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonLanguage();
    }

    @Step("User Do  Click Button Bahasa")
    public void clickButtonBahasa() throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.scrollOnly(baseProfile.btnCLanguage);
        action.clickElementScroll(baseProfile.btnCLanguage);
        action.click(baseProfile.btnBahasa);
        Thread.sleep(4000);
    }

    @Step("User Do Input FullName")
    public void testInputFullName(String fullName) {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnEdit);
        action.sendKeys(baseProfile.inputFullName, fullName);
        action.click(baseProfile.btnSubmitChangeProfile);
    }

    @Step("User Do Choose Favorite")
    public void testChooseFavorite() {
        action.click(baseHomepage.btnProfile);
    }

    @Step("User Do Copy Referral Code")
    public void testCopyReferralCode(String refCode) throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnReferral);
        action.checkerEqual(baseProfile.txtReferralCode, refCode);
        action.click(baseProfile.btnCopyReferralCode);
    }

    @Step("User Do Copy Referral Code")
    public void testShareReferralCode(String refCode) throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnReferral);
        action.checkerEqual(baseProfile.txtReferralCode, refCode);
        action.click(baseProfile.btnShareReferralCode);
    }

    @Step("User Do Check Wishlist")
    public void testCheckWishlist() {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnYourWishList);
    }

    @Step("User Do Change PIN")
    public void testChangePin(String pin) {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnAccount);
        action.click(baseProfile.btnChangePIN);
        action.sendKeys(baseProfile.inputChangePIN, pin);
        action.click(baseProfile.btnConfirmChangePIN);
    }

    @Step("User Do Change PIN Until Confirm")
    public void testPhaseTwoChangePin(String pin) {
        testChangePin(pin);
        action.sendKeys(baseProfile.inputChangePIN, pin);
        action.click(baseProfile.btnConfirmChangePIN);
    }

    @Step("User Do Change PIN Until Completed")
    public void testCompleteChangePin(String pin) {
        testChangePin(pin);
        action.sendKeys(baseProfile.inputChangePIN, pin);
        action.click(baseProfile.btnConfirmChangePIN);
        action.sendKeys(baseProfile.inputChangePIN, pin);
        action.click(baseProfile.btnConfirmChangePIN);
    }

    @Step("User Do Fill Mandatory Field Delivery Address")
    public void testAddDeliveryAddress(String homeOfficeName, String recipientName, String recipientNumber) {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnAccount);
        action.click(baseProfile.btnDeliveryAddress);
        action.click(baseProfile.btnAddAddress);
        action.inputElementScroll(baseProfile.inputHomeOrOffice, homeOfficeName);
        action.inputElementScroll(baseProfile.inputRecipientName, recipientName);
        action.inputElementScroll(baseProfile.inputRecipientPhoneNumber, recipientNumber);
    }

    @Step("User Do Fill Location Field Delivery Address")
    public void testDeliveryAddress(String city, String address) {
        action.clickElementScroll(baseProfile.btnCityOrDistrict);
        action.inputElementScroll(baseProfile.inputSrcCityOrDistrict, city);
        action.click(baseProfile.btnSelectCityOrDistrict);
        action.inputElementScroll(baseProfile.inputAddressDetail, address);
        action.clickElementScroll(baseProfile.btnChooseLocation);
        action.click(baseProfile.btnSelectThisLocation);
        action.clickElementScroll(baseProfile.cbTermsAndConditions);
        action.clickElementScroll(baseProfile.btnSave);
    }

    @Step("User Do Check SIM Info")
    public void testCheckSIMInfo() {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnSIMSetting);
        action.click(baseProfile.btnSIMInfo);
//        baseProfile.checkSIMInfo();
    }

    @Step("User Do Check Compatibility")
    public void testCheckCompatibility() {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnSIMSetting);
        action.click(baseProfile.btnCheckCompatibility);
//        baseProfile.checkCompatibility();
    }

    @Step("User Do Check Chat With Shelly")
    public void testChatWithShely() {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnHelp);
        baseProfile.clickButtonChatWithShely();
        baseProfile.clickButtonChat();
    }

    @Step("User Do Check Email Us")
    public void testEmailUs() {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnHelp);
        baseProfile.clickButtonChatWithShely();
        baseProfile.clickButtonEmail();
    }

    @Step("User Do Check Valid Logout")
    public void testValidLogout() throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnLogout);
        action.click(baseLogout.btnConfirmLogout);
    }

    @Step("User Do Click Logout")
    public void testLogout() {
        action.clickElementScroll(baseProfile.btnLogout);
        action.click(baseLogout.btnConfirmLogout);
    }

    @Step("User Do Click Button Login Here")
    public void testClickButtonLoginHere() {
        action.click(baseLogout.btnLoginHere);
        baseLanding.checkValidationWelcomeText();
    }

    @Step("User can see Points and Rubies Value on Page")
    public void testCheckPointAndRubies() {
        action.click(baseHomepage.btnDeals);
        action.click(baseHomepage.btnQuest);
        action.click(baseHomepage.btnProfile);
    }
}

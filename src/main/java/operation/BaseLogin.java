package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import utilities.finders.ElementAction;

import java.net.MalformedURLException;

public class BaseLogin extends BaseTest {

    ElementAction action = new ElementAction();

    public By btnSubmitLogin = By.id(ObjectElement.LoginPageObject.btnSubmitLogin);

    public By inputUsername = By.id(ObjectElement.LoginPageObject.inputUserName);

    public By inputPIN = By.id(ObjectElement.PINPageObject.inputPIN);

    public By inputOTP = By.id(ObjectElement.LoginPageObject.inputOTP);

    public By inputOTP1 = By.id(ObjectElement.LoginPageObject.inputOTP1);

    public By inputOTP2 = By.id(ObjectElement.LoginPageObject.inputOTP2);

    public By inputOTP3 = By.id(ObjectElement.LoginPageObject.inputOTP3);

    public By inputOTP4 = By.id(ObjectElement.LoginPageObject.inputOTP4);

    public By btnProfile = By.id(ObjectElement.MenuPageObject.btnProfile);

    public By txtValidationTitle = By.id(ObjectElement.LoginPageObject.txtUserValidationTitle);

    public By txtValidationDesc = By.id(ObjectElement.LoginPageObject.txtVariousLoginDesc);

    public By txtErrorInput = By.id(ObjectElement.LoginPageObject.txtErrorInputDesc);

    public By btnChangeEmail = By.id(ObjectElement.LoginPageObject.btnChangeEmail);

    public By btnSignUp2 = By.id(ObjectElement.LoginPageObject.btnSignUp2);

    public By txtVariousLoginDesc = By.id(ObjectElement.LoginPageObject.txtVariousLoginDesc);

    public void checkValidationUnregisteredEmail() {
        String TextInfo = driver.findElement(By.id(ObjectElement.LoginPageObject.txtUserValidationTitle)).getText();
        String DescInfoValidation = driver.findElement(By.id(ObjectElement.LoginPageObject.txtVariousLoginDesc)).getText();
        Assert.assertEquals(BaseData.Validation.VALIDATION_USERNAME_TITLE_EN, TextInfo);
        Assert.assertEquals(BaseData.Validation.VALIDATION_USERNAME_DESC_EN, DescInfoValidation);
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnChangeEmail)));
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnSignUp2)));
    }

    public void checkValidationRegisteredEmail() {
        String TextInfo = driver.findElement(By.id(ObjectElement.LoginPageObject.txtUserValidationTitle)).getText();
        String DescInfoValidation = driver.findElement(By.id(ObjectElement.LoginPageObject.txtVariousLoginDesc)).getText();
        Assert.assertEquals(BaseData.Validation.VALIDATION_ALREADY_REGISTERED_TITLE_EN, TextInfo);
        Assert.assertEquals(BaseData.Validation.VALIDATION_ALREADY_REGISTERED_DESC_EN, DescInfoValidation);
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnChangeEmail)));
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnSignUp2)));
    }

    public void checkInvalidSwitchNumber() {
        String validationTxt = driver.findElement(By.id(ObjectElement.LoginPageObject.txtErrorInputDesc)).getText();
        Assert.assertEquals(validationTxt, BaseData.Validation.VALIDATION_WRONG_SWITCH_NUMBER);
    }

    public void inputOTP(String otp1, String otp2, String otp3, String otp4) {
        if (driver.findElement(By.id(ObjectElement.LoginPageObject.inputOTP)).isDisplayed()) {
            action.sendKeys(inputOTP1, otp1);
            action.sendKeys(inputOTP2, otp2);
            action.sendKeys(inputOTP3, otp3);
            action.sendKeys(inputOTP4, otp4);
        } else {
            return;
        }
    }

    public boolean passOTPSection(String otp1, String otp2, String otp3, String otp4) {
        try {
            inputOTP(otp1, otp2, otp3, otp4);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickButtonSignUp() {
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnSignUp)).click();
    }

}

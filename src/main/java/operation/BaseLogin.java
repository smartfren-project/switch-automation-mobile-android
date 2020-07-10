package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.net.MalformedURLException;

public class BaseLogin extends BaseTest {

    BaseLanding baseLanding = new BaseLanding();

    public void clickButtonSubmitLogin() {
        driver.findElement(By.id(ObjectElement.LoginPageObject.btnSubmitLogin)).click();
    }

    public void inputUsername(String username) {
        driver.findElement(By.id(ObjectElement.LoginPageObject.inputUserName)).sendKeys(username);
    }

    public void inputPIN(String pin) {
        driver.findElement(By.id(ObjectElement.PINPageObject.inputPIN)).sendKeys(pin);
    }

    public void checkSuccessLogin() {
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.MenuPageObject.btnProfile)));
    }

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

    public void checkInvalidDomainEmail() {

    }

    public void checkInvalidSwitchNumber() {

    }

    public void checkDisabledButtonSubmit() {

    }

    public void clickButtonSignUp() {
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnSignUp)).click();
    }

    @Step("User Do Valid Login Using Email")
    public void testValidLoginEmail() throws InterruptedException {
        baseLanding.clickButtonLogin();
        baseLanding.checkValidationWelcomeText();
        inputUsername(BaseData.Login.EMAIL_ID);
        clickButtonSubmitLogin();
        inputPIN(BaseData.Login.PIN);
        Thread.sleep(1500);
        checkSuccessLogin();
        Thread.sleep(1500);
    }

    @Step("User Do Valid Login Using Switch Number")
    public void testValidLoginSwitchNumber() throws InterruptedException {
        baseLanding.clickButtonLogin();
        baseLanding.checkValidationWelcomeText();
        inputUsername(BaseData.Login.SWITCH_NUMBER);
        clickButtonSubmitLogin();
        inputPIN(BaseData.Login.PIN2);
        Thread.sleep(1500);
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.MenuPageObject.btnProfile)));
        Thread.sleep(1500);
    }

    @Step("User Do Invalid Login")
    public void testInvalidEmailLogin() throws InterruptedException {
        baseLanding.clickButtonLogin();
        baseLanding.checkValidationWelcomeText();
        inputUsername(BaseData.Login.INVALID_EMAIL_ID);
        clickButtonSubmitLogin();
        Thread.sleep(1500);
        checkValidationUnregisteredEmail();
        Thread.sleep(1500);
    }

    public void testInvalidSignUpWithRegisteredEmail() throws InterruptedException {
        baseLanding.clickButtonSignUp();
        inputUsername(BaseData.Login.EMAIL_ID);
        baseLanding.clickButtonSubmitSignUp();
        checkValidationRegisteredEmail();
        Thread.sleep(3000);
    }
}

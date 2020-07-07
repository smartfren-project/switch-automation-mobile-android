package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.net.MalformedURLException;

public class BaseLogin extends BaseTest {
    public void launchAppSwitch() throws MalformedURLException {
        setupAppium();
    }

    public void clickButtonLogin() {
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnLogin)).click();
    }

    public void clickButtonSubmitLogin() {
        driver.findElement(By.id(ObjectElement.LoginPageObject.btnSubmitLogin)).click();
    }

    public void checkWelcomeText() {
        String WelcomeAppSwitch = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeTitle)).getText();
        String WelcomeDesc = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeDesc)).getText();
        Assert.assertEquals(BaseData.LaunchPage.WELCOME_EN, WelcomeAppSwitch);
        Assert.assertEquals(BaseData.LaunchPage.WELCOME_DESC_EN, WelcomeDesc);
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

    @Step("User Do Valid Login Using Email")
    public void testValidLoginEmail() throws InterruptedException {
        clickButtonLogin();
        checkWelcomeText();
        inputUsername(BaseData.Login.EMAIL_ID);
        clickButtonSubmitLogin();
        inputPIN(BaseData.Login.PIN);
        Thread.sleep(1500);
        checkSuccessLogin();
        Thread.sleep(1500);
        resetApp();
    }

    @Step("User Do Valid Login Using Switch Number")
    public void testValidLoginSwitchNumber() throws InterruptedException {
        clickButtonLogin();
        checkWelcomeText();
        inputUsername(BaseData.Login.SWITCH_NUMBER);
        clickButtonSubmitLogin();
        inputPIN(BaseData.Login.PIN2);
        Thread.sleep(1500);
//        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.MenuPageObject.btnProfile)));
//        Thread.sleep(1500);
        resetApp();
    }

    @Step("User Do Invalid Login")
    public void testInvalidEmailLogin() throws InterruptedException {
        clickButtonLogin();
        checkWelcomeText();
        inputUsername(BaseData.Login.INVALID_EMAIL_ID);
        clickButtonSubmitLogin();
        Thread.sleep(1500);
        checkValidationUnregisteredEmail();
        Thread.sleep(1500);
        resetApp();
    }

    public void testCloseAppSwitch() throws InterruptedException {
        closeApp();
    }
}

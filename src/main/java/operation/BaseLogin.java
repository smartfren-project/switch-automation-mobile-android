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

    @Step("User Do Valid Login")
    public void testValidLogin() throws InterruptedException {
        clickButtonLogin();
        String WelcomeAppSwitch = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeTitle)).getText();
        String WelcomeDesc = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeDesc)).getText();
        Assert.assertEquals(BaseData.LaunchPage.WELCOME_EN, WelcomeAppSwitch);
        Assert.assertEquals(BaseData.LaunchPage.WELCOME_DESC_EN, WelcomeDesc);
        driver.findElement(By.id(ObjectElement.LoginPageObject.inputUserName)).sendKeys(BaseData.Login.EMAIL_ID);
        clickButtonSubmitLogin();
        driver.findElement(By.id(ObjectElement.PINPageObject.inputPIN)).sendKeys(BaseData.Login.PIN);
        Thread.sleep(1500);
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.MenuPageObject.btnProfile)));
        driver.resetApp();
    }

    @Step("User Do Invalid Login")
    public void testInvalidEmailLogin() throws InterruptedException {
        clickButtonLogin();
        String WelcomeAppSwitch = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeTitle)).getText();
        String WelcomeDesc = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeDesc)).getText();
        Assert.assertEquals(BaseData.LaunchPage.WELCOME_EN, WelcomeAppSwitch);
        Assert.assertEquals(BaseData.LaunchPage.WELCOME_DESC_EN, WelcomeDesc);
        driver.findElement(By.id(ObjectElement.LoginPageObject.inputUserName)).sendKeys(BaseData.Login.INVALID_EMAIL_ID);
        clickButtonSubmitLogin();
        Thread.sleep(1500);
        String TextInfo = driver.findElement(By.id(ObjectElement.LoginPageObject.txtUserValidationTitle)).getText();
        String DescInfoValidation = driver.findElement(By.id(ObjectElement.LoginPageObject.txtVariousLoginDesc)).getText();
        Assert.assertEquals(BaseData.Validation.VALIDATION_USERNAME_TITLE_EN, TextInfo);
        Assert.assertEquals(BaseData.Validation.VALIDATION_USERNAME_DESC_EN, DescInfoValidation);
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnChangeEmail)));
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnSignUp2)));
        driver.resetApp();
    }

    public void testCloseAppSwitch() throws InterruptedException {
        driver.closeApp();
    }
}

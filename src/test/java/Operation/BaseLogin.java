package Operation;

import Data.BaseData;
import Data.ObjectElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.MalformedURLException;

public class BaseLogin extends Driver {

    public void launchAppSwitch() throws MalformedURLException {
        setupAppium();
    }

    @Step("User Click Button Login")
    public void clickButtonLogin() {
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnLogin)).click();
    }

    @Step("User Check Element Page")
    public void checkElementPageLogin() {
        String WelcomeAppSwitch = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeTitle)).getText();
        String WelcomeDesc = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeDesc)).getText();
        Assert.assertEquals(BaseData.LaunchPage.WELCOME_EN, WelcomeAppSwitch);
        Assert.assertEquals(BaseData.LaunchPage.WELCOME_DESC_EN, WelcomeDesc);
    }

    @Step("User Do Valid Login")
    public void testValidLogin() throws InterruptedException {
        clickButtonLogin();
        checkElementPageLogin();
        driver.findElement(By.id(ObjectElement.LoginPageObject.inputUserName)).sendKeys(BaseData.Login.EMAIL_ID);
        driver.findElement(By.id(ObjectElement.LoginPageObject.btnSubmitLogin)).click();
        driver.findElement(By.id(ObjectElement.PINPageObject.inputPIN)).sendKeys(BaseData.Login.PIN);
        Thread.sleep(5000);
        driver.resetApp();
    }

    @Step("User Do Invalid Login")
    public void testInvalidEmailLogin() throws InterruptedException {
        clickButtonLogin();
        checkElementPageLogin();
        driver.findElement(By.id(ObjectElement.LoginPageObject.inputUserName)).sendKeys(BaseData.Login.INVALID_EMAIL_ID);
        driver.findElement(By.id(ObjectElement.LoginPageObject.btnSubmitLogin)).click();
        Thread.sleep(3000);
        driver.resetApp();
    }

    public void testCloseAppSwitch() {
        closeApp();
    }
}

package operation;

import constants.BaseData;
import constants.ObjectElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.qameta.allure.*;

import java.net.MalformedURLException;

public class BaseLanding extends BaseTest {
    public void launchAppSwitch() throws MalformedURLException {
        setupAppium();
    }

    public void clickButtonLogin() {
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnLogin)).click();
    }

    public void clickButtonSignUp() {
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnSignUp)).click();
    }

    public void clickButtonSkip() {
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnSkip)).click();
    }

    public void clickButtonHeaderCredential() {
        driver.findElement(By.id(ObjectElement.SignUpPageObject.btnLogin)).click();
    }

    public void clickButtonFooterCredential() {
        driver.findElement(By.id(ObjectElement.SignUpPageObject.btnLoginHere)).click();
    }

    public void clickButtonOtherMethod() {
        driver.findElement(By.id(ObjectElement.LoginPageObject.btnOtherMethods)).click();
    }

    public void clickButtonGoogle() {
        driver.findElement(By.id(ObjectElement.LoginPageObject.btnGoogle)).click();
    }

    public void clickButtonFacebook() {
        driver.findElement(By.id(ObjectElement.LoginPageObject.btnFacebook)).click();
    }

    @Step("Click Button Login")
    public void testGoToLoginPage() {
        clickButtonLogin();
        String WelcomeAppSwitch = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeTitle)).getText();
        String WelcomeDesc = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeDesc)).getText();
        String OtherWaysTitle = driver.findElement(By.id(ObjectElement.LoginPageObject.txtOtherWaysTitle)).getText();
        if (OtherWaysTitle == "atau bisa pakai") {
            Assert.assertEquals(WelcomeAppSwitch, BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(WelcomeDesc, BaseData.LaunchPage.WELCOME_DESC_ID);
        } else if (OtherWaysTitle == "or use") {
            Assert.assertEquals(WelcomeAppSwitch, BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(WelcomeDesc, BaseData.LaunchPage.WELCOME_DESC_EN);
        }
        driver.resetApp();
    }

    @Step("Click Button Login Without Sign Up")
    public void testLoginAsGuest() {
        clickButtonSkip();
        String ProfileName = driver.findElement(By.id(ObjectElement.MenuPageObject.txtUserProfile)).getText();
        Assert.assertEquals(ProfileName, BaseData.HomePage.GUEST_NAME);
        driver.resetApp();
    }

    @Step("Click Button Sign Up")
    public void testGoToSignUpPage() throws InterruptedException {
        Thread.sleep(2500);
        clickButtonSignUp();
        String WelcomeAppSwitch = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeTitle)).getText();
        String WelcomeDesc = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeDesc)).getText();
        String OtherWaysTitle = driver.findElement(By.id(ObjectElement.LoginPageObject.txtOtherWaysTitle)).getText();
        if (OtherWaysTitle == "atau bisa pakai") {
            Assert.assertEquals(WelcomeAppSwitch, BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(WelcomeDesc, BaseData.LaunchPage.WELCOME_DESC_SIGN_UP_ID);
        } else if (OtherWaysTitle == "or use") {
            Assert.assertEquals(WelcomeAppSwitch, BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(WelcomeDesc, BaseData.LaunchPage.WELCOME_DESC_SIGN_UP_EN);
        }
        driver.resetApp();
    }

    public void testCheckHeaderFooterButton() {
        //From landing page to sign up page
        clickButtonSignUp();
        String TitlePage1 = driver.findElement(By.id(ObjectElement.LoginPageObject.txtLoginTitle)).getText();
        Assert.assertEquals(TitlePage1, BaseData.Validation.VALIDATION_REGISTER_PAGE);
        //From sign up page to login page using button header
        clickButtonHeaderCredential();
        String TitlePage2 = driver.findElement(By.id(ObjectElement.LoginPageObject.txtLoginTitle)).getText();
        Assert.assertEquals(TitlePage2, BaseData.Validation.VALIDATION_LOGIN_PAGE);
        //From login page to sign up using button header
        clickButtonHeaderCredential();
        Assert.assertEquals(TitlePage1, BaseData.Validation.VALIDATION_REGISTER_PAGE);
        //From sign up page to login page using button footer
        clickButtonFooterCredential();
        Assert.assertEquals(TitlePage2, BaseData.Validation.VALIDATION_LOGIN_PAGE);
        //From login page to sign up page using button footer
        clickButtonFooterCredential();
        Assert.assertEquals(TitlePage1, BaseData.Validation.VALIDATION_REGISTER_PAGE);
    }

    public void testSignUpWithGoogle() throws InterruptedException {
        clickButtonSignUp();
        Thread.sleep(2000);
        clickButtonOtherMethod();
        clickButtonGoogle();
    }

    public void testSignUpWithFacebook() throws InterruptedException{
        clickButtonSignUp();
        Thread.sleep(2000);
        clickButtonOtherMethod();
        clickButtonFacebook();
    }


    public void testCloseAppSwitch() {
        driver.closeApp();
    }
}

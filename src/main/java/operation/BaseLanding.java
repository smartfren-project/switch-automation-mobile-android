package operation;

import constants.BaseData;
import constants.ObjectElement;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import io.qameta.allure.*;

import java.io.File;
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

    public void checkTitlePage(String titlePage) {
        String TitlePage = driver.findElement(By.id(ObjectElement.LoginPageObject.txtLoginTitle)).getText();
        Assert.assertEquals(TitlePage, titlePage);
    }

    public void checkValidationWelcomeText(String outTitleEN, String outDescEn, String outDescID) {
        String WelcomeAppSwitch = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeTitle)).getText();
        String WelcomeDesc = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeDesc)).getText();
        String OtherWaysTitle = driver.findElement(By.id(ObjectElement.LoginPageObject.txtOtherWaysTitle)).getText();
        if (OtherWaysTitle.equals("atau bisa pakai")) {
            Assert.assertEquals(WelcomeAppSwitch, outTitleEN);
            Assert.assertEquals(WelcomeDesc, outDescID);
        } else if (OtherWaysTitle.equals("or use")) {
            Assert.assertEquals(WelcomeAppSwitch, outTitleEN);
            Assert.assertEquals(WelcomeDesc, outDescEn);
        }
    }

    public void checkUserProfile(String username) {
        String ProfileName = driver.findElement(By.id(ObjectElement.MenuPageObject.txtUserProfile)).getText();
        Assert.assertEquals(ProfileName, username);
    }

    public void inputUsername(String username) {
        driver.findElement(By.id(ObjectElement.LoginPageObject.inputUserName)).sendKeys(username);
    }

    public void clickButtonSubmitSignUp() {
        driver.findElement(By.id(ObjectElement.LoginPageObject.btnSubmitLogin)).click();
    }

    public void checkValidationRegisteredEmail() {
        String TextInfo = driver.findElement(By.id(ObjectElement.LoginPageObject.txtUserValidationTitle)).getText();
        String DescInfoValidation = driver.findElement(By.id(ObjectElement.LoginPageObject.txtVariousLoginDesc)).getText();
        Assert.assertEquals(BaseData.Validation.VALIDATION_ALREADY_REGISTERED_TITLE_EN, TextInfo);
        Assert.assertEquals(BaseData.Validation.VALIDATION_ALREADY_REGISTERED_DESC_EN, DescInfoValidation);
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnChangeEmail)));
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnSignUp2)));
    }

    @Step("Click Button Login")
    public void testGoToLoginPage() throws InterruptedException {
        clickButtonLogin();
        checkValidationWelcomeText(
                BaseData.LaunchPage.WELCOME_EN,
                BaseData.LaunchPage.WELCOME_DESC_EN,
                BaseData.LaunchPage.WELCOME_DESC_EN);
        Thread.sleep(3000);
    }

    @Step("Click Button Login Without Sign Up")
    public void testLoginAsGuest() throws InterruptedException{
        clickButtonSkip();
        checkUserProfile(BaseData.HomePage.GUEST_NAME);
        Thread.sleep(3000);
    }

    @Step("Click Button Sign Up")
    public void testGoToSignUpPage() throws InterruptedException {
        Thread.sleep(3000);
        clickButtonSignUp();
        checkValidationWelcomeText(
                BaseData.LaunchPage.WELCOME_EN,
                BaseData.LaunchPage.WELCOME_DESC_SIGN_UP_EN,
                BaseData.LaunchPage.WELCOME_DESC_SIGN_UP_EN
        );
        Thread.sleep(3000);
    }

    public void testCheckHeaderFooterButton() throws InterruptedException {
        //From landing page to sign up page
        clickButtonSignUp();
        checkTitlePage(BaseData.Validation.VALIDATION_REGISTER_PAGE);
        //From sign up page to login page using button header
        clickButtonHeaderCredential();
        checkTitlePage(BaseData.Validation.VALIDATION_LOGIN_PAGE);
        //From login page to sign up using button header
        clickButtonHeaderCredential();
        checkTitlePage(BaseData.Validation.VALIDATION_REGISTER_PAGE);
        //From sign up page to login page using button footer
        clickButtonFooterCredential();
        checkTitlePage(BaseData.Validation.VALIDATION_LOGIN_PAGE);
        //From login page to sign up page using button footer
        clickButtonFooterCredential();
        checkTitlePage(BaseData.Validation.VALIDATION_REGISTER_PAGE);
        Thread.sleep(3000);
    }

    public void testSignUpWithGoogle() throws InterruptedException {
        clickButtonSignUp();
        Thread.sleep(3000);
        clickButtonOtherMethod();
        clickButtonGoogle();
        Thread.sleep(3000);
    }

    public void testSignUpWithFacebook() throws InterruptedException{
        clickButtonSignUp();
        Thread.sleep(2000);
        clickButtonOtherMethod();
        clickButtonFacebook();
        Thread.sleep(3000);
    }

    public void testInvalidSignUpWithRegisteredEmail() throws InterruptedException {
        clickButtonSignUp();
        inputUsername(BaseData.Login.EMAIL_ID);
        clickButtonSubmitSignUp();
        checkValidationRegisteredEmail();
        Thread.sleep(3000);
    }

    public void testCloseAppSwitch() throws InterruptedException{
        closeApp();
    }
}

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

    @Step("Click Button Login")
    public void testGoToLoginPage() throws InterruptedException {
        clickButtonLogin();
        checkValidationWelcomeText(
                BaseData.LaunchPage.WELCOME_EN,
                BaseData.LaunchPage.WELCOME_DESC_ID,
                BaseData.LaunchPage.WELCOME_DESC_EN);
        Thread.sleep(1500);
        resetApp();
    }

    @Step("Click Button Login Without Sign Up")
    public void testLoginAsGuest() throws InterruptedException{
        clickButtonSkip();
        checkUserProfile(BaseData.HomePage.GUEST_NAME);
        Thread.sleep(1500);
        resetApp();
    }

    @Step("Click Button Sign Up")
    public void testGoToSignUpPage() throws InterruptedException {
        Thread.sleep(2500);
        clickButtonSignUp();
        checkValidationWelcomeText(
                BaseData.LaunchPage.WELCOME_EN,
                BaseData.LaunchPage.WELCOME_DESC_SIGN_UP_ID,
                BaseData.LaunchPage.WELCOME_DESC_SIGN_UP_EN
        );
        Thread.sleep(1500);
        resetApp();
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
        Thread.sleep(1500);
        resetApp();
    }

    public void testSignUpWithGoogle() throws InterruptedException {
        clickButtonSignUp();
        Thread.sleep(2000);
        clickButtonOtherMethod();
        clickButtonGoogle();
        resetApp();
    }

    public void testSignUpWithFacebook() throws InterruptedException{
        clickButtonSignUp();
        Thread.sleep(2000);
        clickButtonOtherMethod();
        clickButtonFacebook();
        resetApp();
    }


    public void testCloseAppSwitch() throws InterruptedException{
        closeApp();
    }
}

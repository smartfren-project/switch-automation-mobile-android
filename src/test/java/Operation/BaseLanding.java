package Operation;

import Data.BaseData;
import Data.ObjectElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.qameta.allure.*;

import java.net.MalformedURLException;

public class BaseLanding extends Driver {
    public void launchAppSwitch() throws MalformedURLException {
        setupAppium();
    }

    @Step("Click Button Login")
    public void testGoToLoginPage() {
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnLogin)).click();
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
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnSkip)).click();
        String ProfileName = driver.findElement(By.id(ObjectElement.MenuPageObject.txtUserProfile)).getText();
        Assert.assertEquals(ProfileName, BaseData.HomePage.GUEST_NAME);
        driver.resetApp();
    }

    @Step("Click Button Sign Up")
    public void testGoToSignUpPage() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnSignUp)).click();
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


    public void testCloseAppSwitch() {
        closeApp();
    }
}

package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import io.qameta.allure.*;

import java.io.File;
import java.net.MalformedURLException;

public class BaseLanding extends BaseTest {
    public void clickButtonLogin() {
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnLogin)).click();
    }
//    private By clickButtonLogin = By.id(ObjectElement.LandingPageObject.btnLogin);

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

    public String titlePage() {
        String titlePage = driver.findElement(By.id(ObjectElement.LoginPageObject.txtLoginTitle)).getText();
        try {
            return String.valueOf(titlePage);
        } catch (Exception e) {
            return null;
        }
    }

    public String welcomeTitle() {
        String welcomeAppSwitch = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeTitle)).getText();
        try {
            return String.valueOf(welcomeAppSwitch);
        } catch (Exception e) {
            return null;
        }
    }

    public String welcomeDesc() {
        String wDesc = driver.findElement(By.id(ObjectElement.LoginPageObject.txtWelcomeDesc)).getText();
        try {
            return String.valueOf(wDesc);
        } catch (Exception e) {
            return null;
        }
    }

    public String langCenter() {
        String owTitle = driver.findElement(By.id(ObjectElement.LoginPageObject.txtOtherWaysTitle)).getText();
        try {
            return String.valueOf(owTitle);
        } catch (Exception e) {
            return null;
        }
    }

    public void checkValidationWelcomeText() {
        if (langCenter().equals("atau bisa pakai") && titlePage().equals(BaseData.Validation.VALIDATION_LOGIN_PAGE)) {
            Assert.assertEquals(welcomeTitle(), BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(welcomeDesc(), BaseData.LaunchPage.WELCOME_DESC_ID);
        } else if (langCenter().equals("or use") && titlePage().equals(BaseData.Validation.VALIDATION_LOGIN_PAGE)) {
            Assert.assertEquals(welcomeTitle(), BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(welcomeDesc(), BaseData.LaunchPage.WELCOME_DESC_EN);
        } else if (langCenter().equals("atau bisa pakai") && titlePage().equals(BaseData.Validation.VALIDATION_REGISTER_PAGE)) {
            Assert.assertEquals(welcomeTitle(), BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(welcomeDesc(), BaseData.LaunchPage.WELCOME_DESC_SIGN_UP_ID);
        } else {
            Assert.assertEquals(welcomeTitle(), BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(welcomeDesc(), BaseData.LaunchPage.WELCOME_DESC_SIGN_UP_EN);
        }
    }

    public void checkValidationPINPage() {
        String pinTitle = driver.findElement(By.id(ObjectElement.PINPageObject.txtPINPageTitle)).getText();
        String pinDesc = driver.findElement(By.id(ObjectElement.PINPageObject.txtPINInputDesc)).getText();

    }

    public void checkUserProfile(String username) {
        String ProfileName = driver.findElement(By.id(ObjectElement.MenuPageObject.txtUserProfile)).getText();
        Assert.assertEquals(ProfileName, username);
    }

    public void clickButtonSubmitSignUp() {
        driver.findElement(By.id(ObjectElement.LoginPageObject.btnSubmitLogin)).click();
    }

    public void clickButtonGoogleAccount() {
        driver.findElement(By.id(ObjectElement.LoginPageObject.btnGoogleAccount)).click();
    }
}

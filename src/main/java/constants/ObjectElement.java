package Data;

import Operation.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ObjectElement extends Driver {

    public interface LandingPageObject {
        String btnLogin = "com.smartfren.switchmobile:id/skip";
        String btnSignUp = "com.smartfren.switchmobile:id/Next";
        String btnSkip = "com.smartfren.switchmobile:id/skip_new";
        String txtBannerTitle = "com.smartfren.switchmobile:id/slideheading";
        String txtBannerDesc = "com.smartfren.switchmobile:id/slidedec";
    }

    public interface LoginPageObject {
        String btnBack = "com.smartfren.switchmobile:id/imageView2";
        String btnGoLogin = "com.smartfren.switchmobile:id/signup";
        WebElement btnSignUp = driver.findElement(By.id("com.smartfren.switchmobile:id/login"));
        String txtWelcomeTitle = "com.smartfren.switchmobile:id/textView1";
        String txtWelcomeDesc = "com.smartfren.switchmobile:id/firstName";
        String inputUserName = "com.smartfren.switchmobile:id/email";
        String btnSubmitLogin = "com.smartfren.switchmobile:id/registration_button";
        String txtOtherWaysTitle = "com.smartfren.switchmobile:id/textView13";
        WebElement btnOtherMethods = driver.findElement(By.id("com.smartfren.switchmobile:id/social_media_btn"));
        WebElement txtQuestAccountTitle = driver.findElement(By.id("com.smartfren.switchmobile:id/already_have_account"));
        WebElement btnQuestSignUp = driver.findElement(By.id("com.smartfren.switchmobile:id/login_here"));
        WebElement txtVariousLoginTitle = driver.findElement(By.id("com.smartfren.switchmobile:id/txt_get_various_rewards"));
        WebElement btnGoogle = driver.findElement(By.id("com.smartfren.switchmobile:id/btn_login_google"));
        WebElement btnFacebook = driver.findElement(By.id("com.smartfren.switchmobile:id/btn_login_facebook"));
    }

    public interface PINPageObject {
        WebElement txtPINPageTitle = driver.findElement(By.id("com.smartfren.switchmobile:id/textView"));
        WebElement txtPINInputDesc = driver.findElement(By.id("com.smartfren.switchmobile:id/textView2"));
        String inputPIN = "com.smartfren.switchmobile:id/pinnumber";
        WebElement btnForgotPIN = driver.findElement(By.id("com.smartfren.switchmobile:id/textView3"));
        WebElement txtOtherWaysTitle = driver.findElement(By.id("com.smartfren.switchmobile:id/textView5"));
        WebElement txtLoginAnotherAccount = driver.findElement(By.id("com.smartfren.switchmobile:id/textView18"));
        WebElement btnLoginAnotherAccount = driver.findElement(By.id("com.smartfren.switchmobile:id/clickhere"));
    }

    public interface MenuPageObject {
        String btnHome = "com.smartfren.switchmobile:id/home";
        String btnDeals = "com.smartfren.switchmobile:id/reward";
        String btnQuest = "com.smartfren.switchmobile:id/tasks";
        String btnHistory = "com.smartfren.switchmobile:id/history";
        String btnProfile = "com.smartfren.switchmobile:id/profile";
        String txtUserProfile = "com.smartfren.switchmobile:id/username";
    }

    public interface ProfilePageObject {
        String txtDealsTilte = "com.smartfren.switchmobile:id/deals";
        String btnLogout = "com.smartfren.switchmobile:id/logout";
        String btnConfirmLogout = "android:id/button1";
    }
}

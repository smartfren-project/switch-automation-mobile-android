package constants;

import operation.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ObjectElement extends BaseTest {

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
        String btnSignUp = "com.smartfren.switchmobile:id/login";
        String txtWelcomeTitle = "com.smartfren.switchmobile:id/textView1";
        String txtWelcomeDesc = "com.smartfren.switchmobile:id/firstName";
        String inputUserName = "com.smartfren.switchmobile:id/email";
        String btnSubmitLogin = "com.smartfren.switchmobile:id/registration_button";
        String txtOtherWaysTitle = "com.smartfren.switchmobile:id/textView13";
        String btnOtherMethods = "com.smartfren.switchmobile:id/social_media_btn";
        String txtQuestAccountTitle = "com.smartfren.switchmobile:id/already_have_account";
        String btnQuestSignUp = "com.smartfren.switchmobile:id/login_here";
        String txtVariousLoginDesc = "com.smartfren.switchmobile:id/txt_get_various_rewards";
        String btnGoogle = "com.smartfren.switchmobile:id/btn_login_google";
        String btnFacebook = "com.smartfren.switchmobile:id/btn_login_facebook";
        String txtUserValidationTitle = "com.smartfren.switchmobile:id/title";
        String btnChangeEmail = "com.smartfren.switchmobile:id/btn_change_email";
        String btnSignUp2 = "com.smartfren.switchmobile:id/btn_signUp";
        String txtLoginTitle = "com.smartfren.switchmobile:id/signup";
        String txtErrorInputDesc = "com.smartfren.switchmobile:id/validation_txt";
    }

    public interface SignUpPageObject {
        String btnLogin = "com.smartfren.switchmobile:id/login";
        String btnLoginHere = "com.smartfren.switchmobile:id/login_here";
    }

    public interface PINPageObject {
        String txtPINPageTitle = "com.smartfren.switchmobile:id/textView";
        String txtPINInputDesc = "com.smartfren.switchmobile:id/textView2";
        String inputPIN = "com.smartfren.switchmobile:id/pinnumber";
        String btnForgotPIN = "com.smartfren.switchmobile:id/textView3";
        String txtOtherWaysTitle = "com.smartfren.switchmobile:id/textView5";
        String txtLoginAnotherAccount = "com.smartfren.switchmobile:id/textView18";
        String btnLoginAnotherAccount = "com.smartfren.switchmobile:id/clickhere";
    }

    public interface MenuPageObject {
        String btnHome = "com.smartfren.switchmobile:id/home";
        String btnDeals = "com.smartfren.switchmobile:id/reward";
        String btnQuest = "com.smartfren.switchmobile:id/tasks";
        String btnHistory = "com.smartfren.switchmobile:id/history";
        String btnProfile = "com.smartfren.switchmobile:id/profile";
        String txtUserProfile = "com.smartfren.switchmobile:id/username";
        String btnNotification = "com.smartfren.switchmobile:id/im_notification";
    }

    public interface ProfilePageObject {
        String txtHeaderTitle = "com.smartfren.switchmobile:id/profile";
        String txtNameUserTitle = "com.smartfren.switchmobile:id/name_user";
        String txtEmailUserTitle = "com.smartfren.switchmobile:id/user_email";
        String btnEdit = "com.smartfren.switchmobile:id/edit_profile";
        String txtDealsTitle = "com.smartfren.switchmobile:id/deals";
        String btnLogout = "com.smartfren.switchmobile:id/logout";
        String btnConfirmLogout = "android:id/button1";
        String inputFullName = "com.smartfren.switchmobile:id/user_name";
    }
}

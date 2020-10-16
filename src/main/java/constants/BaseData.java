package constants;

public class BaseData {

    public interface Login {
        String EMAIL_ID = "satriopanjiprakoso@gmail.com";
        String PIN = "545454";
        String UNREGISTERED_EMAIL_ID = "haris@smart.com";
        String SWITCH_NUMBER = "088906011294";
        String WRONG_NUMBER = "08881850440";
        String PIN2 = "111111";
        String ALPHABET = "abcde";
        String LESS_SWITCH_NUMBER = "12345678";
        String LESS_EMAIL = "a@a.c";
        String EMAIL_ID2 = "satriopanjiprakoso@gmail.com";
    }

    public interface LaunchPage {
        String WELCOME_EN = "Hi, There!";
        String WELCOME_SIGNUP_EN = "Hi Switizen";
        String WELCOME_DESC_EN = "You can log in by using email or switch number that has been registered.";
        String WELCOME_DESC_ID = "Kamu bisa log in menggunakan email atau nomor switch yang telah terdaftar.";
        String WELCOME_DESC_SIGN_UP_EN = "Enter your email address or register via social media.";
        String WELCOME_DESC_SIGN_UP_ID = "Silakan daftar melalui email atau sosial media.";
    }

    public interface Validation {
        String VALIDATION_USERNAME_TITLE_EN = "Email Not Registered";
        String VALIDATION_USERNAME_DESC_EN = "You can register and create your account now!";
        String VALIDATION_LOGIN_PAGE = "Log in";
        String VALIDATION_REGISTER_PAGE = "Sign up";
        String VALIDATION_USERNAME_1 = "Faizal Akbar Prakoso";
        String VALIDATION_USERNAME_2 = "Satrio Panji Prakoso";
        String VALIDATION_ALT_PHONE_1 = "+628194120194";
        String VALIDATION_ALT_PHONE_2 = "+628881850440";
        String VALIDATION_ALREADY_REGISTERED_TITLE_EN = "Email Registered";
        String VALIDATION_ALREADY_REGISTERED_DESC_EN = "You can log in to your switch account now!";
        String VALIDATION_WRONG_SWITCH_NUMBER = "The number is incorrect, please enter your email or switch number";
        String VALIDATION_TITLE_ORDER_SIM = "Got Your SIM Card?";
        String VALIDATION_DESC_ORDER_SIM = "Activate it now or order one if you haven't! ";
    }

    public interface HomePage {
        String GUEST_NAME = "Hi, Guest";
    }

    public interface TestDescription {
        String USER_ABLE_TO = "";
    }

    public interface ApplicationInformation {
        String UDID_NAME = "emulator-5554";
        String ANDROID_PLATFORM_NAME = "ANDROID";
        String ANDROID_PLATFORM_VERSION = "8.1.0";
        String ANDROID_APPLICATION_PACKAGE = "com.smartfren.switchmobile";
        String ANDROID_APPLICATION_ACTIVITY = "com.smartfren.switchmobile.views.activities.SplashScreenActivity";
    }

    public interface PCloudInformation {
        String USERNAME = "pramoda.kumar@smartfren.com";
        String API_KEY = "ybrf4d2k3jv496f5x53w93wc";
        String APL_NAME = "switch.apk";
        String DEVICE_NAME = "SAMSUNG_GalaxyS9_Android_10.0.0";
    }

    public interface ReferralValidation {
        String REFERRAL_TITLE = "Referral Code";
        String REFERRAL_DESC = "Share this referral code to your friends.So you and your friends will get an amazing rewards!";
    }
}

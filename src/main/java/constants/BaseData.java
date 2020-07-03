package Data;

public class BaseData {

    public interface Login {
        String EMAIL_ID = "david@smartfren.com";
        String PIN = "111111";
        String INVALID_EMAIL_ID = "haris@smart.com";
    }

    public interface LaunchPage {
        String WELCOME_EN = "Hi, There!";
        String WELCOME_DESC_EN = "You can log in by using email or switch number that has been registered.";
        String WELCOME_DESC_ID = "Kamu bisa log in menggunakan email atau nomor switch yang telah terdaftar.";
        String WELCOME_DESC_SIGN_UP_EN = "Enter your email address or register via social media.";
        String WELCOME_DESC_SIGN_UP_ID = "";

    }

    public interface HomePage {
        String GUEST_NAME = "Hi, Guest";
    }
}

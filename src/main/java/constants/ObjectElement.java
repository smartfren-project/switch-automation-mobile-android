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
        String btnEmail = "com.smartfren.switchmobile:id/txt_email";
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
        String btnGoogleAccount = "com.google.android.gms:id/container";
        String inputOTP = "com.smartfren.switchmobile:id/linearLayout";
        String inputOTP1 = "com.smartfren.switchmobile:id/otp1";
        String inputOTP2 = "com.smartfren.switchmobile:id/otp2";
        String inputOTP3 = "com.smartfren.switchmobile:id/otp3";
        String inputOTP4 = "com.smartfren.switchmobile:id/otp4";
    }

    public interface SignUpPageObject {
        String btnLogin = "com.smartfren.switchmobile:id/login";
        String btnLoginHere = "com.smartfren.switchmobile:id/login_here";
        String txtTitleSignUp = "com.smartfren.switchmobile:id/textView1";
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
        String btnProfile = "//android.widget.FrameLayout[@content-desc=\"Profile\"]";
        String txtUserProfile = "com.smartfren.switchmobile:id/username";
        String btnNotification = "com.smartfren.switchmobile:id/im_notification";
        String addPopUp = "com.smartfren.switchmobile:id/com_appboy_inappmessage_modal_imageview";
        String btnClosePopup = "com.smartfren.switchmobile:id/com_appboy_inappmessage_modal_close_button";
        String popUpLocation = "com.smartfren.switchmobile:id/alertTitle";
        String buttonConfirmPopup = "android:id/button1";
        String planBox = "com.smartfren.switchmobile:id/constraintLayout12";
        String btnBuyProduct = "com.smartfren.switchmobile:id/buy";
        String btnCloseGuestPp = "com.smartfren.switchmobile:id/img_close";
        String btnLetsSwitch = "com.smartfren.switchmobile:id/button_activate";
        String txtDealsTitle = "com.smartfren.switchmobile:id/textView118";
        String txtMainCard = "com.smartfren.switchmobile:id/title";
        String txtDescMainCard = "com.smartfren.switchmobile:id/description";
        String btnPlan = "com.smartfren.switchmobile:id/btn_fab";
        String btnDetail = "com.smartfren.switchmobile:id/buy";
        String txtBalance = "com.smartfren.switchmobile:id/txtInternet";
        String txtSMSRemaining = "com.smartfren.switchmobile:id/txtSms";
        String txtCallRemaining = "com.smartfren.switchmobile:id/txtCall";
        String txtDataRemaining = "com.smartfren.switchmobile:id/pack_name";
        String btnCustomNow = "//*[@text='Custom Now']";
        String btnBigMission = "//*[@text='Get Now!']";
        String btnECommerce = "//*[@text='Up To 35.000']";
        String btnMixAndMax = "com.smartfren.switchmobile:id/img_mix_n_match";
        String btnSeeAllNews = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/seeall_news\"));";
        String btnFirstNews = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_trending_news\")).scrollIntoView("
                + "new UiSelector().xpath(\"/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/" +
                "android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/" +
                "android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/" +
                "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/" +
                "android.widget.TextView[1]\"));";
        String btnBack = "com.smartfren.switchmobile:id/back_button";
        String txtAlertLocTitle = "com.smartfren.switchmobile:id/alertTitle";
        String btnAllowLoc = "android:id/button1";
    }

    public interface DealsPageObject {
        String btnPoint = "com.smartfren.switchmobile:id/btn_points";
        String txtPointValue = "com.smartfren.switchmobile:id/points_value";
        String btnRuby = "com.smartfren.switchmobile:id/btn_ruby";
        String txtRubyValue = "com.smartfren.switchmobile:id/ruby_value";
        String btnSeeAllSpecialDeals = "//*[@resource-id='com.smartfren.switchmobile:id/txt_see_all'][1]";
        String btnSeeAllVoucher = "com.smartfren.switchmobile:id/im_notification";
        String btnSeeMore = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_view\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/txt_browse_deals\"));";
        String btnBuyVoucher = "com.smartfren.switchmobile:id/btn_get";
        String txtPointPrice = "com.smartfren.switchmobile:id/txt_points";
        String txtRubyPrice = "com.smartfren.switchmobile:id/txt_ruby";
    }

    public interface HistoryPageObject {
        String btnTabAll = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"All\"));";
        String btnTabWaiting = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"Waiting\"));";
        String btnTabProcessTrx = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"In Process\"));";
        String btnFinishTrx = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"Completed\"));";
        String btnTabSemua = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"Semua\"));";
        String btnTabMenunggu = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"Menunggu\"));";
        String btnTabDiProses = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"Pesanan Diproses\"));";
        String btnTabSelesai = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"Pesanan Selesai\"));";
        String textHistoryMenuTitle = "com.smartfren.switchmobile:id/head_title";
    }

    public interface ProductPageObject {
        String txtProductTitle = "com.smartfren.switchmobile:id/textView83";
        String btnAddToCart = "com.smartfren.switchmobile:id/buy_now";
        String txtCheckPriceDesc = "com.smartfren.switchmobile:id/textView105";
        String btnDecrease = "com.smartfren.switchmobile:id/decrease";
        String btnIncrease = "com.smartfren.switchmobile:id/increase";
        String productCardOne = "//android.widget.FrameLayout[@index='0']";
        String productCardTwo = "//android.widget.FrameLayout[@index='1']";
        String productCardThree = "//android.widget.FrameLayout[@index='2']";
        String productCardFour = "//android.widget.FrameLayout[@index='4']";
        String btnConfirmBuy = "com.smartfren.switchmobile:id/button6";
        String btnChoosePayment = "com.smartfren.switchmobile:id/button4";
        String btnSeeDetail = "com.smartfren.switchmobile:id/txt_see_details";
        String btnCustomPlan = "com.smartfren.switchmobile:id/img_mix_n_match";
        String btnPromoSuperBundle = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                + "new UiSelector().text(\"Super Bar\"));";
        String btnPromoPowerBundle = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                + "new UiSelector().text(\"Power Bar\"));";
        String btnPromoStandardBundle = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                + "new UiSelector().text(\"Standard Bar\"));";
        String btnPromoLiteBundle = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                + "new UiSelector().text(\"Lite Bar\"));";
        String btnOrderSIMHomeID = "//*[@text='YUK, MULAI']";
        String btnOrderSIMHomeEN = "//*[@text='LET'S SWITCH']";
        String btnBasePlan = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"Base Plan\"));";
        String btnAddOn = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"Add-on\"));";
        String btnBalancePlan = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"Balance Plan\"));";
        String btnRoaming = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/tab_layout\")).scrollIntoView("
                + "new UiSelector().text(\"Roaming\"));";
        String btnToken100 = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                + "new UiSelector().text(\"Token 100\"));";
        String btnToken50 = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                + "new UiSelector().text(\"Token 50\"));";
        String btnToken20 = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                + "new UiSelector().text(\"Token 20\"));";
        String btnToken10 = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                + "new UiSelector().text(\"Token 10\"));";
        String btnInfluencer = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/plan_recyler\")).scrollIntoView("
                + "new UiSelector().text(\"Influencer\"));";
        String btnMovieMania = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/plan_recyler\")).scrollIntoView("
                + "new UiSelector().text(\"Movie Mania\"));";
        String btnGamer = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/plan_recyler\")).scrollIntoView("
                + "new UiSelector().text(\"Gamer\"));";
        String btnExecutive = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/plan_recyler\")).scrollIntoView("
                + "new UiSelector().text(\"Executive\"));";
        String btnEditNumber = "com.smartfren.switchmobile:id/edit_mdn";
        String btnEditCustomPlan = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/nestedScroll\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/txt_change\"));";;
        String txtAmountProduct = "com.smartfren.switchmobile:id/textView105";
        String txtAmountRewardPoint = "com.smartfren.switchmobile:id/textView101";
    }

    public interface ProfilePageObject {
        String txtHeaderTitle = "com.smartfren.switchmobile:id/profile";
        String txtNameUserTitle = "com.smartfren.switchmobile:id/name_user";
        String txtEmailUserTitle = "com.smartfren.switchmobile:id/user_email";
        String btnEdit = "com.smartfren.switchmobile:id/edit_profile";
        String txtDealsTitle = "com.smartfren.switchmobile:id/deals";
        String btnLogout = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/logout\"));";
        String btnConfirmLogout = "android:id/button1";
        String btnLanguage = "com.smartfren.switchmobile:id/langText";
        String btnBahasa = "com.smartfren.switchmobile:id/indonesia";
        String btnEnglish = "com.smartfren.switchmobile:id/english";
        String btnCancelChangeLang = "com.smartfren.switchmobile:id/cancel";
        String btnSeeAllFavorite = "com.smartfren.switchmobile:id/textView37";
        String scrollView = "com.smartfren.switchmobile:id/scrollView2";
        String btnLoginHere = "com.smartfren.switchmobile:id/clickhere";
        String btnReferral = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/button3\"));";
        String btnYourWishList = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/wishlist\"));";
        String btnSolveMission = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/textView119\"));";
        String btnAccount = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/account_txt\"));";
        String btnSIMSetting = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/sim_setting\"));";
        String btnCLanguage = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/language\"));";
        String btnHelp = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/help\"));";
        String inputHomeOrOffice = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/txt_address_type\"));";
        String inputRecipientName = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/recName\"));";
        String inputRecipientNumber = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/recPhone\"));";
        String btnCityOrDistrict = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/recCity\"));";
        String inputCityOrDistrict = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/edt_search\"));";
        String inputAddressDetail = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/recDetails\"));";
        String btnChooseLocation = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/img_view_map\"));";
        String cbTermsAndConditions = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/checkBox\"));";
        String btnSave = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/next\"));";
        String btnTrxHistory = "com.smartfren.switchmobile:id/txn_history";
        String txtPointsValue = "com.smartfren.switchmobile:id/textView122";
        String txtRubiesValue = "com.smartfren.switchmobile:id/textView124";
        String btnCancelLogout = "android:id/button2";
        String btnChat = "com.smartfren.switchmobile:id/txt_chat";
        String btnChatWithShelly = "com.smartfren.switchmobile:id/txt_chat_with_us";
        String btnEmail = "com.smartfren.switchmobile:id/txt_email";
        String btnFAQ = "com.smartfren.switchmobile:id/txt_faq";
    }

    public interface EditProfileObject {
        String inputFullName = "com.smartfren.switchmobile:id/user_name";
        String btnSubmitChangeProfile = "com.smartfren.switchmobile:id/save";
        String inputAlternatePhoneNumber = "com.smartfren.switchmobile:id/user_alter_number";
    }

    public interface ReferralObject {
        String btnBack = "com.smartfren.switchmobile:id/back";
        String txtHeadTitleMenu = "com.smartfren.switchmobile:id/head_title";
        String txtReferralTitle = "com.smartfren.switchmobile:id/textView45";
        String txtReferralDesc = "com.smartfren.switchmobile:id/textView51";
        String txtReferralCode = "com.smartfren.switchmobile:id/textView133_referral_code";
        String btnCopyRef = "com.smartfren.switchmobile:id/textView125_copy";
        String btnShareRef = "com.smartfren.switchmobile:id/share";
    }

    public interface AccountObject {
        String txtChangePinTitle = "com.smartfren.switchmobile:id/textView";
        String txtChangePinDesc = "com.smartfren.switchmobile:id/textView2";
        String inputPin = "com.smartfren.switchmobile:id/pinnumber";
        String btnNext = "com.smartfren.switchmobile:id/button";
        String btnClose = "com.smartfren.switchmobile:id/close";
        String btnChangePin = "com.smartfren.switchmobile:id/change_pin";
        String btnDeliveryAddress = "com.smartfren.switchmobile:id/address";
        String btnAddAddress = "com.smartfren.switchmobile:id/save";
        String inputHomeOrOfficeName = "com.smartfren.switchmobile:id/txt_address_type";
        String inputRecipientName = "com.smartfren.switchmobile:id/recName";
        String inputRecipientNumber = "com.smartfren.switchmobile:id/recPhone";
        String btnCityOrDistrict = "com.smartfren.switchmobile:id/recCity";
        String inputSearchCityOrDistrict = "com.smartfren.switchmobile:id/edt_search";
        String btnSelectCityOrDistrict = "com.smartfren.switchmobile:id/tv_places";
        String inputAddressDetail = "com.smartfren.switchmobile:id/recDetails";
        String btnChooseLocation = "com.smartfren.switchmobile:id/img_view_map";
        String btnSearchLocation = "com.smartfren.switchmobile:id/edt_search";
        String inputSearchGoogleLocation = "android:id/search_src_text";
        String btnSelectGoogleLocation = "com.smartfren.switchmobile:id/address_text";
        String btnSelectThisLocation = "com.smartfren.switchmobile:id/btn_select_location";
        String cbTermsAndCondition = "com.smartfren.switchmobile:id/checkBox";
        String btnSave = "com.smartfren.switchmobile:id/next";
    }

    public interface SIMSettingObject {
        String btnSimInfo = "com.smartfren.switchmobile:id/siminfo";
        String btnCheckCompatibility = "com.smartfren.switchmobile:id/compatib";
    }

    public interface OrderSIMNumberPage {
        String btnMainNumber = "com.smartfren.switchmobile:id/textView6";
        String btnFirstNumber = "com.smartfren.switchmobile:id/num1";
        String btnSecondNumber = "com.smartfren.switchmobile:id/num2";
        String btnThirdNumber = "com.smartfren.switchmobile:id/num3";
        String btnFourthNumber = "com.smartfren.switchmobile:id/num4";
        String btnFifthNumber = "com.smartfren.switchmobile:id/num5";
        String btnSixthNumber = "com.smartfren.switchmobile:id/num6";
        String btnSelectNumber = "com.smartfren.switchmobile:id/cv1";
        String btnNext = "com.smartfren.switchmobile:id/next";
        String btnChooseMainNumber = String.format("//*[@text = '']");
        String btnRefresh = "com.smartfren.switchmobile:id/textView12";
        String txtOrderSIMTitle = "com.smartfren.switchmobile:id/textView93";
        String txtOrderSIMDesc = "com.smartfren.switchmobile:id/activate_text";
        String btnSIMCardActivation = "com.smartfren.switchmobile:id/constraint_scan_main";
        String btnOrderSIM = "com.smartfren.switchmobile:id/constraint_sim_main";
        String btnClose = "com.smartfren.switchmobile:id/close";
    }

    public interface DeliveryAddressObject {
        String txtTitle = "com.smartfren.switchmobile:id/textView";
        String inputRecipientName = "com.smartfren.switchmobile:id/recName";
        String inputRecipientPhoneNumber = "com.smartfren.switchmobile:id/recPhone";
        String btnCity = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/recCity\"));";
        String inputZipCode = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/recArea\"));";
        String inputAddressDetail = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/recDetails\"));";
        String btnGoogleLocation = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/img_view_map\"));";
        String cbTermsAndConditions = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/checkBox\"));";
        String btnContinue = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/next\"));";
        String btnEditAddress = "com.smartfren.switchmobile:id/edit_address";
    }

    public interface PaymentDetailObject {
        String txtDetailTitle = "com.smartfren.switchmobile:id/txt_payment_heading";
        String txtTotalAmount = "com.smartfren.switchmobile:id/total_amt_aft_discount";
        String btnCloseDetail = "com.smartfren.switchmobile:id/img_close";
        String btnContinue = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/slDetail\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/continue_payment_btn\"));";
        String btnCancel = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/slDetail\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/cancel_order_txt\"));";

        /* E-Money */
        String btnGopay = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                + "new UiSelector().text(\"GoPay\"));";
        String btnDana = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                + "new UiSelector().text(\"DANA\"));";
        String btnOVO = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                + "new UiSelector().text(\"OVO\"));";
        String btnShopeePay = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                + "new UiSelector().text(\"ShopePay\"));";

        /*Credit Or Debit Card*/
        String btnCC = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                + "new UiSelector().text(\"Visa/Master\"));";
        String btnCCWithJCB = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                + "new UiSelector().text(\"Visa/Master/JCB\"));";

        /*Virtual Account*/
        String btnVAPermata = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                + "new UiSelector().text(\"Permata Virtual Account\"));";
        String btnVADanamon = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                + "new UiSelector().text(\"Danamon Virtual Account\"));";
        String btnVAMandiri = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                + "new UiSelector().text(\"Mandiri Virtual Account\"));";
        String btnAlfamart = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                + "new UiSelector().text(\"Alfamart\"));";
        String btnDelivery = "com.smartfren.switchmobile:id/cardViewDelivery";
        String btnSelecrJNEReg = "//*[@text='JNE regular (2 - 7 days)']";
        String btnSimGoPay = "//*[@text='Go Pay']";
        String btnSimDana = "//*[@text='DANA']";
        String btnSimOVO = "//*[@text='OVO']";
        String btnSimCC = "//*[@text='Visa/Master']";
        String btnPay = "com.smartfren.switchmobile:id/btn_pay";
        String btnSeeTrxStat = "com.smartfren.switchmobile:id/btn_payment_status";
        String txtJNERegPrice = "com.smartfren.switchmobile:id/delivery_amt";
        String btnBuy = "com.smartfren.switchmobile:id/btn_buy";
    }

    public interface ConfirmationAddressObject {
        String txtTitle = "com.smartfren.switchmobile:id/txt_confirmation";
        String txtQuestion = "com.smartfren.switchmobile:id/txt_question";
        String btnContinue = "com.smartfren.switchmobile:id/btn_continue";
        String btnRecheck = "com.smartfren.switchmobile:id/txt_recheck";
        String btnClosePp = "com.smartfren.switchmobile:id/img_close";
    }

    public interface QuestPagesObject {
        String imgAvatar = "com.smartfren.switchmobile:id/imageView19";
        String txtPlayerName = "com.smartfren.switchmobile:id/textView130";
        String btnMission = "com.smartfren.switchmobile:id/missions";
        String btnProgress = "com.smartfren.switchmobile:id/progress";
        String btnGames = "com.smartfren.switchmobile:id/games_btn";
        String btnRank = "com.smartfren.switchmobile:id/textView135";
        String btnCheckLoginQuest = "com.smartfren.switchmobile:id/constraint_daily_login";
        String btnSeeAllBigMission = "com.smartfren.switchmobile:id/txt_see_all";
        String btnLetsStartQuestWorld = "com.smartfren.switchmobile:id/btn_lets_start";
        String btnCancelQuestWorld = "com.smartfren.switchmobile:id/txt_later";
        String btnPlayMission = "com.smartfren.switchmobile:id/btn_main";
    }

    public interface HomePopupObject {
        String txtServicePlanAd = "com.smartfren.switchmobile:id/tvMid";
        String txtServicePlanAdDesc = "com.smartfren.switchmobile:id/tvSubMid";
        String btnConfirmServicePlanAd = "com.smartfren.switchmobile:id/btnDone";
    }

    public interface GamesPageObject {
        String txtFinalGamesTitle = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/viewpager\")).scrollIntoView("
                + "new UiSelector().text(\"Farty Dog\"));";
        String btnActionGames = "//*[@text='Action']";
        String txtFinalActionGames = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/viewpager\")).scrollIntoView("
                + "new UiSelector().text(\"Rock Paper Scissor Warrior\"));";
        String btnClosePopup = "com.smartfren.switchmobile:id/img_close";
        String txtFirstGamesTitle = "new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/viewpager\")).scrollIntoView("
                + "new UiSelector().text(\"Dream Cloud\"));";
        String btnLetsPlay = "com.smartfren.switchmobile:id/btn_lets_start_playing";
    }
}

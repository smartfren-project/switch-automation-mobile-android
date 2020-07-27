package operation;

import constants.AndroidCapabilityType;
import constants.BaseData;
import constants.CloudCapabilityType;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;
    public static TouchAction touchAction;

    public void setupAppium() throws MalformedURLException {
        final String URL_STRING = "http://localhost:4723/wd/hub";
        final String URL_P_CLOUD = "https://device.pcloudy.com/appiumcloud/wd/hub";
        url = new URL(URL_P_CLOUD);

        String apk_Path = System.getProperty("user.dir")
                + "/src/test/resources/app/com.smartfren.switchmobile.apk";

        System.out.println("instance " + this.getClass().getSimpleName());

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("pCloudy_Username", "pramoda.kumar@smartfren.com");
        capabilities.setCapability("pCloudy_ApiKey", "ybrf4d2k3jv496f5x53w93wc");
        capabilities.setCapability("pCloudy_DurationInMinutes", 30);
        capabilities.setCapability("newCommandTimeout", 600);
        capabilities.setCapability("launchTimeout", 90000);
        capabilities.setCapability("pCloudy_DeviceFullName", "SAMSUNG_GalaxyJ8_Android_8.0.0_29e45");
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("pCloudy_ApplicationName", "switch.apk");
        capabilities.setCapability("appPackage", "com.smartfren.switchmobile");
        capabilities.setCapability("appActivity", "com.smartfren.switchmobile.views.activities.SplashScreenActivity");
        capabilities.setCapability("pCloudy_WildNet", "false");
        capabilities.setCapability("autoGrantPermissions", true);


        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.hideKeyboard();
    }

    public void closeApp() throws InterruptedException {
        driver.closeApp();
    }

    public void uninstallApp() throws InterruptedException {
        driver.removeApp(BaseData.ApplicationInformation.ANDROID_APPLICATION_PACKAGE);
    }
}
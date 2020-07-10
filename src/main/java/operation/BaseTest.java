package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
        url = new URL(URL_STRING);

        String apk_Path = System.getProperty("user.dir")
                + "/src/test/resources/app/switch.apk";

        System.out.println("instance " + this.getClass().getSimpleName());

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        capabilities.setCapability("appPackage", "com.smartfren.switchmobile");
        capabilities.setCapability("appActivity", "com.smartfren.switchmobile.views.activities.SplashScreenActivity");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability(MobileCapabilityType.APP, apk_Path);


        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    public void closeApp() throws InterruptedException {
        driver.closeApp();
    }

    public void uninstallApp() throws InterruptedException {
        driver.removeApp("com.smartfren.switchmobile");
    }
}
package operation;

import com.ssts.pcloudy.appium.PCloudyAppiumSession;
import constants.AndroidCapabilityType;
import constants.BaseData;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;
    public static TouchAction touchAction;
    public WebDriverWait wait;

    public void setupAppium(String urlServer) throws MalformedURLException, IOException {

        System.out.println("instance " + this.getClass().getSimpleName());
        PCloudyAppiumSession pCloudySession;
        Properties configFile = new Properties();
        configFile.load(BaseTest.class.getClassLoader().getResourceAsStream("config.properties"));
        String apk_Path = System.getProperty("user.dir")
                + configFile.getProperty("androidAppLocation");
        capabilities = new DesiredCapabilities();
        try {
            url = new URL(configFile.getProperty(urlServer));
            switch (urlServer) {
                /* Use Local Server */
                case "localURL":
                    capabilities.setCapability(MobileCapabilityType.UDID, configFile.getProperty("udid"));
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, configFile.getProperty("androidPlatformName"));
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, configFile.getProperty("androidPlatformVersion"));
                    capabilities.setCapability(AndroidCapabilityType.APP_PACKAGE, configFile.getProperty("androidAppPackage"));
                    capabilities.setCapability(AndroidCapabilityType.APP_ACTIVITY, configFile.getProperty("androidAppActivity"));
                    capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
                    capabilities.setCapability(AndroidCapabilityType.AUTO_GRANT_PERMISSION, "true");
                    capabilities.setCapability(MobileCapabilityType.APP, apk_Path);
                    break;

                /* Use Cloud Server */
                case "pCloudy":
                    capabilities.setCapability("pCloudy_Username", "pramoda.kumar@smartfren.com");
                    capabilities.setCapability("pCloudy_ApiKey", "ybrf4d2k3jv496f5x53w93wc");
                    capabilities.setCapability("pCloudy_DurationInMinutes", 50);
                    capabilities.setCapability("newCommandTimeout", 600);
                    capabilities.setCapability("launchTimeout", 90000);
                    capabilities.setCapability("pCloudy_DeviceFullName", "SAMSUNG_GalaxyM51_Android_10.0.0_9e3a9");
                    capabilities.setCapability("platformVersion", "10.0.0");
                    capabilities.setCapability("platformName", "Android");
                    capabilities.setCapability("automationName", "uiautomator2");
                    capabilities.setCapability("pCloudy_ApplicationName", "app-production-release-1602233459.apk");
                    capabilities.setCapability("appPackage", "com.smartfren.switchmobile");
                    capabilities.setCapability("appActivity", "com.smartfren.switchmobile.views.activities.SplashScreenActivity");
                    capabilities.setCapability("pCloudy_WildNet", "true");
                    break;

                case "browserStack":
                    capabilities.setCapability("browserstack.user", configFile.getProperty("bsUsername"));
                    capabilities.setCapability("browserstack.key", configFile.getProperty("bsKey"));
                    capabilities.setCapability("device", "Samsung Galaxy S10e");
                    capabilities.setCapability("os_version", "9.0");
                    capabilities.setCapability("project", "Switch Android Automation Test");
                    capabilities.setCapability("build", "Release 1.1.4");
                    capabilities.setCapability("name", "Regression Test Android Release 1.1.4");
                    capabilities.setCapability("app", configFile.getProperty("bsAppLink"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.hideKeyboard();
        wait = new WebDriverWait(driver, 15);

        //Populating the properties file
        configFile.setProperty("Device Name", configFile.getProperty("udid"));
        configFile.setProperty("Android Version", configFile.getProperty("androidPlatformVersion"));
        File file = new File("allure-results/environment.properties");
        FileOutputStream fileOut = new FileOutputStream(file);
        configFile.store(fileOut, "Device Info");
        fileOut.close();
    }

    public void closeApp() throws IOException {
        driver.resetApp();
    }

    public void uninstallApp() {
        driver.removeApp(BaseData.ApplicationInformation.ANDROID_APPLICATION_PACKAGE);
    }
}
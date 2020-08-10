package operation;

import com.ssts.pcloudy.appium.PCloudyAppiumSession;
import constants.AndroidCapabilityType;
import constants.BaseData;
import constants.CloudCapabilityType;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
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

    public void setupAppium() throws MalformedURLException {

        System.out.println("instance " + this.getClass().getSimpleName());
        PCloudyAppiumSession pCloudySession;

        Properties configFile = new Properties();
        try {
            configFile.load(BaseTest.class.getClassLoader().getResourceAsStream("config.properties"));
            String apk_Path = System.getProperty("user.dir")
                    + configFile.getProperty("androidAppLocation");
            url = new URL(configFile.getProperty("localURL"));
            capabilities = new DesiredCapabilities();
            /* Use Local Server */
            capabilities.setCapability(MobileCapabilityType.UDID, configFile.getProperty("udid"));
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, configFile.getProperty("androidPlatformName"));
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, configFile.getProperty("androidPlatformVersion"));
            capabilities.setCapability(AndroidCapabilityType.APP_PACKAGE, configFile.getProperty("androidAppPackage"));
            capabilities.setCapability(AndroidCapabilityType.APP_ACTIVITY, configFile.getProperty("androidAppActivity"));
            capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
            capabilities.setCapability(AndroidCapabilityType.AUTO_GRANT_PERMISSION, "true");
            capabilities.setCapability(MobileCapabilityType.APP, apk_Path);

            /* Use Cloud Server */
//            capabilities.setCapability("pCloudy_Username", configFile.getProperty("pCloudyUsername"));
//            capabilities.setCapability("pCloudy_ApiKey", configFile.getProperty("pCloudyApiKey"));
//            capabilities.setCapability("pCloudy_DurationInMinutes", 30);
//            capabilities.setCapability("newCommandTimeout", 600);
//            capabilities.setCapability("launchTimeout", 90000);
//            capabilities.setCapability("pCloudy_DeviceFullName", configFile.getProperty("samsungS9"));
//            capabilities.setCapability("platformVersion", configFile.getProperty("platformVersion"));
//            capabilities.setCapability("platformName", configFile.getProperty("androidPlatformName"));
//            capabilities.setCapability("automationName", "uiautomator2");
//            capabilities.setCapability("pCloudy_ApplicationName", "switch.apk");
//            capabilities.setCapability("appPackage", configFile.getProperty("androidAppPackage"));
//            capabilities.setCapability("appActivity", configFile.getProperty("androidAppActivity"));
//            capabilities.setCapability("pCloudy_WildNet", "false");
//            capabilities.setCapability("autoGrantPermissions", true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.hideKeyboard();
        wait = new WebDriverWait(driver, 15);
    }

    public static void main(String args[]) throws IOException {
        //Instantiating the properties file
        Properties props = new Properties();
        //Populating the properties file
        props.setProperty("Device Name", "udid");
        props.setProperty("Android Version", "androidPlatformVersion");
        File file = new File("Users\\faizalprakoso\\IdeaProjects\\switch-mobile-automation\\target\\allure-results");
        FileOutputStream fileOut = new FileOutputStream(file);
        props.store(fileOut, "Device Info");
        fileOut.close();
    }



    public void click(By element) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
    }

    public void closeApp() throws InterruptedException {
        driver.closeApp();
    }

    public void uninstallApp() throws InterruptedException {
        driver.removeApp(BaseData.ApplicationInformation.ANDROID_APPLICATION_PACKAGE);
    }
}
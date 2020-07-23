package constants;

import io.appium.java_client.remote.MobileCapabilityType;

public class MandatorySetup {
    public static final String[] UDID = new String[] {MobileCapabilityType.UDID, "emulator-5554"};
    public static final String[] PLATFORM_NAME = new String[] {MobileCapabilityType.PLATFORM_NAME, "ANDROID"};
    public static final String[] PLATFORM_VERSION = new String[] {MobileCapabilityType.PLATFORM_VERSION, "8.1.0"};
    public static final String[] APP_PACKAGE = new String[] {AndroidCapabilityType.APP_PACKAGE,
            "com.smartfren.switchmobile"};
    public static final String[] APP_ACTIVITY = new String[] {AndroidCapabilityType.APP_ACTIVITY,
            "com.smartfren.switchmobile.views.activities.SplashScreenActivity"};
    public static final String[] NO_RESET = new String[] {MobileCapabilityType.NO_RESET, "true"};
    public static final String[] AUTO_GRANT_PERMISSION = new String[] {AndroidCapabilityType.AUTO_GRANT_PERMISSION, "true"};
    public static final String[] P_CLOUD_USERNAME = new String[] {"pCloudy_Username", BaseData.PCloudInformation.USERNAME};
    public static final String[] P_CLOUD_API_KEY = new String[] {"pCloudy_ApiKey" , BaseData.PCloudInformation.API_KEY};
    public static final String[] P_CLOUD_APPLICATION_NAME = new String[] {"pCloudy_ApplicationName", BaseData.PCloudInformation.APL_NAME};
    public static final String[] P_CLOUD_DEVICE = new String[] {"pCloudy_DeviceFullName", BaseData.PCloudInformation.DEVICE_NAME};
}

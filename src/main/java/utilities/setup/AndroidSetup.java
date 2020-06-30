//package utilities.setup;
//
//import constants.AndroidSetupData;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.AndroidMobileCapabilityType;
//import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.SessionId;
//import org.testng.ITestContext;
//import org.testng.ITestResult;
//import org.testng.Reporter;
//import org.testng.annotations.*;
//import tests.DeviceInfo;
//import tests.MultipleDriverCreation;
//import utilities.elementFinder.DataController;
//import utilities.fileReadWrite.PropertiesFileReaderWriter;
//import utilities.logController.LogController;
//import utilities.report.SuiteListener;
//
//import java.io.*;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//
//@Listeners(SuiteListener.class)
//public class AndroidSetup extends CommonConfig {
//
//    private DesiredCapabilities capabilities = new DesiredCapabilities();
//    public AndroidDriver driver;
//    public EnvironmentSetup environmentSetup;
//    public String assertionInfo;
//    String serverUrl = null;
//    public LogController logController = null;
//    private String appiumPort;
//    private String serverIp;
//    AppiumDriverLocalService appiumService;
//    String appiumServiceUrl;
//    public static int deviceHeight;
//    public static int deviceWidth;
//    //public static MultipleDriverCreation multipleDriverCreation;
//    protected String udid = null;
//    public SessionId sessionId;
//
//    public AndroidSetup(LogController logController) {
//        this.logController = logController;
//    }
//
//    public static int lastTC;
//    public static String lastUDID = null;
//    public Hashtable<String, String> environmentURL;
//    public String url;
//
//    public AndroidSetup() {
//    }
//
//    @BeforeSuite
//    public void backupLastRunReport() throws Exception {
//        environmentData = new DataController(rootDirectoryPath + "/testData/" + "environmentData/", "environment.properties").getPropertiesFileData();
//        DeviceInfo deviceInfo = new DeviceInfo();
//        deviceInfo.fetchDeviceInfo();
//        deviceInfo.port = (environmentData.get("port"));
//        deviceInfo.bootstrapPort = (environmentData.get("boostrapPort"));
//        multipleDriverCreation = new MultipleDriverCreation(deviceInfo);
//        multipleDriverCreation.setAlDeviceAsFree();
//        multipleDriverCreation.setLogControllers();
//        multipleDriverCreation.setupPort();
//
//        try {
//            String testOutputDir = rootDirectoryPath + "/test-output";
//            File dir = new File(testOutputDir);
//            if (dir.exists()) {
//                System.out.println("I am inside backup");
//                Date now = new Date();
//                SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyyhhmm");
//                String time = dateFormat.format(now);
//                String reportsPath = rootDirectoryPath + "/reports/";
//                File des = new File(reportsPath + "ReportBackup_" + time);
//                File src = new File(testOutputDir);
//                FileUtils.copyDirectory(src, des);
//                FileUtils.deleteDirectory(new File(testOutputDir));
//            }
//        } catch (FileNotFoundException e) {
//            Reporter.log("Error backup test-output folder: test-output folder does not exist... proceeding without backup...");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public AndroidDriver setUp(String port, String udid, String systemPort, String androidVersion) throws Exception {
//        return initDriver(port, udid, systemPort, androidVersion);
//    }
//
//    public void setEnvironment() throws Exception {
//        environmentData = new DataController(rootDirectoryPath + "/testData/" + "environmentData/", "environment.properties").getPropertiesFileData();
//        environmentURL = new DataController(rootDirectoryPath + "/testData" + "environmentData/", "environmentDetails.properties").getPropertiesFileData();
//        environmentData.put(environmentData.get(AndroidSetupData.ENVIRONMENT_TYPE), environmentURL.get(environmentData.get(AndroidSetupData.ENVIRONMENT_TYPE)));
//        environmentSetup = new EnvironmentSetup(logController, environmentData);
//        environmentSetup.setupEnvironmentURL(driver, environmentData.get(AndroidSetupData.ENVIRONMENT_TYPE), environmentData.get(environmentData.get(AndroidSetupData.ENVIRONMENT_TYPE)));
//        environment = environmentData.get(AndroidSetupData.ENVIRONMENT_TYPE);
//        deviceName = environmentData.get(AndroidSetupData.DEVICE_NAME) + " v" + environmentData.get(AndroidSetupData.PLATFORM_VERSION);
//        deviceHeight = driver.manage().window().getSize().getHeight();
//        deviceWidth = driver.manage().window().getSize().getWidth();
//    }
//
//    private AndroidDriver initDriver(String port, String udid, String systemPort, String androidVersion) throws Exception {
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, environmentData.get(AndroidSetupData.DEVICE_PLATFORM));
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, environmentData.get(AndroidSetupData.PLATFORM_VERSION));
//        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, environmentData.get(AndroidSetupData.NEW_COMMAND_TIMEOUT));
//        capabilities.setCapability(AndroidSetupData.APP_PACKAGE, environmentData.get(AndroidSetupData.APP_PACKAGE_VALUE));
//        capabilities.setCapability(AndroidSetupData.APP_ACTIVITY, environmentData.get(AndroidSetupData.APP_ACTIVITY_VALUE));
//
//        String[] str = androidVersion.split("\\.");
//        if (Integer.parseInt(str[0]) >= 6) {
//            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
//        }
//        capabilities.setCapability(AndroidSetupData.NO_RESET, Boolean.parseBoolean(environmentData.get(AndroidSetupData.NO_RESET_VALUE)));
//        try {
//            if (null != environmentData.get(AndroidSetupData.DEVICE_NAME) && null != udid && null != systemPort) {
//                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, environmentData.get(AndroidSetupData.DEVICE_NAME));
//                capabilities.setCapability(MobileCapabilityType.UDID, udid);
//                capabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);
//                serverUrl = "http://" + environmentData.get(AndroidSetupData.SERVER) + ":" + port + "/wd/hub";
//                String rootDirectoryPath = System.getProperty("user.dir");
//                System.out.println(rootDirectoryPath);
//                File logFile = new File(rootDirectoryPath + "/appiumlogs/logs-" + udid + ".txt");
//                String command = "appium --port " + port + " --bootstrap-port " + systemPort + "" + " --log " + logFile + "";
//                Process process = Runtime.getRuntime().exec(command);
//            } else {
//                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, environmentData.get(AndroidSetupData.DEVICE_NAME));
//                capabilities.setCapability(MobileCapabilityType.UDID, environmentData.get(AndroidSetupData.UDID));
//                serverUrl = "http://" + environmentData.get(AndroidSetupData.SERVER) + ":" + environmentData.get(AndroidSetupData.PORT) + "/wd/hub";
//            }
//        } catch (Exception e) {
//
//        }
//        Thread.sleep(5000);
//        System.out.println(udid);
//        System.out.println(port);
//        System.out.println(deviceName);
//        System.out.println(systemPort);
//        System.out.println(appiumPort);
//        System.out.println(serverUrl);
//        try {
//            logController.writeLogs("Creating an iOSDriver  : ", "This driver can be used throughout the test suite! ");
//            driver = new AndroidDriver(new URL(serverUrl), capabilities);
//            logController.writeLogs("iOSDriver has been created! :  ", " The driver is :" + driver);
//        } catch (NullPointerException | MalformedURLException ex) {
//            logController.writeLogs("Unable to create iosDriver! ", "Reason : " + ex);
//            System.out.println("Appium driver could not be initialised for device! Please check appium server connection");
//        } catch (Exception otherException) {
//            logController.writeLogs("Unable to create iosDriver! ", "Reason : " + otherException);
//            System.out.println("Appium driver could not be initialised for device! Please check appium server connection." + otherException);
//        }
//        System.out.println("DriverException in initdriver is : " + driver);
//        return driver;
//
//    }
//
//    public AndroidDriver getDriver() {
//        return driver;
//    }
//
//    @AfterMethod
//    public void captureScreenShotOnFailure(ITestResult testResult) throws Exception {
//        String path = null;
//        String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm").format(Calendar.getInstance().getTime());
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        if (testResult.getStatus() == ITestResult.FAILURE) {
//            String testClassName = getTestClassName(testResult.getInstanceName());
//            String path1 = "FailedScreenShot_" + testClassName + "_" + timeStamp + ".jpg";
//            if (System.getProperty("os.name").contains("windows")) {
//                path = rootDirectoryPath + "\\test-output\\" + path1;
//            } else {
//                path = rootDirectoryPath + "/test-output/" + path1;
//            }
//            try {
//                FileUtils.copyFile(scrFile, new File(path));
//                Reporter.setCurrentTestResult(testResult);
//                Reporter.log("<a href='" + path1 + "'><img src='" + path1 + "' height='160' width='100' /><br>Failure Screenshot</a>");
//            } catch (IOException e) {
//                e.printStackTrace();
//                throw new Exception(e);
//            }
//        }
//        driver.resetApp();
//        if (null != driver) {
//            System.out.println("Driver is not null.");
//        }
//    }
//
//    @BeforeClass
//    public void waitForAWhile(ITestContext context) throws Exception {
//        System.out.println("--------hkjkkk----------" + multipleDriverCreation.getUdid());
//        for (String str : multipleDriverCreation.getUdid()) {
//            System.out.println(str);
//        }
//        System.out.println("--------vghbjkl--------" + multipleDriverCreation.getIsdevicefree());
//        for (boolean st : multipleDriverCreation.getIsdevicefree()) {
//            System.out.println(st);
//        }
//        System.out.println("----------inside waitForAWhile()----");
//        this.udid = MultipleDriverCreation.getFreeDeviceUdid();
//        this.logController = multipleDriverCreation.getLogController(udid);
//        Process p = Runtime.getRuntime().exec("adb devices");
//        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
//
//        List<String> devices = new ArrayList<>();
//        String s = null;
//        int noOfDevice = 0;
//        while ((s = stdInput.readLine()) != null) {
//            if ((s.contains("device")) && !(s.contains("List"))) {
//                devices.add(s.split("\\s")[0]);
//                noOfDevice++;
//            }
//        }
//        if (devices.contains(udid))
//            this.driver = multipleDriverCreation.getDriver(udid, true);
//        else {
//
//            context.getSuite().getXmlSuite().setThreadCount(noOfDevice);
//            this.driver = multipleDriverCreation.getDriver(udid, false);
//        }
//        environmentData = new DataController(rootDirectoryPath + "/testData/" + "environmentData/", "environment.properties").getPropertiesFileData();
//        environmentURL = new DataController(rootDirectoryPath + "/testData/" + "environmentData/", "environmentDetails.properties").getPropertiesFileData();
//        environmentData.put(environmentData.get(AndroidSetupData.ENVIRONMENT_TYPE), environmentURL.get(environmentData.get(AndroidSetupData.ENVIRONMENT_TYPE)));
//        environmentSetup = new EnvironmentSetup(driver,logController, environmentData);
//        environmentSetup.setupEnvironmentURL(driver, environmentData.get(AndroidSetupData.ENVIRONMENT_TYPE), environmentData.get(environmentData.get(AndroidSetupData.ENVIRONMENT_TYPE)));
//
//    }
//
//    @AfterClass
//    public void freeingdevice() {
//        System.out.println("------------freeingdevice:------------------" + udid);
//        MultipleDriverCreation.setIsdevicefree(udid, true);
//        driver.quit();
//        lastTC = SuiteListener.totalTC - 1;
//        if (lastTC == 0) {
//            MultipleDriverCreation.unlockWaiter();
//            lastUDID = udid;
//        }
//        freeMemory();
//    }
//
//    public void freeMemory(){
//        System.runFinalization();
//        Runtime.getRuntime().gc();
//        System.gc();
//    }
//
//
//    @AfterSuite
//    public void tearDown() {
//        driver.quit();
//        logController.writeLogs("closing suite", "Closing suits");
//
//    }
//
//}
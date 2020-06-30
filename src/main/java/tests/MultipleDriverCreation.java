//package tests;
//
//import io.appium.java_client.android.AndroidDriver;
//import org.glassfish.jersey.model.internal.CommonConfig;
//import org.testng.TestNG;
//import tests.DeviceInfo;
//import utilities.logController.LogController;
//import utilities.setup.AndroidSetup;
//
//import java.io.*;
//import java.util.Properties;
//
//import static utilities.setup.CommonConfig.rootDirectoryPath;
//
//public class MultipleDriverCreation extends CommonConfig {
//    DeviceInfo deviceInfo = null;
//
//    //    private String port[];
//    public static String[] udid = null;
//    //    private String bootstrapPort[];
//    private static AndroidDriver driver;
//    private static boolean[] isdevicefree;
//    private static LogController[] logController;
//    public String[] versions = null;
//    public static final Object monitor = new Object();
//    public static boolean monitorState = false;
//    TestNG testNG= new TestNG();
//
//
//
//
//    public MultipleDriverCreation(DeviceInfo deviceInfo){
//        this.deviceInfo = deviceInfo;
//        udid = deviceInfo.udid;
//        versions = deviceInfo.version;
//    }
//
//    public static String getVersion(String udid) {
//        String fileLoc = rootDirectoryPath + "/testData/androidDevice/androidDevice.properties";
//        FileReader reader;
//        String version = null;
//
//        {
//            try {
//                reader = new FileReader(fileLoc);
//                Properties prop = new Properties();
//                prop.load(reader);
//                System.out.println("version:"+prop.getProperty(udid));
//                version = prop.getProperty(udid);
//
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return version;
//        }
//    }
//
//    public LogController[] getLogController() {
//        return logController;
//    }
//
//    public LogController getLogController(String deviceUdid) {
//
//        for (int i = 0; i < udid.length; i++) {
//            //return logController[i];
//            if (deviceUdid.equals(udid[i])) {
//                return logController[i];
//            }
//        }
//        return null;
//    }
//
//    public AndroidDriver getDriver(String deviceUdid, boolean b) throws Exception {
//
//        for (int i = 0; i < udid.length; i++) {
//
//            // return logController[i];
//            if (deviceUdid.equals(udid[i]) && b) {
//                return setDrivers(deviceUdid, i);
//            }
//            else if(!b){
//                //waitForThread();
//                //deviceUdid= AndroidSetup.lastUDID;
//
//                return  setDrivers(deviceUdid, i);
//
//            }
//
//        }
//        return null;
//    }
//
//    public static void waitForThread() {
//        monitorState = true;
//        while (monitorState) {
//            synchronized (monitor) {
//                try {
//                    monitor.wait(); // wait until notified
//                } catch (Exception e) {}
//            }
//        }
//    }
//
//    public static void unlockWaiter() {
//        synchronized (monitor) {
//            monitorState = false;
//            monitor.notifyAll(); // unlock again
//        }
//    }
//
//
//    public void setLogControllers() {
//        logController = new LogController[udid.length];
//        for (int i =0; i < udid.length; i++)
//        {
//            logController[i] = new LogController();
//        }
//    }
//
//
//    public  AndroidDriver setDrivers(String deviceUdid, int i ) throws Exception {
//
//
//        String port =String.valueOf(Integer.parseInt(deviceInfo.port)+i);
//        String bootPort = String.valueOf(Integer.parseInt(deviceInfo.bootStrapPort)+i);
//        driver = new AndroidSetup(logController[i]).setUp(port,deviceUdid, bootPort,versions[i]);
//
//        // Hashtable<String ,String> environmentData=new DataController(System.getProperty("user.dir")+ "/testData" + "/environmentData/" , "environmentData.properties").getPropertiesFileData();
//        logController[i].writeLogs("STARTING SUITE : "," Setting Up for Suite");
//        return driver;
//
//
//    }
//
//
//    public boolean[] getIsdevicefree() { return isdevicefree; }
////
////    public void setIsdevicefree(boolean[] isdevicefree) {
////        this.isdevicefree = isdevicefree;
////    }
//
//    public void setupPort() throws  Exception{
//
//        for(int i=0; i<udid.length;i++){
//
//            String command = "adb -s "+udid[i]+" uninstall io.appium.uiautomator2.server";
//            Process proc = Runtime.getRuntime().exec(command);
//
//// Read the output
//
//            BufferedReader reader =
//                    new BufferedReader(new InputStreamReader(proc.getInputStream()));
//
//            String line = "";
//            while((line = reader.readLine()) != null) {
//                System.out.print(line + "\n");
//            }
//
//            proc.waitFor();
//            String cmd2="adb -s "+udid[i]+" uninstall io.appium.uiautomator2.server.test";
//
//            Process proc2 = Runtime.getRuntime().exec(cmd2);
//
//            BufferedReader reader2 =
//                    new BufferedReader(new InputStreamReader(proc2.getInputStream()));
//
//            String line2 = "";
//            while((line2 = reader2.readLine()) != null) {
//                System.out.print(line2 + "\n");
//            }
//
//            proc2.waitFor();
//        }
//
//
//
//    }
//    public synchronized static String getFreeDeviceUdid() {
//        for(int i = 0; i < isdevicefree.length; i++)
//        {
//            if(isdevicefree[i])
//            {
//                System.out.println("getFreeDeviceUdid:"+udid[i]);
//                isdevicefree[i] =false;
//                return udid[i];
//            }
//
//        }
//        return null;
//    }
//
//    public void setAlDeviceAsFree() {
//        isdevicefree = new boolean[udid.length];
//        for(int i = 0; i < isdevicefree.length; i++)
//        {
//            System.out.println("udid's:"+udid[i]);
//            isdevicefree[i] = true;
//            System.out.println("udid status:"+isdevicefree[i]);
//        }
//    }
//
//    public synchronized static void setIsdevicefree(String id, boolean isDeviceFree) {
//
//        for(int i = 0; i < udid.length; i++)
//        {
//            if(id.equals(udid[i]))
//            {
//                System.out.println("particular udid:"+id);
//                isdevicefree[i] = isDeviceFree;
//                System.out.println("particular udid status:"+isdevicefree[i]);
//            }
//        }
//    }
//
//    public boolean getIsdevicefree(String udid, boolean isDeviceFree) {
//
//        for(int i = 0; i < MultipleDriverCreation.udid.length; i++)
//        {
//            if(udid.equals(MultipleDriverCreation.udid[i]))
//            {
//                return isdevicefree[i];
//            }
//        }
//        return false;
//    }
//
//
///*    public void setPort(String[] port) {
//        this.port = port;
//    }
//
//    public String[] getDevicename() {
//        return devicename;
//    }
//
//    public void setDevicename(String[] devicename) {
//        this.devicename = devicename;
//    }*/
//
//    public String[] getUdid() {
//        return udid;
//    }
//
// /*   public String getUdid(String deviceName) {
//
//        for(int i = 0; i < devicename.length; i++)
//        {
//            if(deviceName.equals(devicename[i]))
//            {
//                return udid[i];
//            }
//        }
//        return null;
//    }*/
//
//    public void setUdid(String[] udid) {
//        MultipleDriverCreation.udid = udid;
//    }
//
//    /*public String[] getWdaLocalPort() {
//        return wdaLocalPort;
//    }
//
//    public String getWdaLocalPort(String deviceName) {
//
//        for(int i = 0; i < devicename.length; i++)
//        {
//            if(deviceName.equals(devicename[i]))
//            {
//                return wdaLocalPort[i];
//            }
//        }
//        return null;
//    }*/
//
//
////    public void setWdaLocalPort(String[] wdaLocalPort) {
////        this.wdaLocalPort = wdaLocalPort;
////    }
//
//    public void quitAllDrivers()
//    {
////        for (int i = 0; i < driver.length; i++)
////        {
////            driver[i].quit();
////        }
//    }
//}

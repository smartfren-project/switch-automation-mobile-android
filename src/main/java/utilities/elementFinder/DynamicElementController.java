//package utilities.elementFinder;
//
//import constants.environment.ConfigData;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.WebElement;
//
//import java.util.Hashtable;
//
//public class DynamicElementController {
//    private Hashtable<String, String> propertiesFileData = null;
//    private Hashtable<String, Hashtable<String, String>> xmlElements = null;
//    ElementController elementController = new ElementController();
//
//    public DynamicElementController(Hashtable<String, Hashtable<String, String>> xmlElement) throws Exception {
//        this.xmlElements = xmlElement;
//    }
//
//    public DynamicElementController(Hashtable<String, String> propertiesFileData, Hashtable<String, Hashtable<String, String>> xmlElements) throws Exception {
//        this.propertiesFileData = propertiesFileData;
//        this.xmlElements = xmlElements;
//    }
//
//    public WebElement waitForDynamicElementToGetEnabled(String propertiesRepositoryLocator, AndroidDriver driver) throws Exception {
//        Exception webDriverException = null;
//        String dynamicXpath = xmlElements.get(propertiesRepositoryLocator).get("dynamicXpath") + "='" + propertiesFileData.get(propertiesRepositoryLocator) + "']";
//        System.out.println("Driver : " + driver + " Key : " + propertiesRepositoryLocator + " Dynamic xpath : " + dynamicXpath);
//        int waitCount = 0;
//        int maxWaitCount;
//        if (null != ConfigData.MAX_WAIT) {
//            maxWaitCount = ConfigData.MAX_WAIT;
//        } else {
//            maxWaitCount = 30;
//        }
//        WebElement webElement = null;
//        do {
//            try {
//                webElement = driver.findElement(By.xpath(dynamicXpath));
//            } catch (WebDriverException wde) {
//                webDriverException = wde;
//            } catch (Exception exception) {
//                webDriverException = exception;
//            }
//            if (null != webElement)
//                break;
//            else
//                elementController.getDeviceDimensionSwipe(driver);
//            waitCount++;
//        } while (waitCount < maxWaitCount);
//        if (null == webElement)
//            throw new Exception(webDriverException);
//        return webElement;
//    }
//
//    public WebElement waitForDynamicElementFromCode(String propertiesRepositoryLocator, String testData, AndroidDriver driver) throws Exception {
//        Exception webDriverException = null;
//        String dynamicXpath = xmlElements.get(propertiesRepositoryLocator).get("dynamicXpath") + "='" + testData + "']";
//        System.out.println("Driver : " + driver + " Key : " + propertiesRepositoryLocator + " Dynamic xpath : " + dynamicXpath);
//        int waitCount = 0;
//        int maxWaitCount;
//        if (null != ConfigData.MAX_WAIT) {
//            maxWaitCount = ConfigData.MAX_WAIT;
//        } else {
//            maxWaitCount = 30;
//        }
//        WebElement webElement = null;
//        do {
//            try {
//                webElement = driver.findElement(By.xpath(dynamicXpath));
//            } catch (WebDriverException wde) {
//                webDriverException = wde;
//            } catch (Exception exception) {
//                webDriverException = exception;
//            }
//            if (null != webElement)
//                break;
//            else
//                elementController.getDeviceDimensionSwipe(driver);
//            waitCount++;
//        } while (waitCount < maxWaitCount);
//        if (null == webElement)
//            throw new Exception(webDriverException);
//        return webElement;
//
//    }
//
//    public Hashtable<String, String> getPropertiesFileData() {
//        return propertiesFileData;
//    }
//
//}

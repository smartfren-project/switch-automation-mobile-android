//package utilities.elementFinder;
//
//import constants.environment.ConfigData;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import utilities.fileReadWrite.XmlReaderWriter;
//import utilities.logController.LogController;
//
//import java.time.Duration;
//import java.util.*;
//
//public class ElementController {
//
//    public HashMap<String, By> elementsLocator = null;
//    public Hashtable<String, Hashtable<String, String>> xmlElements = null;
//    public LogController logController = null;
//    XmlReaderWriter xmlReader = null;
//    Calendar calendar1;
//    Calendar calendar2;
//    int maxWaitCount = ConfigData.MAX_WAIT;
//    WebDriverWait wait;
//
//    public ElementController() {
//
//    }
//
//    public ElementController(String absoluteFilePath) throws Exception {
//        xmlElements = new Hashtable<String, Hashtable<String, String>>();
//        elementsLocator = new HashMap<>();
//        xmlReader = new XmlReaderWriter();
//        xmlElements = xmlReader.getElementParamsByTitle(absoluteFilePath);
//        System.out.println("Size of xml file elemets : " + xmlElements.size());
//        for (String key : xmlElements.keySet()) {
//            System.out.println("Key : " + key + " in Repository");
//            elementsLocator.put(key, getLocators(key, xmlElements.get(key).keySet()));
//        }
//    }
//
//    public Hashtable<String, Hashtable<String, String>> getXMLElements() {
//        return xmlElements;
//    }
//
//    public HashMap<String, By> getElementsLocator() {
//        return elementsLocator;
//    }
//
//
//    private By getLocators(String key, Set<String> stringLocator) {
//        By locator = null;
//        for (String identifier : stringLocator) {
//            if ("id".equals(identifier)) {
//                System.out.println(true);
//                locator = By.id(xmlElements.get(key).get("id"));
//                break;
//            } else if ("xpath".equals(identifier)) {
//                locator = By.xpath(xmlElements.get(key).get("xpath"));
//                break;
//            } else if ("name".equals(identifier)) {
//                locator = By.name(xmlElements.get(key).get("name"));
//                break;
//            } else if ("className".equals(identifier)) {
//                locator = By.className(xmlElements.get(key).get("className"));
//                break;
//            } else if ("dynamicXpath".equals(identifier)) {
//                break;
//            } else if ("uiAutomator".equals(identifier)) {
//                locator = MobileBy.AndroidUIAutomator(xmlElements.get(key).get("uiAutomator"));
//                break;
//            }
//        }
//        return locator;
//    }
//
//
//    public WebElement waitForPageElementToGetEnabled(AndroidDriver driver, By by) throws Exception {
//        Exception webDriverException = null;
//        int waitCount = 0;
//        WebElement webElement = null;
//        do {
//            try {
//                webElement = driver.findElement(by);
//            } catch (Exception exception) {
//                webDriverException = exception;
//            }
//            if (null != webElement) {
//                return webElement;
//            } else {
//                getDeviceDimensionSwipe(driver);
//                if (null != webElement) {
//                    return webElement;
//                }
//                else
//                {
//                    getDeviceDimensionSwipe(driver);
//                }
//
//                }
//            waitCount++;
//        } while (waitCount < maxWaitCount);
//        if (null == webElement)
//            throw new Exception(webDriverException);
//        return webElement;
//    }
//
//    public List<WebElement> waitForPageElementsToGetEnabled(AndroidDriver driver, By by) throws Exception {
//        Exception webDriverException = null;
//        int waitCount = 0;
//        List<WebElement> webElement = null;
//        do {
//            try {
//                webElement = driver.findElements(by);
//            } catch (Exception exception) {
//                webDriverException = exception;
//            }
//            if (null != webElement)
//                return webElement;
//            waitCount++;
//        } while (waitCount < maxWaitCount);
//        if (null == webElement)
//            throw new Exception(webDriverException);
//        return webElement;
//    }
//
//    public Boolean waitForTheElementUntil(AndroidDriver driver, By using, Integer timeOutInSeconds) throws Exception {
//        Calendar startTime = Calendar.getInstance();
//        Exception webDriverException = null;
//        Boolean waitForTheElementTillStatus = false;
//        int count = 0;
//        do {
//            try {
//                driver.findElement(using);
//                waitForTheElementTillStatus = true;
//            } catch (WebDriverException wde) {
//                webDriverException = wde;
//            } catch (Exception exception) {
//                webDriverException = exception;
//            }
//            if (waitForTheElementTillStatus) {
//                break;
//            }
//            Thread.sleep(1000);
//            count++;
//            Calendar currentTime = Calendar.getInstance();
//            long elapsedTime = (currentTime.getTimeInMillis() - startTime.getTimeInMillis()) / 1000;
//            if (elapsedTime > 60) {
//                return false;
//            }
//        } while (count < timeOutInSeconds);
//        if (!waitForTheElementTillStatus)
//            throw new Exception("Element not found after waiting for " + timeOutInSeconds + " seconds : " + webDriverException);
//        return waitForTheElementTillStatus;
//    }
//
//
//    public WebElement waitForElement(AndroidDriver driver, By by) {
//        return driver.findElement(by);
//    }
//
//    public boolean checkForElement(AndroidDriver driver, By by) {
//        Boolean elementFoundStatus = false;
//        try {
//            driver.findElement(by);
//            elementFoundStatus = true;
//        } catch (WebDriverException exception) {
//
//        }
//        return elementFoundStatus;
//    }
//
//    public boolean checkForElement1(AndroidDriver driver, By by) throws Exception {
//        Exception webDriverException = null;
//        Boolean elementFoundStatus = false;
//        int waitCount = 0;
//        WebElement webElement = null;
//        do {
//            try {
//                webElement = driver.findElement(by);
//                elementFoundStatus = true;
//                } catch (Exception exception) {
//                webDriverException = exception;
//            }
//            if (null != webElement) {
//                return elementFoundStatus;
//            } else {
//                getDeviceDimensionSwipe(driver);
//                if (null != webElement) {
//                    return elementFoundStatus;
//                }
//                else
//                {
//                    getDeviceDimensionSwipe(driver);
//                }
//
//            }
//            waitCount++;
//        } while (waitCount < maxWaitCount);
//        return elementFoundStatus;
//    }
//
//    public boolean checkForElements(AndroidDriver driver, By by) {
//        Boolean elementFoundStatus = false;
//        try {
//            driver.findElements(by);
//            elementFoundStatus = true;
//        } catch (WebDriverException exception) {
//
//        }
//        return elementFoundStatus;
//    }
//
//    public boolean checkForElement2(AndroidDriver driver, By by, int i) {
//        Boolean elementFoundStatus = false;
//        try {
//            driver.findElements(by).get(i);
//            elementFoundStatus = true;
//        } catch (WebDriverException exception) {
//
//        }
//        return elementFoundStatus;
//    }
//
//    private void performSwipe(Integer x1, Integer y1, Integer x2, Integer y2, AndroidDriver driver) throws Exception {
//        TouchAction swipe = new TouchAction(driver)
//                .press(x1, y1)
//                .waitAction(Duration.ofSeconds(2))
//                .moveTo(x2, y2)
//                .release();
//        swipe.perform();
//    }
//
//    public void getDeviceDimensionSwipe(AndroidDriver driver) throws Exception {
//        performSwipe(100, getHeightOfDevice(driver) / 2, 100, 100, driver);
//        System.out.println("Performed swipe!");
//
//    }
//
//    private Integer getHeightOfDevice(AndroidDriver driver) {
//        return driver.manage().window().getSize().getHeight();
//    }
//
//    public List<WebElement> waitForDynamicElementsByXpathToGetEnabled(AndroidDriver driver, String element, String dynamicValue) throws Exception {
//        System.out.println(" Inside waitForDynamicElementByPredicateStringToGetEnabled");
//
//        Exception webDriverException = null;
//        int waitCount = 0;
//        int maxWaitCount = 2;
//        List<WebElement> webElement = null;
//        do {
//            System.out.println("Attempt #" + waitCount);
//            try {
//                String elementNode = elementsLocator.get(element).toString().replace("By.xpath: ","");
//                By locator = By.xpath(elementNode.replace("#", dynamicValue));
//               // By locator = MobileBy.iOSNsPredicateString(elementNode.getContent().replace("#", dynamicValue));
//                System.out.println(" Dyn Before findElement()");
//                webElement = driver.findElements(locator);
//                System.out.println("Dyn After findElement()");
//            } catch (WebDriverException wde) {
//                webDriverException = wde;
//            } catch (Exception exception) {
//                webDriverException = exception;
//            }
//            if (null != webElement)
//                break;
//            waitCount++;
//        } while (waitCount < maxWaitCount);
//        if (null == webElement)
//            throw new Exception(webDriverException);
//        System.out.println(": Found element at waitForDynamicElementByPredicateStringToGetEnabled" + webElement );
//        return webElement;
//    }
//
//    public WebElement waitForDynamicBlogFromCode(AndroidDriver driver, String element, String dynamicValue) throws Exception {
//        Exception webDriverException = null;
//        String dynamicuiAutomator = elementsLocator.get(element).toString().replace("By.AndroidUIAutomator: ","");
//        String uiAutomator  = dynamicuiAutomator.replace("#", dynamicValue);
//        System.out.println(uiAutomator);
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
//                webElement = driver.findElementByAndroidUIAutomator(uiAutomator);
//            } catch (WebDriverException wde) {
//                webDriverException = wde;
//            } catch (Exception exception) {
//                webDriverException = exception;
//            }
//            if (null != webElement)
//                break;
//            else
//                getDeviceDimensionSwipe(driver);
//            waitCount++;
//        } while (waitCount < maxWaitCount);
//        if (null == webElement)
//            throw new Exception(webDriverException);
//        return webElement;
//
//    }
//
//
//
//}

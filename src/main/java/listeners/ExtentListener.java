package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.controller.ExtentManager;
import utilities.controller.ExtentTestManager;

public class ExtentListener implements ITestListener {

    ExtentReports reports = new ExtentReports();
    ExtentTest test;

    public byte[] saveScreenShotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(("*** Running test method " + iTestResult.getMethod().getMethodName() + "..."));
        ExtentTestManager.startTest(iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("*** Executed " + iTestResult.getMethod().getMethodName() + " test successfully...");
        ExtentTestManager.getTest().log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("*** Test execution " + iTestResult.getMethod().getMethodName() + " failed...");
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed" + iTestResult.getThrowable().getStackTrace());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("*** Test " + iTestResult.getMethod().getMethodName() + " skipped...");
        ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("*** Test failed but within percentage % " + iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("*** Test Suite " + iTestContext.getName() + " started ***");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println(("*** Test Suite " + iTestContext.getName() + " ending ***"));
        ExtentTestManager.endTest();
        ExtentManager.getInstance().flush();
    }
}

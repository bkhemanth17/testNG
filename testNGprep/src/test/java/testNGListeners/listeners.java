package testNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class listeners implements ITestListener{

    public void onStart(ITestContext context) {
        System.out.println("test execution started...");
    }
    public void onTestStart(ITestResult result) {
        System.out.println("test started...");
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("test success...");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("test Failure...");
    }
    public void onTestSkipped(ITestResult result) {
        System.out.println("test skipped...");
    }
    public void onFinish(ITestContext context) {
        System.out.println("test execution finished...");
    }
}

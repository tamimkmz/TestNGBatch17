package Class02;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The test case has passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("the test case failed");
    }
}

package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListner extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test execution has been started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test script  has been executed successfully",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		failed(methodName);
		Reporter.log("screenshot has been taken",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("the method "+result.getMethod().getMethodName()+" is skipeed ",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	 Reporter.log("test script execution started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("the test execution has been completed ",true);
	}

}

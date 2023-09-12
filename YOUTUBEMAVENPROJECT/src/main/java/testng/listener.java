package testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener  {
	@Override
	public void onTestFailure(ITestResult result) {
	
  System.out.println("The test case fails and the details are "+result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
	
  System.out.println("The test case got skipped and the details are "+result.getName());
	}
	@Override
	public void onTestPassed(ITestResult result) {
	
  System.out.println("The test case passed and the details are "+result.getName());
	}
}

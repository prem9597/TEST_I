package testNG.Testng1;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.xml.XmlSuite;

public class ListenersTestLevel implements ITestListener,IReporter {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Executed ");
	}


	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
//		IReporter.super.generateReport(xmlSuites, suites, outputDirectory);
	}
	
	

}

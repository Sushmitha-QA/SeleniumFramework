package listeners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import report.ExtentLogger;
import report.ExtentReport;

public class TestListeners implements ITestListener  {

   public void onTestStart(ITestResult result) {
       ExtentReport.createTest(result.getName());

    }

    public  void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName() +" is passed");
    }

    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getName() +" is failed");
    }

    public void onStart(ITestContext context) {
        ExtentReport.initReports();
    }

    public void onFinish(ITestContext context) {
        ExtentReport.flushReport();
    }
}

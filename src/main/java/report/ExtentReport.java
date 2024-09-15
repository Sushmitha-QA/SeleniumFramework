package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public final class ExtentReport {

    private ExtentReport() {
    }

    private static ExtentReports extent;
    private static ExtentTest extentTest;

    public static void initReports() {
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/index.html");
        extent.attachReporter(spark);
    }

    public static void createTest(String methodname) {

        extentTest = extent.createTest(methodname);
        ExtentManager.setExtentTest(extentTest);


    }

    public static void flushReport() {
        extent.flush();
    }
}

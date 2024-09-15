package frameworkdemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import config.FrameworkConfig;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.*;
import Driver.Driver;
import report.ExtentReport;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class BaseTest {


    @BeforeMethod
    public void setup() throws MalformedURLException {

       Driver.initDriver();

    }
    @AfterMethod
    public void tearDown(){
        Driver.quit();
    }

}

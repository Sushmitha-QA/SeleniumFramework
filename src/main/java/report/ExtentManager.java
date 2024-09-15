package report;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

   private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();
    public static void setExtentTest(ExtentTest test){
        threadLocal.set(test);

    }
    public static ExtentTest getExtentTest(){
        return threadLocal.get();
    }
}

package report;

import com.aventstack.extentreports.MediaEntityBuilder;
import utils.ScreenshotUtils;

public final class ExtentLogger {

    private ExtentLogger(){};

    public static void pass(String text){
        ExtentManager.getExtentTest().pass(text,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }
    public static void fail(String text){
        ExtentManager.getExtentTest().fail(text);
    }

}

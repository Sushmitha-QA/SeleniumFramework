package utils;

import Driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public final class ScreenshotUtils {


    private ScreenshotUtils(){};

    public static String getScreenshot(){
        TakesScreenshot screenshot = (TakesScreenshot) DriverManager.getDriver();
       return screenshot.getScreenshotAs(OutputType.BASE64);
    }
}

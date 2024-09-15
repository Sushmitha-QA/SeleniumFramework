package utils;

import Driver.DriverManager;
import config.ConfigFactory;
import enums.WaitType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import report.ExtentLogger;

import java.time.Duration;

public final class SeleniumUtils {


    public static void click(By by) {
        DriverManager.getDriver().findElement(by).click();
    }

    public static void click(By by, WaitType waittype,String message) {
        if (waittype == WaitType.CLICKABLE) {
            elementToBeClickable(by).click();
            ExtentLogger.pass( message+" is clicked succesfully");
        } else if (waittype == WaitType.PRESENCE) {
            presenceOfElement(by).click();
            ExtentLogger.pass(message+" is clicked succesfully");
        }
    }

    public static void sendKeys(By by, String text,String message) {
        DriverManager.getDriver().findElement(by).sendKeys(text);
        ExtentLogger.pass( message+" is entered succesfully");
    }

    private static WebElement elementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private static WebElement presenceOfElement(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}

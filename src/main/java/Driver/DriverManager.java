package Driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager(){}
  private static ThreadLocal<WebDriver> threadLocal = new java.lang.ThreadLocal<>();

    public static void setDriver(WebDriver driver){
        threadLocal.set(driver);

    }
    public static WebDriver getDriver(){
       return threadLocal.get();
    }
}

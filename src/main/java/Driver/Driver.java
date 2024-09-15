package Driver;

import config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public final class Driver {
    private Driver() {}
    public static void initDriver() throws MalformedURLException {

        String browserName = ConfigFactory.getConfig().browser();
        String run_mode = ConfigFactory.getConfig().runmode();
        WebDriver driver = DriverFactory.getBrowser(browserName,run_mode);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().get(ConfigFactory.getConfig().url());
        DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);
    }

    public static void quit() {
        DriverManager.getDriver().quit();
    }
}

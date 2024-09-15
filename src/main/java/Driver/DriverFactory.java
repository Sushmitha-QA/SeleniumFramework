package Driver;

import config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public final class DriverFactory {


    public static WebDriver getBrowser(String browser, String runmode) throws MalformedURLException {
    WebDriver driver = null;
        if (runmode.equalsIgnoreCase("remote")) {
 driver = RemoteDriverFactory.getRemoteDriver(browser);

        }
       else if (runmode.equalsIgnoreCase("local")) {
          driver= LocalDriverFactory.getLocalDriver(browser);

        }


        return driver;
    }
}
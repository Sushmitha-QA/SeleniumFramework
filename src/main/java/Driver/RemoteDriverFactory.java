package Driver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    public static WebDriver getRemoteDriver(String browser) throws MalformedURLException {
        WebDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if(browser.equalsIgnoreCase("chrome")){
            capabilities.setBrowserName("chrome");

        }
        else if(browser.equalsIgnoreCase("firefox")){
            capabilities.setBrowserName("firefox");
        }
        else{
            capabilities.setBrowserName("edge");

        }

        return  new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);

    }
}

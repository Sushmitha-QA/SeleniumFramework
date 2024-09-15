package pages;

import enums.WaitType;
import org.openqa.selenium.By;
import pages.pagecomponents.SidemenuComponents;
import report.ExtentLogger;
import utils.SeleniumUtils;

public class HomePage {
    private static final By TXT_USERNAME = By.xpath("//input[@name='username']");
    private static final By TXT_PASSWORD = By.xpath("//input[@name='password']");
    private static final By BTN_LOGIN = By.xpath("//*[@type='submit']");

    private final SidemenuComponents sidemenu;

    public HomePage(){
        sidemenu = new SidemenuComponents();
    }

    private HomePage setUsername(String username) {
        SeleniumUtils.sendKeys(TXT_USERNAME,username,"username");
        return this;
    }

    private HomePage setPassword(String password) {
        SeleniumUtils.sendKeys(TXT_PASSWORD,password,"password");
        return this;
    }

    private HomePage setLogin() {
        SeleniumUtils.click(BTN_LOGIN, WaitType.CLICKABLE,"Login Button");
        return this;
    }

  public  void Login(String username, String password){
     setUsername(username).setPassword(password).setLogin();
  }
    public void clickOnAdmin(){
        sidemenu.clickAdmin();
    }


}

package pages.pagecomponents;

import Driver.DriverManager;
import enums.WaitType;
import org.openqa.selenium.By;
import utils.SeleniumUtils;

public class SidemenuComponents {

   private final By lnkAdmin = By.xpath("//span[text()='Admin']");

    public void clickAdmin(){
        SeleniumUtils.click(lnkAdmin, WaitType.PRESENCE,"Admin");
       // DriverManager.getDriver().findElement(lnkAdmin).click();
    }

}

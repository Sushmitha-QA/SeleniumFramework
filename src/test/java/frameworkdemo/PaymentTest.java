package frameworkdemo;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Driver.DriverManager;

public class PaymentTest extends BaseTest {

    @Test
    public void payment(){

        DriverManager.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        DriverManager.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        DriverManager.getDriver().findElement (By.xpath("//*[@type='submit']"));
    }

}

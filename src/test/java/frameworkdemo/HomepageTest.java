package frameworkdemo;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;
import pages.HomePage;
import testdata.Testdata;
import utils.DataproviderUtils;

import java.lang.reflect.Method;
import java.time.Duration;


public class HomepageTest extends BaseTest {



    @Test(dataProvider = "getdata", dataProviderClass = DataproviderUtils.class)
    public void titleValidationTest(Testdata data) throws InterruptedException {


        HomePage homepage = new HomePage();
        homepage.Login(data.username, data.password);
        Thread.sleep(Duration.ofSeconds(5));

    }

   @Test (dataProvider = "getdata",dataProviderClass = DataproviderUtils.class)
    public void adminTest(Testdata data) throws InterruptedException {


        HomePage homepage = new HomePage();
        homepage.Login(data.username, data.password);
        homepage.clickOnAdmin();
        Thread.sleep(Duration.ofSeconds(5));


    }


}

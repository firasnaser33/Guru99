package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtils;
import utilities.DriverUtil;

import java.util.concurrent.TimeUnit;

public class baseTest {
    @BeforeMethod
    public void SetUp(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closing(){
        BrowserUtils.wait(2);
        DriverUtil.closeDriver();
    }

}

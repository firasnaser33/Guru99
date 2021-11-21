package Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtils;
import utilities.DriverUtil;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

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

    public BasePage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }

}



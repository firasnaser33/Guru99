package Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtils;
import utilities.DriverUtil;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {


    public BasePage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }

}



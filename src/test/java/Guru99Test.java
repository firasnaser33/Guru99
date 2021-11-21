import Pages.GuruLoginPage;
import Pages.HomePage;
import Pages.NewCustomerPage;
import org.testng.annotations.Test;
import utilities.DriverUtil;
import utilities.PropertiesReadingUtil;

public class Guru99Test {

    GuruLoginPage guruLoginPage;
    HomePage homePage;
    NewCustomerPage newCustomerPage;

    @Test
    public void TC1_headerVerify(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru99_url"));
        guruLoginPage = new GuruLoginPage();
        guruLoginPage.headerVerify();
    }

    @Test
    public void TC2_logIn(){

        guruLoginPage.loginGuru(PropertiesReadingUtil.getProperties("guru99_userID"),
                PropertiesReadingUtil.getProperties("guru99_password"));
    }

    @Test
    public void TC3_homePageTextContains(){
        homePage = new HomePage();
        homePage.homePageContainsText(PropertiesReadingUtil.getProperties("guru99_homepage_contains"));

    }
    @Test
    public void TC4_VerifyOnNewCustomerModule(){
        newCustomerPage=new NewCustomerPage();
        newCustomerPage.newCustomerModule();

        newCustomerPage.inputInfoForNewCustomer();
        newCustomerPage.verifyNewCustomerAddedSuccessfully();



    }


}


package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utilities.DriverUtil;

public class NewCustomerPage extends BasePage{

    //Step 5) Click on new customer button and verify you are in New Customer Entry Page
    @FindBy(xpath = "//a[.='New Customer']")
    public WebElement newCustomerModule;

    //Step 6) Fill the information for new customer
    @FindBy(xpath = "//input[@onkeyup='validatecustomername();']")
    public WebElement customerName;

    @FindBy(id ="dob" )
    public WebElement dateOfBirth;

    @FindBy(xpath = "//textarea[@name='addr']")
    public WebElement address;

    @FindBy(xpath = "//input[@name='city']" )
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement pin;

    @FindBy(xpath = "//input[@name='telephoneno']" )
    public WebElement mobileNumber;

    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']" )
    public WebElement password;

    @FindBy(xpath = "//input[@name='sub']" )
    public WebElement submitButton;

    //Step 7) Verify new customer added sucessfully
    @FindBy(xpath = "//p[@class='heading3']")
    public WebElement verifyNewCustomerAddedSuccessfully;






    public void newCustomerModule(){
        newCustomerModule.click();
        Assert.assertEquals(DriverUtil.getDriver().getTitle(),"Guru99 Bank New Customer Entry Page","Failed on wrong page ");
    }

    public void inputInfoForNewCustomer(){
        Faker faker =new Faker();
        customerName.sendKeys(faker.letterify("John Doe"));
        dateOfBirth.sendKeys(faker.numerify("05/07/1998"));
        address.sendKeys(faker.letterify("123 Someone St"));
        city.sendKeys(faker.address().city());
        state.sendKeys(faker.address().state());
        pin.sendKeys(faker.numerify("030303"));
        mobileNumber.sendKeys(faker.numerify("5401234567"));
        email.sendKeys(faker.internet().emailAddress());
        password.sendKeys(faker.internet().password());

        submitButton.click();
    }
    public void verifyNewCustomerAddedSuccessfully(){
        String expected="Customer Registered Successfully!!!";
        Assert.assertEquals(verifyNewCustomerAddedSuccessfully.getText(),expected);
    }



}



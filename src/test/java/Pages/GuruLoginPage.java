package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuruLoginPage extends BasePage {

    @FindBy(css = "h2.barone")
    public WebElement headerVerify;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userIdBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(name = "btnLogin")
    public WebElement logInButton;

    public void headerVerify(){
        boolean header= headerVerify.isDisplayed();
        System.out.println(headerVerify.getText()+" is Displayed "+header);

    }


    public void loginGuru(String userId, String password){

        userIdBox.sendKeys(userId);
        passwordBox.sendKeys(password);
        logInButton.click();
    }

}

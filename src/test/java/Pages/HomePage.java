package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath ="//td[contains(text(),'Manger')]" )
    public WebElement homePageContainsText;


    public void homePageContainsText(String expectedText){

        if (homePageContainsText.getText().contains(expectedText)){
            System.out.println("Verification Passed");
        }else {
            System.out.println("Verification Failed Page Actual contains is:"+ homePageContainsText.getText());
        }


    }

}

package homeofficevisawk5.pages;

import com.aventstack.extentreports.Status;
import homeofficevisawk5.customlisteners.CustomListeners;
import homeofficevisawk5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ResultPage extends Utility {

    // resultMessage locator and create methods 'String getResultMessage()' and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)



    @CacheLookup
    @FindBy(xpath="//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement message;
    public String getResultMessage(){
        Reporter.log("Verify text"+ message);
        CustomListeners.test.log(Status.PASS, "verify text message");
        return getTextFromElement(message);
    }

    @CacheLookup
    @FindBy(xpath="//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement message1;
    public String getResultMessage1(){
        Reporter.log("Verify text"+ message1);
        CustomListeners.test.log(Status.PASS, "verify text message");
        return getTextFromElement(message1);
    }

    @CacheLookup
    @FindBy(xpath="//h2[normalize-space()='You may need a visa']")
    WebElement message2;
    public String getResultMessage2(){
        Reporter.log("Verify text"+ message2);
        CustomListeners.test.log(Status.PASS, "verify text message");
        return getTextFromElement(message2);
    }

}
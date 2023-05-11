package homeofficevisawk5.pages;

import com.aventstack.extentreports.Status;
import homeofficevisawk5.customlisteners.CustomListeners;
import homeofficevisawk5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {

    public StartPage() {
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement Startnow;
    public void clickStartNow() {
        Reporter.log("click on start now " + Startnow);
        mouseHoverToElementAndClick2(Startnow);
        CustomListeners.test.log(Status.PASS,"mouseHover To Element And Click");
    }


    }


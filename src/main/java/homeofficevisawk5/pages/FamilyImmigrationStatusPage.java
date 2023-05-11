package homeofficevisawk5.pages;

import com.aventstack.extentreports.Status;
import homeofficevisawk5.customlisteners.CustomListeners;
import homeofficevisawk5.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yes;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement no;

    public void selectImmigrationStatus(String status) {
        Reporter.log("Immigration status" + yes.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Immigration status" + yes);

        switch (status) {
            case "yes":
                clickOnElement((By) yes);
                break;
            case "no":
                clickOnElement((By) no);
                break;
        }
    }

}
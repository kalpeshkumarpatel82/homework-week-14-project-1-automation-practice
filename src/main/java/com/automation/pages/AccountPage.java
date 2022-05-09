package com.automation.pages;
/* 
 Created by Kalpesh Patel
 */

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement signOutButton;

    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement pageHeader;



    public String getSignOutButtonText() {
        return getTextFromElement(signOutButton);
    }
    public String getPageHeader() {
        Reporter.log("Clicking on login link " + pageHeader.toString());
        return getTextFromElement(pageHeader);
    }

    public void setSignOutButton() {
        Reporter.log("Clicking on SignOut link "+signOutButton.toString());
        clickOnElement(signOutButton);
    }

}

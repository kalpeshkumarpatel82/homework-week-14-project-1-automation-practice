package com.automation.pages;
/* 
 Created by Kalpesh Patel
 */

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utility {

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddress;

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailAddressToCreateAnAccount;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement signInButton;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createAccount;

    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement pageHeader;

    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createAccountHeader;

    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    WebElement errorMessage;

    public void setEmailAddress(String text){
        sendTextToElement(emailAddress,text);
    }

    public void setEmailAddressToCreateAnAccount(String text){
        int a = (int)(Math.random()*10000);
        sendTextToElement(emailAddressToCreateAnAccount,text+a+"@nodomain.com");
    }

    public void setPassword(String text){
        Reporter.log("Sending Password "+ text + " to " + password.toString());
        sendTextToElement(password,text);
    }

    public void setSignInButton(){
        Reporter.log("Clicking on Sign IN " + signInButton.toString());
        clickOnElement(signInButton);
    }

    public String getSignInButton(){
        Reporter.log("Getting text of Sign IN " + signInButton.toString());
        return getTextFromElement(signInButton);
    }

    public void setCreateAccount(){
        Reporter.log("Clicking on Create Account" + createAccount.toString());
        clickOnElement(createAccount);
    }

    public String getPageHeader(){
        Reporter.log("Getting Page Header" + pageHeader.toString());
        return getTextFromElement(pageHeader);
    }

    public String getCreateAccountHeader(){
        Reporter.log("Getting Create Account Header" + createAccountHeader.toString());

        return getTextFromElement(createAccountHeader);
    }

    public String getErrorMessage(){
        Reporter.log("Getting Error Message" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

}

package com.automation.pages;
/* 
 Created by Kalpesh Patel
 */

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement gender;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstNamePersonalInfo;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastNamePersonalInfo;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddress;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    WebElement birthDays;

    @FindBy(xpath = "//select[@id='months']")
    WebElement birthMonth;

    @FindBy(xpath = "//select[@id='years']")
    WebElement birthYear;

    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsLetter;

    @FindBy(xpath = "//input[@id='optin']")
    WebElement receiveOfferCheckBox;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='company']")
    WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressLine1;

    @FindBy(xpath = "//input[@id='address2']")
    WebElement addressLine2;

    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postcode;

    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;

    @FindBy(xpath = "//textarea[@id='other']")
    WebElement additionalInfo;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement homePhone;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhone;

    @FindBy(xpath = "//input[@id='alias']")
    WebElement alias;

    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerButton;

    public void setGender() {
        Reporter.log("Clicking on Gender Radio " + gender.toString());
        clickOnElement(gender);
    }

    public void setFirstNamePersonalInfo(String text) {
        Reporter.log("Sending firstname "+ text + " to "  + firstNamePersonalInfo.toString());
        sendTextToElement(firstNamePersonalInfo, text);
    }

    public void setLastNamePersonalInfo(String text) {
        Reporter.log("Sending lastname "+ text + " to " +  lastNamePersonalInfo.toString());
        sendTextToElement(lastNamePersonalInfo, text);
    }

    public void setEmailAddress(String text) {
        Reporter.log("Sending emailaddress "+ text + " to " +  emailAddress.toString());
        sendTextToElement(emailAddress, text);
    }

    public void setPassword(String text) {
        Reporter.log("Sending password "+ text + " to " +  password.toString());
        sendTextToElement(password, text);
    }

    public void setBirthDate(String day, String month, String year) {
        Reporter.log("Setting BirthDate  "+ day+"/"+month+"/"+year + " to " +  birthDays.toString()+" "+birthMonth.toString()+" "+birthYear.toString() );
        selectByValueFromDropDown(birthDays, day);
        selectByValueFromDropDown(birthMonth, month);
        selectByValueFromDropDown(birthYear, year);
    }

    public void setNewsLetter() {
        Reporter.log("Clicking on Newsletter checkbox " + newsLetter.toString());
        clickOnElement(newsLetter);
    }

    public void setReceiveOfferCheckBox() {
        Reporter.log("Clicking on offer checkbox " + receiveOfferCheckBox.toString());
        clickOnElement(receiveOfferCheckBox);
    }

    public void setFirstName(String text) {
        Reporter.log("Sending firstname "+ text + " to " + firstName.toString());
        sendTextToElement(firstName, text);
    }

    public void setLastName(String text) {
        Reporter.log("Sending lastname "+ text + " to " + lastName.toString());
        sendTextToElement(lastName, text);
    }

    public void setCompany(String text) {
        Reporter.log("Sending company "+ text + " to " +  company.toString());
        sendTextToElement(company, text);
    }

    public void setAddress(String line1, String line2) {
        Reporter.log("Sending Address "+ line1+" " + line1 + " to " + addressLine1.toString()+" "+addressLine2.toString());
        sendTextToElement(addressLine1, line1);
        sendTextToElement(addressLine2, line2);
    }

    public void setCity(String text) {
        Reporter.log("Sending city "+ text + " to " +  city.toString());
        sendTextToElement(city, text);
    }

    public void setState(String text) {
        Reporter.log("setting state "+ text + " to " + state.toString());
        selectByVisibleTextFromDropDown(state, text);
    }

    public void setPostcode(String text) {
        Reporter.log("Sending Postcode " + text +" to "+ postcode.toString());
        sendTextToElement(postcode, text);
    }

    public void setCountry(String text) {
        Reporter.log("Setting Country " + text + " to " + country.toString());
        selectByVisibleTextFromDropDown(country, text);
    }

    public void setAdditionalInfo(String text) {
        Reporter.log("Sending additional info " + text + " to " + additionalInfo.toString());
        sendTextToElement(additionalInfo, text);
    }

    public void setHomePhone(String text) {
        Reporter.log("Sending homephone "+ text + " to " + homePhone.toString());
        sendTextToElement(homePhone, text);
    }

    public void setMobilePhone(String text) {
        Reporter.log("Sending mobile "+ text + " to " +  mobilePhone.toString());
        sendTextToElement(mobilePhone, text);
    }

    public void setAlias(String text) {
        Reporter.log("Sending alias " + text + " to " +  alias.toString());
        sendTextToElement(alias, text);
    }

    public void setRegisterButton() {
        Reporter.log("Clicking on register button " + registerButton.toString());
        clickOnElement(registerButton);
    }


}

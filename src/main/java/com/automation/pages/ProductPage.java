package com.automation.pages;
/* 
 Created by Kalpesh Patel
 */

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductPage extends Utility {

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;

    @FindBy(xpath = "//select[@id='group_1']")
    WebElement size;

    @FindBy(xpath = "//a[@name='White']")
    WebElement whiteColour;

    @FindBy(xpath = "//a[@name='Orange']")
    WebElement orangeColour;

    @FindBy(xpath = "//a[@name='Green']")
    WebElement greenColour;

    @FindBy(xpath = "//a[@name='Blue']")
    WebElement blueColour;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCard;

//    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']/h2/text()[2]")
//    WebElement confirmMessage;

    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']")
    WebElement confirmMessage;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
    WebElement closeConfirmMessage;

    public void setQuantity(String text) {
        Reporter.log("Sending text to Quantity : " + text + " to " + quantity.toString());
        sendTextToElement(quantity, text);
    }

    public void setQuantity() {
        Reporter.log("Clearing Quantity " + quantity.toString());
        sendTextToElement(quantity);
    }

    public void setSize(String text) {
        Reporter.log("Setting Size " + text+" to " +size.toString());
        selectByVisibleTextFromDropDown(size, text);
    }

    public void setColour(String text) {
        if (text == "White") {
            Reporter.log("Selecting White Colour " + whiteColour.toString());
            clickOnElement(whiteColour);
        }
        if (text == "Orange") {
            Reporter.log("Selecting Orange Colour " + orangeColour.toString());
            clickOnElement(orangeColour);
        }
        if (text == "Green") {
            Reporter.log("Selecting Green Colour " + greenColour.toString());
            clickOnElement(greenColour);
        }
        if (text == "Blue") {
            Reporter.log("Selecting Blue Colour " + blueColour.toString());
            clickOnElement(blueColour);
        }
    }

    public void setAddToCard() {
        Reporter.log("Clicking on Add to Cart " + addToCard.toString());
        clickOnElement(addToCard);
    }

    public void setCloseConfirmMessage() {
        Reporter.log("Clicking on Close button " + closeConfirmMessage.toString());

        clickOnElement(closeConfirmMessage);
    }

    public String getConfirmMessage() {
        Reporter.log("Getting Confirm Message " + confirmMessage.toString());
        return getTextFromElement(confirmMessage).substring(0, 49);
    }


}

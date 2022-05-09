package com.automation.pages;
/* 
 Created by Kalpesh Patel
 */

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='sf-with-ul' and contains(text(),'Women')]")
    WebElement topMenuWomen;

    @FindBy(xpath = "//ul/li[1]//a[@class='sf-with-ul' and contains(text(),'Dresses')]")
    WebElement topMenuDresses;

    @FindBy(xpath = "//ul/li[1]//a[@title='T-shirts' and contains(text(),'T-shirts')]")
    WebElement topMenuTShirts;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInButton;

    @FindBy(xpath = "//div[@id='header_logo']")
    WebElement headerLogo;

    public void setTopMenuWomen(){
        Reporter.log("Clicking on Women tab " + topMenuWomen.toString());
        clickOnElement(topMenuWomen);
    }

    public void setTopMenuDresses(){
        Reporter.log("Clicking on Dress tab " + topMenuDresses.toString());
        clickOnElement(topMenuDresses);
    }

    public void setTopMenuTShirts(){
        Reporter.log("Clicking on T-Shirt tab " + topMenuTShirts.toString());
        clickOnElement(topMenuTShirts);
    }

    public void setHeaderLogo(){
        Reporter.log("Clicking on Header Logo" + headerLogo.toString());
        clickOnElement(headerLogo);
    }

    public void setSignInButton(){
        Reporter.log("Clicking on Sign In " + signInButton.toString());
        clickOnElement(signInButton);
    }









}

package com.automation.pages;
/* 
 Created by Kalpesh Patel
 */

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WomenCategoryPage extends Utility {
    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement pageHeader;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]")
    WebElement topsLink;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement dressesLink;

    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortBy;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[3]/div[1]/ul[1]/li[3]/a[1]/i[1]")
    WebElement listView;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
    WebElement blouseDress;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedDress;

    @FindBy(xpath = "//a[contains(text(),'Printed Chiffon Dress')]")
    WebElement printedChiffonDress;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedSummerDress;


    public String getPageHeader() {
        Reporter.log("Getting Page Header" + pageHeader.toString());
        return getTextFromElement(pageHeader);
    }

    public void setTopsLink() {
        Reporter.log("Clicking on Tops " + topsLink.toString());
        clickOnElement(topsLink);
    }

    public void setDressesLink() {
        Reporter.log("Clicking on Dresses " + dressesLink.toString());
        clickOnElement(dressesLink);
    }

    public void setSortBy(String text) {
        Reporter.log("Selecting sort by " + sortBy.toString());
        selectByValueFromDropDown(sortBy, text);
    }

    public void setListView() {
        Reporter.log("Clicking on List View " + listView.toString());
        clickOnElement(listView);
    }

    public void selectProduct(String text) {

        if (text == "Blouse") {
            Reporter.log("Clicking on Blouse " + blouseDress.toString());
            clickOnElement(blouseDress);
        }

        if (text == "Printed Dress") {
            Reporter.log("Clicking on Printed Dress " + printedDress.toString());
            clickOnElement(printedDress);
        }
        if (text == "Printed Chiffon Dress") {
            Reporter.log("Clicking on Printed Chiffon Dress " + printedChiffonDress.toString());
            clickOnElement(printedChiffonDress);
        }
        if (text == "Printed Summer Dress with Price $28.98") {
            Reporter.log("Clicking on Printed Summer Dress with Price tag $28.98 " + printedSummerDress.toString());
            clickOnElement(printedSummerDress);
        }
    }


}

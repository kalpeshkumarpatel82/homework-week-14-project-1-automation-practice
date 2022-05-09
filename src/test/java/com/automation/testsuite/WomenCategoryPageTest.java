package com.automation.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        womenCategoryPage = new WomenCategoryPage();
        productPage = new ProductPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully(){
        homePage.setTopMenuWomen();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(womenCategoryPage.getPageHeader(),"WOMEN","Failed to load Women Page");
        softAssert.assertAll();
    }

    @Test(groups = {"sanity","smoke","regression"},dataProvider = "product",dataProviderClass = TestData.class)
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String size, String colour) throws InterruptedException {
        homePage.setTopMenuWomen();
        womenCategoryPage.selectProduct(product);
        productPage.setQuantity();
        productPage.setQuantity(qty);
        productPage.setSize(size);
        productPage.setColour(colour);
        productPage.setAddToCard();
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(productPage.getConfirmMessage(),"Product successfully added to your shopping cart\n","Failed to add in cart");
        softAssert.assertAll();

        productPage.setCloseConfirmMessage();

    }


}

package com.automation.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.automation.pages.AccountPage;
import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
        accountPage = new AccountPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        SoftAssert softAssert = new SoftAssert();
        homePage.setSignInButton();
        signInPage.setEmailAddressToCreateAnAccount("chhota");
        signInPage.setCreateAccount();
        createAccountPage.setGender();
        createAccountPage.setFirstNamePersonalInfo("Raman");
        createAccountPage.setLastNamePersonalInfo("Magan");
        //createAccountPage.setEmailAddress("raman_magan@mydomain.com");
        createAccountPage.setPassword("Password123");
        createAccountPage.setBirthDate("25","6","1985");
        createAccountPage.setNewsLetter();
        createAccountPage.setReceiveOfferCheckBox();
        createAccountPage.setFirstName("Popatlal");
        createAccountPage.setLastName("Patrakar");
        createAccountPage.setCompany("Twitter");
        createAccountPage.setAddress("11 Park Avenue", "Second Floor");
        createAccountPage.setCountry("United States");
        createAccountPage.setState("Texas");
        createAccountPage.setCity("Goa");
        createAccountPage.setPostcode("75002");
        createAccountPage.setAdditionalInfo("Not applicable");
        createAccountPage.setHomePhone("001 23456789");
        createAccountPage.setMobilePhone("001 4785264456");
        createAccountPage.setAlias("chhota_raman");
        createAccountPage.setRegisterButton();
        softAssert.assertEquals(accountPage.getPageHeader(),"MY ACCOUNT","Failed to created an account");
        softAssert.assertAll();


    }

}

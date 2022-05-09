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
import resources.testdata.TestData;

public class SignPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    AccountPage accountPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        accountPage = new AccountPage();
        createAccountPage = new CreateAccountPage();

    }

    @Test (groups = {"sanity","regression"})
    public void userShouldNavigateToSignInPageSuccessFully(){
        SoftAssert softAssert = new SoftAssert();
        homePage.setSignInButton();
        softAssert.assertEquals(signInPage.getPageHeader(),"AUTHENTICATION","Not on SignInPage");
        softAssert.assertAll();

    }

    @Test(groups = {"sanity","smoke","regression"},dataProvider = "credentials",dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,String message){
        homePage.setSignInButton();
        signInPage.setEmailAddress(username);
        signInPage.setPassword(password);
        signInPage.setSignInButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(signInPage.getErrorMessage(),message,"Invalid Tests are Failed");
        softAssert.assertAll();

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        SoftAssert softAssert = new SoftAssert();
        homePage.setSignInButton();
        signInPage.setEmailAddress("test@yahoo.be");
        signInPage.setPassword("Password123");
        signInPage.setSignInButton();
        softAssert.assertEquals(accountPage.getSignOutButtonText(),"Sign out","Failed to login");
        softAssert.assertAll();

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully(){
        SoftAssert softAssert = new SoftAssert();
        homePage.setSignInButton();
        signInPage.setEmailAddress("test@yahoo.be");
        signInPage.setPassword("Password123");
        signInPage.setSignInButton();
        accountPage.setSignOutButton();
        softAssert.assertEquals(signInPage.getSignInButton(),"Sign in","Failed to logout");
        softAssert.assertAll();

    }
}

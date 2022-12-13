package com.orangehrmlive.testsuite;

import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.pages.Loginpage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    Loginpage loginpage;
    @BeforeMethod
    public void inIt(){
        loginpage =new Loginpage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToLoginPageWithValidCredentialsSuccessfully(){
        loginpage.enterUsername("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickOnLoginButton();
        String expectedErrorMessage = "Dashboard";

        Assert.assertEquals(loginpage.getDeskboardMessage(),expectedErrorMessage,"message is not displyed");


    }
}

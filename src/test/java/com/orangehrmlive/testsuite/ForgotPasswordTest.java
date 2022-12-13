package com.orangehrmlive.testsuite;

import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.pages.ForgotPassword;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ForgotPasswordTest extends BaseTest {
ForgotPassword forgotPassword;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        forgotPassword=new ForgotPassword();
    }


    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        forgotPassword.clickOnForgotPassword();
        String expectedMessage="Reset Password";
        String actualMessage =forgotPassword.forgotPasswordText();
        Assert.assertEquals(actualMessage, expectedMessage, "Text is not correct");



    }






}

package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ForgotPassword extends Utility {
    public ForgotPassword() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-forgot']//p")
    WebElement forgotPasswordLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-forgot-password-container']//h6")
    WebElement forgotPasswordText;


    public void clickOnForgotPassword() {
        Reporter.log("Clicking on Login Button " + forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
    }

    public String forgotPasswordText() {
        Reporter.log("Get secure text " + forgotPasswordText.toString());
        return getTextFromElement(forgotPasswordText);
    }


}


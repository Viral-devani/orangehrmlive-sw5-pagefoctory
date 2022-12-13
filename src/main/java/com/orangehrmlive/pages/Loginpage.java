package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Loginpage extends Utility {
    public Loginpage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;


    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/span[1]/h6[1]")
    WebElement deskboardMessage;


    public void enterUsername(String username) {
        Reporter.log("Enter username " + username + " to username field " + usernameField.toString());
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter username " + password + " to username field " + usernameField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicking on Login Button " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getDeskboardMessage() {
        Reporter.log("Get deskboard Message" + deskboardMessage.toString());
        return getTextFromElement(deskboardMessage);
    }

}

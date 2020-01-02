package com.odoo.pages;

import com.odoo.utilities.BrowserUtilities;
import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    // this button we will click, when we just open URL
    // we need to click it in purpose to see Username and Password input boxes
    @FindBy (xpath = "//b[text()='Sign in']")
    public WebElement SignInButton;

    @FindBy (id = "login")
    public WebElement usernameTextBox;

    @FindBy (id = "password")
    public WebElement passwordTextBox;

    @FindBy (xpath = "//button[text()='Log in']")
    public WebElement logInButton;

    @FindBy (xpath = "//ol//li")
    public WebElement subTitle;

    public LoginPage() {
        //it's mandatory if you want to use @FindBy annotation
        //Driver.get() return webdriver object
        PageFactory.initElements(Driver.get(), this);

    }

    public void login(String username, String password) {
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        BrowserUtilities.waitForClickablility(logInButton, 10);
        logInButton.click();

    }



}

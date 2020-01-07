package com.odoo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

    @FindBy(xpath = "//*[@id='oe_main_menu_navbar']/div[2]/ul[1]/li[4]/a")
    public WebElement ContactsButton;

    @FindBy(xpath = "//div[1]/div[2]/div[1]/ol/li[2]/text()")
    public WebElement contactsSubModule;

    @FindBy(css = "button[class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createContactButton;

    @FindBy(css = "[class*='input o_required_modifier']")
    public WebElement contactName;

    @FindBy(xpath = "//*[@id='o_field_input_227']")
    public WebElement contactCompany;

    @FindBy(name = "street")
    public WebElement contactStreet;

    @FindBy(name = "street2")
    public WebElement contactStreet2;

    @FindBy(name = "city")
    public WebElement contactCity;

    @FindBy(xpath = "//*[@id='o_field_input_233']")
    public WebElement contactState;

    @FindBy(name = "zip")
    public WebElement contactZipcode;

    @FindBy(xpath = "//*[@id='o_field_input_235']")
    public WebElement contactCountry;

    @FindBy(name = "function")
    public WebElement contactJobPosition;

    @FindBy(name = "phone")
    public WebElement contactphone;

    @FindBy(name = "mobile")
    public WebElement contactmobile;

    @FindBy(name = "email")
    public WebElement contactEmail;

    @FindBy(name = "website")
    public WebElement contactWebsite;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveContact;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li[2]/text()")
    public WebElement contactSaved;




}

package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PointOfSalePage extends BasePage{

    public PointOfSalePage(){

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][contains(text(),'Point of Sale')]")
    public WebElement pointOfSaleTap;

    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][contains(text(),'Products')] ")
    public WebElement productSubmoduleLink;

    @FindBy(xpath = "//span[contains(text(),'PoS Categories')]")
    public WebElement poSCategoriesLink ;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

   @FindBy(css = "input[name='name']")
    public WebElement nameInputBox;

   @FindBy (css = "input[id='o_field_input_137']")
    public WebElement parentCategoryDropDownBox;

   @FindBy(xpath = "//table//tbody//tr//td//*[@name='sequence']")
    public WebElement sequenceInputBox;

   @FindBy(xpath = " //button[@class='btn btn-primary btn-sm o_form_button_save']")
   public  WebElement saveButton;

   @FindBy(xpath = "//table//tbody//td//*[text()='New Generation']")
    public WebElement createdName;

   @FindBy(xpath = "//a[@data-menu='489']//span")
    public WebElement ordersButton;
  
   @FindBy(xpath = "//table//tbody//td//*[text()='110,110']")
    public WebElement createdSequence;

   @FindBy(xpath = "//table//tbody//tr[1]//td//div//input[1]")
    public WebElement deletedProductCheckbox;

   @FindBy(xpath="//div[@class='btn-group o_dropdown']//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'][contains(text(),'Action')]")
    public WebElement actionButton;

   @FindBy(xpath = "//li//a[contains(text(),'Delete')]")
    public WebElement deleteButton;

    }




package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PointOfSalePage {

    public PointOfSalePage(){

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy()
    public WebElement x ;

    @FindBy()
    public WebElement y;

    @FindBy()
    public WebElement z ;

    @FindBy()
    public WebElement t;




    }




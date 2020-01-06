package com.odoo.pages;

import com.odoo.utilities.BrowserFactory;
import com.odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPipelinePage extends BasePage {

    public NewPipelinePage(){

        PageFactory.initElements(Driver.get(), this);
    }

@FindBy (xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][contains(text(),'CRM")
    public WebElement CRMtab;

@FindBy(className = "[class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createButton;


public void inputBoxText(){

    WebDriver driver=BrowserFactory.getDriver("chrome");
    driver.get("http://34.220.250.213/web?#view_type=kanban&model=crm.lead&menu_id=261&action=366");
    WebElement input = driver.findElement(By.className("[class='btn btn-primary btn-sm o-kanban-button-new']"));
    input.sendKeys("Online2");
    WebElement enter = driver.findElement(By.name("edit_dialog"));
    enter.click();

}



}

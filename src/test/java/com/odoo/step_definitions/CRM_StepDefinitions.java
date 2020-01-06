package com.odoo.step_definitions;

import com.odoo.pages.BasePage;
import com.odoo.pages.CRM_Page;
import com.odoo.utilities.BrowserUtilities;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CRM_StepDefinitions  {

    BasePage basePage = new BasePage();
    CRM_Page crm_page = new CRM_Page();
    public static WebElement pipeline;

    @Then("user navigates to {string} module")
    public void user_navigates_to_module(String moduleName) {
        basePage.navigateToModule(moduleName);
        System.out.println("You are on "+moduleName+" module!");
        BrowserUtilities.wait(2);

    }

    @Then("user verifies, that columns name {string},{string},{string},{string} are visible")
    public void user_verifies_that_columns_name_are_visible(String column1, String column2, String column3, String column4) {

        crm_page.verifyColumns(column1,column2,column3,column4);

    }

    @Then("user finds pipeline by the {string}")
    public void user_finds_pipeline_by_the(String pipelineName) {
        BrowserUtilities.wait(1);
        this.pipeline = Driver.get().findElement(By.xpath("//*[contains(@class,'record ui-sortable-handle')]//div//div//span[text()='"+pipelineName+"']"));

    }

    @Then("user moves pipeline to {string} column")
    public void user_moves_pipeline_to_column(String name) {

        WebElement column = Driver.get().findElement(By.cssSelector("[data-id='"+crm_page.getLocator(name)+"']"));
        Actions actions = new Actions(Driver.get());
        actions.clickAndHold(pipeline).moveToElement(column).release(column).build().perform();
        BrowserUtilities.wait(2);


    }




}

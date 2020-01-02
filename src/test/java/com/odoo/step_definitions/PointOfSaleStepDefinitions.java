package com.odoo.step_definitions;

import com.odoo.pages.PointOfSalePage;
import com.odoo.utilities.BrowserUtilities;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PointOfSaleStepDefinitions {


    PointOfSalePage pointOfSalePage = new PointOfSalePage();
   //  WebDriverWait wait=new WebDriverWait();


    @Then("user will click the Point Of Sale tab")
    public void user_will_click_the_Point_Of_Sale_tab() {
        BrowserUtilities.waitForClickablility(pointOfSalePage.pointOfSaleTap,10);
        pointOfSalePage.pointOfSaleTap.click();
        System.out.println("I clicked the PointOf Same tab");
    }

    @Then("user will click the Products subModule first and then click the Pos Categories")
    public void user_will_click_the_Products_subModule_first_and_then_click_the_Pos_Categories() {
       pointOfSalePage.productSubmoduleLink.click();
    }

    @Then("user will click the Create button")
    public void user_will_click_the_Create_button()
    {
        pointOfSalePage.poSCategoriesLink.click();
        BrowserUtilities.waitForClickablility(pointOfSalePage.createButton,10);
        pointOfSalePage.createButton.click();
    }

    @Then("user will enter the name of the product to the Name box")
    public void user_will_enter_the_name_of_the_product_to_the_Name_box() {
        BrowserUtilities.waitForVisibility(pointOfSalePage.nameInputBox,10);
        pointOfSalePage.nameInputBox.sendKeys("New Generation");

    }

    @Then("user enter info to the Parent Category")
    public void user_enter_info_to_the_Parent_Category() {
      // BrowserUtilities.waitForClickablility(pointOfSalePage.parentCategoryDropDownBox,10);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        WebElement data = Driver.get().findElement(By.xpath("//li[@class='ui-menu-item']"));
        js.executeScript("arguments[0],click()",data);
      //  pointOfSalePage.parentCategoryDropDownBox.click();
    //    pointOfSalePage.parentCategoryDropDownBox.sendKeys("Books");




     //   WebElement data = Driver.get().findElement(By.xpath("//li[@class='ui-menu-item']"));
     //   BrowserUtilities.waitForClickablility(data,10);
      //  data.click();

    }

    @Then("user enter data to the box of sequence")
    public void user_enter_data_to_the_box_of_sequence() {
        pointOfSalePage.sequenceInputBox.sendKeys("0110110");

    }

     @Then("User clicks Save button")
    public void user_clicks_Save_button() {
        pointOfSalePage.saveButton.click();

    }




}

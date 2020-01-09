package com.odoo.step_definitions;

import com.odoo.pages.PointOfSalePage;
import com.odoo.utilities.BrowserUtilities;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;

public class PointOfSaleStepDefinitions {


    PointOfSalePage pointOfSalePage = new PointOfSalePage();

    WebDriverWait wait = new WebDriverWait(Driver.get(),10);

    @Then("user will click the Point Of Sale tab")
    public void user_will_click_the_Point_Of_Sale_tab() {
        BrowserUtilities.waitForClickability(pointOfSalePage.pointOfSaleTap,10);
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
        BrowserUtilities.waitForClickability(pointOfSalePage.createButton,10);
        pointOfSalePage.createButton.click();
    }

    @Then("user will enter the name of the product to the Name box")
    public void user_will_enter_the_name_of_the_product_to_the_Name_box() {
        BrowserUtilities.waitForVisibility(pointOfSalePage.nameInputBox,10);
        pointOfSalePage.nameInputBox.sendKeys("New Generation");

    }

    @Then("user choose an option from the Parent Category box")
    public void user_choose_an_option_from_the_Parent_Category_box()  {
        BrowserUtilities.waitForVisibility(pointOfSalePage.parentCategoryDropDownBox, 10);
        pointOfSalePage.parentCategoryDropDownBox.click();

        BrowserUtilities.waitForClickability(pointOfSalePage.optionForDropDownBox,15);
      pointOfSalePage.optionForDropDownBox.click();
      // Assert.assertTrue(pointOfSalePage.optionForDropDownBox.isDisplayed());

        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].click", pointOfSalePage.optionForDropDownBox);
    }


    @Then("user enter data to the box of sequence")
    public void user_enter_data_to_the_box_of_sequence() {

        BrowserUtilities.waitForVisibility(pointOfSalePage.sequenceInputBox,10);
        BrowserUtilities.wait(3);
        pointOfSalePage.sequenceInputBox.sendKeys("0110110");
        BrowserUtilities.wait(3);

    }

     @Then("User clicks Save button")
    public void user_clicks_Save_button() {
        pointOfSalePage.saveButton.click();

    }

    @Then("user will verify {string} for Name")
    public void user_will_verify_for_Name(String string) {
        BrowserUtilities.waitForVisibility(pointOfSalePage.createdName,10);
        String expected ="New Generation";
        String actual = pointOfSalePage.createdName.getText();
        Assert.assertEquals(expected,actual);
    }

    @Then("user will verify {string} for Sequence")
    public void user_will_verify_for_Sequence(String string) {
        BrowserUtilities.waitForVisibility(pointOfSalePage.createdSequence,10);
       String expected ="110,110";
       String actual =pointOfSalePage.createdSequence.getText();
       Assert.assertEquals(expected,actual);
    }

    @Then("user will click the Orders button")
    public void user_will_click_the_Orders_button() {
        wait.until(ExpectedConditions.visibilityOf(pointOfSalePage.ordersButton));
       BrowserUtilities.waitForClickability(pointOfSalePage.ordersButton,15);
        pointOfSalePage.ordersButton.click();
    }


    @Then("user will check the order to be deleted")
    public void user_will_check_the_order_to_be_deleted() {
        BrowserUtilities.waitForClickability(pointOfSalePage.deletedProductCheckbox,15);
        pointOfSalePage.deletedProductCheckbox.click();
    }


    @Then("user will click the Action on the top of the page")
    public void user_will_click_the_Action_on_the_top_of_the_page(){
        BrowserUtilities.waitForClickability(pointOfSalePage.actionButton,1);
        pointOfSalePage.actionButton.click();
    }

    @Then("user will click the delete button")
    public void user_will_click_the_delete_button(){
        pointOfSalePage.deleteButton.click();
    }

}

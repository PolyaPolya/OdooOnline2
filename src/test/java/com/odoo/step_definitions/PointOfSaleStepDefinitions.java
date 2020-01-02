package com.odoo.step_definitions;

import com.odoo.pages.PointOfSalePage;
import com.odoo.utilities.BrowserUtilities;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    public void user_will_click_the_Create_button() {
        pointOfSalePage.poSCategoriesLink.click();
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

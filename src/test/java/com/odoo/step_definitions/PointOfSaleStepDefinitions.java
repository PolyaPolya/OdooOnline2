package com.odoo.step_definitions;

import com.odoo.pages.PointOfSalePage;
import com.odoo.utilities.BrowserUtilities;
import io.cucumber.java.en.Then;

public class PointOfSaleStepDefinitions {


    PointOfSalePage pointOfSalePage = new PointOfSalePage();



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
    public void user_will_click_the_Create_button() {
        pointOfSalePage.poSCategoriesLink.click();
    }





}

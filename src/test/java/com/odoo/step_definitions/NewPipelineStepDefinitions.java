package com.odoo.step_definitions;

import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtilities;
import io.cucumber.java.en.*;

public class NewPipelineStepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

    }

    @Given("user clicks Sign In button")
    public void user_clicks_Sign_In_button() {
        BrowserUtilities.wait(3);

    }

    @Then("user logs in as eventcrm manager with {string} username and {string} password")
    public void user_logs_in_as_eventcrm_manager_with_username_and_password(String string, String string2) {
        BrowserUtilities.wait(3);
    }

    @Then("user clicks on CRM tab")
    public void user_clicks_on_CRM_tab() {
        BrowserUtilities.wait(3);
    }

    @Then("user licks on create button")
    public void user_licks_on_create_button() {
        BrowserUtilities.wait(3);
    }

    @Then("user type new Pipeline name")
    public void user_type_new_Pipeline_name() {
        BrowserUtilities.wait(3);
    }

    @Then("user click on Create and Edit button")
    public void user_click_on_Create_and_Edit_button() {
        BrowserUtilities.wait(3);
    }


}

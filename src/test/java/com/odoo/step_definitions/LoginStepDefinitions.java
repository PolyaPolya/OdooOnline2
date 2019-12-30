package com.odoo.step_definitions;

import com.odoo.pages.BasePage;
import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtilities;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions extends BasePage {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

//    @Given("user in on the login page")
//    public void user_in_on_the_login_page() {
//        Driver.get().get(ConfigurationReader.getProperty("url"));
//
//    }

//    @Then("user click Sign in button")
//    public void user_click_Sign_in_button() {
//        BrowserUtilities.waitForClickablility(loginPage.SignInButton, 10);
//        loginPage.SignInButton.click();
//    }


//    @Then("user logs in as inventory manager with {string} username and {string} password")
//    public void user_logs_in_as_inventory_manager_with_username_and_password(String username, String password) {
//        System.out.println("I logged in as Inventory Manager!");
//        username = ConfigurationReader.getProperty("InventMan_username");
//        password = ConfigurationReader.getProperty("InventMan_password");
//        loginPage.login(username,password);
//
//    }

//    @Then("user verifies that subtitle {string} is displayed")
//    public void user_verifies_that_subtitle_is_displayed(String string) {
//       String actualResult = basePage.getPageSubTitle();
//       Assert.assertEquals(string,actualResult);
//        System.out.println("Page subtitle is: "+actualResult);
//
//    }

//    @Then("user logs in as pos manager with {string} username and {string} password")
//    public void user_logs_in_as_pos_manager_with_username_and_password(String username, String password) {
//        System.out.println("I logged in as Pos Manager!");
//        username = ConfigurationReader.getProperty("POS_username");
//        password = ConfigurationReader.getProperty("POS_password");
//        loginPage.login(username,password);
//
//    }

//    @Then("user logs in as events crm manager with {string} username and {string} password")
//    public void user_logs_in_as_events_crm_manager_with_username_and_password(String username, String password) {
//        System.out.println("I logged in as CRM Manager!");
//        username = ConfigurationReader.getProperty("CRM_username");
//        password = ConfigurationReader.getProperty("CRM_password");
//        loginPage.login(username,password);  }


        @Given("user in on the login page")
        public void user_in_on_the_login_page() {
            Driver.get().get(ConfigurationReader.getProperty("url"));
        }

        @Then("user click Sign in button")
        public void user_click_Sign_in_button() {
            BrowserUtilities.waitForClickablility(loginPage.SignInButton, 10);
            loginPage.SignInButton.click();
        }

        @Then("user logs in as inventory manager with {string} username and {string} password")
        public void user_logs_in_as_inventory_manager_with_username_and_password(String username, String password) {
            System.out.println("I logged in as Inventory Manager!");
            username = ConfigurationReader.getProperty("InventMan_username");
            password = ConfigurationReader.getProperty("InventMan_password");
            loginPage.login(username,password);
        }

        @Then("user verifies that subtitle {string} is displayed")
        public void user_verifies_that_subtitle_is_displayed(String string) throws InterruptedException {
            Thread.sleep(5000);
            String actualResult = loginPage.subTitle.getText();
            Assert.assertEquals(string,actualResult);
            System.out.println("Page subtitle is: "+actualResult);
        }

        @Then("user logs in as pos manager with {string} username and {string} password")
        public void user_logs_in_as_pos_manager_with_username_and_password(String username, String password) {
            System.out.println("I logged in as Pos Manager!");
            username = ConfigurationReader.getProperty("POS_username");
            password = ConfigurationReader.getProperty("POS_password");
            loginPage.login(username,password);
        }

        @Then("user logs in as events crm manager with {string} username and {string} password")
        public void user_logs_in_as_events_crm_manager_with_username_and_password(String username, String password) {
            System.out.println("I logged in as CRM Manager!");
            username = ConfigurationReader.getProperty("CRM_username");
            password = ConfigurationReader.getProperty("CRM_password");
            loginPage.login(username,password);
        }




}

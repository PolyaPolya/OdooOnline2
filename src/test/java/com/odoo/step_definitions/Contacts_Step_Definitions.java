package com.odoo.step_definitions;


import com.odoo.pages.BasePage;
import com.odoo.pages.ContactsPage;
import com.odoo.utilities.BrowserUtilities;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Contacts_Step_Definitions extends BasePage{
    ContactsPage contactsPage = new ContactsPage();
    BasePage basePage = new BasePage();


    @Then("user navigates to contacts module")
    public void user_navigates_to_contacts_module() {

        BrowserUtilities.waitForClickability(contactsPage.ContactsButton,10);
        contactsPage.ContactsButton.click();
        BrowserUtilities.wait(3);

    }


    @When("user will click the Create button in {string} module")
    public void user_will_click_the_Create_button_in_module(String string) {

       // contactsPage.ContactsButton.click();

        BrowserUtilities.waitForClickability(contactsPage.createContactButton,10);
        contactsPage.createContactButton.click();
        BrowserUtilities.wait(3);

    }

    @When("user enters Contact information and saves new contact")
    public void user_enters_Contact_information_and_saves_new_contact() {

        BrowserUtilities.waitForVisibility(contactsPage.contactName, 10);
        contactsPage.contactName.sendKeys("Defenders contact");

        BrowserUtilities.wait(3);

    contactsPage.contactStreet.sendKeys("test");
    contactsPage.contactCity.sendKeys("Houston");
    contactsPage.contactZipcode.sendKeys("asd");
    contactsPage.saveContact.click();

        BrowserUtilities.waitForVisibility(contactsPage.saveContact, 10);
        BrowserUtilities.wait(3);


    }
}

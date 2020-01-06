package com.odoo.pages;

import com.odoo.utilities.BrowserUtilities;
import com.odoo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CRM_Page {

    @FindBy (css = "o_column_title")
    public List<WebElement> columnNames;

    public CRM_Page() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void verifyColumns(String column1, String column2, String column3, String column4) {

        List<String> columns = new ArrayList<>();
        columns.add(column1);
        columns.add(column2);
        columns.add(column3);
        columns.add(column4);

        for (String column: columns){
            for (WebElement element: columnNames){
                column.equals(element.getText());
                Assert.assertTrue(element.isDisplayed());

            }
            System.out.println(column+" is displayed!");
            BrowserUtilities.wait(1);
        }

    }

   public String getLocator(String columnName) {
       int idNumber = 0;
       switch (columnName){
           case "New": idNumber = 1; break;
           case "Proposition": idNumber = 3; break;
           case "Qualified": idNumber = 2; break;
           case "Approved": idNumber =9; break;
           default:
               System.out.println("Such column name does not exist");
       }
       String id = Integer.toString(idNumber);
       return id;
    }



}

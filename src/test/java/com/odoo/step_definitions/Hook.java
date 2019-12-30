package com.odoo.step_definitions;

import com.odoo.utilities.Driver;

import javax.xml.transform.sax.SAXSource;

public class Hook {

    public void teardown(){

        Driver.close();
    }
}

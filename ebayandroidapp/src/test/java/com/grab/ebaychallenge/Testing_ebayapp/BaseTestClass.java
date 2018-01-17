package com.grab.ebaychallenge.Testing_ebayapp;

import com.grab.ebaychallenge.AppiumSupport.AppiumBaseClass;


import com.grab.ebaychallenge.PAOBFactory.Ebay_Item_Display_Page.Android_Ebay_Item_Display_Page_Repository;
import com.grab.ebaychallenge.PAOBFactory.Ebay_Item_Display_Page.Ebay_Item_Display_Page_Repository;
import com.grab.ebaychallenge.PAOBFactory.Ebay_Item_page.Android_Ebay_Item_Page_Repository;
import com.grab.ebaychallenge.PAOBFactory.Ebay_Item_page.Ebay_Item_Page_Repository;
import com.grab.ebaychallenge.PAOBFactory.Ebay_Launch_Page.Android_Ebay_Launch_Page_Repository;
import com.grab.ebaychallenge.PAOBFactory.Ebay_Launch_Page.Ebay_Launch_Page_Repository;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.grab.ebaychallenge.AppiumSupport.AppiumController;


import java.io.File;

public class BaseTestClass extends AppiumBaseClass{
    protected Ebay_Launch_Page_Repository ELPR;
    protected Ebay_Item_Page_Repository EIPR;
    protected Ebay_Item_Display_Page_Repository EIDPR;


    @BeforeSuite
    public void setUp() throws Exception {
        AppiumController.instance.start();
        switch (AppiumController.executionOS) {
            case ANDROID:

                ELPR = new Android_Ebay_Launch_Page_Repository(driver());
                EIPR= (Ebay_Item_Page_Repository) new Android_Ebay_Item_Page_Repository(driver());
                EIDPR= new Android_Ebay_Item_Display_Page_Repository(driver());
                break;

        }
    }

    @AfterSuite
    public void tearDown() {
        AppiumController.instance.stop();
    }
}

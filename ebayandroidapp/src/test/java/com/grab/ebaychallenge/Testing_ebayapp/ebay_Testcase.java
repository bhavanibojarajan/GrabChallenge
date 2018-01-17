package com.grab.ebaychallenge.Testing_ebayapp;

import com.grab.ebaychallenge.Log_File.Log;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
public class ebay_Testcase extends BaseTestClass {

public static String UserEmail;

    File classpathRoot = new File(System.getProperty("user.dir"));
    File appDir = new File(classpathRoot, "/app");
    File prop = new File (appDir, "log4j.properties");


    @BeforeTest
    public void setup()

    {



   PropertyConfigurator.configure(prop.getAbsolutePath());


    }




  @Test
    public void Left_Menu() {

   Log.startTestCase("Ebay Challenge ");


      ELPR.Type_Search_Item();
      EIPR.Open_Item();
      EIDPR.Open_First_Item();


       Log.endTestCase("Ebay Challenge");








    }








}

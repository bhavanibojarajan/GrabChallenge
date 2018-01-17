package com.grab.ebaychallenge.PAOBFactory.Ebay_Launch_Page;

import com.grab.ebaychallenge.Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.containsString;
import static org.testng.Assert.assertTrue;

public class Android_Ebay_Launch_Page_Repository implements Ebay_Launch_Page_Repository {

AppiumDriver driver;

    //Search Box
    @FindBy(how = How.ID, using = "search_box")
    public AndroidElement searchbox;

    //Search box text
    @FindBy(how = How.ID, using = "search_src_text")
    public AndroidElement searchboxtext;

    //Search complete icon
    @FindBy(how = How.ID, using = "search_complete_icon")
    public AndroidElement searchcompleteicon;
    //=========================================================================
    public Android_Ebay_Launch_Page_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================

    public void Type_Search_Item()
    {  Log.info("----------------------------- Enter the Item ------------------------------");
        searchbox.click();
        Log.info("Clicked the Search Box");
        searchboxtext.sendKeys("Lamps"+"\n");

        Log.info("Entered the item to be searched "+searchboxtext.getText());

    }


    /*


        Log.info("----------------------------- Adding comments ------------------------------");

        String comments="A good com";
        int index=0;
        addcomment.sendKeys(comments);
        //String time = driver.getDeviceTime();
        Timestamp time_value=new Timestamp(System.currentTimeMillis());
        //Log.info("Timestamp Value "+time);
        Log.info("Comments added in the add comment text box "+addcomment.getText());
       chat_send_btn.click();
        Log.info("Send Button Pressed ");

        int sizeofthelist =displayed_chatcontent.size()-1;
        Assert.assertEquals(displayed_chatcontent.get(sizeofthelist).getText(),comments,"The Chat message mismatch with the send message");

        Log.info("Content displayed in the chat box matches"+ displayed_chatcontent.get(sizeofthelist).getText());















*/
}

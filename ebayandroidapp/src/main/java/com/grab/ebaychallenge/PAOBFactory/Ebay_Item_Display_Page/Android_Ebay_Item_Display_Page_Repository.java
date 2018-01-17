package com.grab.ebaychallenge.PAOBFactory.Ebay_Item_Display_Page;

import com.grab.ebaychallenge.Log_File.Log;
import com.grab.ebaychallenge.PAOBFactory.Ebay_Item_page.Ebay_Item_Page_Repository;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.containsString;

public class Android_Ebay_Item_Display_Page_Repository implements Ebay_Item_Display_Page_Repository {

AppiumDriver driver;

    //First Item
    @FindBy(how = How.ID, using = "textview_item_title")
    public AndroidElement firstitem;

    //Search box text
    @FindBy(how = How.ID, using = "button_watch")
    public AndroidElement watch;

    //Search complete icon
    @FindBy(how = How.ID, using = "search_complete_icon")
    public AndroidElement searchcompleteicon;
    //=========================================================================
    public Android_Ebay_Item_Display_Page_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================

    public void Open_First_Item()
    {  Log.info("----------------------------- Open the Lowest price Item ------------------------------");
       firstitem.click();
        Log.info("Clicked the First Item");
        watch.click();
        Log.info("Clicked the "+watch.getText());
       


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

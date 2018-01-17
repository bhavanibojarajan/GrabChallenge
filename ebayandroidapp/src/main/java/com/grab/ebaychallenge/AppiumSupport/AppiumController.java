package com.grab.ebaychallenge.AppiumSupport;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumController {

    public static OS executionOS = OS.ANDROID;

    public enum OS {
        ANDROID

    }
    public static AppiumController instance = new AppiumController();
    public AppiumDriver driver;

    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        switch(executionOS){
            case ANDROID:
                File classpathRoot = new File(System.getProperty("user.dir"));
                File appDir = new File(classpathRoot, "/app/Android");
                File app = new File (appDir, "ebay.apk");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("deviceName", "Nexus_4_API_24");
                capabilities.setCapability("app", app.getAbsolutePath());

                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;



        }

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

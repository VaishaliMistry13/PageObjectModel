package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils{

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void OpenBrowser(){

        browserSelector.openBrowser();

        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterMethod
    public void CloseBrowser(){

        driver.quit();
    }
}

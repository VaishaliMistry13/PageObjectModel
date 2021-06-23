package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class CartPage extends Utils{

    LoadProperty loadProperty = new LoadProperty();

    By _clickOnCheckout = By.xpath("//button[@id=\"checkout\"]");
    By _clickOnTermsOfService = By.xpath("//input[@id=\"termsofservice\"]");

    public void CartDetails(){

        //page scrolling
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //page scrolling down
        js.executeScript("window.scrollBy(0,500)");

        //click on terms of service
        clickOnElement(_clickOnTermsOfService);

        //click on checkout
        clickOnElement(_clickOnCheckout);
    }
}

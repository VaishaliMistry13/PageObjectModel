package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class FlowerGirlBracelet extends Utils{

    LoadProperty loadProperty = new LoadProperty();

    By _clickOnCart = By.xpath("//button[@id=\"button-1 add-to-cart-button\"]");
    By _clickOnShoppingCart = By.xpath("//span[@class=\"cart-label\"]");

    public void BraceletDetails(){

        //page scrolling
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //page scrolling down
        js.executeScript("window.scrollBy(0,500)");

        //adding bracelet to cart
        clickOnElement(_clickOnCart);

        //page scrolling up
        js.executeScript("window.scrollBy(0,-500)");

        //click on shopping cart
        clickOnElement(_clickOnShoppingCart);
    }
}

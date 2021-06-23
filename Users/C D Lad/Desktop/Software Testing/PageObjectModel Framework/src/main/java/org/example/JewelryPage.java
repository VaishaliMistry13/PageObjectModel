package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JewelryPage extends Utils{

    LoadProperty loadProperty = new LoadProperty();

    By _clickOnFlowerGirlBracelet = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/h2/a");

    public void JewelryDetails(){

        //page scrolling
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //page scrolling down
        js.executeScript("window.scrollBy(0,20)");

        //click on flower girl bracelet element
        clickOnElement(_clickOnFlowerGirlBracelet);
    }
}

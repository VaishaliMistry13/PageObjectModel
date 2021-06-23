package org.example;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class Utils extends BasePage{

    //used for click on elements
    public static void clickOnElement(By Locator) {
        driver.findElement(Locator).click();
    }

    //used to entertext
    public static void enterText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    //To select from drop down by value
    public static void selectFromDropDownByValue(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    //To select from drop down by visible text
    public static void selectFromDropDownByVisibleText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
}

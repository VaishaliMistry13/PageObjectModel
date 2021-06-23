package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    LoadProperty loadProperty = new LoadProperty();

    By clickOnRegister = By.linkText("Register");
    By clickOnLogin = By.linkText("Log in");
    By clickOnJewelry = By.linkText("Jewelry");

    public void clickOnRegister() {

        clickOnElement(clickOnRegister);
    }

    public void clickOnLogin(){

        clickOnElement(clickOnLogin);
    }

    public void clickOnJewelry(){

        clickOnElement(clickOnJewelry);
    }
}

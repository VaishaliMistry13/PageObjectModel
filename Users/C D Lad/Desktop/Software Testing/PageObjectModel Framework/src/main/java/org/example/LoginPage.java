package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{

    LoadProperty loadProperty = new LoadProperty();

    By _EmailId = By.id("Email");
    By _Password = By.id("Password");

    public void loginDetails(){

        enterText(_EmailId,loadProperty.getProperty("Email"));
        enterText(_Password,loadProperty.getProperty("Password"));
        clickOnElement(By.xpath("//button[@class=\"button-1 login-button\"]"));
    }
}

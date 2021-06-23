package org.example;

import javafx.css.CssMetaData;
import org.openqa.selenium.By;

public class RegisterPage extends Utils{

    LoadProperty loadProperty = new LoadProperty();

    By _FirstName = By.id("FirstName");
    By _LastName = By.id("LastName");
    By _DateOfBirth = By.name("DateOfBirthDay");
    By _MonthOfBirth = By.name("DateOfBirthMonth");
    By _YearOfBirth = By.name("DateOfBirthYear");
    By _EmailId = By.id("Email");
    By _CompanyName = By.id("Company");
    By _Password = By.id("Password");
    By _ConfirmPassword = By.id("ConfirmPassword");

    public void FillRegisterDetails(){

        //click on gender
        clickOnElement(By.xpath("//input[@id=\"gender-female\"]"));
        //enter firstname
        enterText(_FirstName,loadProperty.getProperty("FirstName"));
        //enter lastname
        enterText(_LastName,loadProperty.getProperty("LastName"));
        //select date of birth
        selectFromDropDownByValue(_DateOfBirth,loadProperty.getProperty("DateOfBirth"));
        //select month
        selectFromDropDownByVisibleText(_MonthOfBirth,loadProperty.getProperty("MonthOfBirth"));
        //select year
        selectFromDropDownByValue(_YearOfBirth,loadProperty.getProperty("YearOfBirth"));
        //enter email id
        enterText(_EmailId,loadProperty.getProperty("Email"));
        //enter company name
        enterText(_CompanyName,loadProperty.getProperty("Company"));
        //click on newsletter
        clickOnElement(By.xpath("//input[@id=\"Newsletter\"]"));
        //enter password
        enterText(_Password,loadProperty.getProperty("Password"));
        //re-enter password to confirm
        enterText(_ConfirmPassword,loadProperty.getProperty("ConfirmPassword"));
        //click on register button
        clickOnElement(By.xpath("//button[@id=\"register-button\"]"));
    }
}

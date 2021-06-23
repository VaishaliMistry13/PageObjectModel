package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuits extends BaseTest{

    HomePage homepage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    JewelryPage jewelryPage= new JewelryPage();
    FlowerGirlBracelet flowerGirlBracelet = new FlowerGirlBracelet();
    CartPage cartPage = new CartPage();


    @Test
    public void UserShouldBeAbleToRegister(){

        homepage.clickOnRegister();
        registerPage.FillRegisterDetails();
    }

    @Test
    public void UserShouldBeAbleToLogin(){

        homepage.clickOnLogin();
        loginPage.loginDetails();
    }

    @Test
    public void UserShouldBeAbleToAddItemToCartAndProceedToCheckout(){

        homepage.clickOnJewelry();
        jewelryPage.JewelryDetails();
        flowerGirlBracelet.BraceletDetails();
        cartPage.CartDetails();
        loginPage.loginDetails();

    }
}

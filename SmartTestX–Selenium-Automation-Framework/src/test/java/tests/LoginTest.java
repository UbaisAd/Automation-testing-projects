package tests;

import org.testng.annotations.Test;

import core.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        LoginPage loginPage = new LoginPage();

        loginPage.openSite();

        

        loginPage.enterUsername("standard_user");

loginPage.enterPassword("secret_sauce");

        loginPage.clickLogin();

        System.out.println("Login Test Executed");
    }
}

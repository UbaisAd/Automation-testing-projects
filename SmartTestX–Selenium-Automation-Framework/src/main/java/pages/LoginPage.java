package pages;

import org.openqa.selenium.By;

import core.DriverFactory;
import utils.WaitHelper;

public class LoginPage {

    By username = By.id("user-name");

    By password = By.id("password");

    By loginBtn = By.id("login-button");

    public void openSite() {

        DriverFactory.driver.get(
            "https://www.saucedemo.com/"
        );
    }

    public void enterUsername(String user) {

        WaitHelper.waitForElement(username);

        DriverFactory.driver
                .findElement(username)
                .sendKeys(user);
    }

    public void enterPassword(String pass) {

        DriverFactory.driver
                .findElement(password)
                .sendKeys(pass);
    }

    public void clickLogin() {

        DriverFactory.driver
                .findElement(loginBtn)
                .click();
    }
}

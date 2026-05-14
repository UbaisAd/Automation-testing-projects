package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.DriverFactory;

public class WaitHelper {

    public static void waitForElement(By locator) {

        WebDriverWait wait =
                new WebDriverWait(
                        DriverFactory.driver,
                        Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }
}

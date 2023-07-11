package pages;

import org.openqa.selenium.WebDriver;
import locators.LogoutLocators;

public class LogoutPage {
    public static void logout(WebDriver driver) {
        driver.findElement(LogoutLocators.BUTTON_ICON).click();
        driver.findElement(LogoutLocators.BUTTON_LOGOUT).click();
    }
}

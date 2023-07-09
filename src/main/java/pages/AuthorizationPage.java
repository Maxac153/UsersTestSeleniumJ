package pages;

import org.openqa.selenium.WebDriver;
import locators.AuthorizationLocators;

public class AuthorizationPage {
    public String authorization(WebDriver driver, String email, String password) {
        driver.findElement(AuthorizationLocators.INPUT_EMAIL).sendKeys(email);
        driver.findElement(AuthorizationLocators.INPUT_PASSWORD).sendKeys(password);
        driver.findElement(AuthorizationLocators.BUTTON_AUTHORIZATION).click();
        return driver.findElement(AuthorizationLocators.USER_LOGIN).getText();
    }
}

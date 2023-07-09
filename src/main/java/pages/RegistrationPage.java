package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import locators.RegistrationLocators;

public class RegistrationPage extends BasePage {
    public static String userRegistration(WebDriver driver, String userName, String email, String password) {
        driver.findElement(RegistrationLocators.INPUT_NAME).sendKeys(userName);
        driver.findElement(RegistrationLocators.INPUT_EMAIL).sendKeys(email);
        driver.findElement(RegistrationLocators.INPUT_PASSWORD).sendKeys(password);
        driver.findElement(RegistrationLocators.BUTTON_REGISTRATION).click();
        return driver.findElement(RegistrationLocators.USER_LOGIN).getText();
    }
}

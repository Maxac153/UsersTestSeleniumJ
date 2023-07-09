package pages;

import org.openqa.selenium.WebDriver;
import locators.DeleteLocators;

public class DeletePage {
    public static String deleteUser(WebDriver driver, String user_name, String email, String password) {
        driver.findElement(DeleteLocators.INPUT_NAME).sendKeys(email);
        driver.findElement(DeleteLocators.INPUT_EMAIL).sendKeys(password);
        driver.findElement(DeleteLocators.BUTTON_AUTHORIZATION).click();
        driver.findElement(DeleteLocators.INPUT_USER_SEARCH).sendKeys(user_name);
        driver.findElement(DeleteLocators.BUTTON_SEARCH).click();
        driver.findElement(DeleteLocators.BUTTON_DELETE).click();
        return driver.findElement(DeleteLocators.FOUND_USERS).getText();
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import locators.ProfileLocators;

public class ProfilePage {
    public String authorization(WebDriver driver, String email, String password, String img) {
        driver.findElement(ProfileLocators.INPUT_EMAIL).sendKeys(email);
        driver.findElement(ProfileLocators.INPUT_EMAIL).sendKeys(password);
        driver.findElement(ProfileLocators.INPUT_EMAIL).click();
        driver.findElement(ProfileLocators.INPUT_EMAIL).click();
        driver.findElement(ProfileLocators.INPUT_EMAIL).click();
        driver.findElement(ProfileLocators.INPUT_EMAIL).sendKeys(img);
        driver.findElement(ProfileLocators.INPUT_EMAIL).click();
        return driver.findElement(ProfileLocators.INPUT_EMAIL).getAttribute("src");
    }
}

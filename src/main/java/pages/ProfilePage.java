package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import locators.ProfileLocators;


public class ProfilePage {
    public static String addAvatar(WebDriver driver, String email, String password, String img) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        driver.findElement(ProfileLocators.INPUT_EMAIL).sendKeys(email);
        driver.findElement(ProfileLocators.INPUT_PASSWORD).sendKeys(password);
        driver.findElement(ProfileLocators.BUTTON_AUTHORIZATION).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(ProfileLocators.USER_LOGO));
        driver.findElement(ProfileLocators.USER_LOGO).click();
        driver.findElement(ProfileLocators.USER_PERSONAL_ACCOUNT).click();
        driver.findElement(ProfileLocators.USER_ICON_INPUT).sendKeys(img);
        driver.findElement(ProfileLocators.USER_SAVE_ICON).click();
        return driver.findElement(ProfileLocators.USER_ICON).getAttribute("src");
    }
}

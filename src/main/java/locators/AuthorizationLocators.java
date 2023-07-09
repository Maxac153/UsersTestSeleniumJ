package locators;

import org.openqa.selenium.By;

public class AuthorizationLocators {
    public static By INPUT_EMAIL = By.xpath("//div[@class='col-md-6'][1]/*/*/*/tr[1]/td[2]/input");
    public static By INPUT_PASSWORD = By.xpath("//div[@class='col-md-6'][1]/*/*/*/tr[2]/td[2]/input");
    public static By BUTTON_AUTHORIZATION = By.xpath("//div[@class='col-md-6'][1]/*/*/*/tr[3]/td[2]/input");
    public static By USER_LOGIN = By.xpath("//a[@class='dropdown-toggle']");
}

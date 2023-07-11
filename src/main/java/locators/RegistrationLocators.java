package locators;

import org.openqa.selenium.By;

public class RegistrationLocators {
    public static By INPUT_NAME = By.xpath("//div[@class='col-md-6'][2]/*/*/*/tr[1]/td[2]/input");
    public static By INPUT_EMAIL = By.xpath("//div[@class='col-md-6'][2]/*/*/*/tr[2]/td[2]/input");
    public static By INPUT_PASSWORD = By.xpath("//div[@class='col-md-6'][2]/*/*/*/tr[3]/td[2]/input");
    public static By BUTTON_REGISTRATION = By.xpath("//input[@name='act_register_now']");
}

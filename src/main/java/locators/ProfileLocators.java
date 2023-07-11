package locators;

import org.openqa.selenium.By;

public class ProfileLocators {
    public static By INPUT_EMAIL = By.xpath("//div[@class='col-md-6'][1]/*/*/*/tr[1]/td[2]/input");
    public static By INPUT_PASSWORD = By.xpath("//div[@class='col-md-6'][1]/*/*/*/tr[2]/td[2]/input");
    public static By BUTTON_AUTHORIZATION = By.xpath("//div[@class='col-md-6'][1]/*/*/*/tr[3]/td[2]/input");
    public static By USER_LOGO = By.xpath("//li/a[@class='dropdown-toggle']");
    public static By USER_PERSONAL_ACCOUNT = By.xpath("//li/a[@href='/user/profile/index.html']");
    public static By USER_ICON_INPUT = By.xpath("//td//input[@type='file']");
    public static By USER_SAVE_ICON = By.xpath("//td/input[@type='submit']");
    public static By USER_ICON = By.xpath("//div/img");
}

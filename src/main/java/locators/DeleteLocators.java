package locators;

import org.openqa.selenium.By;

public class DeleteLocators {
    public static By INPUT_NAME = By.xpath("//div[@class='col-md-6'][1]/*/*/*/tr[1]/td[2]/input");
    public static By INPUT_EMAIL = By.xpath("//div[@class='col-md-6'][1]/*/*/*/tr[2]/td[2]/input");
    public static By BUTTON_AUTHORIZATION = By.xpath("//input[@class='btn btn-danger']");
    public static By INPUT_USER_SEARCH = By.xpath("//input[@placeholder='Введите email или имя']");
    public static By BUTTON_SEARCH = By.xpath("//button[@class='btn btn-submit']");
    public static By BUTTON_DELETE = By.xpath("//a[text()='Удалить']");
    public static By FOUND_USERS = By.xpath("//div[@class='content']/p[2]");
}

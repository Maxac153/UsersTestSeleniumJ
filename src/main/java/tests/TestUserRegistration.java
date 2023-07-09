package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.DeletePage;
import pages.RegistrationPage;

public class TestUserRegistration {
    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"tur123", "verygood@mail.ru", "123", "tur123"},
                {"tur123", "verygood@mail.ru", "", "tur123"}
        };
    }

    @Test(dataProvider = "testData")
    public static void testUserRegistration(String userName, String email, String password, String exceptionResult) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://users.bugred.ru/user/login/index.html");
        String result = RegistrationPage.userRegistration(driver,userName, email, password);

        driver.get("http://users.bugred.ru/user/login/index.html");
        DeletePage.deleteUser(driver, userName, "manager@mail.ru", "1");
        driver.close();

        Assert.assertEquals(result, exceptionResult);
    }
}
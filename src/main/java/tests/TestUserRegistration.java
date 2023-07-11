package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DeletePage;
import pages.RegistrationPage;
import resources.TestConstants;

public class TestUserRegistration {
    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"tur123", "verygood@mail.ru", "123", "http://users.bugred.ru/"},
                {"tur123", "verygoodmail.ru", "123", "http://users.bugred.ru/user/register/index.html"},
                {"tur123", "verygood@mailru", "123", "http://users.bugred.ru/user/register/index.html"},
                {"", "verygood@mail.ru", "123", "http://users.bugred.ru/user/login/index.html"},
                {"tur123", "", "123", "http://users.bugred.ru/user/login/index.html"},
                {"tur123", "verygood@mail.ru", "", "http://users.bugred.ru/user/login/index.html"}
        };
    }

    @Test(dataProvider = "testData")
    public static void testUserRegistration(String userName, String email, String password, String exceptionResult) {
        System.setProperty(TestConstants.WEBDRIVER, TestConstants.CHROMEDRIVER);
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://users.bugred.ru/user/login/index.html");
            String result = RegistrationPage.userRegistration(driver, userName, email, password);

            // Удаление пользователя если он зарегистрирован
            if (result.equals("http://users.bugred.ru/")) {
                driver.get("http://users.bugred.ru/user/login/index.html");
                DeletePage.deleteUser(driver, userName, "manager@mail.ru", "1");
            }

            Assert.assertEquals(result, exceptionResult);
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
        } finally {
            driver.close();
        }
    }
}
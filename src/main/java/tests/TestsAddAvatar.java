package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ProfilePage;
import resources.TestConstants;

public class TestsAddAvatar {
    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {
                    "manager@mail.ru",
                    "1",
                    "C:\\Users\\Turgor\\IdeaProjects\\UsersTestSeleniumJ\\src\\main\\java\\img\\img_8Kb.png",
                    "http://users.bugred.ru/tmp/default_avatar.jpg"
                },
                {
                    "manager@mail.ru",
                    "1",
                    "C:\\Users\\Turgor\\IdeaProjects\\UsersTestSeleniumJ\\src\\main\\java\\img\\img_more_150Kb.jpg",
                    "http://users.bugred.ru/tmp/default_avatar.jpg"
                }
        };
    }

    @Test(dataProvider = "testData")
    public static void testAddAvatar(String email, String password, String img, String exceptionResult) {
        System.setProperty(TestConstants.WEBDRIVER, TestConstants.CHROMEDRIVER);
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://users.bugred.ru/user/login/index.html");
            String result = ProfilePage.addAvatar(driver, email, password, img);
            System.out.println(result);
            Assert.assertNotEquals(result, exceptionResult);
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
        } finally {
            driver.close();
        }
    }
}

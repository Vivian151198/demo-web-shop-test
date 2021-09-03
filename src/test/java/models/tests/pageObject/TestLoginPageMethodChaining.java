package models.tests.pageObject;

import drivers.DriverFactory;
import models.pagesold.LoginPagMethodChaining;
import org.openqa.selenium.WebDriver;

public class TestLoginPageMethodChaining {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverFactory.getChromeDriver();
        TestLoginPageMethodChaining testLoginPage = new TestLoginPageMethodChaining();

        driver.get("https://the-internet.herokuapp.com/login");
        testLoginPage.testLoginWithIncorrectCreds(driver);
        Thread.sleep(3000);
        testLoginPage.testLoginWithCorrectCreds(driver);

    }

    void testLoginWithCorrectCreds(WebDriver driver){

        LoginPagMethodChaining loginPage = new LoginPagMethodChaining(driver);
        loginPage.inputUsername("tomsmith")
                .inputPassword("SuperSecretPassword!")
                .clickOnLoginBtn();
    }
    void testLoginWithIncorrectCreds(WebDriver driver){

        LoginPagMethodChaining loginPage = new LoginPagMethodChaining(driver);
        loginPage.inputUsername("tomsmith__")
                .inputPassword("SuperSecretPassword!__")
                .clickOnLoginBtn();
    }
}

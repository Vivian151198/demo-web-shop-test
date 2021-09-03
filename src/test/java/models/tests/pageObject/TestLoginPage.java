package models.tests.pageObject;

import drivers.DriverFactory;

import models.pagesold.LoginPage;
import org.openqa.selenium.WebDriver;

public class TestLoginPage {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverFactory.getChromeDriver();
        TestLoginPage testLoginPage = new TestLoginPage();

        driver.get("https://the-internet.herokuapp.com/login");
        testLoginPage.testLoginWithIncorrectCreds(driver);
        Thread.sleep(3000);
        testLoginPage.testLoginWithCorrectCreds(driver);

    }

    void testLoginWithCorrectCreds(WebDriver driver){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.username().sendKeys("tomsmith");
        loginPage.password().sendKeys("SuperSecretPassword!");
        loginPage.loginBtn().click();
    }
    void testLoginWithIncorrectCreds(WebDriver driver){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.username().sendKeys("username");
        loginPage.password().sendKeys("password");
        loginPage.loginBtn().click();
    }
}

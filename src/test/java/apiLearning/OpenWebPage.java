package apiLearning;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenWebPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverFactory.getChromeDriver();

        //Open URL
        driver.get("https://the-internet.herokuapp.com/login");

        //Input username
        // WebElement usernameElement = driver.findElement(By.id("username")).sendKeys("username");
        WebElement usernameElement = driver.findElement(By.id("username"));
        usernameElement.sendKeys("username");

        //Another Strategy
        WebElement userElementCss = driver.findElement(By.cssSelector("#username"));
        userElementCss.clear();
        usernameElement.sendKeys("username - css");

        //Input password
        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("[password]");


        //Click on login btn
        WebElement loginBtn = driver.findElement(By.cssSelector("#login > button"));
        loginBtn.click();

        Thread.sleep(3000);

        //Quit browser
        driver.quit();

    }
}

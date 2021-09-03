package models.pagesold;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    //Attributes
    private WebDriver driver;
    private final By usernameSel = By.cssSelector("#username");
    private final By passwordSel = By.cssSelector("#password");
    private final By loginBtn = By.cssSelector("#login > button");

    //Getters - WebElement
    public WebElement username() {
        return this.driver.findElement(usernameSel);
    }

    public WebElement password() {
        return this.driver.findElement(passwordSel);
    }

    public WebElement loginBtn() {
        return this.driver.findElement(loginBtn);
    }
    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
}

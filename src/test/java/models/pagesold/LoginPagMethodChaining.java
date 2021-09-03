package models.pagesold;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagMethodChaining {

    //Attributes
    private WebDriver driver;
    private final By usernameSel = By.cssSelector("#username");
    private final By passwordSel = By.cssSelector("#password");
    private final By loginBtn = By.cssSelector("#login > button");

    //Getters - WebElement
    public LoginPagMethodChaining inputUsername (String username) {

        this.driver.findElement(usernameSel).sendKeys(username);
        return this;
    }

    public LoginPagMethodChaining inputPassword(String password) {

        this.driver.findElement(passwordSel).sendKeys(password);
        return this;
    }

    public void clickOnLoginBtn() {

        this.driver.findElement(loginBtn).click();
    }
    // Constructor
    public LoginPagMethodChaining(WebDriver driver) {

        this.driver = driver;
    }
}

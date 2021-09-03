package models.components.global;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderComponent {

    private final WebDriver driver;
    private final By logoImgSel = By.cssSelector(".header-logo a img");
    private final By loginLinkSel = By.linkText("Log in");
    private final By registerLinkSel = By.linkText("Register");
    private final By shoppingCartLinkSel = By.linkText("Shopping cart");
    private final By shoppingCartQtySel = By.cssSelector("span.cart-qty");
    private final By wishListLinkSel = By.linkText("Wishlist");
    private final By wishListQtySel = By.cssSelector("span.wishlist-qty");

    public HeaderComponent(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement logoImg() {
        return this.driver.findElement(logoImgSel);
    }

    //Login
    public void clickOnLoginLink(){

        this.driver.findElement(loginLinkSel).click();
    }

    public String getTextLoginLink(){
        return this.driver.findElement(loginLinkSel).getText();
    }

    public String getLinkLoginLink(){

        return this.driver.findElement(loginLinkSel).getAttribute("href");
    }

    //Register
    public void clickOnRegisterLink(){

        this.driver.findElement(registerLinkSel).click();
    }

    public String getTextRegisterLink(){
        return this.driver.findElement(registerLinkSel).getText();
    }

    public String getLinkRegisterLink(){

        return this.driver.findElement(registerLinkSel).getAttribute("href");
    }

    //Shopping cart
    public void clickOnShoppingCartLink(){

        this.driver.findElement(shoppingCartLinkSel).click();
    }

    public String getShoppingCartQty(){

        return this.driver.findElement(shoppingCartQtySel).getText();
    }

    public String getTextShoppingCartLink(){
        return this.driver.findElement(shoppingCartLinkSel).getText();
    }

    public String getLinkShoppingCartLink(){

        return this.driver.findElement(shoppingCartLinkSel).getAttribute("href");
    }

    //Wish list
    public void clickOnWishListLink(){

        this.driver.findElement(wishListLinkSel).click();
    }

    public String getWishListQty(){

        return this.driver.findElement(wishListQtySel).getText();
    }

    public String getTextWishListLink(){
        return this.driver.findElement(wishListLinkSel).getText();
    }

    public String getLinkWishListLink(){

        return this.driver.findElement(wishListLinkSel).getAttribute("href");
    }

}

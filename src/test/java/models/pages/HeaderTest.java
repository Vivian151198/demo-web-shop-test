package models.pages;

import drivers.DriverFactory;
import models.components.global.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class HeaderTest {

    private final WebDriver driver;
    private HeaderComponent headerComponent;

    public HeaderTest(WebDriver driver) {

        this.driver = driver;
    }

    public HeaderComponent headerComponent(){

        return new HeaderComponent(this.driver);
    }

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            HeaderTest homePage = new HeaderTest(driver);
            driver.get("http://demowebshop.tricentis.com/");

            //Test header
            String headerImgSrc = homePage.headerComponent().logoImg().getAttribute("src");
            System.out.println("Logo Img src: "+headerImgSrc);

            //Login link
            String loginText = homePage.headerComponent().getTextLoginLink();
            String loginLink = homePage.headerComponent().getLinkLoginLink();
            System.out.println("Information of login:");
            System.out.println("Login Text:" +loginText);
            System.out.println("Login Link:" +loginLink);

            //Register link
            String registerText = homePage.headerComponent().getTextRegisterLink();
            String registerLink = homePage.headerComponent().getLinkRegisterLink();
            System.out.println("Information of register:");
            System.out.println("Register Text:" +registerText);
            System.out.println("Register Link:" +registerLink);

            //Shopping cart
            String shoppingCartText = homePage.headerComponent().getTextShoppingCartLink();
            String shoppingCartLink = homePage.headerComponent().getLinkShoppingCartLink();
            String shoppingCartQty = homePage.headerComponent().getShoppingCartQty();
            System.out.println("Information of shopping cart:");
            System.out.println("Shopping cart Text:" +shoppingCartText);
            System.out.println("Shopping cart Link:" +shoppingCartLink);
            System.out.println("Shopping cart qty:" +shoppingCartQty);

            //Wishlist
            String wishListText = homePage.headerComponent().getTextWishListLink();
            String wishListLink = homePage.headerComponent().getLinkWishListLink();
            String wishListQty = homePage.headerComponent().getWishListQty();
            System.out.println("Information of wish list:");
            System.out.println("Wsh list Text:" +wishListText);
            System.out.println("Wish list Link:" +wishListLink);
            System.out.println("Wish list qty:" +wishListQty);

        }finally {
            driver.quit();
        }

    }
}

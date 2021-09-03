package components.global;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.SecureRandom;
import java.util.List;

public abstract class HeaderTest {

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            //testHomePageHeader(driver);
            testCategoryPageHeader(driver);
//            testProductItemHeader(driver);
//            testAboutUsPageHeader(driver);
        }
        finally {
            driver.quit();
        }

    }
    private static void testHomePageHeader(WebDriver driver) {
        //Navigation to about us page
        driver.get("http://demowebshop.tricentis.com/");
        //Verification point
        commonHeaderTest(driver);
    }
    private static void testCategoryPageHeader(WebDriver driver) {
        //Navigate to category page
        driver.get("http://demowebshop.tricentis.com/");
        //Randomly to pick up a category and navigate to that category

        List<WebElement> topMenuItem = driver.findElements(By.cssSelector(".header-menu .top-menu > li"));
        WebElement randomMenuItem = topMenuItem.get(new SecureRandom().nextInt(topMenuItem.size()));

        System.out.println(randomMenuItem.getText());

        //Verification point
       commonHeaderTest(driver);
    }

    private static void testProductItemHeader(WebDriver driver) {
    }

    private static void testAboutUsPageHeader(WebDriver driver) {

    }

    private static void commonHeaderTest(WebDriver driver) {

        //Locator WebElement
        WebElement headerLogo = driver.findElement(By.cssSelector(".header .header-logo img"));
        List<WebElement> headerLinks = driver.findElements(By.cssSelector(".header-links li a"));

        //Verification point
        System.out.println("Is logo displayed" +headerLogo.isDisplayed());
        for(WebElement link: headerLinks){
            System.out.println(link.getText().isEmpty());
            System.out.println(link.getAttribute("href").isEmpty());
        }
    }

}

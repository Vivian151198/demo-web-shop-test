package components.global;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{


            testHomePageFooter (driver);
            testCategoryPageFooter (driver);
            testProductItemFooter (driver);
            testAboutUsPageFooter (driver);
        }
        finally {
            driver.quit();
        }

    }
    private static void testHomePageFooter (WebDriver driver) {

        //Verification point

        footerInformationColumnTest(driver);
        footerCustomerServiceColumnTest(driver);
        footerMyAccountColumnTest(driver);
        footerFollowUsColumnTest(driver);
        footerPowerByTest(driver);
        footerDisclaimerTest(driver);

    }
    private static void testCategoryPageFooter (WebDriver driver) {

    }

    private static void testProductItemFooter (WebDriver driver) {
    }

    private static void testAboutUsPageFooter (WebDriver driver) {

    }

    private static void commonFooterTest(WebDriver driver) {

        //Locator WebElement
        WebElement footerLogo = driver.findElement(By.cssSelector(""));
        List<WebElement> footerLinks = driver.findElements(By.cssSelector(""));

        //Verification point
        System.out.println("Is logo displayed" +footerLogo.isDisplayed());
        for(WebElement link: footerLinks){
            System.out.println(link.getText().isEmpty());
            System.out.println(link.getAttribute("href").isEmpty());
        }
    }

    private static void footerInformationColumnTest(WebDriver driver){

    }

    private static void footerCustomerServiceColumnTest(WebDriver driver){

    }

    private static void footerMyAccountColumnTest(WebDriver driver){

    }

    private static void footerFollowUsColumnTest(WebDriver driver){

    }
    private static void footerPowerByTest(WebDriver driver){

    }
    private static void footerDisclaimerTest(WebDriver driver){

    }
}

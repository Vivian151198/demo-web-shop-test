package models.pages;

import drivers.DriverFactory;
import models.components.global.FooterComponent;
import models.components.global.HeaderComponent;
import models.components.searching.SearchAndInputComponent;
import org.openqa.selenium.WebDriver;

public class SearchTest {

    private final WebDriver driver;
    private SearchAndInputComponent searchAndInputComponent;

    public SearchTest(WebDriver driver) {

        this.driver = driver;
    }

    SearchAndInputComponent searchAndInputComponent(){
        return new SearchAndInputComponent(this.driver);
    }

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            SearchTest homepage = new SearchTest(driver);
            driver.get("http://demowebshop.tricentis.com/");

            homepage.searchAndInputComponent().inputProductNameAndSearch("Laptop");

            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}

package models.pagesold;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ECommerceHomePage {

    private WebDriver driver;
    private final By searchTextBxSel = By.cssSelector("#small-searchterms");
    private final By searchBtnSel = By.cssSelector("form[action='/search'] .search-box-button");

    public ECommerceHomePage(WebDriver driver) {

        this.driver = driver;
    }

    //Service Method
    public void inputProductNameAndSearch(String productName){
        this.inputSearchKeywords(productName);
        this.clickOnSearchBtn();
    }

    //Support methods
    private void inputSearchKeywords(String productName) {
        this.driver.findElement(searchTextBxSel).sendKeys(productName);
    }

    private void clickOnSearchBtn() {
        this.driver.findElement(searchBtnSel).click();
    }

    public static void main(String[] args){

        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        ECommerceHomePage eCommerceHomePage = new ECommerceHomePage(driver);
        eCommerceHomePage.inputProductNameAndSearch("Laptop");
    }

}


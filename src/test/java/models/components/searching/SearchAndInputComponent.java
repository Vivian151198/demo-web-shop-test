package models.components.searching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchAndInputComponent {

    private final WebDriver driver;
    private final By searchTextBxSel = By.cssSelector("#small-searchterms");
    private final By searchBtnSel = By.cssSelector("form[action='/search'] .search-box-button");

    public SearchAndInputComponent(WebDriver driver) {

        this.driver = driver;
    }

    public void inputProductNameAndSearch(String productName) {
        this.inputSearchKeywords(productName);
        this.clickOnSearchBtn();
    }

    private void inputSearchKeywords(String productName) {
        this.driver.findElement(searchTextBxSel).sendKeys(productName);
    }

    private void clickOnSearchBtn() {

        this.driver.findElement(searchBtnSel).click();
    }
}

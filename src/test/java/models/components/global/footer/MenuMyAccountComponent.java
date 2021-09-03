package models.components.global.footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuMyAccountComponent {

    private final WebDriver driver;

    public MenuMyAccountComponent(WebDriver driver) {

        this.driver = driver;
    }

    private List<WebElement> listOfMyAccountColumn() {
        return driver.findElements(By.cssSelector(".column.my-account li a"));
    };

    public void getAllTextOfMyAccount(){
        for( WebElement link: listOfMyAccountColumn()){
            System.out.println(link.getText());
        }
    }

    public void getAllLinkOMyAccount(){
        for( WebElement link: listOfMyAccountColumn()){
            System.out.println(link.getAttribute("href"));
        }
    }
}

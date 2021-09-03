package models.components.global.footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuInformationColumnComponent {

    private final WebDriver driver;

    public MenuInformationColumnComponent(WebDriver driver) {

        this.driver = driver;
    }

    private List<WebElement> listOfMenuInformationColumn() {
        return driver.findElements(By.cssSelector(".column.information li a"));
    };

    public void getAllTextOfInformation(){
        for( WebElement link: listOfMenuInformationColumn()){
            System.out.println(link.getText());
        }
    }

    public void getAllLinkOInformation(){
        for( WebElement link: listOfMenuInformationColumn()){
            System.out.println(link.getAttribute("href"));
        }
    }
}

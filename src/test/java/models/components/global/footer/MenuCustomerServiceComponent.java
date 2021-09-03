package models.components.global.footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuCustomerServiceComponent {

    private final WebDriver driver;

    public MenuCustomerServiceComponent(WebDriver driver) {
        this.driver = driver;
    }

    private List<WebElement> listOfMenuCustomerService() {
        return driver.findElements(By.cssSelector(".column.customer-service li a"));
    };

    public void getAllTextOfMenuCustomerService(){
        for( WebElement link: listOfMenuCustomerService()){
            System.out.println(link.getText());
        }
    }

    public void getAllLinkOfMenuCustomerService(){
        for( WebElement link: listOfMenuCustomerService()){
            System.out.println(link.getAttribute("href"));
        }
    }

}

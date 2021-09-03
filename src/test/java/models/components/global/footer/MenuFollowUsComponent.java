package models.components.global.footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuFollowUsComponent {

    private final WebDriver driver;

    public MenuFollowUsComponent(WebDriver driver) {

        this.driver = driver;
    }

    private List<WebElement> listOfMenuFollowUs() {
        return driver.findElements(By.cssSelector(".column.follow-us li a"));
    };

    public void getAllTextOfFollowUs(){
        for( WebElement link: listOfMenuFollowUs()){
            System.out.println(link.getText());
        }
    }

    public void getAllLinkOfFollowUs(){
        for( WebElement link: listOfMenuFollowUs()){
            System.out.println(link.getAttribute("href"));
        }
    }
}

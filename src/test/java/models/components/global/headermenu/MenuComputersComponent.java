package models.components.global.headermenu;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MenuComputersComponent {

    private final WebDriver driver;
    private final By mainMenuComputersSel = By.cssSelector("div.header-menu > ul.top-menu > li:nth-child(2) > a");
    private final By subMenuComputersSel = By.cssSelector(".top-menu li:nth-child(2) ul a");

    public WebElement mainMenuComputer() {
        return this.driver.findElement(mainMenuComputersSel);
    }

    public List<WebElement> subMenuComputers() {
        return this.driver.findElements(subMenuComputersSel);
    }

    public MenuComputersComponent(WebDriver driver) {

        this.driver = driver;
    }

    public String getMenuComputerName(){

        return this.mainMenuComputer().getText();
    }

    public String getMainMenuComputerLink(){

        return this.mainMenuComputer().getAttribute("href");
    }

    public static void Hover(WebDriver driver, WebElement element){

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void getTextSubMenuComputer(){
        List<WebElement> subMenuComputer = this.subMenuComputers();
        for (WebElement item : subMenuComputer) {
            System.out.println("CONTENT: " + item.getText());
        }
    }

    public void getLinksSubMenuComputer(){
        List<WebElement> subMenuComputer = this.subMenuComputers();
        for (WebElement item : subMenuComputer
        ) {
            System.out.println("LINKS: " + item.getAttribute("href"));
        }
    }

}

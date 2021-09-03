package models.components.global.headermenu;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MenuElectronicsComponent {

    private final WebDriver driver;
    private final By mainMenuElectronicsSel = By.cssSelector("div.header-menu > ul.top-menu > li:nth-child(3) > a");
    private final By subMenuElectronicsSel = By.cssSelector(".top-menu li:nth-child(3) ul a");

    public WebElement mainMenuElectronics() {
        return this.driver.findElement(mainMenuElectronicsSel);
    }

    public List<WebElement> subMenuElectronics() {
        return this.driver.findElements(subMenuElectronicsSel);
    }

    public MenuElectronicsComponent(WebDriver driver) {

        this.driver = driver;
    }

    public String getMenuElectronicsName(){

        return this.mainMenuElectronics().getText();
    }

    public String getMainMenuElectronicsLink(){

        return this.mainMenuElectronics().getAttribute("href");
    }

    public static void Hover(WebDriver driver, WebElement element){

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void getTextSubMenuElectronics(){
        List<WebElement> subMenuElectronics = this.subMenuElectronics();
        for (WebElement item : subMenuElectronics
             ) {
            System.out.println("CONTENT: " + item.getText());
        }
    }

    public void getLinkSubMenuElectronics(){
        List<WebElement> subMenuElectronics = this.subMenuElectronics();
        for (WebElement item : subMenuElectronics
        ) {
            System.out.println("LINKS: " + item.getAttribute("href"));
        }
    }

}

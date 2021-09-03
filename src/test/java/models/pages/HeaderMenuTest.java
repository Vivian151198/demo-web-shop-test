package models.pages;

import drivers.DriverFactory;
import models.components.global.headermenu.HeaderMenu;
import models.components.global.headermenu.MenuComputersComponent;
import models.components.global.headermenu.MenuElectronicsComponent;
import org.openqa.selenium.WebDriver;

public class HeaderMenuTest {

    private final WebDriver driver;
    private HeaderMenu headerMenu;
    private MenuComputersComponent menuComputersComponent;
    private MenuElectronicsComponent menuElectronicsComponent;

    public HeaderMenuTest(WebDriver driver) {
        this.driver = driver;
    }

    HeaderMenu menuBooksComponent(){
        return new HeaderMenu(this.driver);
    }

    MenuComputersComponent menuComputersComponent(){
        return new MenuComputersComponent(this.driver);
    }

    MenuElectronicsComponent menuElectronicsComponent(){
        return new MenuElectronicsComponent(this.driver);
    }

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        try{

            HeaderMenuTest homepage = new HeaderMenuTest(driver);
            homepage.menuBooksComponent().getTextMenuList();
            homepage.menuBooksComponent().getLinkMenuList();

            homepage.menuComputersComponent().Hover(driver, homepage.menuComputersComponent().mainMenuComputer());
            homepage.menuComputersComponent().getTextSubMenuComputer();
            homepage.menuComputersComponent().getLinksSubMenuComputer();

            homepage.menuElectronicsComponent().Hover(driver, homepage.menuElectronicsComponent().mainMenuElectronics());
            homepage.menuElectronicsComponent().getTextSubMenuElectronics();
            homepage.menuElectronicsComponent().getLinkSubMenuElectronics();
        }finally {
            driver.quit();
        }
    }

}

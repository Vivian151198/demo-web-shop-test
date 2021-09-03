package models.components.global.headermenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class HeaderMenu {

    private final WebDriver driver;
    private final By mainMenuSel = By.cssSelector("div.header-menu > ul.top-menu > li > a");

    public HeaderMenu(WebDriver driver) {

        this.driver = driver;
    }

    public List<WebElement> mainMenuList(){
        return this.driver.findElements(mainMenuSel);
    }
    public void getTextMenuList(){

        List<WebElement> mainMenuList = mainMenuList();
        for(WebElement menu: mainMenuList){
            System.out.println(menu.getText());
        }
    }

    public void getLinkMenuList(){
        List<WebElement> mainMenuList = mainMenuList();
        for(WebElement menu: mainMenuList){
            System.out.println(menu.getAttribute("href"));
        }
    }

}

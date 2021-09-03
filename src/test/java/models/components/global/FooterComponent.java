package models.components.global;

import models.components.global.footer.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterComponent {

    private final WebDriver driver;
    private MenuInformationColumnComponent menuInformationColumnComponent;
    private MenuCustomerServiceComponent menuCustomerServiceComponent;
    private MenuMyAccountComponent menuMyAccountComponent;
    private MenuFollowUsComponent menuFollowUsComponent;
    private PoweredByComponent poweredByComponent;
    private final By disclaimerTextSel = By.cssSelector(".footer-disclaimer");

    public FooterComponent(WebDriver driver) {
        this.driver = driver;
    }

    public MenuInformationColumnComponent menuInformationColumnComponent(){
        return new MenuInformationColumnComponent(this.driver);
    }

    public MenuCustomerServiceComponent menuCustomerServiceComponent(){
        return new MenuCustomerServiceComponent(this.driver);
    }

    public MenuMyAccountComponent menuMyAccountComponent(){

        return new MenuMyAccountComponent(this.driver);
    }

    public MenuFollowUsComponent menuFollowUsComponent(){
        return new MenuFollowUsComponent(this.driver);
    }

    public PoweredByComponent poweredByComponent(){
        return new PoweredByComponent(this.driver);
    }

    public String copyrightText(){
        return this.driver.findElement(disclaimerTextSel).getText();
    }
}

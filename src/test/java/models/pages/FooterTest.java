package models.pages;

import drivers.DriverFactory;
import models.components.global.FooterComponent;
import org.openqa.selenium.WebDriver;

public class FooterTest {

    private final WebDriver driver;
    private FooterComponent footerComponent;

    public FooterTest(WebDriver driver) {

        this.driver = driver;
    }

    public FooterComponent footerComponent(){

        return new FooterComponent(this.driver);
    }
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            FooterTest homePage = new FooterTest(driver);
            driver.get("http://demowebshop.tricentis.com/");

            Thread.sleep(2000);
            //Menu customer service component
            System.out.println("Information of customer service:");
            homePage.footerComponent().menuCustomerServiceComponent().getAllTextOfMenuCustomerService();;
            homePage.footerComponent().menuCustomerServiceComponent().getAllLinkOfMenuCustomerService();;

            //Menu follow us component
            System.out.println("Information of follow us:");
            homePage.footerComponent().menuFollowUsComponent().getAllTextOfFollowUs();;
            homePage.footerComponent().menuFollowUsComponent().getAllLinkOfFollowUs();;

            //Menu information component
            System.out.println("Information of information column:");
            homePage.footerComponent().menuInformationColumnComponent().getAllTextOfInformation();;
            homePage.footerComponent().menuInformationColumnComponent().getAllLinkOInformation();

            //Menu my account component
            System.out.println("Information of my account:");
            homePage.footerComponent().menuMyAccountComponent().getAllTextOfMyAccount();;
            homePage.footerComponent().menuMyAccountComponent().getAllLinkOMyAccount();;

            //Powered by component
            String powerByText = homePage.footerComponent().poweredByComponent().getText();
            System.out.println("Power by:" +powerByText);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}

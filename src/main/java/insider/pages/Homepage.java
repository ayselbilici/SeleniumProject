package insider.pages;

import insider.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends Helper {
    private final By cookieButton = By.id("wt-cli-accept-btn");
    private final By moreButton = By.xpath("//a[@id='mega-menu-1']//span[text()='More']");
    private final By careersButton = By.xpath("//a[@href='https://useinsider.com/careers/']//h5[text()='Careers']");

    public Homepage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickCookieButton() {
        click(cookieButton,1);
    }

    public void clickMoreButton() {
        click(moreButton,1);
    }

    public void clickCareersButton() {
        click(careersButton,1);
    }


}

package insider.pages;

import insider.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Careerpage extends Helper {

    private final By lifeText = By.xpath("//h2[text()='Life at Insider']");
    private final By AllTeamsButton = By.xpath("//a[text()='See all teams']");
    private final By QAButton = By.xpath("//a[@href='https://useinsider.com/careers/quality-assurance/']");
    private final By AllJobsButton = By.xpath("//a[@href='https://useinsider.com/careers/open-positions/?department=qualityassurance']");


    public Careerpage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickSeeAllTeamsButton() {
        click(AllTeamsButton, 1);
    }

    public void clickQAButton() {
        click(QAButton, 1);
    }

    public void clickAllQAJobsButton() {
        click(AllJobsButton, 1);
    }

    public void scrollToSeeeAllButton() {
        scrollToBottomWithTimes(11);
    }

    public void scrollQAArea() {
        scrollToBottomWithTimes(9);
    }

    public String getLifeText() {
        return getText(lifeText);
    }


}

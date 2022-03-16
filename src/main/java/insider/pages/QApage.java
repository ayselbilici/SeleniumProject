package insider.pages;

import insider.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QApage extends Helper {

    private final By LocationFilterButton = By.id("select2-filter-by-location-container");
    private final By IstanbulOption = By.xpath("//option[@class='job-location istanbul-turkey']");
    private final By JobApplyButton = By.xpath("//a[@href='https://jobs.lever.co/useinsider/6013cc18-8219-4587-a78c-9325c137b436']");
    private final By JobsLocationText = By.xpath("//div[text()='Istanbul, Turkey']");
    private final By JobsDepartmentText = By.xpath("//span[@class='position-department text-large font-weight-600 text-primary']");
    private final By JobTitle = By.xpath("//h2[text()='Software QA Tester- Insider Testinium Tech Hub']");


    public QApage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickLocationFilterButton() {
        click(LocationFilterButton, 1);
    }

    public void clickLocationOption() {
        click(IstanbulOption, 1);
    }

    public void clickApplyButton() {
        click(JobApplyButton, 1);
    }

    public void scrollJobArea() {
        scrollToBottomWithTimes(2);
    }

    public String getJobsLocationText() {
        return getText(JobsLocationText);
    }

    public void focusLastPage() {
        chromeFocusLastTab();
    }

    public String getJobsDepartmentText() {
        return getText(JobsDepartmentText);
    }

    public String getJobTitle() {
        return getText(JobTitle);
    }
}

package insider;

import insider.pages.Careerpage;
import insider.pages.Homepage;
import insider.pages.QApage;
import org.junit.Assert;
import org.junit.Test;


public class TestCase extends BaseTest {

    @Test
    public void Insider() throws InterruptedException {

        String URL = "https://useinsider.com/";
        String lifeAtInsiderText= "Life at Insider";
        String jobsDepartmentText= "Quality Assurance";
        String jobsLocationText= "Istanbul, Turkey";
        String jobTitle= "Software QA Tester- Insider Testinium Tech Hub";

        Homepage homePage = new Homepage(webDriver);
        homePage.clickCookieButton();
        Assert.assertEquals(homePage.getURL(),URL);
        homePage.clickMoreButton();
        homePage.clickCareersButton();

        Careerpage careerPage = new Careerpage(webDriver);
        Assert.assertEquals(careerPage.getLifeText(),lifeAtInsiderText);
        careerPage.scrollToSeeeAllButton();
        careerPage.clickSeeAllTeamsButton();
        careerPage.scrollQAArea();
        careerPage.clickQAButton();
        careerPage.clickAllQAJobsButton();

        QApage QApage = new QApage(webDriver);
        QApage.clickLocationFilterButton();
        QApage.clickLocationOption();
        QApage.clickLocationFilterButton();
        QApage.scrollJobArea();
        Thread.sleep(3000);
        Assert.assertEquals(QApage.getJobsLocationText(),jobsLocationText);
        Assert.assertEquals(QApage.getJobsDepartmentText(),jobsDepartmentText);
        QApage.clickApplyButton();
        Thread.sleep(3000);
        QApage.focusLastPage();
        Assert.assertEquals(QApage.getJobTitle(),jobTitle);
    }
    }



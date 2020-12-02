package googleCloud;

import base.BaseTest;
import googleCloud.pages.GoogleCloudCalculatorPage;
import googleCloud.pages.GoogleCloudHomePage;
import googleCloud.pages.GoogleCloudSearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.*;
import tenMinuteMail.pages.TenMinuteMailHomePage;

public class GoogleCloudTest extends BaseTest {

    @Test
    public void isTotalEstimatedMonthlyCostInEmailEqualsToRequiredTest() {
        logger.info("isTotalEstimatedMonthlyCostInEmailEqualsToRequiredTest started");
        GoogleCloudHomePage cloudHomePage = new GoogleCloudHomePage(driver);
        GoogleCloudSearchResultsPage cloudSearchResultsPage = new GoogleCloudSearchResultsPage(driver);
        GoogleCloudCalculatorPage cloudCalculatorPage = new GoogleCloudCalculatorPage(driver);
        TenMinuteMailHomePage tenMinuteMailHomePage = new TenMinuteMailHomePage(driver);
        cloudHomePage.openPage();
        String ENTERED_SEARCH_TERM = "Google Cloud Platform Pricing Calculator";
        cloudHomePage.enterSearchTerm(ENTERED_SEARCH_TERM);
        cloudHomePage.runSearch();
        cloudSearchResultsPage.goToCalculatorPage();
        cloudCalculatorPage.activateComputeEngine();
        cloudCalculatorPage.fillForms();
        cloudCalculatorPage.addToEstimate();
        cloudCalculatorPage.openLinkInNewTab();
        tenMinuteMailHomePage.copyEmail();
        tenMinuteMailHomePage.switchToCalculator();
        cloudCalculatorPage.emailEstimate();
        cloudCalculatorPage.enterEmail();
        cloudCalculatorPage.sendEmail();
        cloudCalculatorPage.switchToTenMinuteMail();
        tenMinuteMailHomePage.openMailMessage();
        logger.info("isTotalEstimatedMonthlyCostInEmailEqualsToRequiredTest finished");
        String REQUIRED_TOTAL_COST = "1,082.77";
        Assert.assertTrue(tenMinuteMailHomePage.isTotalCostInEmailEqualsToRequired(REQUIRED_TOTAL_COST));
    }
}
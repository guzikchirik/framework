package googleCloud;

import base.BaseTest;
import googleCloud.pages.GoogleCloudCalculatorPage;
import googleCloud.pages.GoogleCloudHomePage;
import googleCloud.pages.GoogleCloudSearchResultsPage;
import model.*;
import org.testng.Assert;
import org.testng.annotations.*;
import service.*;
import service.FormModelCreator;
import tenMinuteMail.pages.TenMinuteMailHomePage;

public class GoogleCloudTest extends BaseTest {

    InstancesNumber instancesNumber = InstancesNumberCreator.withCredentialsFromProperty();
    FormModelCreator formModelCreator = new FormModelCreator();

    @Test
    public void isTotalEstimatedMonthlyCostInEmailEqualsToRequiredTest() {
        logger.info("isTotalEstimatedMonthlyCostInEmailEqualsToRequiredTest started");
        GoogleCloudHomePage cloudHomePage = new GoogleCloudHomePage(driver);
        GoogleCloudSearchResultsPage cloudSearchResultsPage = new GoogleCloudSearchResultsPage(driver);
        GoogleCloudCalculatorPage cloudCalculatorPage = new GoogleCloudCalculatorPage(driver);
        TenMinuteMailHomePage tenMinuteMailHomePage = new TenMinuteMailHomePage(driver);
        cloudHomePage.openPage();
        cloudHomePage.enterSearchTerm(formModelCreator.readSearchValue());
        cloudHomePage.runSearch();
        cloudSearchResultsPage.goToCalculatorPage();
        cloudCalculatorPage.activateComputeEngine();
        cloudCalculatorPage.enterInstancesNumber(instancesNumber);
        cloudCalculatorPage.enterOSType(formModelCreator.readOperatingSystemValue());
        cloudCalculatorPage.enterMachineClass(formModelCreator.readMachineClassValue());
        cloudCalculatorPage.enterSeries(formModelCreator.readSeriesValue());
        cloudCalculatorPage.enterMachineType(formModelCreator.readMachineTypeValue());
        cloudCalculatorPage.markAddGPUCheckbox();
        cloudCalculatorPage.enterNumberOfGPUs(formModelCreator.readNumberOfGPUsValue());
        cloudCalculatorPage.enterGPUType(formModelCreator.readGPUTypeValue());
        cloudCalculatorPage.enterLocalSSD(formModelCreator.readLocalSSDValue());
        cloudCalculatorPage.enterDatacenterLocation(formModelCreator.readLocationValue());
        cloudCalculatorPage.enterCommittedUsage(formModelCreator.readCommittedUsageValue());
        cloudCalculatorPage.addToEstimate();
        String resultFromCalculator = cloudCalculatorPage.getTotalEstimateCostAsString();
        cloudCalculatorPage.openLinkInNewTab();
        tenMinuteMailHomePage.copyEmail();
        tenMinuteMailHomePage.switchToCalculator();
        cloudCalculatorPage.emailEstimate();
        cloudCalculatorPage.enterEmail();
        cloudCalculatorPage.sendEmail();
        cloudCalculatorPage.switchToTenMinuteMail();
        tenMinuteMailHomePage.openMailMessage();
        Assert.assertTrue(resultFromCalculator
                .contains(tenMinuteMailHomePage.getTotalEstimatedCostFromEmailAsString()));
        logger.info("isTotalEstimatedMonthlyCostInEmailEqualsToRequiredTest finished");
    }
}
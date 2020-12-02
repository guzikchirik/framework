package googleCloud;

import base.BaseTest;
import googleCloud.pages.GoogleCloudCalculatorPage;
import googleCloud.pages.GoogleCloudHomePage;
import googleCloud.pages.GoogleCloudSearchResultsPage;
import model.*;
import org.testng.Assert;
import org.testng.annotations.*;
import service.*;
import tenMinuteMail.pages.TenMinuteMailHomePage;

public class GoogleCloudTest extends BaseTest {

    Search search = SearchCreator.withCredentialsFromProperty();
    InstancesNumber instancesNumber = InstancesNumberCreator.withCredentialsFromProperty();
    OperatingSystem operatingSystem = OperatingSystemCreator.withCredentialsFromProperty();
    MachineClass machineClass = MachineClassCreator.withCredentialsFromProperty();
    Series series = SeriesCreator.withCredentialsFromProperty();
    MachineType machineType = MachineTypeCreator.withCredentialsFromProperty();
    NumberOfGPUs numberOfGPUs = NumberOfGPUsCreator.withCredentialsFromProperty();

    @Test
    public void isTotalEstimatedMonthlyCostInEmailEqualsToRequiredTest() {
        logger.info("isTotalEstimatedMonthlyCostInEmailEqualsToRequiredTest started");
        GoogleCloudHomePage cloudHomePage = new GoogleCloudHomePage(driver);
        GoogleCloudSearchResultsPage cloudSearchResultsPage = new GoogleCloudSearchResultsPage(driver);
        GoogleCloudCalculatorPage cloudCalculatorPage = new GoogleCloudCalculatorPage(driver);
        TenMinuteMailHomePage tenMinuteMailHomePage = new TenMinuteMailHomePage(driver);
        cloudHomePage.openPage();
        cloudHomePage.enterSearchTerm(search); //model
        cloudHomePage.runSearch();
        cloudSearchResultsPage.goToCalculatorPage();
        cloudCalculatorPage.activateComputeEngine();
        cloudCalculatorPage.enterInstancesNumber(instancesNumber); //model
        cloudCalculatorPage.enterOSType(operatingSystem); //model
        cloudCalculatorPage.enterMachineClass(machineClass); //model
        cloudCalculatorPage.enterSeries(series); //model
        cloudCalculatorPage.enterMachineType(machineType); //model
        cloudCalculatorPage.markAddGPUCheckbox();
        cloudCalculatorPage.enterNumberOfGPUs(numberOfGPUs); //model

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
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
    GPUType gpuType = GPUTypeCreator.withCredentialsFromProperty();
    LocalSSD localSSD = LocalSSDCreator.withCredentialsFromProperty();
    Location location = LocationCreator.withCredentialsFromProperty();
    CommittedUsage committedUsage = CommittedUsageCreator.withCredentialsFromProperty();

    @Test
    public void isTotalEstimatedMonthlyCostInEmailEqualsToRequiredTest() {
        logger.info("isTotalEstimatedMonthlyCostInEmailEqualsToRequiredTest started");
        GoogleCloudHomePage cloudHomePage = new GoogleCloudHomePage(driver);
        GoogleCloudSearchResultsPage cloudSearchResultsPage = new GoogleCloudSearchResultsPage(driver);
        GoogleCloudCalculatorPage cloudCalculatorPage = new GoogleCloudCalculatorPage(driver);
        TenMinuteMailHomePage tenMinuteMailHomePage = new TenMinuteMailHomePage(driver);
        cloudHomePage.openPage();
        cloudHomePage.enterSearchTerm(search);
        cloudHomePage.runSearch();
        cloudSearchResultsPage.goToCalculatorPage();
        cloudCalculatorPage.activateComputeEngine();
        cloudCalculatorPage.enterInstancesNumber(instancesNumber);
        cloudCalculatorPage.enterOSType(operatingSystem);
        cloudCalculatorPage.enterMachineClass(machineClass);
        cloudCalculatorPage.enterSeries(series);
        cloudCalculatorPage.enterMachineType(machineType);
        cloudCalculatorPage.markAddGPUCheckbox();
        cloudCalculatorPage.enterNumberOfGPUs(numberOfGPUs);
        cloudCalculatorPage.enterGPUType(gpuType);
        cloudCalculatorPage.enterLocalSSD(localSSD);
        cloudCalculatorPage.enterDatacenterLocation(location);
        cloudCalculatorPage.enterCommittedUsage(committedUsage);
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
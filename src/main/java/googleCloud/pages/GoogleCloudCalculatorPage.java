package googleCloud.pages;

import defaultPage.DefaultPage;
import model.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GoogleCloudCalculatorPage extends DefaultPage {

    @FindBy(xpath = "//iframe[starts-with(@src, '/products')]")
    private WebElement parentFrameLocator;

    @FindBy(id = "myFrame")
    private WebElement childFrameLocator;

    @FindBy(id = "input-0")
    private WebElement searchForAProductLocator;

    @FindBy(xpath = "//span[@class='highlight']/..")
    private List<WebElement> computeEngineLocator;

    @FindBy(xpath = "//label[contains(text(), 'Number of instances')]/../input[@name='quantity']")
    private WebElement numberOfInstancesLocator;

    @FindBy(xpath = "//label[text()='Operating System / Software']/../md-select")
    private WebElement operatingSystemLocator;

    @FindBy(xpath = "//div[@aria-hidden='false']//div[@class='md-text']")
    private List<WebElement> requiredOSValueLocator;

    @FindBy(xpath = "//label[text()='Machine Class']/../md-select")
    private WebElement machineClassLocator;

    @FindBy(xpath = "//div[@aria-hidden='false']//div[@class='md-text']")
    private List<WebElement> requiredMachineClassLocator;

    @FindBy(xpath = "//label[text()='Series']/following-sibling::md-select")
    private WebElement seriesLocator;

    @FindBy(xpath = "//div[@aria-hidden='false']//div[@class='md-text ng-binding']")
    private List<WebElement> requiredSeriesLocator;

    @FindBy(xpath = "//label[text()='Machine type']/following-sibling::md-select")
    private WebElement machineTypeLocator;

    @FindBy(xpath = "//div[@aria-hidden='false']//div[@class='md-text ng-binding']")
    private List<WebElement> requiredMachineTypeLocator;

    @FindBy(xpath = "//md-checkbox[@ng-model='listingCtrl.computeServer.addGPUs']/" +
            "child::div[starts-with(@class, 'md-container')]")
    private WebElement addGPUCheckboxLocator;

    @FindBy(xpath = "//label[text()='Number of GPUs']/../md-select")
    private WebElement gpuCountLocator;

    @FindBy(xpath = "//div[@aria-hidden='false']//div[@class='md-text ng-binding']")
    private List<WebElement> requiredGPUCountLocator;

    @FindBy(xpath = "//label[text()='GPU type']/../md-select")
    private WebElement gpuTypeLocator;

    @FindBy(xpath = "//div[@aria-hidden='false']//div[@class='md-text ng-binding']")
    private List<WebElement> requiredGPUTypeLocator;

    @FindBy(xpath = "//label[text()='Local SSD']/../md-select")
    private List<WebElement> localSSDLocator;

    @FindBy(xpath = "//div[@aria-hidden='false']//div[@class='md-text ng-binding']")
    private List<WebElement> requiredLocalSSDLocator;

    @FindBy(xpath = "//label[text()='Datacenter location']/../md-select")
    private List<WebElement> locationLocator;

    @FindBy(xpath = "//div[@aria-hidden='false']//div[@class='md-text ng-binding']")
    private List<WebElement> requiredLocationLocator;

    @FindBy(xpath = "//label[text()='Committed usage']/../md-select")
    private List<WebElement> committedUsageLocator;

    @FindBy(xpath = "//div[@aria-hidden='false']//div[@class='md-text']")
    private List<WebElement> requiredCommittedUsageLocator;

    @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
    private List<WebElement> addToEstimateButtonLocator;

    @FindBy(xpath = "//h2/b[@class='ng-binding']")
    private WebElement totalEstimateCostLocator;

    @FindBy(xpath = "//body[@type='marketing']")
    private WebElement bodyLocator;

    @FindBy(xpath = "//button[@aria-label='Email Estimate']")
    private WebElement emailEstimateButtonLocator;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement inputEmailLocator;

    @FindBy(xpath = "//md-dialog-actions/child::button")
    private List<WebElement> sendEmailButtonLocator;

    public GoogleCloudCalculatorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void activateComputeEngine() {
        waitForFrameToBeAvailableAndSwitchToIt(parentFrameLocator);
        waitForFrameToBeAvailableAndSwitchToIt(childFrameLocator);
        waitForElementToBeClickable(searchForAProductLocator).click();
        waitForElementToBeClickable(computeEngineLocator.get(0)).click();
        logger.info("Compute Engine activated");
    }

    public void enterInstancesNumber(InstancesNumber instancesNumber) {
        waitForElementToBeClickable(numberOfInstancesLocator);
        numberOfInstancesLocator.sendKeys(instancesNumber.getKeys());
        logger.info("Instances number entered: " + instancesNumber.getKeys().name());
    }

    public void enterOSType(OperatingSystem operatingSystem) {
        waitForElementToBeClickable(operatingSystemLocator).click();
        waitForVisibilityOfAllElements(requiredOSValueLocator);
        waitForElementSelectionStateToBe(requiredOSValueLocator
                .get(Integer.parseInt(operatingSystem.getOperatingSystem())), false);
        requiredOSValueLocator.get(Integer.parseInt(operatingSystem.getOperatingSystem())).click();
        logger.info("OS type entered: " + requiredOSValueLocator
                .get(Integer.parseInt(operatingSystem.getOperatingSystem())).getText());
    }

    public void enterMachineClass(MachineClass machineClass) {
        waitForElementToBeClickable(machineClassLocator).click();
        waitForVisibilityOfAllElements(requiredMachineClassLocator);
        waitForElementSelectionStateToBe(requiredMachineClassLocator
                .get(Integer.parseInt(machineClass.getMachineClass())), false);
        requiredMachineClassLocator.get(Integer.parseInt(machineClass.getMachineClass())).click();
        logger.info("Machine class entered: " + requiredMachineClassLocator
                .get(Integer.parseInt(machineClass.getMachineClass())).getText());
    }

    public void enterSeries(Series series) {
        waitForElementToBeClickable(seriesLocator).click();
        waitForVisibilityOfAllElements(requiredSeriesLocator);
        waitForElementSelectionStateToBe(requiredSeriesLocator
                .get(Integer.parseInt(series.getSeries())), false);
        requiredSeriesLocator.get(Integer.parseInt(series.getSeries())).click();
        logger.info("Series entered: " + requiredSeriesLocator.get(Integer.parseInt(series.getSeries())).getText());
    }

    public void enterMachineType(MachineType machineType) {
        waitForElementToBeClickable(machineTypeLocator).click();
        waitForVisibilityOfAllElements(requiredMachineTypeLocator);
        waitForElementSelectionStateToBe(requiredMachineTypeLocator
                .get(Integer.parseInt(machineType.getMachineType())), false);
        requiredMachineTypeLocator.get(Integer.parseInt(machineType.getMachineType())).click();
        logger.info("Machine type entered: " + requiredMachineTypeLocator
                .get(Integer.parseInt(machineType.getMachineType())).getText());
    }

    public void markAddGPUCheckbox() {
        waitForElementToBeClickable(addGPUCheckboxLocator).click();
        logger.info("GPU checkbox marked");
    }

    public void enterNumberOfGPUs(NumberOfGPUs numberOfGPUs) {
        waitForElementToBeClickable(gpuCountLocator).click();
        waitForVisibilityOfAllElements(requiredGPUCountLocator);
        waitForElementSelectionStateToBe(requiredGPUCountLocator
                .get(Integer.parseInt(numberOfGPUs.getNumberOfGPUs())), false);
        requiredGPUCountLocator.get(Integer.parseInt(numberOfGPUs.getNumberOfGPUs())).click();
        logger.info("GPUs number entered: " + requiredGPUCountLocator
                .get(Integer.parseInt(numberOfGPUs.getNumberOfGPUs())).getText());
    }

    public void enterGPUType(GPUType gpuType) {
        waitForElementToBeClickable(gpuTypeLocator).click();
        waitForVisibilityOfAllElements(requiredGPUTypeLocator);
        waitForElementSelectionStateToBe(requiredGPUTypeLocator
                .get(Integer.parseInt(gpuType.getGpuType())), false);
        requiredGPUTypeLocator.get(Integer.parseInt(gpuType.getGpuType())).click();
        logger.info("GPU type entered: " + requiredGPUTypeLocator
                .get(Integer.parseInt(gpuType.getGpuType())).getText());
    }

    public void enterLocalSSD(LocalSSD localSSD) {
        waitForElementToBeClickable(localSSDLocator.get(0)).click();
        waitForVisibilityOfAllElements(requiredLocalSSDLocator);
        waitForElementSelectionStateToBe(requiredLocalSSDLocator
                .get(Integer.parseInt(localSSD.getLocalSSD())), false);
        requiredLocalSSDLocator.get(Integer.parseInt(localSSD.getLocalSSD())).click();
        logger.info("Local SSD entered: " + requiredLocalSSDLocator
                .get(Integer.parseInt(localSSD.getLocalSSD())).getText());
    }

    public void enterDatacenterLocation(Location location) {
        waitForElementToBeClickable(locationLocator.get(0)).click();
        waitForVisibilityOfAllElements(requiredLocationLocator);
        waitForElementSelectionStateToBe(requiredLocationLocator
                .get(Integer.parseInt(location.getLocation())), false);
        requiredLocationLocator.get(Integer.parseInt(location.getLocation())).click();
        logger.info("Datacenter location entered: " + requiredLocationLocator
                .get(Integer.parseInt(location.getLocation())).getText());
    }

    public void enterCommittedUsage(CommittedUsage committedUsage) {
        waitForElementToBeClickable(committedUsageLocator.get(0)).click();
        waitForVisibilityOfAllElements(requiredCommittedUsageLocator);
        waitForElementSelectionStateToBe(requiredCommittedUsageLocator
                .get(Integer.parseInt(committedUsage.getCommittedUsage())), false);
        requiredCommittedUsageLocator.get(Integer.parseInt(committedUsage.getCommittedUsage())).click();
        logger.info("Committed usage entered");
    }

    public void addToEstimate() {
        waitForElementToBeClickable(addToEstimateButtonLocator.get(0)).click();
        logger.info("All forms filled & added to estimate");
    }

    public void openLinkInNewTab() {
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://10minutemail.com");
        logger.info("Switched to mail service in new tab");
    }

    public void emailEstimate() {
        driver.switchTo().activeElement();
        waitForFrameToBeAvailableAndSwitchToIt(parentFrameLocator);
        waitForFrameToBeAvailableAndSwitchToIt(childFrameLocator);
        waitForElementToBeClickable(emailEstimateButtonLocator).click();
        logger.info("Email form opened");
    }

    public void enterEmail() {
        try {
            waitForElementToBeClickable(inputEmailLocator).sendKeys((String) Toolkit.getDefaultToolkit()
                    .getSystemClipboard().getData(DataFlavor.stringFlavor));
            logger.info("Email entered: " + Toolkit.getDefaultToolkit()
                    .getSystemClipboard().getData(DataFlavor.stringFlavor));
        } catch (UnsupportedFlavorException | IOException e) {
            e.printStackTrace();
        }
    }

    public void sendEmail() {
        waitForElementToBeClickable(sendEmailButtonLocator.get(1)).click();
        logger.info("Email sent");
    }

    public void switchToTenMinuteMail() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        logger.info("Switched to mail service");
    }

    public String getTotalEstimateCostAsString() {
        logger.info("Received " + totalEstimateCostLocator.getText());
        return totalEstimateCostLocator.getText();
    }
}
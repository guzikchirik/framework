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

    @FindBy(xpath = "//md-content/md-option[@value='NVIDIA_TESLA_V100']/div[contains(text(), 'NVIDIA Tesla V100')]")
    private WebElement requiredGPUTypeLocator;

    @FindBy(xpath = "//label[text()='Local SSD']/../md-select")
    private List<WebElement> localSSDLocator;

    @FindBy(xpath = "//md-content/md-option[@value='2']/div[contains(text(), '2x375 GB')]")
    private WebElement requiredLocalSSDLocator;

    @FindBy(xpath = "//label[text()='Datacenter location']/../md-select")
    private List<WebElement> locationLocator;

    @FindBy(xpath = "//md-content/md-option[@value='europe-west3']/div[contains(text(), 'Frankfurt (europe-west3)')]")
    private List<WebElement> requiredLocationLocator;

    @FindBy(xpath = "//label[text()='Committed usage']/../md-select")
    private List<WebElement> committedUsageLocator;

    @FindBy(xpath = "//md-content/md-option[@value='1']/div[contains(text(), '1 Year')]")
    private List<WebElement> requiredCommittedUsageLocator;

    @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
    private List<WebElement> addToEstimateButtonLocator;

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
    }

    public void enterOSType(OperatingSystem operatingSystem) {
        waitForElementToBeClickable(operatingSystemLocator).click();
        waitForVisibilityOfAllElements(requiredOSValueLocator);
        requiredOSValueLocator.get(Integer.parseInt(operatingSystem.getOperatingSystem())).click();
    }

    public void enterMachineClass(MachineClass machineClass) {
        waitForElementToBeClickable(machineClassLocator).click();
        waitForVisibilityOfAllElements(requiredMachineClassLocator);
        requiredMachineClassLocator.get(Integer.parseInt(machineClass.getMachineClass())).click();
    }

    public void enterSeries(Series series) {
        waitForElementToBeClickable(seriesLocator).click();
        waitForVisibilityOfAllElements(requiredSeriesLocator);
        requiredSeriesLocator.get(Integer.parseInt(series.getSeries())).click();
    }

    public void enterMachineType(MachineType machineType) {
        waitForElementToBeClickable(machineTypeLocator).click();
        waitForVisibilityOfAllElements(requiredMachineTypeLocator);
        requiredMachineTypeLocator.get(Integer.parseInt(machineType.getMachineType())).click();
    }

    public void markAddGPUCheckbox() {
        waitForElementToBeClickable(addGPUCheckboxLocator).click();
    }

    public void enterNumberOfGPUs(NumberOfGPUs numberOfGPUs) {
        waitForElementToBeClickable(gpuCountLocator).click();
        waitForVisibilityOfAllElements(requiredGPUCountLocator);
        requiredGPUCountLocator.get(Integer.parseInt(numberOfGPUs.getNumberOfGPUs())).click();
    }

    public void fillForms() {
        waitForElementToBeClickable(gpuTypeLocator).click();
        waitForElementToBeClickable(requiredGPUTypeLocator).click();
        waitForElementToBeClickable(localSSDLocator.get(0)).click();
        waitForElementToBeClickable(requiredLocalSSDLocator).click();
        waitForElementToBeClickable(locationLocator.get(0)).click();
        waitForElementToBeClickable(requiredLocationLocator.get(2)).click();
        waitForElementToBeClickable(committedUsageLocator.get(0)).click();
        waitForElementToBeClickable(requiredCommittedUsageLocator.get(1)).click();
        logger.info("Forms filled");
    }

    public void addToEstimate() {
        waitForElementToBeClickable(addToEstimateButtonLocator.get(0)).click();
        logger.info("Added to estimate");
    }

    public void openLinkInNewTab() {
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://10minutemail.com");
        logger.info("New tab opened");
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
            logger.info((String) Toolkit.getDefaultToolkit()
                    .getSystemClipboard().getData(DataFlavor.stringFlavor));
        } catch (UnsupportedFlavorException | IOException e) {
            e.printStackTrace();
        }
        logger.info("Email entered");
    }

    public void sendEmail() {
        waitForElementToBeClickable(sendEmailButtonLocator.get(1)).click();
        logger.info("Send email button clicked");
    }

    public void switchToTenMinuteMail() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        logger.info("Switched to second tab");
    }
}
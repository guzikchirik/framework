package defaultPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class DefaultPage {

    protected WebDriver driver;
    protected Logger logger = LogManager.getRootLogger();

    public DefaultPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver waitForFrameToBeAvailableAndSwitchToIt(WebElement webElement) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(webElement));
    }

    public WebElement waitForElementToBeClickable(WebElement webElement) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public List<WebElement> waitForVisibilityOfAllElements(List<WebElement> webElementList) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfAllElements(webElementList));
    }

    public boolean waitForElementSelectionStateToBe(WebElement webElement, Boolean flag) {
        return new WebDriverWait(driver,10)
                .until(ExpectedConditions.elementSelectionStateToBe(webElement, flag));
    }
}
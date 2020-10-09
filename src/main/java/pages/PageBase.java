package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    protected WebDriver driver;
    public JavascriptExecutor jse;
    public Select select;
    public Actions actions;
    public WebDriverWait wait;

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
        jse = (JavascriptExecutor) driver;

    }

    @Step("Click on a WebElement")
    protected static void clickButton(WebElement Button) {
        Button.click();
    }

    @Step("Set text in a text field")
    protected static void setTextElementText(WebElement textElement, String value) {
        textElement.sendKeys(value);
    }

    @Step("Scroll to a defined position")
    public void scrollToBottom() {
        jse.executeScript("scrollBy(0,4000)");
    }

    @Step("Clear text in a field")
    public void clearText(WebElement element) {
        element.clear();
    }

    @Step("Wait until a webElement is visible")
    public void waitUntilElementIsVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    @Step("Wait until a WebElement is clickable")
    public void waitUntilElementIsClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}

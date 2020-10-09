package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PLPPage extends PageBase {
    public PLPPage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;

    }

    @FindBy(xpath = "//h3[contains(text(),'Andrea Beauty Salon')]")
    protected WebElement andreaSalonTitleInList;

    public void clickOnAndreaSalonTitle() {
        scrollToBottom();
        waitUntilElementIsClickable(andreaSalonTitleInList);
        clickButton(andreaSalonTitleInList);
    }
}

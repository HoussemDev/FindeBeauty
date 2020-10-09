package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input.search_input.ui-autocomplete-input")
    protected WebElement searchTxt;
    @FindBy(xpath = "//button[@class='button_one']")
    protected WebElement searchBtn;
    @FindBy(css = "div.PopupClose.PopupClosebtn")
    public WebElement closePopUpBtn;
    @FindBy(xpath = "//li[@class='ui-menu-item']")
    public WebElement autoCompleteCat;


    @Step("search for a Service via the autocomplete search field")
    public void searchForService(String Service) {

        closePopUpButton();

        waitUntilElementIsVisible(searchTxt);
        setTextElementText(searchTxt, Service);

        waitUntilElementIsClickable(autoCompleteCat);
        clickButton(autoCompleteCat);

        closePopUpButton();

        waitUntilElementIsClickable(searchBtn);
        clickButton(searchBtn);
    }

    @Step("Close the popup window when displayed")
    public void closePopUpButton() {
        if (closePopUpBtn.isDisplayed())
            clickButton(closePopUpBtn);
    }


}

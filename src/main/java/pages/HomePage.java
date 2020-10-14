package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

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
    @FindBy(xpath = "/html/body/section/section/div[3]/div[1]/div/div[2]/div/div/div/h1")
    public WebElement Popular_servicesectiontiltle;
    @FindBy(xpath = "/html/body/section/section/div[3]/div[1]/div/div[2]/ul/li[1]/img")
    WebElement haircut_servicebtn;
    @FindBy(xpath = "/html/body/section/section/div[3]/div[1]/div/div[3]/div/div/div/div/h1")
    public WebElement FeaturedSalonssectiontiltle;
    @FindBy(xpath = "/html/body/section/section/div[3]/div[1]/div/div[3]/div/ul/li[1]/a/div[1]/img")
    public WebElement featuredsalon;
    @FindBy(xpath = "/html/body/section/section/div[3]/div[1]/div/div[1]/div/div[1]/div/div/h1")
    public WebElement  todayExclusiveDealssectiontiltle;
    @FindBy(xpath = "/html/body/section/section/div[3]/div[1]/div/div[1]/div/div[2]/div/div[1]/div/div[6]/div/div/div[1]/img")
    public WebElement ExclusiveDeals;
    @FindBy(xpath = "//*[@id=\"Deal_Details\"]/div/div[2]")
    public WebElement BookingdealsPopUp;


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

    @Step("Verify the Popular service section")
    public void verify_section__popularservice(){
        jse.executeScript("scrollBy(0,(800))");
               if (todayExclusiveDealssectiontiltle.isDisplayed())
            clickButton(haircut_servicebtn);
    }

    @Step("Verify the Featured Salons section")
    public void verify_section__FeaturedSalons(){
        jse.executeScript("scrollBy(0,1000)");
        if (FeaturedSalonssectiontiltle.isDisplayed())
            clickButton(featuredsalon);
    }
    @Step("Verify the Exclusive deals section")
    public void verify_section__Exclusivedeals() {
        jse.executeScript("scrollBy(0,500)");
        waitUntilElementIsClickable(ExclusiveDeals);
        if (FeaturedSalonssectiontiltle.isDisplayed())
            clickButton(ExclusiveDeals);
    }

}

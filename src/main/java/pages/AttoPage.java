package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AttoPage extends PageBase {
    public AttoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(), ' AVANTI')]")
    protected WebElement nextBtn;

    @Step("click next button")
    public void clickNextBtn() {
        clickButton(nextBtn);
    }


}

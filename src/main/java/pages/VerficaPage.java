package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerficaPage extends PageBase {
    public VerficaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(), 'Dati atto VALIDO')]")
    protected WebElement verificaLabel;

    @Step("check if verifica label is dispalyed ")
    public boolean checkIfVerificaLabelIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        return verificaLabel.isDisplayed();
    }


}

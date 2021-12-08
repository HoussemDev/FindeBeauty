package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatiAttoPage extends PageBase {
    public DatiAttoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='..numero sub...']")
    protected WebElement subTxt;
    @FindBy(css = "input[placeholder='..numero sub socio...']")
    protected WebElement subSocioTxt;
    @FindBy(css = "input[placeholder='..numero value...']")
    protected WebElement valuesTxt;
    @FindBy(css = "input[placeholder='..numero anno...']")
    protected WebElement annoTxt;
    @FindBy(xpath = "//button[contains(text(), ' AVANTI')]")
    protected WebElement nextBtn;

    @Step("complte dati atto form")
    public void compteDatiAttoForm(String sub, String subSocio, String value, String anno) {
        subTxt.clear();
        subSocioTxt.clear();
        valuesTxt.clear();
        annoTxt.clear();
        setTextElementText(subTxt, sub);
        setTextElementText(subSocioTxt,subSocio);
        setTextElementText(valuesTxt,value);
        setTextElementText(annoTxt, anno);
        clickButton(nextBtn);
    }

    @Step("click next button")
    public void clickNextBtn() {
        clickButton(nextBtn);
    }

}

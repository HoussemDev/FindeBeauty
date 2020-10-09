package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalonPage extends PageBase {
    public SalonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Andrea Beauty Salon')]")
    public WebElement andreaSalonTitle;

}

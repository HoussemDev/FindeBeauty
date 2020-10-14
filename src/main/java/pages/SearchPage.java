package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/section/div[1]/div[1]/div[1]/h2")
     public WebElement Filtersectiontitle;

}

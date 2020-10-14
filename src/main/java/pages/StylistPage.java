package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StylistPage  extends PageBase{
    public StylistPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"Div_SalonInfo\"]/h1")
    WebElement Stylistname;
    @FindBy(css="button.bookingBtn.popupBtn.button_one")
    WebElement stylistbookingbtn;
    @FindBy(id="btnWriteReview")
    WebElement btnWriteReview;
    

}

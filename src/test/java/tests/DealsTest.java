package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PLPPage;
import pages.SalonPage;
import pages.SearchPage;

public class DealsTest extends TestBase{
    HomePage homeObject;
    PLPPage plpPageObject;
    SalonPage salonPageObject;

    @Description("User can access one deal in View all DealsToday's Exclusive Deals section ")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)

    public void verify_accecissibilty_to_FullLegsWaxing() throws InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.closePopUpButton();
        homeObject.verify_section__Exclusivedeals();
        Thread.sleep(3000);
        Assert.assertTrue(homeObject.BookingdealsPopUp.isDisplayed());


    }
}


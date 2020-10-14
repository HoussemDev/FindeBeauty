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

public class FeaturedSalons extends TestBase {

    HomePage homeObject;
    PLPPage plpPageObject;
    SalonPage salonPageObject;

    @Description("User can access to details salon page 'andreasalon' from Featured salon section ")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)

    public void verify_accecissibilty_to_andreasalonbutton() throws InterruptedException {
        homeObject = new HomePage(driver);
        salonPageObject = new SalonPage(driver);
        homeObject.closePopUpButton();
         homeObject.verify_section__FeaturedSalons();
        Thread.sleep(3000);
        Assert.assertTrue(salonPageObject.andreaSalonTitle.getText().contains("Andrea Beauty Salon"));

    }
}

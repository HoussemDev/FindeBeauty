package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PLPPage;
import pages.SalonPage;

public class SearchTest extends TestBase {

    HomePage homeObject;
    PLPPage plpPageObject;
    SalonPage salonPageObject;
    String service = "Blow dry";


    @Description("User can search for a the blow dry service in the Andrea Salon")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void UserCanSearchForServiceInSalonSuccessfully() throws InterruptedException {

        homeObject = new HomePage(driver);
        plpPageObject = new PLPPage(driver);
        salonPageObject = new SalonPage(driver);

        homeObject.searchForService(service);
        plpPageObject.clickOnAndreaSalonTitle();
        Thread.sleep(3000);
        Assert.assertTrue(salonPageObject.andreaSalonTitle.getText().contains("Andrea Beauty Salon"));

    }
}
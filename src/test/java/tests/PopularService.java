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

public class PopularService extends TestBase{
    HomePage homeObject;
    SearchPage searchPageObject;


    @Description("User can access to haircut service from popular service section ")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)

    public void verify_avaibility_haircut_service() throws InterruptedException {
        homeObject = new HomePage(driver);
        searchPageObject = new SearchPage(driver);
        homeObject.closePopUpButton();
        homeObject.verify_section__popularservice();
        Thread.sleep(3000);
        Assert.assertTrue(searchPageObject.Filtersectiontitle.isDisplayed());

    }
    }



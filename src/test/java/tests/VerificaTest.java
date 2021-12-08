package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import resources.TestBase;
import resources.utils;

public class VerificaTest extends TestBase {

    LoginPage loginPageObject;
    AttoPage attoPageObject;
    DatiAttoPage datiAttoPageObject;
    VerficaPage verficaPageObject;



    @Description("User can complete the workflow to Verifica step")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void UserCanCompleteWorkflowSuccessfully() throws InterruptedException {

        loginPageObject = new LoginPage(driver);
        attoPageObject = new AttoPage(driver);
        datiAttoPageObject = new DatiAttoPage(driver);
        verficaPageObject = new VerficaPage(driver);

        loginPageObject.loginToPortal(utils.userName, utils.password);
        attoPageObject.clickNextBtn();
        Thread.sleep(500);

        datiAttoPageObject.compteDatiAttoForm("123", "456", "789", "2020");
        for (int i = 0; i < 3; i++) {
            Thread.sleep(500);
            attoPageObject.clickNextBtn();
        }
        Thread.sleep(1000);
        Assert.assertTrue(verficaPageObject.checkIfVerificaLabelIsDisplayed(), "VERIFICA DATIATTO is displayed");
    }
}
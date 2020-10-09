package tests;

import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;



public class TestBase {

    public static WebDriver driver;

    @BeforeSuite
    void setAllureEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", "70.0.3538.77")
                        .put("URL", "http://salon3levelcustomer.edurar.com/")
                        .build(), System.getProperty("user.dir")
                        + "/allure-results/");
    }

    @BeforeTest
    @Parameters({"browser"})
    public void startDriver(@Optional("chrome") String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(80, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
        driver.navigate().to("http://salon3levelcustomer.edurar.com/");
    }


    @AfterTest
    public void driverClose() {
        driver.close();
    }


}

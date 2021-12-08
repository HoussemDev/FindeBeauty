package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    protected WebElement userNameTxt;
    @FindBy(id = "password")
    protected WebElement passwordTxt;
    @FindBy(id = "kc-login")
    public WebElement loginBtn;

    @Step("fill in login form")
    public void loginToPortal(String username, String password) {
        setTextElementText(userNameTxt, username);
        setTextElementText(passwordTxt, password);
        clickButton(loginBtn);
    }


}
